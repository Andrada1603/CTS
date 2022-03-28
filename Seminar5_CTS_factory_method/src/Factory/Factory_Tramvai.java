package Factory;

public class Factory_Tramvai implements Factory {

	@Override
	public MijlocTransport getMijlocTransport(int nrInmatriculare) {
		
		return new Tramvai(nrInmatriculare);
	}

}
