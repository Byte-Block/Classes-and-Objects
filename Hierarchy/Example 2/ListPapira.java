public class ListPapira {
private int redniBroj;
private String tekst;

public ListPapira(int redniBroj, String tekst) {
	this.redniBroj = redniBroj;
	this.tekst = tekst;
}

public int getRedniBroj () {
	return redniBroj;
}

public static boolean poredjenje(ListPapira a, ListPapira b) {
	return a.redniBroj >= b.redniBroj;
}
public boolean poredjenje(ListPapira a) {
	return this.redniBroj >= a.redniBroj;
}

public void setTekst(String tekst) {
	this.tekst =  tekst;
}
public String toString() {
	return tekst + "(" + redniBroj + ")";
}
}
