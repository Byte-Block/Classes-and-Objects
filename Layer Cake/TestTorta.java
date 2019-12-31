package layerCake;

import java.util.Scanner;

public class TestTorta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner sc = new Scanner(System.in);
    String nazivSastojka, jedinicaMere;
		double kolicina;
    
		System.out.println("Unesite broj sastojaka: ");
		int n = sc.nextInt();
		Sastojak[] nizSastojaka = new Sastojak[n];
		sc.nextLine();
    
		for (int i = 0; i < n; i++) {
		
			System.out.println("Naziv sastojka: ");
			nazivSastojka = sc.nextLine();
			
			if (!Sastojak.dozvoljenSastojak(nazivSastojka)) {
				do {
					System.out.println("Nije dozvoljen sastojak!");
					System.out.println("Naziv sastojka: ");
					nazivSastojka = sc.nextLine();
				} while (!Sastojak.dozvoljenSastojak(nazivSastojka));
			}
      
			System.out.println("Kolicina: ");
			kolicina = sc.nextDouble();
			System.out.println("Jedinica mere: ");
			sc.nextLine();
			jedinicaMere = sc.nextLine();
			Sastojak sastojak = new Sastojak(nazivSastojka, kolicina, jedinicaMere);
			nizSastojaka[i] = sastojak;

		}
    
		System.out.println("Unesite tezinu recepta: ");
		int tezinaRecepta = sc.nextInt();
		ReceptTorta Reforma = new ReceptTorta(nizSastojaka, tezinaRecepta);
		System.out.println(Reforma.toString());

		sc.close();
	}

}
