package paketDomaci19;

public class StudentMasterStudija extends Student {
	private String smerMasterStudija;

	public StudentMasterStudija(String ime, String prezime, int godinaRodjenja, int trenutnaGodinaStudija,
			double trenutniProsek, String smerMasterStudija) {
		super(ime, prezime, godinaRodjenja, trenutnaGodinaStudija, trenutniProsek);
		this.smerMasterStudija = smerMasterStudija;
	}

	public String toString() {
		return super.toString() + "Smer Master Studija: " + smerMasterStudija + "\n";
	}
}
