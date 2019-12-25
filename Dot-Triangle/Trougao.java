public class Trougao {
	private Tacka pocetnaTacka;
	private double strana_a;
	private double strana_b;
	private double strana_c;
	private double obimTrougla;
	private double povrsinaTrougla;

	public Trougao(Tacka pocetnaTacka, double strana_a, double strana_b, double strana_c) {
		if (strana_a <= 0 || strana_b <= 0 || strana_c <= 0 || strana_a + strana_b <= strana_c
				|| strana_b + strana_c <= strana_a || strana_c + strana_a <= strana_b) {
			System.out.println("\nTrougao nije validan!");
		} else {
			this.pocetnaTacka = pocetnaTacka;
			this.strana_a = strana_a;
			this.strana_b = strana_b;
			this.strana_c = strana_c;
			this.obimTrougla = obimTrougla();
			this.povrsinaTrougla = povrsinaTrougla();
		}
	}

	public void daLiJeJednakokraki() {
		if (strana_a == strana_b || strana_b == strana_c || strana_c == strana_a)
			System.out.println("\nTrougao je jednakokraki.");
		else
			System.out.println("\nNije jednakokraki.");
	}

	public double obimTrougla() {
		double obimTrougla = strana_a + strana_b + strana_c;
		return obimTrougla;
	}

	public double getObim() {
		return obimTrougla;
	}

	public double getPovrsina() {
		return povrsinaTrougla;
	}

	public double povrsinaTrougla() {
		double s = (strana_a + strana_b + strana_c) / 2;
		double povrsinaTrougla = Math.sqrt(s * (s - strana_a) * (s - strana_b) * (s - strana_c));
		return povrsinaTrougla;
	}

	public void setStrana_a(double strana_a) {
		if (strana_a <= 0 || strana_c + strana_b <= strana_a)
			System.out.println("Izmena nije validna!");
		else
			this.strana_a = strana_a;
	}

	public void setStrana_b(double strana_b) {
		if (strana_b <= 0 || strana_a + strana_c <= strana_b)
			System.out.println("Izmena nije validna!");
		else
			this.strana_b = strana_b;
	}

	public void setStrana_c(double strana_c) {
		if (strana_c <= 0 || strana_a + strana_b <= strana_c)
			System.out.println("Izmena nije validna!");
		else
			this.strana_c = strana_c;
	}

	public static void daLiIstuPocetnuTacku(Trougao t1, Trougao t2) {
		if (t1.pocetnaTacka.equals(t2.pocetnaTacka))
			System.out.println("\nImaju istu pocetnu tacku.");
		else
			System.out.println("\nNemaju istu pocetnu tacku.");
	}

	public String ispisiTrougao() {
		String ispis = "";
		if (strana_a <= 0 || strana_b <= 0 || strana_c <= 0 || strana_a + strana_b <= strana_c
				|| strana_b + strana_c <= strana_a || strana_c + strana_a <= strana_b) {
			ispis += "\nTrougao nije kreiran pravilno!";
			return ispis;
		} else {
			ispis += "\nTrougao sa pocetkom u " + pocetnaTacka.ispisTacke();
			ispis += "\nStranice trougla: " + strana_a + " " + strana_b + " " + strana_c;
			ispis += "\nPovrsina i obim: P= " + getPovrsina() + " O= " + getObim();
			return ispis;
		}
	}

	public void setPocetnaTacka(Tacka pocetnaTacka) {
		this.pocetnaTacka = pocetnaTacka;
	}
	
}
