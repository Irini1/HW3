public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int iOS = 1;
        if (iOS <= 0) ;
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
            System.out.println("2022 Не високосный");

        int deliveryDays = 1;

        int deliveryDictance = 95;

        if (deliveryDictance > 20) {
            deliveryDays++;
        }

        if (deliveryDictance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней " + deliveryDays);

        {
            task5();
            {
                int mounthNumber = 1;
                switch (mounthNumber) {
                    case 12:
                    case 1:
                    case 2:
                        System.out.println("Зима");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Весна");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("Лето");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("Осень");
                        break;
                    default:
                        System.out.println("Некорректный месяц: " + mounthNumber);
                }

            }
        }