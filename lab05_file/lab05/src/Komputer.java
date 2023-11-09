public class Komputer {
    public void uruchom(){
        System.out.println("Komputer uruchomiony");
    }
}
class Laptop extends Komputer{
    @Override
    /*protected*/ public void uruchom(){
        System.out.println("Laptop uruchomiony");
    }
}
