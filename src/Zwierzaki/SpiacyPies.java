package Zwierzaki;

public class SpiacyPies extends Pies {

    // konstruktor obiektu klasy pochodnej, tworzony na podstawie obiekt klasy bazowej
    public SpiacyPies(String imie, int wiek) {
        super(imie, wiek);  // super- wywołanie konstruktora z klasy bazowej
    }

    @Override  // nadpisanie metody w klasie dziedziczącej
    public void sayHallo() {
        System.out.println("Nie chce mi się z Tobą gadać!");
    }
}
