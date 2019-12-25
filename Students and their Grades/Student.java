package paketDomaci18;

import java.util.Calendar;
import java.util.Date;

@SuppressWarnings("unused")
public class Student {
	private String potpis; // Ime i Prezime razdvojeni jednim spejsom.
	private String jmbg;
	private Ocena[] nizOcena;
	public static final int tekucaGodina = Calendar.getInstance().get(Calendar.YEAR);
	
	public Student(String potpis, String jmbg, Ocena[] nizOcena) {
		this.potpis = potpis;
		this.jmbg = jmbg;
		this.nizOcena = nizOcena;
	}

	public String getPotpis() {
		return potpis;
	}

	public void setPotpis(String potpis) {
		this.potpis = potpis;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public Ocena[] getNizOcena() {
		return nizOcena;
	}

	public void setNizOcena(Ocena[] nizOcena) {
		this.nizOcena = nizOcena;
	}

	public double getProsecnaOcena() {
		double zbir = 0;
		int brPrelaznih = 0;

		for (Ocena o : nizOcena) {
			int ocena = o.getOcenuNaOsnovuBodova();
			if (ocena > 5) {
				zbir += ocena;
				brPrelaznih++;
			}
		}
		return zbir/brPrelaznih;
	}

	public String getDatumRodjenja() {
//		int datumRodjenja = Integer.parseInt(jmbg);
		String dan = jmbg.substring(0, 2);
		String mesec = jmbg.substring(2, 4);
		String datumRodjenja = dan + "." + mesec + ".";
		if (jmbg.charAt(4) == '9') 
			datumRodjenja += "1";
		else datumRodjenja += "2";
		datumRodjenja += jmbg.substring(4, 7) + ".";
		
		return datumRodjenja;
	}
	
	public String getIme() {
		String[] potpisNaDvaDela = potpis.split(" ");
		return potpisNaDvaDela[0];
	}
	
	public String getPrezime() {
		String[] potpisNaDvaDela = potpis.split(" ");
		return potpisNaDvaDela[1];
	}
	
	public String najboljaOcena() {
		Ocena najboljaOcena = nizOcena[0];
		for(int i=0; i < nizOcena.length; i++) {
			if(nizOcena[i].getBodovi() > najboljaOcena.getBodovi())
				najboljaOcena = nizOcena[i];
		}
		return najboljaOcena.getPr().getIme();
	}
	
	public static boolean starijiOd(Student s, int god) {
		int godinaStudenta = tekucaGodina - Integer.parseInt(s.getDatumRodjenja().substring(6, 10));
		if (godinaStudenta >= god) return true;
		else return false;
	}
	
	public static Student[] prosekVeciOd(Student[] nizStudenata, double ocena) {
		int brojacStudenataSaProsekomVecimOdZadatog = 0;
		for (int i = 0; i < nizStudenata.length; i++) {
			if (nizStudenata[i].getProsecnaOcena() > ocena) {
				brojacStudenataSaProsekomVecimOdZadatog++;
			}
		}
		Student[] nizStudenataSaProsekomVecimOdZadatog = new Student[brojacStudenataSaProsekomVecimOdZadatog];
		int i = 0;
		for (int j = 0; j < nizStudenata.length; j++) {
			if (nizStudenata[j].getProsecnaOcena() > ocena) {
				nizStudenataSaProsekomVecimOdZadatog[i] = nizStudenata[j];
				i++;
			}
		}
		return nizStudenataSaProsekomVecimOdZadatog;
	}
		
}
