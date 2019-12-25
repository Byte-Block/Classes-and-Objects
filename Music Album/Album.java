import java.util.Date;
import java.time.LocalDate;
import java.util.Calendar;

@SuppressWarnings("unused")
public class Album {
	private String naziv;
	private String izvodjac;
	private Date datum;
	private MuzickaNumera[] nizPesama;
	private int brPesmeUAlbumu = 0;

	public Album(String naziv, String izvodjac, Date datum) {
		this.naziv = naziv;
		this.izvodjac = izvodjac;
		this.datum = datum;
		this.nizPesama = new MuzickaNumera[5];
	}

	public void dodaj/* MuzickuNumeru */(MuzickaNumera mN) {
		// fali da se napise
		if (brPesmeUAlbumu == 10)
			System.out.println("Popunili ste plocu!");
		if (brPesmeUAlbumu == nizPesama.length) {
			System.out.println("Popunjeno je 5 pesama, okrenite plocu na drugu stranu!");
			MuzickaNumera[] nizPesamaStranaB = new MuzickaNumera[nizPesama.length * 2];
			int i = 0;
			for (MuzickaNumera muzNum : nizPesama) {
				nizPesamaStranaB[i] = muzNum;
				i++;
			}
			nizPesama = nizPesamaStranaB;
			nizPesama[brPesmeUAlbumu] = mN;// preko 5 pesama.
			brPesmeUAlbumu++;// 6ta pesma po redu. Potom dopisati sta se desava ako apuni i drugu stranu.
		} else {
			nizPesama[brPesmeUAlbumu] = mN;
			brPesmeUAlbumu++;
		}
	}

	public void dodaj/* kreirajIDodajMuzickuNumeru */(String name, String trajanje) {
		MuzickaNumera mN = new MuzickaNumera(name, izvodjac, trajanje);
		dodaj(mN);
	}

	public String getNaziv() {
		return naziv;
	}

	public String getIzvodjac() {
		return izvodjac;
	}

	public String getTrajanje/* Albuma */() {
		String ukupnoTrajanjeAlbuma = "";
		String[] minutiISekunde = new String[2];
		int minuti = 0;
		int sekunde = 0;
		for (int i = 0; i < nizPesama.length; i++) {
			if (nizPesama[i] != null) {
				minutiISekunde = nizPesama[i].getTrajanje().split(":");
				minuti += Integer.parseInt(minutiISekunde[0]);
				sekunde += Integer.parseInt(minutiISekunde[1]);
				if (sekunde >= 60) {
					minuti += 1;
					sekunde %= 60;
				}
			}
		}
		return ukupnoTrajanjeAlbuma = Integer.toString(minuti) + ":" + Integer.toString(sekunde);
	}

	public Date getDatum() {
		return datum;
	}

	public MuzickaNumera getMuzickuNumeruPoIndeksu(int i) {
		return nizPesama[i];
	}

	public MuzickaNumera getMuzickuNumeruPoImenuForPetljom(String ime) {
		MuzickaNumera trazenaMuzickaNumeraPoImenu = new MuzickaNumera();
		for (int i = 0; i < nizPesama.length; i++) {// obicnom for petljom
			if (nizPesama[i].getNaziv().equals(ime)) {
				trazenaMuzickaNumeraPoImenu = nizPesama[i];
			}
		}
		return trazenaMuzickaNumeraPoImenu;
	}

	public MuzickaNumera getMuzickuNumeruPoImenuForEachPetljom(String ime) {
		MuzickaNumera trazenaMuzickaNumeraPoImenu = new MuzickaNumera();
		for (MuzickaNumera mN : nizPesama) {// For-each petljom.
			if (mN.getNaziv().equals(ime))
				trazenaMuzickaNumeraPoImenu = mN;
		}
		return trazenaMuzickaNumeraPoImenu;
	}

	public String toString() {
		String s = "";
		s += izvodjac + " - " + naziv + "(" + datum + ")" + ":[";
		for (int i = 0; i < nizPesama.length; i++) {
			if (nizPesama[i] != null)
				s += "\n\t(" + nizPesama[i] + ")";
		}
		s += "\n];";
		return s;
	}
}
