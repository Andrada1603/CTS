package Proxy;

public class Main {

	public static void main(String[] args) {


		Autobuz autobuz1= new Autobuz(101, 0);
		Autobuz autobuz2= new Autobuz(102, 0);
		Autobuz autobuz3= new Autobuz(103, 10);
	
		MijlocTransport mijlocTransportNoapte1= new MijlocTransportNoapte(autobuz1);
		MijlocTransport mijlocTransportNoapte2= new MijlocTransportNoapte(autobuz2);
			
		mijlocTransportNoapte1.opreste();
		mijlocTransportNoapte2.opreste();
		autobuz3.opreste();

	

	}

}
