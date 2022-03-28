package Factory;

public class Factory {
	
	public MijlocTransport getMijlocTransport(TipTransport tipTransport, int nrInmatriculare) {
		
		if(tipTransport== TipTransport.AUTOBUZ) {
			
		}
		switch(tipTransport) {
			case AUTOBUZ: return new Autobuz(nrInmatriculare);
			case TRAMVAI: return new Tramvai(nrInmatriculare);
			case TROLEIBUZ: return new Troleibuz(nrInmatriculare);
			default: return null;
		}
	}

}
