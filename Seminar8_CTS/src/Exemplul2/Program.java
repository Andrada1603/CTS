package Exemplul2;


public class Program {

    public static void main(String[] args) {

        Autobuz autobuz1 = new Autobuz("A1",1995,40);
        Autobuz autobuz2 = new Autobuz("A2",1996,50);
        Autobuz autobuz3 = new Autobuz("A3",1997,30);


        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Linie linie1 = flyweightFactory.getLinie(168);
        Linie linie2 = flyweightFactory.getLinie(122);

        autobuz1.descriereAutobuz(linie1);
        autobuz2.descriereAutobuz(linie1);
        autobuz3.descriereAutobuz(linie2);

    }
}
