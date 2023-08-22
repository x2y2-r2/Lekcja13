package Zwierzaki;

public class Pies {
    String imie;
    int wiek;

    public Pies(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public void sayHallo() {
        System.out.println("Siema, jestem " + imie + " i mam " + wiek + " lat" );
    }
}
