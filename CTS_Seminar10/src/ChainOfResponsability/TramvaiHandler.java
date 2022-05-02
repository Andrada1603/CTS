package ChainOfResponsability;

public class TramvaiHandler extends Handler {
	
	public TramvaiHandler(int prag) {
		super(prag);
		this.prag=prag;
	}

	@Override
	public void alegeMijlocTransport(int distanta) {


		if(distanta<prag) {
			System.out.println("Calatorul poate merge cu tramvaiul");
		}
		else {
			this.nextHandler.alegeMijlocTransport(distanta);
		}
		
	}


}
