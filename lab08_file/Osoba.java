import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class Osoba implements Comparable<Osoba>, Cloneable{
    String name;
    double height;
    int age;

    public Osoba(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public Osoba(int age) {
        this.age = age;
    }

    public Osoba(double height) {
        this.height = height;
    }

    public Osoba(double height, int age) {
        this.height = height;
        this.age = age;
    }

    @Override
    public String toString() {
        return "[ " + height + " , "+ age +" ]";
    }

    public static void main(String[] args){
        ArrayList<Osoba> osobaList = new ArrayList<>();
        osobaList.add(new Osoba(156.0,18));
        osobaList.add(new Osoba(156.0,12));
        osobaList.add(new Osoba(256.0,21));
        osobaList.add(new Osoba(176.0,19));
        ArrayList<Osoba> osobaList2 = new ArrayList<>();
        osobaList2.add(new Osoba(156.0,18));
        osobaList2.add(new Osoba(156.0,12));
        osobaList2.add(new Osoba(256.0,21));
        osobaList2.add(new Osoba(140.0,19));
        Collections.sort(osobaList, new OsobaHeightComparator());
        System.out.println(osobaList);
        //Collections.sort(osobaList2,new OsobaAgeComparator().reversed());
        Collections.sort(osobaList2,new OsobaAgeComparator());
        System.out.println(osobaList2);

    }

   /* @Override ///mozna takim sposobem na piechote
    public int compareTo(Osoba o) {
        if(this.height>o.height)
            return -1;
        if(this.height == o.height)
            return 0;
        else
            return  1;
    }*/
    public int compareTo(Osoba o){
        //return Double.compare(o.height,this.height);
        //return (int) Math.signum(o.height-this.height);
        if(Double.compare(o.height,this.height)==0){
            return Integer.compare(o.age,this.age);
        }
        return Double.compare(o.height,this.height);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
class OsobaHeightComparator implements Comparator<Osoba>
{
    @Override
    public int compare(Osoba o1, Osoba o2) {
        return Double.compare(o2.height, o1.height);
    }
}
class OsobaAgeComparator implements Comparator<Osoba>
{
    @Override
    public int compare(Osoba o1, Osoba o2) {
        return Integer.compare(o2.age, o1.age);
    }
}
