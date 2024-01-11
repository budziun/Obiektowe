package zad4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Napisz klasę Person z polami firstName (typu String), lastName (typu String) oraz birthYear (typu int).
        //Zaimplementuj dwie klasy implementujące generyczny interfejs Comparator: LastNameComparator do porównywania obiektów po polu lastName (alfabetycznie od A do Z) oraz BirthDateComparator do porównywania obiektów po polu birthYear (od najstarszej do najmłodszej osoby). Stwórz tablicę 5 obiektów klasy Person i posortuj ją zgodnie z oboma kryteriami (najpierw po nazwisku, a następnie przy równości po dacie urodzenia).
        Person[] pepole = {
                new Person("Anna","Dawid",1979),
                new Person("Julia","Dawid",2005),
                new Person("Snorlax","Snorlax",2002)
        };
        Arrays.sort(pepole, new BirthDateComparator());
        for (var e: pepole){
            System.out.println(e);
        }
        Arrays.sort(pepole, new LastNameComparator());
        for (var e: pepole){
            System.out.println(e);
        }
    }
}
