public class Asistent extends Nastavnik {
	private String smerDoktorskihStudija;

	public Asistent(String ime, String prezime, int godinaRodjenja, int godinaZaposlenja, double plata,
			String omiljeniPredmet, String[] listaPredmetaNaKojimaDrziNastavu, String smerDoktorskihStudija) {
		super(ime, prezime, godinaRodjenja, godinaZaposlenja, plata, omiljeniPredmet, listaPredmetaNaKojimaDrziNastavu);
		this.smerDoktorskihStudija = smerDoktorskihStudija;
	}

	public String toString() {
		return super.toString() + "Smer doktorskih studija: " + smerDoktorskihStudija + "\n";
	}
}
