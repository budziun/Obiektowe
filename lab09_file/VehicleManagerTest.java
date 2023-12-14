public class VehicleManagerTest {
    public static void main(String[] args) {
        VehicleManager auto = new Car();
        VehicleManager motor = new Motorcycle();

        System.out.println(auto.startEngine());
        System.out.println(auto.getFuelLevel());

        System.out.println(motor.startEngine());
        System.out.println(motor.getFuelLevel());
    }
}
