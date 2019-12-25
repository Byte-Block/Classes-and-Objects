public class Meni {
	private Namirnica[] niz;
	private int brNam;

	public Meni(int nNiza) {
		niz = new Namirnica[nNiza];
		brNam = 0;
	}

	public double energVr() {
		double ukupnaEnVr = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] != null) {
				ukupnaEnVr += niz[i].energVr();
			}
		}
		return ukupnaEnVr;
	}

	public boolean dodaj(Namirnica nam) {
		if (brNam == niz.length) {
			System.out.println("Meni je popunjen.");
			return false;
		} else {
			niz[brNam++] = nam;
			return true;
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Meni (" + energVr() + "kJ): ");
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] != null) {
				sb.append("\n" + niz[i]);
			}
		}
		return sb.toString();
	}
}
