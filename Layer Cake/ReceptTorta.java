package layerCake;

public class ReceptTorta {
	private Sastojak[] nizSastojaka;
	private int nivoTezineRecepta;

	public ReceptTorta(Sastojak[] nizSastojaka, int nivoTezineRecepta) {
		this.nizSastojaka = nizSastojaka;
		if (nivoTezineRecepta != 1 || nivoTezineRecepta != 2 || nivoTezineRecepta != 3 || nivoTezineRecepta != 4
				|| nivoTezineRecepta != 5) {
			this.nivoTezineRecepta = nivoTezineRecepta = 3;
		} else {
			this.nivoTezineRecepta = nivoTezineRecepta;
		}
	}

	public String tezinaRecepta() {		
		if (nivoTezineRecepta == 1)
			return "lak";
		else if (nivoTezineRecepta == 2)
			return "srednje lak";
		else if (nivoTezineRecepta == 3)
			return "srednji";
		else if (nivoTezineRecepta == 4)
			return "srednje tezak";
		else
			return "tezak";
	}

	public double ukupnaMasaTorte() {
		double ukupnaMasaTorte = 0;
		for (int i = 0; i < nizSastojaka.length; i++) {
			if (nizSastojaka[i].getJedinicaMere().equals("g"))
				ukupnaMasaTorte += nizSastojaka[i].getKolicina();
			else continue;
		}
		return ukupnaMasaTorte;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Lista sastojaka: \n");
		for (int i=0; i<nizSastojaka.length; i++) {
			sb.append(i+1+". ").append(nizSastojaka[i]).append("\n");
		}
		sb.append("Masa Torte: ").append(ukupnaMasaTorte());
		return sb.toString();
	}
}
