package zad1; /// kazde zadanie w pakietach
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int a=scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(podziel(a, b));
                break;
            } catch (ArithmeticException e) {
                System.out.println("nie można dzielić przez 0");
            } catch (InputMismatchException f) {
                System.out.println("jedna z wprowadzonych liczb nie jest typu int");
                scanner.nextLine();
            }
        }

    }
    public static int podziel(int a, int b) {
        return a/b;
    }


}