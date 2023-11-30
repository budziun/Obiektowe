import java.util.Objects;

public class Animal {
    String name;
    int age;
    double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Animal animal = (Animal) object;
        return age == animal.age &&
                Double.compare(weight, animal.weight) == 0 &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + age;
        long doubleToLong = Double.doubleToLongBits(weight);
        result = 31 * result + (int)(doubleToLong ^ (doubleToLong >>> 32));
        result = 31 * result + name.hashCode();
        return result;
    }
}
