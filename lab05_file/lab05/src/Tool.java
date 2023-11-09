public class Tool {
    public String name;
    protected Tool(String name){
        this.name = name;
    }
}
//java: modifier private not allowed here -> dlatego nie mozemy uzyc klasy private

class Hammer extends Tool{
    protected Hammer(String name) {
        super(name);
    }
}
