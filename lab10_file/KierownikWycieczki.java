public class KierownikWycieczki {

    private final Biletomat biletomat;
    public KierownikWycieczki(Biletomat biletomat){
        this.biletomat=biletomat;
    }
    public void ogarnijBilet(){
        biletomat.wystawBilet();
    }

}
