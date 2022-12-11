package transport;

public class Train extends Transport{
    private double priceOfTrip;
    private int travelTime;
    private String departureStation;
    private String endingStation;
    private int numberOfWagons;

    public Train(String brand,
                 String model,
                 String color,
                 int year,
                 String country,
                 int maxSpeed,
                 double priceOfTrip,
                 int travelTime,
                 String departureStation,
                 String endingStation,
                 int numberOfWagons,
                 double fuelPercentage) {
        super(brand, model, color, year, country, maxSpeed, "дизель", fuelPercentage);
        setPriceOfTrip(priceOfTrip);
        setTravelTime(travelTime);
        setDepartureStation(departureStation);
        setEndingStation(endingStation);
        setNumberOfWagons(numberOfWagons);
    }

    public void refill(){
        if(fuelPercentage<100) {setFuelPercentage(100);}
        System.out.println("Поезд "+getBrand()+ " "+getModel()+ " заправлен "+getFuel()+ " на 100 процентов");
    }

    public void setPriceOfTrip(double priceOfTrip) {
        if (Double.compare(priceOfTrip, 00) == 0 ||
                priceOfTrip<0){
            priceOfTrip = 100;
        }
        this.priceOfTrip = priceOfTrip;
    }

    public void setTravelTime(int travelTime) {
        if (travelTime<=0) {travelTime=60;}
        this.travelTime = travelTime;
    }

    public void setDepartureStation(String departureStation) {
        if (departureStation == null || departureStation.isBlank() == true) {
            departureStation = "default";
        }
        this.departureStation = departureStation;
    }

    public void setEndingStation(String endingStation) {
        if (endingStation == null || endingStation.isBlank() == true) {
            endingStation = "default";
        }
        this.endingStation = endingStation;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons<0){numberOfWagons=0;}
        this.numberOfWagons = numberOfWagons;
    }

    public double getPriceOfTrip() {
        return priceOfTrip;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    @Override
    public String toString() {
        return super.toString()+
                "идет из " + departureStation + " в " + endingStation + '\n' +
                "число вагонов " + numberOfWagons +
                ", цена " + String.format ("%.2f",priceOfTrip) + ", время поездки " + travelTime + " минут" ;
    }
}
