public class Licznik {
    public int liczba;
    public void zwieksz(int value){
        this.liczba+=value;
    }
    public void dodaj(Licznik l){
        this.liczba+=l.liczba;
    }
}
