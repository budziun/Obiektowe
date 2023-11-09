public class Animal {
    public String name;
    public Animal(){

    }
    public Animal(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        return this.name;
    }
    @Override
    public boolean equals(Object other){
        if(other instanceof Animal temp){
//            Animal o = (Animal) other; to samo przez dopisanie za Animal o w ifie
            return this.name.equals(temp.name);
        }
        else
            return false;
    }
    public void dajGlos(){
        System.out.println("Odgłos zwierzaka");
    }
}
class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    @Override
    public void dajGlos(){
        System.out.println("Mjau mjau");
    }
}