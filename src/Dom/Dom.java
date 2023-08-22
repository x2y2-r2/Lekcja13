package Dom;

public class Dom {
    Obywatel obywatel;

//    konstruktor
    public Dom () {
        obywatel = new Obywatel();
//        obywatel.siema();  // pomimo braku modyfikatora dostępu public, tutaj nam wszystko działa,
//        dlatego, że wyżucenie modyfikatora dostępu, metoda stała się package private, czyli dostępna tylko w obrębie pakietu
        obywatel.powitac("Tom"); //dostajemy się do metody siema za pomocą publicznej metody powitać
//        taki sposób pozwala na uniknięcie powielania kodu
    }
}
