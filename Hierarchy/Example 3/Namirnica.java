public abstract class Namirnica extends Energent {
	protected String ime;
	protected int id;
	private static int idBrojac = 0;

	public Namirnica(String ime) {
		super();
		this.ime = ime;
		this.id = idBrojac;
		idBrojac++;
	}

	public String getIme() {
		return ime;
	}

	public int getId() {
		return id;
	}

	public String toString() {
		return "[" + (id+1) + "]" + " " + ime;
	}
}
