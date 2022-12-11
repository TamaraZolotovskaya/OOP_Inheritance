package transport;
public abstract class Transport {
    private final String brand;
    private final String model;
    private String color;
    private final int year;
    private final String country;
    private int maxSpeed;
    private String fuel;
    double fuelPercentage;

    public Transport(String brand,
                     String model,
                     String color,
                     int year,
                     String country,
                     int maxSpeed,
                     String fuel,
                     double fuelPercentage
    ) {

        if (brand == null || brand.isBlank() == true) {
            brand = "default";
        }
        this.brand = brand;

        if (model == null || model.isBlank() == true) {
            model = "default";
        }
        this.model = model;

        setColor(color);
        if (year < 0) {
            year = 2000;
        }
        this.year = year;
        if (country == null || country.isBlank() == true) {
            country = "default";
        }
        this.country = country;
        setMaxSpeed(maxSpeed);
        setFuel(fuel);
        setFuelPercentage(fuelPercentage);

    }

    abstract void refill();

    public void setFuel(String fuel) {
        if (fuel == null || fuel.isBlank() == true) {
            fuel = "дизель";
        }
        this.fuel = fuel;
    }

    public void setFuelPercentage(double fuelPercentage) {
        if (fuelPercentage<0 || fuelPercentage>100){
            fuelPercentage=10;
        }
        this.fuelPercentage = fuelPercentage;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank() == true) {
            color = "белый";
        }
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            maxSpeed = 100;
        }
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getFuel() {
        return fuel;
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    @Override
    public String toString() {
        return brand + " " +
                model + "\n" +
                "год выпуска " + year +
                ", сборка в " + country + "\n" +
                "цвет " + color + ", скорость "+maxSpeed+ " км/ч"+"\n"+
                "заправлен "+fuel+" на "+ String.format ("%.2f",fuelPercentage) + " процентов"+"\n";
    }
}
