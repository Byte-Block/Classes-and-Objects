public class Nastavnik extends Zaposleni {
private String omiljeniPredmet;
private String[] listaPredmetaNaKojimaDrziNastavu;
public Nastavnik(String ime, String prezime, int godinaRodjenja, int godinaZaposlenja, double plata,
		String omiljeniPredmet, String[] listaPredmetaNaKojimaDrziNastavu) {
	super(ime, prezime, godinaRodjenja, godinaZaposlenja, plata);
	this.omiljeniPredmet = omiljeniPredmet;
	this.listaPredmetaNaKojimaDrziNastavu = listaPredmetaNaKojimaDrziNastavu;
}

public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("Omiljeni Predmet: " + omiljeniPredmet + "\nPredmeti na kojima drzi nastavu: ");
	for (int i = 0; i < listaPredmetaNaKojimaDrziNastavu.length; i++) {
		sb.append("\n\t"+listaPredmetaNaKojimaDrziNastavu[i]);
	}
	sb.append("\n");
	return super.toString() + sb;
}
}
