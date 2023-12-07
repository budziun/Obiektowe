public class Samochod implements Comparable<Samochod>{
    String marka;
    int przebieg;
    int rokProdukcji;

    public Samochod(String marka, int przebieg, int rokProdukcji) {
        this.marka = marka;
        this.przebieg = przebieg;
        this.rokProdukcji = rokProdukcji;
    }

    @Override
    public String toString() {
        return "[ " + marka + " " + przebieg + " " + rokProdukcji + " ]";
    }

    @Override
    public int compareTo(Samochod o) {
        return Integer.compare(this.przebieg,o.przebieg);
    }
}
