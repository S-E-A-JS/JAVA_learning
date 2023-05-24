public class HW5 {
    /*
Напишите программу действий кассира магазина, если у него пытаются купить алкоголь следующие 5 покупателей:
10 лет, 17 лет, 18 лет, 20 лет и 30 лет.

Напишите программу, которая определяет сезон года.
На вход приходят месяцы
Месяца указаны int переменными.
     */
    public static void main(String[] args) {
        int ageCustomer1 = 10;
        int ageCustomer2 = 17;
        int ageCustomer3 = 18;
        int ageCustomer4 = 20;
        int ageCustomer5 = 30;
//        допустим что по закону алкоголь можно покупать с 18 лет
        cliHelpers.separator();
        System.out.println(possibilitySellAlkohol(ageCustomer1));
        System.out.println(possibilitySellAlkohol(ageCustomer2));
        System.out.println(possibilitySellAlkohol(ageCustomer3));
        System.out.println(possibilitySellAlkohol(ageCustomer4));
        System.out.println(possibilitySellAlkohol(ageCustomer5));
        cliHelpers.separator();


        int mounth1 = 1;
        int mounth2 = 2;
        int mounth3 = 3;
        int mounth4 = 4;
        int mounth5 = 5;
        int mounth6 = 6;
        int mounth7 = 7;
        int mounth8 = 8;
        int mounth9 = 9;
        int mounth10 = 10;
        int mounth11 = 11;
        int mounth12 = 12;
        int testMounth0 = 0;
        int testMounth13 = 13;
        int testMounthNegativeNumber = -1;

        System.out.println("Вы ввели " + mounth1 + " результат: " + determineSeasonOfTheYear(mounth1));
        System.out.println("Вы ввели " + mounth2 + " результат: " + determineSeasonOfTheYear(mounth2));
        System.out.println("Вы ввели " + mounth12 + " результат: " + determineSeasonOfTheYear(mounth12));
        System.out.println("Вы ввели " + mounth3 + " результат: " + determineSeasonOfTheYear(mounth3));
        System.out.println("Вы ввели " + mounth4 + " результат: " + determineSeasonOfTheYear(mounth4));
        System.out.println("Вы ввели " + mounth5 + " результат: " + determineSeasonOfTheYear(mounth5));
        System.out.println("Вы ввели " + mounth6 + " результат: " + determineSeasonOfTheYear(mounth6));
        System.out.println("Вы ввели " + mounth7 + " результат: " + determineSeasonOfTheYear(mounth7));
        System.out.println("Вы ввели " + mounth8 + " результат: " + determineSeasonOfTheYear(mounth8));
        System.out.println("Вы ввели " + mounth9 + " результат: " + determineSeasonOfTheYear(mounth9));
        System.out.println("Вы ввели " + mounth10 + " результат: " + determineSeasonOfTheYear(mounth10));
        System.out.println("Вы ввели " + mounth11 + " результат: " + determineSeasonOfTheYear(mounth11));
        System.out.println("Вы ввели " + testMounth0 + " результат: " + determineSeasonOfTheYear(testMounth0));
        System.out.println("Вы ввели " + testMounth13 + " результат: " + determineSeasonOfTheYear(testMounth13));
        System.out.println("Вы ввели " + testMounthNegativeNumber + " результат: " + determineSeasonOfTheYear(testMounthNegativeNumber));
        cliHelpers.separator();
    }

    public static String possibilitySellAlkohol(int customerAge) {
        String answer = "";

        switch (customerAge) {
            case 10:
            case 17:
                answer = "(Продажа запрещена) Вы младше 18, я не могу продать алкоголь.";
                break;
            case 18:
            case 20:
            case 30:
                answer = "(Продажа разрешена) Будете оплачивать картой или наличными?";
                break;
        }

//        почитал про контрактное программирование и если я правильно все понял то решение должно было выглядеть так +
//        хотел решить не прописывая большое количество кейсов(если задача была бы приблежена к реальной), но для
//        этого понадобился бы метод .valueOf()

//        boolean checkPossibility = customerAge >= 18;
//        String isPossibleSell = String.valueOf(checkPossibility);
//
//        switch (isPossibleSell) {
//            case "true":
//                answer = "(Продажа разрешена) Будете оплачивать картой или наличными?";
//                break;
//            case "false":
//                answer = "(Продажа запрещена) Я не могу продать вам алкоголь.";
//                break;
//        }
        return answer;
    }

    public static String determineSeasonOfTheYear(int mounthNumber) {
        String season = "";

        switch (mounthNumber) {
            case 12:
            case 1:
            case 2:
                season = "Зима";
                break;

            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;
            default:
                season = "Нужно ввести цифру от 1 до 12";
        }
        return season;
    }
}
