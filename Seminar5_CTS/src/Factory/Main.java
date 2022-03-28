package Factory;

public class Main {

	public static void main(String[] args) {
		
		Factory factory= new Factory();
		
		MijlocTransport mijloc1= factory.getMijlocTransport(TipTransport.AUTOBUZ, 100);
		MijlocTransport mijloc2= factory.getMijlocTransport(TipTransport.TROLEIBUZ, 200);
		MijlocTransport mijloc3= factory.getMijlocTransport(TipTransport.TRAMVAI, 300);
		
		
		System.out.println(mijloc1.toString());
		System.out.println(mijloc2.toString());
		System.out.println(mijloc3.toString());
	}

}
