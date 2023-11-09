public class Pojazd {
    public void jedz(){
        System.out.println("Pojazd jedzie");
    }
}
class Samochod extends Pojazd{
    public String marka;
    public Samochod(String marka){
        this.marka = marka;
    }
    @Override
    public void jedz(){
        super.jedz();
        System.out.println(marka);
    }
}