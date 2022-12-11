import transport.Bus;
import transport.Car;
import transport.Train;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
//class Car
        Car lada = new Car("Lada",
                "Granta",
                1.7,
                "желтый",
                2015,
                "Россия",
                "механическая",
                "Седан",
                "1213СС234",
                5,
                true,
                "бензин",
                12
        );
        lada.new Insurance(LocalDate.of(2022, 12, 19), 1000, "123456789");

        Car audi = new Car("Audi",
                "A8 50 L TDI quattro",
                3,
                "черный",
                2020,
                "Германия",
                "механическая",
                "хэтчбек",
                "А000СС234",
                6,
                true,
                "бензин",
                11);
        Car bmw = new Car("BMW",
                "Z8",
                3,
                "черный",
                2021,
                "Германия",
                "автоматическая",
                "хэтчбек",
                "А137СС234",
                5,
                true,
                "бензин",
                56);
        Car kia = new Car("Kia",
                "Sportage 4-го поколения",
                2.4,
                "красный",
                2018,
                "Южная Корея",
                "автоматическая",
                "универсал",
                "А123СС454",
                5,
                false,
                "бензин",
                23);
        Car hyindai = new Car("Hyundai",
                "Avante", 1.6,
                "оранжевый",
                2016,
                "Южная Корея",
                "автоматическая",
                "универса",
                "А123СС999",
                5,
                false,
                "бензин",
                56);

        lada.changeTires(5);
        hyindai.changeTires(12);
        boolean trueNumber = lada.isCorrectNumber();
        if (trueNumber == false) {
            System.out.println(lada.getBrand() + " " + lada.getModel() + " имеет некорректный номер " + lada.getRegistrationNumber());
        }

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyindai);

// class Train

        Train lastochka = new Train("Ласточка",
                "B-901",
                null,
                2001,
                "Россия",
                301,
                3500,
                0,
                "Белорусский вокзал",
                "Минск-Пассажирский",
                11,
                57);
        Train leningrad = new Train("Ленинград",
                "D-125",
                null,
                2019,
                "Россия",
                270,
                1700,
                0,
                "Ленинградскй вокзал",
                "Ленинград-Пассажирский",
                8,
                90);
        System.out.println(lastochka);
        System.out.println(leningrad);

        //class Bus

        Bus vaz = new Bus("Ваз",
                "Ф-12",
                "серый",
                2000,
                "Россия",
                150,
                "дизель",
                100);
        Bus mersedes = new Bus("Мерседес",
                "РА234",
                "черный",
                2010,
                "Грмания",
                200,
                "дизель",
                100);
        Bus subary = new Bus("Субару",
                "НТ-2",
                "белый",
                2015,
                "Корея",
                170,
                "дизель",
                1);

        subary.refill();
        System.out.println(vaz);
        System.out.println(mersedes);
        System.out.println(subary);

    }
}
