public class Main {
    public static void main(String[] args) {
        //Napisz klasę Ksiazka, która będzie zawierać trzy pola: tytul, autor, rokWydania. Następnie zaimplementuj dwa konstruktory - jeden domyślny, który nie przyjmuje żadnych argumentów, i drugi, który przyjmuje trzy argumenty odpowiadające polom klasy. W przypadku drugiego konstruktora, nazwy parametrów muszą być takie same jak nazwy pól. Sprawdź czy jesteś w stanie prawidłowo przypisać wartości do pól klasy używając słowa kluczowego this.

        Ksiazka k1 = new Ksiazka();
        //System.out.println(k1.tytul);
        Ksiazka k2 = new Ksiazka("Bill Gatsby","FSJ",1585);
        //System.out.println(k2.tytul);

        //Stwórz klasę Samochod, która będzie zawierać trzy pola: marka, model, rokProdukcji. Zaimplementuj trzy konstruktory - pierwszy domyślny, drugi przyjmujący dwa argumenty (marka i model), trzeci przyjmujący trzy argumenty (marka, model, rokProdukcji). W przypadku drugiego i trzeciego konstruktora, nazwy parametrów muszą być takie same jak nazwy pól. Wykorzystaj słowo kluczowe this do rozróżnienia pól klasy od parametrów.

        Samochod car1 = new Samochod("BMW","e36");
        //System.out.println(car1.rokProdukcji);
        Samochod car2 = new Samochod("Audi","A4 B5",1998);
        //System.out.println(car2.rokProdukcji);
        Samochod car3 = new Samochod();

        //Napisz klasę Osoba, która będzie miała pola: imie, nazwisko i wiek. Zdefiniuj w niej dwa konstruktory, jeden przyjmujący wszystkie trzy parametry, a drugi tylko imię i nazwisko. Drugi konstruktor powinien wywołać pierwszy, przekazując mu domyślną wartość wieku jako 0.

        Osoba o1 = new Osoba("Grzegorz","Brzęczyszczykiewicz");
        //System.out.println(o1.wiek);
        Osoba o2 = new Osoba("Jan","Nowak",47);
        //System.out.println(o2.wiek);

        //Zaprojektuj klasę Kwadrat, która posiada pole bok oraz konstruktor, który umożliwia ustawienie wartości tego pola. Następnie napisz drugi konstruktor, który nie przyjmuje żadnych argumentów, a jedynie wywołuje pierwszy konstruktor z wartością domyślną 1

        Kwadrat kw1 = new Kwadrat();
        //System.out.println(kw1.bok);

        //Napisz klasę Student, która ma pola: imie, nazwisko i kierunekStudiow. Zdefiniuj w niej dwa konstruktory, jeden przyjmujący wszystkie trzy parametry, a drugi tylko imię i nazwisko. Drugi konstruktor powinien wywoływać pierwszy, przekazując mu domyślną wartość kierunku studiów jako nieznany

        Student s1 = new Student("Jakub","Budzich");
        //System.out.println(s1.kierunekStudiow);

        //Stwórz klasę Osoba. Klasa powinna zawierać pole imienne oraz statyczne pole licznik. Zadaniem jest zwiększanie wartości licznik za każdym razem, gdy tworzona jest nowa instancja klasy Osoba. Dodaj metodę, która zwróci wartość licznik. Stwórz przypadek testowy.

        Osoba2 os1 = new Osoba2();
        Osoba2 os2 = new Osoba2();
        System.out.println(os1.licznik);
        Osoba2 os3 = new Osoba2();
        Osoba2 os4 = new Osoba2();
        System.out.println(os1.licznik);

        //Stwórz klasę Matematyka, która posiada pole statyczne PI, które przechowuje przybliżoną wartość liczby . Upewnij się, że wartość tego pola jest niemutowalna. Stwórz przypadek testowy

        System.out.println(Matematyka.PI);

        //Stwórz klasę Kalkulator, która posiada podstawowe metody matematyczne: dodawanie, odejmowanie, mnożenie i dzielenie. Zaimplementuj te metody jako metody statyczne. Utwórz drugą klasę, w której przetestujesz te metody bez tworzenia instancji klasy Kalkulator.

        System.out.println(Kalkulator.dodawanie(15,7));
        System.out.println(Kalkulator.odejmowanie(15,7));
        System.out.println(Kalkulator.mnozenie(15,7));
        System.out.println(Kalkulator.dzielenie(15,7));

        //Stwórz klasę Produkt, która zawiera pole statyczne liczbaProduktow oraz pole statyczne MAX_PRODUKTOW. Pole liczbaProduktow będzie służyć do zliczania ilości utworzonych produktów, a MAX_PRODUKTOW do ograniczenia ich liczby. Oznacz tylko jedno z tych pól słowem kluczowym final i zastanów się nad konsekwencjami tego wyboru.

        Produkt pr1 = new Produkt();

        //Stwórz klasę Singleton, która używa pola statycznego do przechowywania jednej i tylko jednej instancji tej klasy. Klasa powinna zawierać prywatny konstruktor oraz publiczną statyczną metodę getInstance(), która zwraca jedyną instancję klasy Singleton. Stwórz przypadek testowy.

        

    }
}