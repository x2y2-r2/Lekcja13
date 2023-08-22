package Zwierzaki;

public class SzkolonyPies extends Pies{
    //pole
    String skill;



    // konstruktor
    public SzkolonyPies(String imie, int wiek, String skill) {
        super(imie, wiek);  //super musi być na pierwszym miejscu w konstruktorze,
//        najpierw musimy utworzyć obiekt klasy bazowej a później dodamy do niego tę umiejętność,
        this.skill = skill;  // to musi być na drugim miejscu, bo nie mamy do czego dołożyć tej umiejętności,
    }

    @Override
    public void sayHallo() {
        System.out.println("Witaj! Jestem " + imie + " i potrafię " + skill);
    }
}
