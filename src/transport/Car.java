package transport;

import java.time.LocalDate;

public class Car extends Transport {
    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public class Insurance {
        private final LocalDate expireDate;
        private final double price;
        final String number;

        public Insurance(LocalDate expireDate, double price, String number) {
            if (expireDate == null) {
                expireDate = LocalDate.now().plusDays(60);
            }
            this.expireDate = expireDate;
            if (price <= 0) {
                price = 1000;
            }
            this.price = price;
            if (number == null || number.isBlank() == true) {
                number = "000000000";
            }
            this.number = number;
        }

        public void isCorrectNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }

        public void isInsuranceExpired() {
            boolean IsExpared = expireDate.isAfter(LocalDate.now());
            if (IsExpared) {
                System.out.println("Страховка просрочена!");
            }
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getPrice() {
            return price;
        }

        public String getNumber() {
            return number;
        }

        @Override
        public String toString() {
            return "дата окончания " + expireDate +
                    ", цена " + price +
                    ", номер " + number;
        }
    }
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean winterTires;
    private Key key;
    private Insurance insurance;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               boolean winterTires,
               String fuel,
               double fuelPercentage

    ) {
        super(brand, model,color,year,country, 0, fuel, fuelPercentage);
        setEngineVolume(engineVolume);
        setTransmission(transmission);

        if (bodyType == null || bodyType.isBlank() == true) {
            bodyType = "default";
        }
        this.bodyType = bodyType;

        setRegistrationNumber(registrationNumber);

        if (numberOfSeats < 2) {
            numberOfSeats = 5;
        }
        this.numberOfSeats = numberOfSeats;

        setWinterTires(winterTires);

    }

    public void refill(){
        if(fuelPercentage<100) {setFuelPercentage(100);}
        System.out.println("Машина "+getBrand()+" "+getModel()+ "заправлена "+getFuel()+ " на 100 процентов");
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setEngineVolume(double engineVolume) {
        if (Double.compare(engineVolume, 00) == 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank() == true) {
            transmission = "default";
        }
        this.transmission = transmission;
    }
    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isBlank() == true) {
            registrationNumber = "default";
        }
        this.registrationNumber = registrationNumber;
    }
    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public void changeTires(int month) {
        switch (month) {
            case 11:
            case 12:
            case 1:
            case 2:
            case 3:
                winterTires = true;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                winterTires = false;
                break;
            default:
                winterTires = false;
        }
    }
    private boolean isCorrectNumberletter(char letter)
    //А, В, Е, К, М, Н, О, Р, С, Т, У, Х
    {
        if (letter == 'А' ||
                letter == 'В' ||
                letter == 'Е' ||
                letter == 'К' ||
                letter == 'М' ||
                letter == 'Н' ||
                letter == 'О' ||
                letter == 'Р' ||
                letter == 'С' ||
                letter == 'Т' ||
                letter == 'У' ||
                letter == 'Х') {
            return true;
        } else return false;

    }
    public boolean isCorrectNumber() {
        char[] number = registrationNumber.toCharArray();
        if (number.length != 9 ||
                Character.isDigit(number[1]) == false ||
                Character.isDigit(number[2]) == false ||
                Character.isDigit(number[3]) == false ||
                Character.isDigit(number[6]) == false ||
                Character.isDigit(number[7]) == false ||
                Character.isDigit(number[8]) == false ||
                isCorrectNumberletter(number[0]) == false ||
                isCorrectNumberletter(number[4]) == false ||
                isCorrectNumberletter(number[5]) == false) {
            return false;
        } else return true;
    }


    @Override
    public String toString() {
        String season = new String();
        if (winterTires == true) {
            season = "зимняя";
        } else season = "летняя";
        return super.toString()+
                "объем двигателя " + engineVolume + "\n" +
                "коробка передач " + transmission + "\n" +
                "тип кузова " + bodyType + "\n" +
                "регистрационный номер " + registrationNumber + "\n" +
                "количество мест " + numberOfSeats + "\n" +
                "резина " + season + "\n";

    }
}
