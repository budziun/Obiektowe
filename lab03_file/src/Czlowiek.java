public class Czlowiek {
    public String imie;
    public void przedstawSie(){
        System.out.println("Cześć, nazywam się "+imie);
    }
    public  void czesc(){
        System.out.println("Cześć "+imie);
    }
    public void zmienImie(String noweImie){
        this.imie = noweImie;
    }
    public void zamienImionami(Czlowiek innaOsoba){
        String temp = this.imie;
        this.imie= innaOsoba.imie;
        innaOsoba.imie = temp;
    }
}
