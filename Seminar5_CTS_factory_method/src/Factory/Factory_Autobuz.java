package Factory;

public class Factory_Autobuz implements Factory {

	@Override
	public MijlocTransport getMijlocTransport(int nrInmatriculare) {
	
		return new Autobuz(nrInmatriculare);
	}

}
