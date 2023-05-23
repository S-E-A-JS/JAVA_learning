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
        System.out.println(salesmanProgramm(ageCustomer1));
        System.out.println(salesmanProgramm(ageCustomer2));
        System.out.println(salesmanProgramm(ageCustomer3));
        System.out.println(salesmanProgramm(ageCustomer4));
        System.out.println(salesmanProgramm(ageCustomer5));
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

        System.out.println(determineSeasonOfTheYear(mounth1));
        System.out.println(determineSeasonOfTheYear(mounth2));
        System.out.println(determineSeasonOfTheYear(mounth3));
        System.out.println(determineSeasonOfTheYear(mounth4));
        System.out.println(determineSeasonOfTheYear(mounth5));
        System.out.println(determineSeasonOfTheYear(mounth6));
        System.out.println(determineSeasonOfTheYear(mounth7));
        System.out.println(determineSeasonOfTheYear(mounth8));
        System.out.println(determineSeasonOfTheYear(mounth9));
        System.out.println(determineSeasonOfTheYear(mounth10));
        System.out.println(determineSeasonOfTheYear(mounth11));
        System.out.println(determineSeasonOfTheYear(mounth12));
        System.out.println(determineSeasonOfTheYear(testMounth0));
        System.out.println(determineSeasonOfTheYear(testMounth13));
        System.out.println(determineSeasonOfTheYear(testMounthNegativeNumber));
        cliHelpers.separator();
    }

    public static String salesmanProgramm(int customerAge) {
        int ageToBuyAlkohol = 18;

        boolean canSellAlkohol = customerAge >= ageToBuyAlkohol;

        return canSellAlkohol ? "Вы будете оплачивать картой или наличными?" :
                "Алкоголь продается людям старше " + ageToBuyAlkohol + " лет.";
    }

    public static String determineSeasonOfTheYear(int mounthNumber) {
//        можно обойтись и без этих переменных и написать сравнения сразу в return, но это снизит читабельность кода
        boolean isSpring = mounthNumber >= 3 & mounthNumber <= 5;
        boolean isSummer = mounthNumber >= 6 & mounthNumber <= 8;
        boolean isAutumn = mounthNumber >= 9 & mounthNumber <= 11;
        boolean isWinter = mounthNumber > 0 & mounthNumber <= 2 | mounthNumber == 12;

        String phrase = "Вы ввели номер месяца " + mounthNumber + " и он соответствует сезону ";

        return isSpring ? phrase + "Весна" : isSummer ?
                phrase + "Лето" : isAutumn ? phrase + "Осень" : isWinter ?
                phrase + "Зима" : "Нужно ввести число от 1 до 12";
    }
}
