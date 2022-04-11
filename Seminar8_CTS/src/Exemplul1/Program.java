package Exemplul1;


public class Program {

    public static void main(String[] args) {
        MijlocDeTransport autobuz = new Autobuz(168);
        ICalator c1 = new Calator("Andrei");
        ICalator c2 = new Calator("Mihai");
        ICalator c3 = new Calator("Vlad");

        autobuz.adaugaCalator(c1);
        autobuz.adaugaCalator(c2);

        autobuz.anuntaCalatori();

        autobuz.stergeCalator(c2);
        autobuz.adaugaCalator(c3);

        autobuz.anuntaCalatori();
    }
}
