public class Sluzbenik extends Zaposleni {
	private String odsek;

	public Sluzbenik(String ime, String prezime, int godinaRodjenja, int godinaZaposlenja, double plata, String odsek) {
		super(ime, prezime, godinaRodjenja, godinaZaposlenja, plata);
		this.odsek = odsek;
	}
	public String toString() {
		return super.toString() + "Sluzbenik na odseku: " + odsek + "\n";
	}
}
