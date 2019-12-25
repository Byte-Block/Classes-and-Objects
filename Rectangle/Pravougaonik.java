public class Pravougaonik {
	private double a;
	private double b;
	private String ime;
	
	public Pravougaonik (double a, double b, String ime) {
		this.a = a;
		this.b = b;
		this.ime = ime;
	}
	public Pravougaonik (double a, String ime) {
		this.a = a;
		this.b = a;
		this.ime = ime;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public String getIme ( ) {
		return ime;
	}
	public double getObim () {
		double Obim = 2 * a + 2 * b; 		
		return Obim;
	}
	public double getPovrsina () {
		double Povrsina = a * b;
		return Povrsina;
	}
	public String ispisiPravougaonik () {
		String ispis = "";
		ispis = ispis + "Pravougaonik (Ime): "+ ime;
		ispis = ispis + "\nDuzina prve stranice je "+a;
		ispis = ispis + "\nDuzina druge stranice je "+b;
		ispis = ispis + "\nPovrsina pravougaonika je "+getPovrsina();
		ispis = ispis + "\nObim pravougaonika je "+getObim();
		return ispis;
	}
}
