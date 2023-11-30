public class Main {
    public static void main(String[] args) {
        Animal zwierz = new Animal("Zebra",1,13);
        Animal zwierz2 = new Animal("Zebra",2,13);
        System.out.println(Integer.toHexString(zwierz2.hashCode())+
                "\n"+Integer.toHexString(zwierz.hashCode()));

        Person p1 = new Person("Adam",15);
        Person p2 = new Person("Adam",-15);
        System.out.println(p1.equals(p2));
        Person.greet();

        //Stwórz rekord BookDTO, który reprezentuje książkę w sklepie internetowym. Powinien zawierać takie informacje jak title, author, price i yearOfPublication. Następnie stwórz kilka instancji tego rekordu, reprezentujących różne książki.
        BookDTO book1 = new BookDTO("tytul","autor",19.99,2023);
        System.out.println(book1);
        BookDTO book2 = new BookDTO("inny tytul","inny autor",39.98,2000);
        System.out.println(book2);

        //Utwórz rekord Address, który zawiera street, houseNumber, postalCode i city. Następnie, stwórz rekord Person, który oprócz podstawowych informacji o osobie (np. firstName, lastName) zawiera również pole typu Address. Stwórz przypadek testowy.
        Address address = new Address("Iwaszkiewicza",123,"87-220","Olsztyn");
        System.out.println(address);
        Person2 osoba = new Person2("Jakub","Budzich",address);
        System.out.println(osoba);

        //Stwórz rekord BankAccount, który zawiera numer konta oraz saldo. Dodaj konstruktor, który pozwala na tworzenie konta tylko z numerem, przy czym domyślne saldo wynosi 0. Stwórz przypadek testowy.
        BankAccount konto1 = new BankAccount(123456);
        System.out.println(konto1);

        //Stwórz rekord MusicTrack, który opisuje tytuł, artystę i czas trwania utworu w sekundach. Dodaj konstruktor, który przyjmuje tylko tytuł i artystę, przyjmując domyślną długość utworu jako 180 sekund. Stwórz przypadek testowy.
        MusicTrack utwor1 = new MusicTrack("SIRI","OKI");
        System.out.println(utwor1);

        //Stwórz rekord Car, który zawiera brand, model i fuelConsumptionPer100km. Dodaj metodę fuelCost(double fuelPrice, double distance), która oblicza i zwraca koszt podróży na podstawie podanej ceny paliwa oraz dystansu. Stwórz przypadek testowy.
        Car auto1 = new Car("Audi","A4",6);
        auto1.fuelCost(100,6.6);
    }
}