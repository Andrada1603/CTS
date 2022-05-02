package Template;

public class Tramvai extends MijlocTransportSine {
	
	private int idTramvai;
	private int nrCalatori;
	
	

	public Tramvai(int idTramvai, int nrCalatori) {
		super();
		this.idTramvai = idTramvai;
		this.nrCalatori = nrCalatori;
	}

	@Override
	protected void opresteStatie1() {
		System.out.println("Tramvaiul " + idTramvai + " a oprit in statia 1");
		
	}

	@Override
	protected void opresteStatie2() {
		System.out.println("Tramvaiul " + idTramvai + " a oprit in statia 2");
		
	}

	@Override
	protected void opresteStatie3() {
		System.out.println("Tramvaiul " + idTramvai + " a oprit in statia 3");
		
	}
	
	

}
