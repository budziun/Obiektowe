public class Tool {
    public String name;
    protected Tool(String name){
        this.name = name;
    }
}
class Hammer extends Tool{
    protected Hammer(String name) {
        super(name);
    }
}
