public class Singleton {

    private static Singleton instancja = new Singleton();
    private Singleton(){

    }

    public static Singleton getInstance(){
        if (instancja == null){
            instancja = new Singleton();
                
            }
        return instancja;
        }
    }