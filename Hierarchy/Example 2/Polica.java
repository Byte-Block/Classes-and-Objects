package zadatak1;

public class Polica {
	private Knjiga[] nizKnjiga;
	private int brojKnjiga = 0;

	public Polica(Knjiga[] nizKnjiga) {
		nizKnjiga = new Knjiga[10];
	}

	public void staviNaPolicu(Knjiga knj) {
		if (brojKnjiga > 9) {
			System.out.println("Ignorisi.");
		} else {
			nizKnjiga[brojKnjiga] = knj;
			brojKnjiga++;
		}
	}

	public Knjiga getKnjigaPoNaslovu(String naslov) {
		Knjiga knj = new Knjiga();
		for (Knjiga knji : nizKnjiga) {
			if (knji.getNaziv().equals(naslov)) {
				knj = knji;
				break;
			}
		}
		return knj;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Knjiga knji : nizKnjiga) {
			sb.append(knji.toString()).append("\n");
		}
		return sb.toString();
	}
}
