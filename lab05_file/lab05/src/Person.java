public class Person {
    public String firstName;
    protected String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
}
class Employee extends Person{
    public Employee(String firstName, String lastName){
        super(firstName,lastName);
    }
    public void displayData(){
        System.out.println(getFirstName() + "  " + getLastName());
//        System.out.println(getLastName());
    }
}