package Factory;

public class Main {
	
	public static void afisareMijlocTransport(Factory factory, int nrInmatriculare) {
		MijlocTransport mijlocTransport= factory.getMijlocTransport(nrInmatriculare);
		System.out.println(mijlocTransport.toString());
	}

	public static void main(String[] args) {
		
		
//		MijlocTransport mijloc1= new Factory_Autobuz().getMijlocTransport(100);
//		MijlocTransport mijloc2= new Factory_Troleibuz().getMijlocTransport(200);
//		MijlocTransport mijloc3= new Factory_Tramvai().getMijlocTransport(300);
//		
//		System.out.println(mijloc1);
//		System.out.println(mijloc2);
//		System.out.println(mijloc3);
		
		
	}

}
