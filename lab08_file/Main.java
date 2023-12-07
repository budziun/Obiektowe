import java.util.ArrayList;
import java.util.Collections;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Osoba o1 = new Osoba("Stefan",182,21);
        Osoba o2 = (Osoba) o1.clone();
        System.out.println(o1 + " " + o2);
        o2.age = 95;
        System.out.println(o1 + " " + o2);
        //Napisz klasę Ksiazka, która zawiera pola: tytul (typu String), liczbaStron (typu int) i dataWydania (typu LocalDate). Zaimplementuj interfejs Comparable w taki sposób, aby obiekty klasy Ksiazka były sortowane malejąco według liczby stron. Stwórz tablicę 4 obiektów klasy Ksiazka i posortuj ją według sprecyzowanego kryterium.
        ArrayList<Ksiazka> ksiazkaList = new ArrayList<>();
        ksiazkaList.add(new Ksiazka("tytul1",33));
        ksiazkaList.add(new Ksiazka("tytul2",14));
        ksiazkaList.add(new Ksiazka("tytul3",13));
        ksiazkaList.add(new Ksiazka("tytul4",133));
        System.out.println(ksiazkaList);
        Collections.sort(ksiazkaList);
        System.out.println(ksiazkaList);
        //Napisz klasę Samochod, która zawiera pola: marka (typu String), przebieg (typu int) i rokProdukcji (typu int). Zaimplementuj interfejs Comparable w taki sposób, aby obiekty klasy Samochod były sortowane rosnąco według przebiegu. Stwórz tablicę 4 obiektów klasy Samochod i posortuj ją według sprecyzowanego kryterium.
        ArrayList<Samochod> samochodList = new ArrayList<>();
        samochodList.add(new Samochod("audi",350000,2003));
        samochodList.add(new Samochod("bmw",150000,1995));
        samochodList.add(new Samochod("mazda",900000,2000));
        samochodList.add(new Samochod("toyota",600000,2010));
        System.out.println(samochodList);
        Collections.sort(samochodList);
        System.out.println(samochodList);
        //Napisz klasę Zamowienie, która zawiera pola: nazwaProduktu (typu String), ilosc (typu int) i cenaJednostkowa (typu double). Zaimplementuj interfejs Comparable w taki sposób, aby obiekty klasy Zamowienie były sortowane według jednego kryterium: malejąco według ceny jednostkowej, a przy równości sortowane były rosnąco według ilości. Stwórz listę tablicową 4 obiektów klasy Zamowienie i posortuj ją według sprecyzowanego kryterium.
        ArrayList<Zamowienie> zamowienieList = new ArrayList<>();
        zamowienieList.add(new Zamowienie("mleko",12,3));
        zamowienieList.add(new Zamowienie("jajka",3,3));
        zamowienieList.add(new Zamowienie("mąka",5,5));
        zamowienieList.add(new Zamowienie("cukier",1,6));
        System.out.println(zamowienieList);
        Collections.sort(zamowienieList);
        System.out.println(zamowienieList);
        //Napisz klasę Order z polami id (typu int), customerName (typu String) oraz orderDate (typu LocalDate). Stwórz nową klasę i zaimplementuj w niej interfejs Comparator do porównywania obiektów po polu orderDate (od najwcześniejszej do najpóźniejszej daty), a w przypadku równości po polu id. Stwórz listę 5 obiektów klasy Order i posortuj ją zgodnie z opisanym kryterium.
        ArrayList<Order> orderList = new ArrayList<>();
        orderList.add(new Order(1, "John Doe", LocalDate.of(2023, 1, 15)));
        orderList.add(new Order(2, "Jane Smith", LocalDate.of(2023, 3, 8)));
        orderList.add(new Order(3, "Bob Johnson", LocalDate.of(2023, 2, 1)));
        orderList.add(new Order(4, "Alice Brown", LocalDate.of(2023, 3, 8)));
        orderList.add(new Order(5, "Charlie Wilson", LocalDate.of(2023, 1, 15)));
        Collections.sort(orderList, new OrderComparator());
        System.out.println(orderList);
        //Napisz klasę Song z polami title (typu String), artist (typu String) oraz duration (typu int). Stwórz nową klasę i zaimplementuj w niej interfejs Comparator do porównywania obiektów po polu duration (od najkrótszej do najdłuższej piosenki), a w przypadku równości po polu title. Stwórz tablicę 5 obiektów klasy Song i posortuj ją zgodnie z opisanym kryterium.

        //Napisz klasę Student z polami id (typu int), name (typu String) oraz averageGrade (typu double). Zaimplementuj dwie klasy implementujące generyczny interfejs Comparator: AverageGradeComparator do porównywania obiektów po polu averageGrade (od najwyższej do najniższej średniej ocen) oraz IdComparator do porównywania obiektów po polu id (od najniższego do najwyższego identyfikatora). Stwórz listę 5 obiektów klasy Student i posortuj ją zgodnie z oboma kryteriami (najpierw po średniej ocen, a następnie po identyfikatorze).

        //Napisz klasę Athlete z dwoma polami: name (String) i lapTimes (lista tablicowa zmiennych typu Integer, reprezentująca czas w sekundach potrzebny na przebiegnięcie okrążenia podczas różnych prób). Zaimplementuj interfejs Cloneable i nadpisz metodę clone(), aby móc klonować obiekty tej klasy. W metodzie main() utwórz obiekt Athlete, sklonuj go, a następnie zmień czas na pozycji 3 oryginalnego sportowca. Wyświetl czasy obu sportowców, aby zobaczyć, czy są niezależne.

    }
}