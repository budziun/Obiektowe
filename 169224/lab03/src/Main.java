public class Main {
    public static void main(String[] args) {
        House domStefana = new House();
        domStefana.garage = true;
        domStefana.garden = false;
        domStefana.floors = 2;
        domStefana.area = 150;
        domStefana.rooms = 6;

        System.out.println(domStefana.getValue());

        House domSylwii = new House();
        domSylwii.garden = true;
        domSylwii.garage = false;
        domSylwii.area = 175;
        domSylwii.rooms =4;
        domSylwii.floors = 2;

        System.out.println(domSylwii.getValue());
        //Utwórz klasę Dog z polami: name, breed i age. Napisz metodę bark(), która wydrukuje na konsoli "Hau Hau". Stwórz przypadek testowy, aby wywołać metodę co najmniej jeden raz.
        Dog pies=new Dog();
        pies.age = 3;
        pies.breed = "owczarek";
        pies.name = "orzeł";
        pies.bark();
        //Stwórz klasę Car z polami: brand, model i speed. Napisz metody accelerate(int value) i decelerate(int value), które odpowiednio zwiększają i zmniejszają prędkość o podaną wartość. Stwórz przypadek testowy, aby wywołać każdą metodę co najmniej jeden raz.
        Car sraudi = new Car();
        sraudi.brand = "Audi";
        sraudi.model = "A4 B5";
        sraudi.speed = 180;

        //Stwórz klasę Time z polami: hours i minutes. Napisz metodę addTime(Time otherTime), która dodaje do bieżącego czasu czas podany jako argument i zwraca nowy obiekt klasy Time. Zadbaj o to, aby minuty i godziny nie przekraczały odpowiednio 59 i 23. Stwórz przypadek testowy, aby wywołać metodę co najmniej jeden raz.
        Time jeden = new Time();
        jeden.minutes = 38;
        jeden.hours=2;
        Time dwa = new Time();
        dwa.minutes = 35;
        dwa.hours = 3;
        Time trzy = jeden.addT(dwa);
        System.out.println(trzy.hours);
        System.out.println(trzy.minutes);
        trzy.print();
        //Wykonaj po kolei dwa podpunkty:
        //A. Stwórz klasę Car zawierającą pole brand. W klasie Main, utwórz obiekt klasy Car, przypisz mu wartość null i spróbuj odwołać się do pola brand. Jaki jest wynik?
        Car asterka = null;
        /*System.out.println(asterka.brand);*/
        // Exception in thread "main" java.lang.NullPointerException: Cannot read field "brand" because "asterka" is null
        //B. Zmodyfikuj kod z podpunktu A tak, aby sprawdzić, czy obiekt Car jest null przed odwołaniem się do pola brand. Jaki jest wynik?
        try{
            System.out.println(asterka.brand);
        }catch(NullPointerException e){
            System.out.println("asterka jest null wiec brand nie dziala");
        }
        //Stwórz obiekt klasy Dog z zadania pierwszego, i ustaw jego wartość na null. Spróbuj wykonać metodę  bark() na tym obiekcie.
        Dog pies2 = null;
        /*pies2.bark();*/
        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Dog.bark()" because "pies2" is null
        ///////////////////////////////////////////////////
        //Wykonaj kolejno poniższe czynności:
        //Stwórz klasę Czlowiek z polem imie. Dodaj do klasy metodę przedstawSie, która wyświetli wiadomość “Cześć, jestem” i imię osoby. W klasie Main, utwórz obiekt Czlowiek i wywołaj na nim metodę przedstawSie. Czy musisz użyć słowo kluczowe this w implementacji metody?
        //Dodaj do klasy Czlowiek metodę powiedzCzesc, która jako argument przyjmuje inny obiekt klasy Czlowiek i wyświetla wiadomość “Cześć,” i imię drugiego człowieka. Przeanalizuj działanie.
        //Dodaj do klasy Czlowiek metodę zmienImie, która jako argument przyjmuje łańcuch znaków i przypisuje go do pola imie. Utwórz obiekt Czlowiek i użyj metody zmienImie do zmiany jego imienia. Następnie wywołaj metodę przedstawSie. Czy imię zostało zmienione? Czy musisz użyć słowo kluczowe this w implementacji metody?
        //Dodaj do klasy Czlowiek metodę zamienImionami, która jako argument przyjmuje inny obiekt klasy Czlowiek i zamienia imionami obie osoby. Utwórz dwa obiekty Czlowiek i użyj metody zamienImionami do zamiany ich imion. Następnie wywołaj metodę przedstawSie na obu obiektach. Czy imiona zostały zamienione?

        //Wykonaj kolejno poniższe czynności:
        //Stwórz klasę Licznik z jednym polem liczba. Dodaj do klasy metodę zwieksz, która przyjmuje parametr typu int i zwiększa wartość pola liczba o wartość tego parametru. W klasie Main, utwórz zmienną typu int, przekaż ją do metody zwieksz i sprawdź, czy wartość zmiennej zmieniła się po wywołaniu metody.
        //Dodaj do klasy Licznik metodę dodaj, która przyjmuje inny obiekt Licznik i dodaje wartość jego pola liczba do pola liczba bieżącego obiektu. Utwórz dwa obiekty Licznik w klasie Main i użyj metody dodaj. Sprawdź, czy obiekt przekazany jako argument metody dodaj zmienił swoją wartość po wywołaniu metody.
        //Stwórz klasę Zmieniacz, która posiada metodę zmienWartosc, która jako argument przyjmuje typ int. Wewnątrz metody zmień wartość argumentu na inną. W klasie Main utwórz zmienną int, a następnie przekaż ją do metody zmienWartosc i sprawdź, czy wartość zmiennej się zmieniła.
        //Dodaj do klasy Zmieniacz metodę zmienObiekt, która jako argument przyjmuje obiekt Licznik. Wewnątrz metody zmień wartość pola liczba obiektu Licznik na inną. W klasie Main utwórz obiekt Licznik, a następnie przekaż go do metody zmienObiekt i sprawdź, czy wartość pola liczba obiektu się zmieniła.

        //Utwórz klasę Osoba z publicznym polem imie oraz prywatnym polem haslo. Zobacz jak różne modyfikatory dostępu wpływają na dostęp do tych pól z innej klasy.

    }
}