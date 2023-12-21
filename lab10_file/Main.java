public class Main {
    public static void main(String[] args) {
        /*Koncert koncert = new Koncert();
        LotMiedzynarodowy lot = new LotMiedzynarodowy();
        BramkaNaAutostradzie bramka = new BramkaNaAutostradzie();
        koncert.wystawBilet();
        lot.wystawBilet();
        bramka.wystawBilet();*/

        KierownikWycieczki kierownik = new KierownikWycieczki(new Koncert());
        kierownik.ogarnijBilet();
        kierownik = new KierownikWycieczki(new LotMiedzynarodowy());
        kierownik.ogarnijBilet();
        kierownik = new KierownikWycieczki(new BramkaNaAutostradzie());
        kierownik.ogarnijBilet();

        //Wykonaj poniższe czynności:
        //Stwórz interfejs Printer z metodą drukuj(String tekst).
        //Utwórz klasę StandardowyPrinter, która implementuje Printer i wypisuje tekst na konsolę.
        //Utwórz klasę Biuro, która posiada prywatne pole typu Printer. W konstruktorze Biuro przyjmij Printer jako argument i przypisz go do pola. Dodaj metodę drukujDokument(String tekst), która będzie delegować zadanie drukowania do obiektu klasy Printer.
        Biuro biuro = new Biuro(new StandardowyPrinter());
        biuro.drukujDokument("dokument 1");

        //Wykonaj poniższe czynności:
        //Stwórz interfejs Silnik z metodami uruchom() i zatrzymaj().
        //Utwórz klasę BenzynowySilnik, która implementuje Silnik i symuluje działanie silnika na benzynę.
        //Utwórz klasę Samochód, która posiada prywatne pole typu Silnik. W konstruktorze przyjmij Silnik jako argument. Dodaj metody start() i stop(), które będą delegować odpowiednio zadanie uruchomienia i zatrzymania silnika do obiektu klasy Silnik.

        Samochód auto = new Samochód(new BenzynowySilnik());
        auto.start();
        auto.stop();

        //Wykonaj poniższe czynności:
        //Stwórz interfejs Powiadomienie z metodą wyślij(String wiadomość).
        //Utwórz klasę Email, która implementuje Powiadomienie i symuluje wysyłanie wiadomości e-mail.
        //Utwórz klasę Użytkownik, która posiada prywatne pole typu Powiadomienie. W konstruktorze przyjmij Powiadomienie jako argument. Dodaj metodę powiadomOModernizacji(String informacja), która będzie delegować zadanie wysyłania powiadomienia do obiektu klasy Powiadomienie.

        Użytkownik użytkownik = new Użytkownik(new Email());
        użytkownik.powiadomOModernizacji("Informacja");

        //Napisz program, który definiuje metodę checkAge(int age). Metoda ta powinna rzucić wyjątek IllegalArgumentException z odpowiednim komunikatem, jeśli podany wiek jest mniejszy niż 18. W głównej metodzie programu (main) wywołaj checkAge z różnymi wartościami i obsłuż wyjątek, wyświetlając stosowny komunikat dla użytkownika.

        //Napisz program, który prosi użytkownika o wpisanie dwóch liczb, a następnie dzieli pierwszą liczbę przez drugą. Program powinien obsługiwać dwa rodzaje wyjątków: ArithmeticException w przypadku dzielenia przez zero i InputMismatchException, gdy użytkownik wprowadzi coś innego niż liczby. W obu przypadkach należy wyświetlić stosowny komunikat błędu i poprosić użytkownika o ponowne wprowadzenie danych. Wykorzystaj typ int.

        //Zaprojektuj i zaimplementuj klasę wyjątku NiepoprawnyFormatDanychException, która będzie rozszerzać klasę Exception. Następnie napisz metodę sprawdzFormatDanych(String dane), która rzuci wyjątek NiepoprawnyFormatDanychException, jeśli podany ciąg znaków nie odpowiada określonemu wzorcowi (np. nie jest adresem e-mail). W metodzie main przetestuj działanie tej metody, obsługując wyjątek i informując użytkownika o błędzie.
    }
}