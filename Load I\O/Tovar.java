public abstract class Tovar {

	public Tovar() {
		
	}
	
	public abstract String vrsta();
	
	public abstract double tezina();
	
	public String toString() {
		return vrsta() + " (" + tezina() + ")";
	}
}
