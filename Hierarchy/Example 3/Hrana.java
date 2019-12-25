public class Hrana extends Namirnica {
	private double tezina;// izrazena u gramima.
	private double belancevine;
	private double masti;
	private double ugljHidrati;

	public Hrana(String ime, double tezina, double belancevine, double masti, double ugljHidrati) {
		super(ime);
		if (belancevine + masti + ugljHidrati > 100) {
			System.out.println("Greska!");
			return;
		} else {
			this.tezina = tezina;
			this.belancevine = belancevine;
			this.masti = masti;
			this.ugljHidrati = ugljHidrati;
		}
	}

	public double getBelancevine() {
		return tezina * belancevine / 100;
	}

	public double getMasti() {
		return tezina * masti / 100;
	}

	public double getUgljHidrati() {
		return ugljHidrati * ugljHidrati / 100;
	}

	public double getTezina() {
		return tezina;
	}

	@Override
	public double energVr() {
		// TODO Auto-generated method stub
		return (tezina * belancevine / 100) * 16.7 + (tezina * masti / 100) * 37.6
				+ (tezina * ugljHidrati / 100) * 17.2;
	}

	@Override
	public String toString() {
		return super.toString() + "(" + tezina + "gr, " + energVr() + "kJ)";
	}
}
