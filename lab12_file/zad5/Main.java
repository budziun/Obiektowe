package zad5;

public class Main {
    public static void main(String[] args) {
        //Wykonaj poniższe czynności:
        //Stwórz interfejs Powiadomienie z metodą wyślij(String wiadomość).
        //Utwórz klasę Email, która implementuje Powiadomienie i symuluje wysyłanie wiadomości e-mail.
        //Utwórz klasę Użytkownik, która posiada prywatne pole typu Powiadomienie. W konstruktorze przyjmij Powiadomienie jako argument. Dodaj metodę powiadomOModernizacji(String informacja), która będzie delegować zadanie wysyłania powiadomienia do obiektu klasy Powiadomienie.
        // i klasa discord z tym uzytkownik
        Powiadomienie email = new Email();
        Powiadomienie discord = new Discord();
        Uzytkownik uzytkownik = new Uzytkownik(email);
        Uzytkownik uzytkownikdc = new Uzytkownik(discord);
        uzytkownik.powiadomOModernizacji("Przerwa techniczna gmaila");
        uzytkownikdc.powiadomOModernizacji("Serwery discorda sie wykrecily");
    }
}
