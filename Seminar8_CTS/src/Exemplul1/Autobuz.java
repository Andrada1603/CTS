package Exemplul1;

public class Autobuz extends MijlocDeTransport{

    private int nrLinie;

    public Autobuz(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    @Override
    public void anuntaCalatori() {
        for(ICalator c: calatori){
            c.primesteNotificare("Autobuzul " + nrLinie + " a plecat de la capat de linie.");
        }
    }
}
