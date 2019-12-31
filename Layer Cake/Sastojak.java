package paket24_Test;

public class Sastojak {
	private String naziv;
	private double kolicina;
	private String jedinicaMere;
	private static String[] dozvoljeniSastojci = { "jaje", "brasno", "secer", "puter" };
	public static boolean dozvoljenSastojak;

	public Sastojak(String naziv, double kolicina, String jedinicaMere) {
		if (dozvoljenSastojak(naziv)) {
			this.naziv = naziv;
		} else
			return;
		this.kolicina = kolicina;
		this.jedinicaMere = jedinicaMere;
	}

	public static boolean dozvoljenSastojak(String naziv) {
		for (int i = 0; i < dozvoljeniSastojci.length; i++) {
			if (dozvoljeniSastojci[i] == naziv)// mozda i sa .toLowerCase()
				return true;
		}
		return false;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getKolicina() {
		return kolicina;
	}

	public void setKolicina(double kolicina) {
		this.kolicina = kolicina;
	}

	public String getJedinicaMere() {
		return jedinicaMere;
	}

	public void setJedinicaMere(String jedinicaMere) {
		this.jedinicaMere = jedinicaMere;
	}

	public String toString() {
//Sastojak: brasno (kolicina: 500.0 g)	
		return "Sastojak: " + getNaziv() + " (kolicina: " + getKolicina() + " " + getJedinicaMere() + ")";
	}

}
