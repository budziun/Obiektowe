Intellij idea
        openjdk21

        sout i tab zeby wpisac system.out.println

//kalkulator
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        double liczba1 = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę");
        double liczba2 = scanner.nextDouble();
        System.out.println("wynik dodawania to: "+(liczba1+liczba2));
        System.out.println("wynik odejmowania to: "+(liczba1-liczba2));
        System.out.println("wynik mnożenia to: "+(liczba1*liczba2));
        System.out.println("wynik dzielenia to: "+(liczba1/liczba2));
    }
}
//dwa stringi dodac
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszy znak");
        String str1 = scanner.next();
        System.out.println("Podaj drugi znak");
        String str2 = scanner.next();
        System.out.println("Wynik: "+str1+str2);
    }
}
//Napisz program, który wczytuje ze standardowego wejścia cztery liczby wymierne, a następnie wypisuje ich sumę na standardowym wyjściu.
//Stwórz program do obliczenia pola kwadratu. Dane pobierz od użytkownika, wynik wyświetl na standardowym wyjściu.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // zad 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbe");
        int liczba1= scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        int liczba2= scanner.nextInt();
        System.out.println("Podaj trzecia liczbe");
        int liczba3= scanner.nextInt();
        System.out.println("Podaj czwarta liczbe");
        int liczba4= scanner.nextInt();
        double wynik=(liczba1+liczba2+liczba3+liczba4);
        double wynik2=(wynik/4);
        System.out.println(wynik2);
        // zad 2
        System.out.println("Podaj bok kwadratu");
        double bok1=scanner.nextDouble();
        System.out.println("Pole kwadratu: "+(bok1*bok1));
    }
}
//Napisz program, który przyjmuje trzy liczby całkowite jako argumenty i zwraca największą z nich. Zastosuj instrukcje warunkowe do porównania liczb.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbe");
        int liczba1= scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        int liczba2= scanner.nextInt();
        System.out.println("Podaj trzecia liczbe");
        int liczba3= scanner.nextInt();
        if(liczba1>liczba2 && liczba1>liczba3){
            System.out.println(liczba1);
        }
        if(liczba2>liczba1 && liczba2>liczba3){
            System.out.println(liczba2);
        }
        if(liczba1==liczba2 && liczba1==liczba3){
            System.out.println(liczba1);
        }
        if(liczba3>liczba1 && liczba3>liczba2){
            System.out.println(liczba3);
        }
    }
}
//Napisz program, który na podstawie podanego jako argument numeru dnia tygodnia (od 1 do 7) wypisze nazwę tego dnia tygodnia. Dla przykładu, jeżeli użytkownik poda liczbę 1, program powinien wypisać “Poniedziałek”. Jeżeli podana liczba nie jest z zakresu od 1 do 7, program powinien wyświetlić komunikat “Niepoprawny numer dnia tygodnia”.
import java.util.Scanner;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe od 1 do 7");
        int liczba= scanner.nextInt();
        if(liczba==1){
            System.out.println("Poniedziałek");
        }
        else if(liczba==2){
            System.out.println("Wtorek");
        }
        else if(liczba==3){
            System.out.println("Środa");
        }
        else if(liczba==4){
            System.out.println("Czwartek");
        }
        else if(liczba==5){
            System.out.println("Piątek");
        }
        else if(liczba==6){
            System.out.println("Sobota");
        }
        else if(liczba==7){
            System.out.println("Niedziela");
        }
        else {
            System.out.println("Podałeś złą liczbę");
        }
    }
}

//Napisz program, który będzie sprawdzał, czy podany rok jest rokiem przestępnym. Rok jest przestępny, jeśli jest podzielny przez 4, ale nie jest podzielny przez 100, chyba że jest podzielny przez 400
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe rok");
        int rok= scanner.nextInt();
        if(rok%4==0 && rok%100!=0){
            System.out.println("Rok przestępny");
        }
        else if (rok%400==0 && rok%4==0) {
            System.out.println("Rok przestępny");
        }
        else{
            System.out.println("Rok nie przestępny");
        }
    }
}
    //Napisz program sprawdzający czy podane liczby z klawiatury mogą stanowić poprawna godzinę w formacie 24-godzinnym.
    Przykładowe wejście:
        Podaj godzinę: 22
        Podaj minuty: 12
        Podaj sekundy: 33
        Przykładowe wyjście:
        Poprawna godzina!
/////////////////
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe godzine");
        int godzina= scanner.nextInt();
        System.out.println("Podaj minute godzine");
        int minuta= scanner.nextInt();
        System.out.println("Podaj sekunde godzine");
        int sekunda= scanner.nextInt();
        if(godzina<24 && minuta<60 && sekunda<60){
            System.out.println("Poprawna godzina!");
        }
        else{
            System.out.println("Błędna godzina :(((");
        }
    }
}
//Napisz program, który wykorzystując pętlę for wyświetli liczby od 1 do 100.
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.printf(i+" ");
        }
    }
}
//Napisz program, który przy użyciu pętli while obliczy sumę liczb od 1 do 50.
public class Main {
    public static void main(String[] args) {
        int wynik=0;
        int i=0;
        while(i<=50){
            wynik=wynik+i;
            i++;
        }
        System.out.println(wynik);
    }
}
//Napisz program, który oblicza sumę cyfr dowolnej wprowadzonej liczby. Program powinien akceptować liczbę jako input od użytkownika.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int liczba= scanner.nextInt();
        int suma=0;
        int temp=0;
        temp=liczba;
        while(temp>0)
        {
            suma=suma+temp%10;
            temp=temp/10;
        }
        System.out.println(suma);
        suma=0;
    }
}
//Stwórz program, który przyjmie od użytkownika liczbę całkowitą i zwróci tę liczbę w odwrotnej kolejności. Na przykład, dla liczby 12345, wynik powinien wynosić 54321. Możesz ograniczyć program tylko do liczb dodatnich.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();
        int odwroconaLiczba = odwrocLiczbe(liczba);
        System.out.println("Liczba w odwrotnej kolejności: " + odwroconaLiczba);
    }

    public static int odwrocLiczbe(int liczba) {
        int odwroconaLiczba = 0;
        while (liczba != 0) {
            int cyfra = liczba % 10; // Pobierz ostatnią cyfrę
            odwroconaLiczba = odwroconaLiczba * 10 + cyfra; // Dodaj cyfrę do odwroconej liczby
            liczba /= 10; // Usuń ostatnią cyfrę z liczby
        }
        return odwroconaLiczba;
    }
}
//Napisz program, który sprawdzi, czy podana liczba jest liczbą Armstronga. Liczba Amstronga to taka, której suma jej cyfr podniesionych do potęgi równiej liczbie cyfr w tej liczbie, jest równa samej liczbie. (Liczba 153 jest liczbą Armstronga)
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę do sprawdzenia: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " jest liczbą Armstronga.");
        } else {
            System.out.println(number + " nie jest liczbą Armstronga.");
        }
    }

    // Funkcja do sprawdzania, czy liczba jest liczbą Armstronga
    static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int numberOfDigits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        return sum == originalNum;
    }
}
//Napisz program wczytujący kolejne liczby całkowite (różnych znaków) z klawiatury i kończący się gdy ich suma przekroczy 100.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        while (suma < 101) {
            System.out.println("Podaj liczbe");
            int liczba= scanner.nextInt();
            suma = suma + liczba;
        }
    }
}

