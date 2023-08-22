package Dom;

public class Obywatel {

    public void powitajWielokrotnie (String Imie, int ileRazy) {
        for(int i = 0; i < ileRazy; i++) {
            powitac(Imie);
            }
    }

    public void powitac (String imie) {
        siema();
        System.out.println(imie);
    }

    private void siema () {
        System.out.println("Siema!");
    }
}
