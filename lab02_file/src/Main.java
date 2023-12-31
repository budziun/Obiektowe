import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static Random random = new Random();
    public static void main(String[] args) {
        //System.out.println(generateRandomBoolean());
        //System.out.println(Tablicasrednia());
        //MinMaxTab();
        //Piramida();
        //Usuwanie();
        //reverseString();
        //lista();
        //System.out.println(sumdouble());
        List<Double> lista1 = List.of(1.0, 2.137, 3.0, 4.0, 5.0);
        double srednia = average(lista1);
        System.out.println("Srednia: "+srednia);
        List<Integer> lista = new ArrayList<>();
        lista.add(0);
        lista.add(1);
        lista.add(2);
        lista.add(0);
        lista.add(3);
        lista.add(0);
        lista.add(4);
        int iloscZer = countZeros(lista);
        System.out.println("Liczba wystąpień zera: " + iloscZer);
    }
    //Napisz metodę generateRandomInt, która generuje i zwraca losową liczbę całkowitą.
    public static int generateRandomInt(){
        return random.nextInt();
    }
    //Napisz metodę generateRandomDouble, która generuje i zwraca losową liczbę zmiennoprzecinkową z zakresu od 0.0 do 1.0
    public static double generateRandomDouble(){
        return random.nextDouble();
    }
    //generateRandomGaussian, która generuje i zwraca losową liczbę zmiennoprzecinkową zgodnie z rozkładem normalnym.
    public static double generateRandomGaussian(){
        return random.nextGaussian();
    }
    //Napisz metodę generateRandomBoolean, która generuje i zwraca losową wartość logiczną (true lub false)
    public static boolean generateRandomBoolean(){
        return random.nextBoolean();
    }
    //Napisz program, który tworzy tablicę jednowymiarową 10 liczb całkowitych, a następnie wyświetla je w konsoli w porządku odwrotnym do wprowadzenia
    public static void Tablica(){
        int[] tab = {0,1,2,3,4,5,6,7,8,9};
        for(int j=9;j>=0;j--){
            System.out.println(tab[j]);
        }
    }
    //Utwórz program, który tworzy jednowymiarową tablicę 20 liczb losowych z przedziału od 1 do 100, a następnie oblicza i wyświetla ich średnią wartość
    public static double Tablicasrednia(){
        int[] tab = new int[20];
        for(int i=0;i<20;i++){
            tab[i]=random.nextInt(1,100);
        }
        double wynik=0;
        for(int j=0;j<20;j++){
            wynik=wynik+tab[j];
        }
        return wynik/20;
    }
    //Napisz program, który tworzy tablicę jednowymiarową 15 liczb całkowitych, a następnie oblicza i wyświetla największą i najmniejszą wartość w tablicy
    public static void MinMaxTab(){
        int[] tab = new int[15];
        for(int i=0;i<15;i++) {
            tab[i] = random.nextInt(1, 100);
        }
        int min = tab[0];
        int max = tab[0];
        for(int j=1;j<15;j++){
            if(tab[j]<min){
                min=tab[j];
            }
            if(tab[j]>max){
                max=tab[j];
            }
        }
        System.out.println("Najmniejszy element tablicy: "+min);
        System.out.println("Najwiekszy  element tablicy: "+max);
    }
    //Napisz program, który przyjmuje jako wejście pojedynczy znak oraz liczbę całkowitą n. Używając klasy StringBuilder, zbuduj i wypisz piramidę o wysokości n, gdzie każdy poziom piramidy składa się z podanego znaku. Na przykład dla znaku * i n=3, oczekiwany wynik to:
    public static void Piramida()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj znak");
        String znak=scanner.next();
        System.out.println("Podaj wysokosc");
        int wysokosc=scanner.nextInt();

        for (int i=0;i<wysokosc;i++)
        {
            int liczbaspacji=wysokosc-i-1;
            int liczbaznakow=2*i+1;
            StringBuilder sb= new StringBuilder();
            while(liczbaspacji-->0)
            {
                sb.append(' ');
            }
            while(liczbaznakow-->0)
            {
                sb.append(znak);
            }
            System.out.println(sb.toString());
        }
    }
    //Dany jest napis. Używając StringBuilder, napisz program, który usuwa wszystkie powtarzające się znaki, pozostawiając tylko pierwsze wystąpienie każdego znaku. Na przykład dla napisu “bananowy”, oczekiwany wynik to “banowy”.
    public static void Usuwanie(){
        String napis = "banannowy";
        StringBuilder result = new StringBuilder();
        for(int i=0;i<napis.length();i++){
            char currentChar = napis.charAt(i);
            if(result.indexOf(String.valueOf(currentChar))==-1){
                result.append(currentChar);
            }
        }
        System.out.println(result.toString());
    }
    //Napisz metodę statyczną reverseString, która przyjmuje jako argument obiekt typu StringBuilder i zwraca nowy StringBuilder, będący odwróconym napisem pierwotnym.
    public static void reverseString(){
        System.out.println("Podaj słowo: ");
        Scanner scanner = new Scanner(System.in);
        String slowo = scanner.next();
        StringBuilder sb=new StringBuilder();
        sb.append(slowo);
        sb.reverse();
        System.out.println(sb.toString());
    }
    //Napisz program, który tworzy listę tablicową 10 liczb całkowitych, a następnie wyświetla je w konsoli w porządku odwrotnym do wprowadzenia
    public static void lista(){
        ArrayList<Integer> liczby = new ArrayList<>();
        for(int i=0;i<15;i++){
            liczby.add(random.nextInt(0,50));
        }
        System.out.println(liczby);
        for(int j=14;j>=0;j--){
            System.out.println(liczby.get(j));
        }
    }
    //Napisz program, który tworzy listę tablicową 10 liczb zmiennoprzecinkowych, a następnie oblicza i wyświetla ich sumę.
    public static double sumdouble(){
        ArrayList<Double> liczby = new ArrayList<Double>();
        double suma=0;
        for(int i=0;i<15;i++){
            liczby.add(random.nextDouble());
        }
        for(int i=0;i<15;i++){
            suma += liczby.get(i);
        }
        return suma;
    }
    //Napisz statyczną metodę average, która przyjmuje listę tablicową liczb zmiennoprzecinkowych jako argument i zwraca średnią arytmetyczną wszystkich liczb. Jeżeli lista tablicowa jest pusta, zwróć 0
    public static double average(List<Double> lista) {
        if (lista.isEmpty()) {
            return 0.0;
        }

        double suma = 0.0;
        for (Double liczba : lista) {
            suma += liczba;
        }

        return suma / lista.size();
    }
    //Napisz statyczną metodę countZeros, która przyjmuje listę tablicową liczb całkowitych jako argument i zwraca liczbę wystąpień zera w liście tablicowej. Na przykład, dla [0, 1, 2, 0, 3, 0, 4], funkcja powinna zwrócić 3
    public static int countZeros(List<Integer> lista) {
        int iloscZer = 0;
        for (int liczba : lista) {
            if (liczba == 0) {
                iloscZer++;
            }
        }
        return iloscZer;
    }

}