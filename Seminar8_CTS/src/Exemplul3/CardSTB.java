package Exemplul3;

public class CardSTB implements ModPlata{

    @Override
    public void plateste(float pret) {
        System.out.println("A fost realizata plata in valoare de " + pret + " prin card STB");
    }
}
