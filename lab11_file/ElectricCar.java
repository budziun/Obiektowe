public class ElectricCar extends Car{
    private int batteryCapacity;
    public ElectricCar(String brand,int batteryCapacity){
        super(brand);
        this.batteryCapacity=batteryCapacity;
    }
    public int getBatteryCapacity(){
        return batteryCapacity;
    }
}
