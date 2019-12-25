package paketDomaci19;

public class Profesor extends Nastavnik {
	private String titula;

	public Profesor(String ime, String prezime, int godinaRodjenja, int godinaZaposlenja, double plata,
			String omiljeniPredmet, String[] listaPredmetaNaKojimaDrziNastavu, String titula) {
		super(ime, prezime, godinaRodjenja, godinaZaposlenja, plata, omiljeniPredmet, listaPredmetaNaKojimaDrziNastavu);
		this.titula = titula;
	}

	public String toString() {
		return super.toString() + "Titula profesora: " + titula + "\n";
	}
}
