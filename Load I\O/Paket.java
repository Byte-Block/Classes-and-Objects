import java.util.ArrayList;

public class Paket extends Tovar {
	private ArrayList<Tovar> tovar;

	public Paket() {
		this.tovar = new ArrayList<Tovar>();
	}

	@Override
	public double tezina() {
		// TODO Auto-generated method stub
		double tezinaPaketa = 0;
		for (Tovar tovar : tovar) {
			tezinaPaketa += tovar.tezina();
		}
		return tezinaPaketa;
	}

	@Override
	public String vrsta() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("paket [");
		for (int i = 0; i < tovar.size(); i++) {
			sb.append(tovar.get(i).vrsta());
			if (i < tovar.size() - 1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}

	public void dodaj(Tovar tovar) {
		this.tovar.add(tovar);
	}

}
