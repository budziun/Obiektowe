public class Produkt {
    public static int liczbaProduktow;
    public static final int MAX_PRODUKTOW=5;

    public Produkt(){
        if(liczbaProduktow<MAX_PRODUKTOW){
            liczbaProduktow++;
        }
    }

}

