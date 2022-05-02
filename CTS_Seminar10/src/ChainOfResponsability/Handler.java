package ChainOfResponsability;

public abstract class Handler {
	
	protected Handler nextHandler;
	protected int prag;
	
	
	
	public Handler(Handler nextHandler, int prag) {
		super();
		this.nextHandler = nextHandler;
		this.prag = prag;
	}
	
	public Handler(int prag) {
		super();
		nextHandler=null;
		this.prag = prag;
	}
	
	
	public int getPrag() {
		return prag;
	}
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	public abstract void alegeMijlocTransport(int distanta);
	

}
