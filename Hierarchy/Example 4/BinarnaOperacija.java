package paketDomaci22;

public abstract class BinarnaOperacija extends Izraz {
protected Izraz levi, desni;

public BinarnaOperacija(Izraz levi, Izraz desni) {
	super();
	this.levi = levi;
	this.desni = desni;
}


}
