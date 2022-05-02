package ChainOfResponsability;

public class MetrouHandler extends Handler {
	
	public MetrouHandler(int prag) {
		super(prag);
		this.prag=prag;
	}

	@Override
	public void alegeMijlocTransport(int distanta) {


		if(distanta>=prag) {
			System.out.println("Calatorul poate merge cu metroul");
		}
		
	}

}
