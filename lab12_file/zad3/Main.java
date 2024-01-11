package zad3;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
    //Napisz klasę Product, która zawiera pola: name (typu String), price (typu double) i productionYear (typu int). Zaimplementuj interfejs Comparable w taki sposób, aby obiekty klasy Product były sortowane rosnąco według daty produkcji. Stwórz listę tablicową 5 obiektów klasy Product i posortuj ją według sprecyzowanego kryterium.
        ArrayList<Product> lista = new ArrayList<>();
        lista.add(new Product("TV",999.99,2020));
        lista.add(new Product("Telefon",120.01,2018));
        lista.add(new Product("Rower",12.56,2023));
        lista.add(new Product("Komputer",3999.99,2021));
        lista.add(new Product("Laptop",9999.99,2024));

        Collections.sort(lista);
        System.out.println(lista);
    }
}