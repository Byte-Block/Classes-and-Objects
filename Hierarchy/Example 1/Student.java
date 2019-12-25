public class Student extends Covek {
	private int trenutnaGodinaStudija;
	private double trenutniProsek;

	public Student(String ime, String prezime, int godinaRodjenja, int trenutnaGodinaStudija, double trenutniProsek) {
		super(ime, prezime, godinaRodjenja);
		this.trenutnaGodinaStudija = trenutnaGodinaStudija;
		this.trenutniProsek = trenutniProsek;
	}

	public String toString() {
		return super.toString() + "Trenutna godina studija: " + trenutnaGodinaStudija + "\nTrenutni Prosek: " + trenutniProsek + "\n";
	}
}
