public class Istota {
    public Istota(){
        System.out.println("Tworze istote");
    }
}

class Czlowiek extends Istota{
    public Czlowiek(){
        System.out.println("Tworze czlowieka");
    }
}

class Programista extends Czlowiek{
    public Programista(){
        System.out.println("Tworze programiste");
    }
}
