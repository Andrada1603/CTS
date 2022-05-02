package Proxy;

public class MijlocTransportNoapte implements MijlocTransport{
	
	private MijlocTransport mijlocTransportNoapte;
	
	

	public MijlocTransportNoapte(MijlocTransport mijlocTransportNoapte) {
		super();
		this.mijlocTransportNoapte = mijlocTransportNoapte;
	}

	@Override
	public void opreste() {
		
		if(mijlocTransportNoapte.getNrCalatori()<=0) {
			System.out.println("Autobuzul nu a oprit in statie, deoarece este noapte");
		}
		
	}

	@Override
	public int getNrCalatori() {
		return mijlocTransportNoapte.getNrCalatori();
	}
	
	
	
	
}
