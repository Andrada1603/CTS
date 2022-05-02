package Template;

public class Main {

	public static void main(String[] args) {


		MijlocTransportSine tramvai1= new Tramvai(101, 5);
		MijlocTransportSine tramvai2= new Tramvai(102, 10);
		
		tramvai1.parcurgeTraseu();
		tramvai2.parcurgeTraseuInvers();
		

	}

}
