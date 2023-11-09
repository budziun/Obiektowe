public class Kalkulator {
    public static int dodaj(int a, int b){
        return a+b;
    }
}
class KalkulatorRozszerzony extends Kalkulator{
    public static int dodaj(int a,int b,int c){
        return a + b + c;
    }
}
