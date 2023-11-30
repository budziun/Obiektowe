public record Car(String Brand,String Model,double fuelConsumptionPer100km) {
    public void fuelCost(double fuelPrice, double distance){
        double cena= (distance/100)*fuelPrice*fuelConsumptionPer100km;
        System.out.println(cena);
    }
}
