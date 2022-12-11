package transport;

public class Bus extends Transport{
    public Bus(String brand, String model, String color, int year, String country, int maxSpeed, String fuel, double fuelPercentage) {
        super(brand, model, color, year, country, maxSpeed, fuel, fuelPercentage);
    }

    public void refill(){
        if(fuelPercentage<100) {setFuelPercentage(100);}
        System.out.println("Автобус "+getBrand()+" "+getModel()+ " заправлен "+getFuel()+ " на 100 процентов");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
