package ChainOfResponsability;

public class Main {

	public static void main(String[] args) {


		Handler autobuz= new AutobuzHandler(3);
		Handler troleibuz= new TroleibuzHandler(5);
		Handler tramvai= new TramvaiHandler(10);
		Handler metrou= new MetrouHandler(20);
		
		autobuz.setNextHandler(troleibuz);
		troleibuz.setNextHandler(tramvai);
		tramvai.setNextHandler(metrou);
		
		
		autobuz.alegeMijlocTransport(2);
		autobuz.alegeMijlocTransport(4);
		autobuz.alegeMijlocTransport(8);
		autobuz.alegeMijlocTransport(15);
		autobuz.alegeMijlocTransport(25);

	}

}
