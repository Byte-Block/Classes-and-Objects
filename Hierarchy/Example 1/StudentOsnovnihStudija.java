public class StudentOsnovnihStudija extends Student {	
	private String smerOsnovnihStudija;
	public StudentOsnovnihStudija(String ime, String prezime, int godinaRodjenja, int trenutnaGodinaStudija, double trenutniProsek, String smer) {
		super(ime, prezime, godinaRodjenja, trenutnaGodinaStudija, trenutniProsek);
		this.smerOsnovnihStudija = smer;
	}

	public String toString() {
		return super.toString() + "Smer Osnovnih Studija: " + smerOsnovnihStudija + "\n";
	}

}
