import java.util.ArrayList;

public class Kamion {
	private String regBroj;
	private ArrayList<Tovar> tovar;
	private double nosivost;
	private double teret;

	public Kamion(String regBroj, double nosivost) {
		this.regBroj = regBroj;
		this.nosivost = nosivost;
		this.tovar = new ArrayList<Tovar>();
		this.teret = 0;
	}

	public boolean stavi(Tovar tovar) {
		if ((tovar.tezina() + teret) > nosivost) {
			return false;
		} else {
			this.tovar.add(tovar);
			teret += tovar.tezina();

			return true;
		}
	}
	
	public void skini() {
		if (tovar.size() > 0) {
			teret -= tovar.get(tovar.size() - 1).tezina();
			tovar.remove(tovar.size() - 1);
		} else
			return;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(regBroj + "(" + teret + "/" + nosivost + ")\n");
		for (int i = 0; i < tovar.size(); i++) {
			sb.append(tovar.get(i) + "\n");
		}
		return sb.toString();
	}
}
