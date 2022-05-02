package ChainOfResponsability;

public class TroleibuzHandler extends Handler {
	
	public TroleibuzHandler(int prag) {
		super(prag);
		this.prag=prag;
	}

	@Override
	public void alegeMijlocTransport(int distanta) {


		if(distanta<prag) {
			System.out.println("Calatorul poate merge cu troleibuzul");
		}
		else {
			this.nextHandler.alegeMijlocTransport(distanta);
		}
		
	}


}
