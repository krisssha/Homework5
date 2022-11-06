public class Main {
    public static void main(String[] args) {

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();

        int clientOS1 = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();

        int years = 2015;
        if (years % 4 == 0 && years % 100 != 0 && years % 400 == 0) {
            System.out.println( years + " год является високосным");

        } else {
            System.out.println(years + " год не является високосным");
        }
        System.out.println();

        int diliveryDistance = 95;
        if(diliveryDistance <= 20) {
            System.out.println("Потребуется 1 день на доставку" );
        }
        if (diliveryDistance > 20 && diliveryDistance <= 60) {
            System.out.println("Потребуется 2 дня на доставку");
        }
        else if (diliveryDistance > 60 && diliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня на доставку");
        }

        System.out.println();

        int monthNumber = 12;
        switch (monthNumber){
            case 12 :
                System.out.println(monthNumber + " месяц принадлежит к сезону ЗИМА");
                break;
            case 1 :
                System.out.println(monthNumber + " месяц принадлежит к сезону ЗИМА");
                break;
            case 2 :
                System.out.println(monthNumber + " месяц принадлежит к сезону ЗИМА");
                break;
            case 3 :
                System.out.println(monthNumber + " месяц принадлежит к сезону ВЕСНА");
                break;
            case 4 :
                System.out.println(monthNumber + " месяц принадлежит к сезону ВЕСНА");
                break;
            case 5 :
                System.out.println(monthNumber + " месяц принадлежит к сезону ВЕСНА");
                break;
            case 6 :
                System.out.println(monthNumber + " месяц принадлежит к сезону ЛЕТО");
                break;
            case 7 :
                System.out.println(monthNumber + " месяц принадлежит к сезону ЛЕТО");
                break;
            case 8 :
                System.out.println(monthNumber + " месяц принадлежит к сезону ЛЕТО");
                break;
            case 9 :
                System.out.println(monthNumber + " месяц принадлежит к сезону ОСЕНЬ");
                break;
            case 10 :
                System.out.println(monthNumber + " месяц принадлежит к сезону ОСЕНЬ");
                break;
            case 11 :
                System.out.println(monthNumber + " месяц принадлежит к сезону ОСЕНЬ");
                break;
            default:
                System.out.println("Ничего не подходит");

        }


    }
}

