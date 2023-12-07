public class Zamowienie implements Comparable<Zamowienie>{
    String nazwaProduktu;
    int ilosc;
    double cenaJednostkowa;

    public Zamowienie(String nazwaProduktu, int ilosc, double cenaJednostkowa) {
        this.nazwaProduktu = nazwaProduktu;
        this.ilosc = ilosc;
        this.cenaJednostkowa = cenaJednostkowa;
    }

    @Override
    public String toString() {
        return "[ " + nazwaProduktu + " " + ilosc + " " + cenaJednostkowa + " ]";
    }

    @Override
    public int compareTo(Zamowienie o) {
        if(Double.compare(o.cenaJednostkowa,this.cenaJednostkowa)==0){
            return Integer.compare(this.ilosc,o.ilosc);
        }
        return Double.compare(o.cenaJednostkowa,this.cenaJednostkowa);
    }
}
