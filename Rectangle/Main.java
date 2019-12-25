public class GlavniProgramPravougaonika {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pravougaonik p1 = new Pravougaonik ( 4, 6, "Stanlio");
Pravougaonik p2 = new Pravougaonik(4, "Olio");

System.out.println("Duzina stranica od p1 je "+p1.getA()+" i "+p1.getB());
System.out.println("Duzina stranica od p2 je "+p2.getA()+" i "+p2.getB());

System.out.println("\n"+p1.ispisiPravougaonik());
System.out.println("\n"+p2.ispisiPravougaonik());
	}

}
