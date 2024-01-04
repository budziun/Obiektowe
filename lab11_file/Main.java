import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Box<String,Integer> box= new Box<>("STOP",4);
        Box<Integer,String> box2= new Box<>(5,"BACZNOSC");
        Box<Integer,Integer> box3=new Box<>(3,3);
        wypisz(4);
        wypisz("STOP");
        //Napisz generyczną metodę isEqual, która przyjmuje dwa dowolne obiekty tego samego typu i zwraca true, jeśli są one równe, w przeciwnym razie false
        String str1="Hello";
        String str2="Hello";
        System.out.println(isEqual(str1,str2));

        Integer num1=20;
        Integer num2=10;
        System.out.println(isEqual(num1,num2));
        //Stwórz klasę generyczną Triple<T, U, V>, która może przechowywać trzy obiekty różnych typów. Zaimplementuj metody getFirst(), getSecond() i getThird() do pobierania odpowiednio pierwszego, drugiego i trzeciego elementu.
        Triple<String, Integer, Double> triple = new Triple<>("Witaj", 4, 3.14);
        System.out.println("First: " + triple.getFirst());
        System.out.println("Second: " + triple.getSecond());
        System.out.println("Third: " + triple.getThird());

        //Napisz statyczną metodę generyczną swap, która przyjmuje tablicę dowolnego typu i dwa indeksy, a następnie zamienia miejscami elementy w tej tablicy pod wskazanymi indeksami. Metoda powinna działać dla tablicy każdego typu. Przykładowe wywołanie metody: swap(myArray, 0, 2);, gdzie myArray to tablica typu Integer[] lub dowolnego innego typu. Zabezpiecz metodę tak, aby nie można było jej wywołać z indeksami spoza zakresu tablicy.
        Integer[] myArray = {1, 2, 3, 4, 5};
        ArrayUtils.swap(myArray, 0, 2);
        for (Integer value : myArray) {
            System.out.print(value + " ");
        }
        System.out.println("");
        ArrayUtils.swap(myArray,1,6);

        //Napisz statyczną metodę generyczną maxValue, która przyjmuje tablicę elementów typu generycznego T, gdzie T rozszerza Comparable<T>. Metoda powinna zwracać największy element z tablicy. Upewnij się, że metoda nie akceptuje pustej tablicy (o zerowej liczbie elementów). Przetestuj metodę na tablicach zawierających różne typy porównywalnych obiektów, jak Integer, Float, czy String. Stwórz klasę Vehicle z polami model i speed, implementującą generyczny Comparable, i przetestuj metodę maxValue na tablicy obiektów Vehicle.
        Integer[] intArray = {3,7,1,2,9,8};
        Float[] floatArray = {2.5f,1.2f,5.7f,4.2f};
        String[] stringArray = {"banan", "wisnia", "kiwi", "jablko"};
        Vehicle[] vehicleArray = {
                new Vehicle("Auto", 120),
                new Vehicle("Rower", 25),
                new Vehicle("Motor", 200)
        };
        System.out.println(Tablica.maxValue(intArray));
        System.out.println(Tablica.maxValue(floatArray));
        System.out.println(Tablica.maxValue(stringArray));
        Vehicle maxSpeedVehicle = Tablica.maxValue(vehicleArray);
        System.out.println(maxSpeedVehicle.getModel() + " (" + maxSpeedVehicle.getSpeed() + " km/h)");

        //Zdefiniuj klasy Car (Samochód) i ElectricCar (Samochód Elektryczny), gdzie ElectricCar dziedziczy po Car. Napisz statyczną metodę generyczną compareObjects, która przyjmuje dwa argumenty: object1 i object2 typu extends Car. Metoda ma zwracać wartość true, jeśli obiekty są tego samego typu, w przeciwnym wypadku false. Użyj metody getClass() do porównania klas obiektów.
        Car car1=new Car("Audi");
        Car car2=new Car("BMW");

        ElectricCar elektryk1= new ElectricCar("Tesla",100);
        ElectricCar elektryk2= new ElectricCar("Xiaomi",50);
        System.out.println(compareObjects(car1,car2));
        System.out.println(compareObjects(car1,elektryk1));
        System.out.println(compareObjects(elektryk1,elektryk2));

        //Stwórz klasę generyczną Triple<T>, która przechowuje trzy obiekty tego samego typu. Następnie utwórz dwie klasy: Bird i Eagle, gdzie Eagle dziedziczy po Bird. Potem napisz statyczną metodę generyczną findMin, która przyjmuje Triple<? extends Bird>. Ta metoda powinna zwracać element mniejszy na podstawie kryterium porównania zdefiniowanego przez ciebie.

        //Stwórz klasę generyczną Pair<T> która przechowuje dwa obiekty tego samego typu. Utwórz dwie klasy: Animal (Zwierzę) i Dog (Pies), gdzie Dog dziedziczy po Animal. Klasa Dog ma posiadać prywatne pole age, które nie posiada klasa Animal. Następnie napisz statyczną metodę generyczną findMinMaxAge, która przyjmuje jako argument tablicę obiektów typu Dog oraz Pair<?super Dog> result. Metoda powinna ma zapisać (jako obiekty typu Dog) najmniejszy i najmniejszy (pod kątem wieku) psa z tablicy w drugim argumencie metody. Zrób to bezpośrednio bez używania interfejsów Comparable czy Comparator.
        
    }
    public static <T> void wypisz(T val){
        System.out.println(val);
    }
    //zad1
    public static <T> boolean isEqual(T obj1,T obj2){
        return obj1.equals(obj2);
    }
    //zad auta
    public static <T extends Car>boolean compareObjects(T object1,T object2){
        return object1.getClass().equals(object2.getClass());
    }
    //zad ptaki
    /*public static <T extends Bird> T findMin(Triple<? extends Bird,?> triple){
        T first = triple.getFirst();
        T second = triple.getSecond();
        T third = triple.getThird();
    }*/
}
