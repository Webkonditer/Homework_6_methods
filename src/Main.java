import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        int year = 2020;
        checkingLeapYear(year);

        //Задание 2
        checkingAppType(0, 2021);

        //Задание 3
        int deys = timeOfDelivery(55);
        System.out.println("Потребуется дней: " + deys);

    }

    private static void checkingLeapYear(int year) {
        if ((year % 4 != 0 || year % 100 == 0) && year % 400 != 0) {
            System.out.printf("%d — не високосный год",year);
        } else {
            System.out.printf("%d — високосный год %n",year);
        }
    }

    private static void checkingAppType(int os, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        String clientOS = (os == 0) ? "IOS" : "Android";
        String type = (clientDeviceYear == currentYear) ? "Обычная" : "Lite";
        System.out.printf("%s версия для %s %n", type, clientOS);
    }

    private static int timeOfDelivery(int deliveryDistance) {
        int deysForDelivery = 0;
        if (deliveryDistance <= 20) {
            deysForDelivery = 1;
        } else if (deliveryDistance <= 60) {
            deysForDelivery = 2;
        } else if (deliveryDistance <= 100) {
            deysForDelivery = 3;
        }
        return deysForDelivery;
    }
}