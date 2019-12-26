import java.util.ArrayList;

public class Predstava {
	private String naziv;
	private Pozoriste pozoriste;
	private ArrayList<Zaposleni> zaposleni = new ArrayList<Zaposleni>();

	public Predstava(String naziv, Pozoriste pozoriste, Reditelj reditelj) {
		this.naziv = naziv;
		this.pozoriste = pozoriste;
		if (reditelj.getPozoriste().getId() == pozoriste.getId()) {
			this.zaposleni.add(reditelj);
		} else {
			System.out.println("Reditelj nije zaposlen u pozoristu u kome se predstava odrzava.");
		}
	}

	public boolean dodaj(Glumac glumac) {
		if (glumac.getPozoriste().getId() != pozoriste.getId()) {
			System.out.println("Glumac nije zaposlen u pozoristu u kome se predstava odrzava.");
			return false;
		}
		zaposleni.add(glumac);
		return true;
	}

	public boolean dodaj(Kostimograf kostimograf) {
		int brojKostimografa = 0;
		if (kostimograf.getPozoriste().getId() != pozoriste.getId()) {
			System.out.println("Kostimograf nije zaposlen u pozoristu u kome se predstava odrzava.");
			return false;
		}
		for (Zaposleni zap : zaposleni) {
			if (zap.imePosla().equals("Kostimograf")) {
				brojKostimografa++;
			}
		}
		if (brojKostimografa == 2) {
			return false;
		} else {
			zaposleni.add(kostimograf);
			return true;
		}
	}

	public String getNaziv() {
		return naziv;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(naziv + ":");
		for (Zaposleni zap : zaposleni) {
			sb.append("\n\t"+ zap.toString() + ")");
		}
		return sb.toString();
	}
}
