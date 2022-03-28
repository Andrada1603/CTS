package Factory;

public class Factory_Troleibuz implements Factory {

	@Override
	public MijlocTransport getMijlocTransport(int nrInmatriculare) {
		
		return new Troleibuz(nrInmatriculare);
	}

}
