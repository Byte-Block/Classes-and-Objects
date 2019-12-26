public class Pozoriste {
	private int id;
	private String naziv;
	private static int brojacID = 0;

	public Pozoriste(String naziv) {
		this.naziv = naziv;
		this.id = ++brojacID;
	}

	public int getId() {
		return id;
	}

	public String getNaziv() {
		return naziv;
	}

	public String getSkraceniNaziv() {
		String[] inicijali = naziv.split(" ");
		String akronim = "";

		for (String prvoSlovo : inicijali) {
			akronim += prvoSlovo.charAt(0);
		}
		return akronim.toUpperCase();
	}

	public String toString() {
		return naziv + " [" + id + "]";
	}
}
