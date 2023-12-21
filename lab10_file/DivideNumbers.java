import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Wprowadź pierwszą liczbę: ");
                int liczba1 = scanner.nextInt();

                System.out.print("Wprowadź drugą liczbę: ");
                int liczba2 = scanner.nextInt();

                int wynik = liczba1 / liczba2;
                System.out.println("Wynik dzielenia: " + wynik);

                break;

            } catch (ArithmeticException e) {
                System.err.println("Błąd: Nie można dzielić przez zero. Spróbuj ponownie.");

            } catch (InputMismatchException e) {
                System.err.println("Błąd: Wprowadź poprawną liczbę. Spróbuj ponownie.");
                scanner.next();
            }
        }
        scanner.close();
    }
}