package ChainOfResponsability;

public class AutobuzHandler extends Handler {

	public AutobuzHandler(int prag) {
		super(prag);
		this.prag=prag;
	}

	@Override
	public void alegeMijlocTransport(int distanta) {


		if(distanta<prag) {
			System.out.println("Calatorul poate merge cu autobuzul");
		}
		else {
			this.nextHandler.alegeMijlocTransport(distanta);
		}
		
	}

	
}
