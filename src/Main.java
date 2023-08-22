import Dom.Obywatel;
import Zwierzaki.Pies;
import Zwierzaki.SpiacyPies;
import Zwierzaki.SzkolonyPies;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;  // Dzięki temu importowi statycznego, nie musimy się do metody odwoływać przez klasę,
// tylko bezpośrednio wywołujemy metody


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //        1. Pakiety - utworzyć zmienna typu LocalDate. Co oznacza ten import?
        LocalDate szkola; // zmienna "szkoła" typu LocalDate, klasa LocalDate importowana z pakietu z java.time,
        // Pakiety tworzymy w celu organizacji projektu i uniknięcia konfliktu nazw.
        // Umożliwia to np. robienie w projektach powiązane ze sobą grupy klas.

        //        2. Tworzenie pakietów.
//        Zadanie:
//              - utwórz pakiet dom
//              - utwórz pakiet firma
//              - w obu pakietach utwórz klasę Obywatel
//              - stwórz obiekty obu klas w Main
//

        Obywatel domowaOsoba = new Obywatel(); //Obiekt klasy obywatek z pakietu Dom
        Firma.Obywatel firmowyObywatel = new Firma.Obywatel(); // sięgając po klasę o tej samej nazwie, ale z innego pakietu,
//        to podajemy pełną ścieżkę do tego pakietu, inaczej mamy konflikt nazw

        String tekst = "cos";

//        3. Importowanie statyczne
//        służy do importowania metod statycznych (czyli metod, które działają na rzecz klasy, a nie konkretnego obiektu)

//        double pow = Math.pow(2, 2); // klasa Math, metoda podnoszenia liczby do potęgi
        double pow = pow(2, 2);  //jeżeli dokonam importu statycznego, to mogę pisać w postaci skróconej (tylko "pow")

//
//        4. Modyfikatory dostępu.
//        W klasie Osoba w pakiecie dom stwórzmy publiczną metodę siema()
//        Wywołajmy ją w Main
//        domowaOsoba.siema();

//        Usunąć jej modyfikator dostepu.- Jeżeli jej usuniemy modyfikator dostępu public, to metoda nie uruchamia się w Main.
//        działa tylko w obrębie swojej klasy.

//        Czy da się jej użyć w pakiecie nadrzędnym?
//        public vs package-private - public tylko w obrębie projektu, package-private tylko w obrębie pakietu
//        protected - jest dostępne w obrębie pakietu i klasach dziedziczących
//        private - metoda dostępna jest tylko w swojej klasie

        domowaOsoba.powitac("Staszek");
        domowaOsoba.powitajWielokrotnie("Stachu", 3);

//        W klasie obywatel, mamy metodę publiczną powitaj, który wykorzystuje metodę siema, która jest prywatna
        System.out.println("===================");
//        5. Dziedziczenie

//        Klasy mogą po sobie dziedziczyć. W Javie można dziedziczyć tylko po jednej klasie.
//        Stwórz klasę Pies posiadającą imię i wiek. Utwórz odpowiedni konstruktor.
        Pies burek = new Pies("Burek", 4);
        burek.sayHallo();

        //        Stwórz klasę SpiacyPies posiadającą imię i wiek. Utwórz odpowiedni konstruktor.

        Pies azor = new SpiacyPies("Azor", 2); //dziedziczenie określa nam między klasami relacje typu "jest"
//        SpiacyPies jest Pies, wiec mogę do typu bazowego przypisać tym dziedziczący.

//        może być również
//        SpiacyPies azor = new SpiacyPies("Azor", 2);

//        Stwórz obiekt Pies i wywołaj metodę sayHallo()

//        azor.sayHallo(); // - teraz ta metoda mówi to samo co Pies z klasy bazowej

//        Utwórz klasę SpiacyPies, który na powitanie będzie mówił
//        "Nie chce mi się z Tobą gadać!
//        Musimy nadpisać metodę sayHallo w klasie SpiacyPies


        azor.sayHallo(); // - teraz mówi coś innego, ponieważ nadpisaliśmy metodę bazową




//        Stwórz klasę SzkolonyPies dziedziczącą po Pies, z dodatkowym polem umiejętność.
//        Utwórz konstruktor, który będzie przyjmował dodatkowy argument
//        Klasa SzkolonyPies ma nadpisywać metodę sayHello(), tak aby witał się imieniem, wiekiem oraz umiejętnością.

        Pies czesiu = new SzkolonyPies("Czesiu", 10, "maluje");
        czesiu.sayHallo();

//        Stwórz listę i wywołaj sayHallo() dla wszystkich obiektów
        System.out.println("------------------------");

        List<Pies> pieski = new ArrayList<>();
        pieski.add(burek);
        pieski.add(azor);
        pieski.add(czesiu);

        for (Pies pies : pieski) {
            pies.sayHallo();   //obiekty innych klas zebraliśmy sobie w jedną listę dzięki temu, że pozostałe klasy rozszerzają klasę Pies
//          jest to POLIMORFIZM
//        CO TO POLIMORFIZM?
//        Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
//        Polimorfizm oznacza, że możemy w miejsce klasy bazowej podstawić dowolny element z klasy dziedziczącej.
        }

    }
}