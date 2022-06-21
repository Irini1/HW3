public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int iOS = 0;
        if (iOS >= 0) ;
        {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        int clientAndroid = 1;
        if (clientAndroid >= 1) ;
        {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        int clientDeviceYear = 2015;
        if (clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear >= 16) {
            System.out.println("Установите приложение банка");
        }

        int year = 2022;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else
            System.out.println("Не високосный");

        int distance = 20;
        int deliveryDictance = 95;
        if (distance == 20 && deliveryDictance < 95)
            System.out.println("Доставка карты в этот же день");
        if (distance >= 20 && deliveryDictance < 95)
            System.out.println("Доставка карты на следующий день");

    }
}
