package Proxy;

public class Autobuz implements MijlocTransport {
	
	private int nrAutobuz;
	private int nrCalatori;
	
	

	public Autobuz(int nrAutobuz, int nrCalatori) {
		super();
		this.nrAutobuz = nrAutobuz;
		this.nrCalatori = nrCalatori;
	}
	
	



	public int getNrCalatori() {
		return nrCalatori;
	}




	@Override
	public void opreste() {

		System.out.println("Autobuzul nr " + nrAutobuz + " a oprit in statie cu " + nrCalatori+ " calatori.");
		
	}

}
