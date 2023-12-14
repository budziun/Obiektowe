public class Main {
    public static void main(String[] args) {
        //Załóżmy, że mamy interfejs MusicPlayer z metodami turnOn(), turnOff() i nextTrack(). Stwórz klasę Radio, która będzie implementować ten interfejs. W metodzie turnOn() powinien zostać wydrukowany komunikat “Radio włączone”, w metodzie turnOff() - “Radio wyłączone”, a w nextTrack() - “Zmieniono stację radiową”.
        Radio radio = new Radio();
        radio.turnOn();
        radio.nextTrack();
        radio.turnOff();

        //Opracuj interfejs MediaPlayer z trzema abstrakcyjnymi metodami: play(String trackName) zwracającą void, pause() zwracającą void oraz getCurrentTrack() zwracającą String. Stwórz dwie klasy AudioPlayer i VideoPlayer, które implementują ten interfejs. W osobnej klasie MediaPlayerTest sprawdź działanie metod dla obiektów z obu klas.
        // MediaPlayerTest.java

        //Stwórz interfejs Storage z trzema metodami abstrakcyjnymi: save(String data) zwracającą boolean, delete(String identifier) zwracającą boolean oraz retrieve(String identifier) zwracającą String. Zaprojektuj dwie klasy FileStorage i DatabaseStorage, które implementują ten interfejs. W klasie StorageTest wykonaj testy metod dla obiektów z obu klas.
        // StorageTest.java

        //Wykonaj poniższe czynności:
        //Utwórz interfejs VehicleManager z dwoma metodami abstrakcyjnymi: startEngine() zwracającą String i getFuelLevel() zwracającą int.
        //Stwórz klasę Car, implementującą VehicleManager. W metodzie startEngine zwróć “Silnik samochodu uruchomiony”, a w getFuelLevel zwróć wartość 50.
        //Stwórz klasę Motorcycle, również implementującą VehicleManager. W startEngine zwróć “Silnik motocykla uruchomiony”, a w getFuelLevel zwróć wartość 30.
        //W klasie VehicleManagerTest stwórz obiekty obu klas i przetestuj ich metody.


    }
}