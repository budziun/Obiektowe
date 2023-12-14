public class Car implements VehicleManager {
    @Override
    public String startEngine() {
        return "Silnik uruchomiony";
    }

    @Override
    public int getFuelLevel() {
        return 50;
    }
}
