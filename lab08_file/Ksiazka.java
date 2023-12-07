import java.time.LocalDate;
import java.util.Comparator;

public class Ksiazka implements Comparable<Ksiazka>{
    String tytul;
    int liczbaStron;
    LocalDate dataWydania;

    public Ksiazka(String tytul, int liczbaStron) {
        this.tytul = tytul;
        this.liczbaStron = liczbaStron;
        //this.dataWydania = dataWydania;
    }

    @Override
    public String toString() {
        return "[" + tytul + " " + liczbaStron + " " +" ]";
    }

    @Override
    public int compareTo(Ksiazka o) {
        return Integer.compare(o.liczbaStron,this.liczbaStron);
    }
}
