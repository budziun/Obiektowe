package zad5;

public class Email implements Powiadomienie{

    @Override
    public void wyślij(String wiadomość) {
        System.out.println("Wysłano email "+ wiadomość);
    }
}
