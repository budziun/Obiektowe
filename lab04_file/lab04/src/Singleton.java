public class Singleton {

    public static Singleton instancja = new Singleton();
    public int test = 0;

    public static Singleton getInstance(){

        return instancja;
    }
    private Singleton(){

        test++;
    }
}
