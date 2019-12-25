package paketDomaci22;

public class Broj extends Izraz {
private int vrednost;

public Broj(int vrednost) {
	super();
	this.vrednost = vrednost;
}

public double izracunaj() {
	return vrednost;
}
}
