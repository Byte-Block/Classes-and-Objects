package layerCake;

public class Sastojak {
	private String naziv;
	private double kolicina;
	private String jedinicaMere;
	private static String[] dozvoljeniSastojci = {"jaje","brasno","secer","puter"};
	public static boolean istinitostDozvoljenogSastojka;
	
	public Sastojak(String naziv, double kolicina, String jedinicaMere) {
		this.naziv = naziv;
		this.kolicina = kolicina;
		this.jedinicaMere = jedinicaMere;
	}

	public static boolean dozvoljenSastojak(String naziv) {
		for (int i = 0; i < dozvoljeniSastojci.length; i++) {
			if (naziv.equals(dozvoljeniSastojci[i])) {// mozda i sa .toLowerCase()
				istinitostDozvoljenogSastojka = true;
				return istinitostDozvoljenogSastojka;
		    }
			else continue;
		}
		istinitostDozvoljenogSastojka = false;
		return istinitostDozvoljenogSastojka;
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
		return "Sastojak: " + getNaziv() + " (kolicina: " + getKolicina() + " " + getJedinicaMere() + ")";
	}

}
