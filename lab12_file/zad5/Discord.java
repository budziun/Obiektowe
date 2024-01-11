package zad5;

public class Discord implements Powiadomienie{

    @Override
    public void wyślij(String wiadomość) {
        System.out.println("Wysłano wiadomosc "+ wiadomość);
    }
}
