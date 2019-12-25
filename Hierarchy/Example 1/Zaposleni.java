package paketDomaci19;

public class Zaposleni extends Covek{
private int godinaZaposlenja;
private double plata;
public Zaposleni(String ime, String prezime, int godinaRodjenja, int godinaZaposlenja, double plata) {
	super(ime, prezime, godinaRodjenja);
	this.godinaZaposlenja = godinaZaposlenja;
	this.plata = plata;
}

public String toString() {
	return super.toString() + "Godina Zaposlenja: " + godinaZaposlenja + "\nPlata: " + plata + "\n";
}
}
