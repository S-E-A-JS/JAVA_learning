/*
Написать программу для вычисления площади круга.
Найти длину окружности.
Написать формулу вычисления стоимости Евро, если курс Евро к Доллару 1,1.
Найти соотношение площади Беларуси к площади Украины.
Найти, во сколько раз площадь Москвы больше площади Берлина.
Если клиент положил в банк 1000€ под 3,5%, какая сумма будет его ждать через семь лет?
 */

public class HW3 {
    public static void main(String[] args) {
        findCircleArea();

        findCircleLenght();

        calculateEurBasedOnUSD();

        comparisonCountryAreas();

        comparisonCityAreas();

        calculateYield();
    }

    public static void findCircleArea() {
        byte circleRadius = 14;
        double result = Math.PI * Math.pow(circleRadius, 2);

        System.out.println("Площадь круга с радиусом в " + circleRadius + " ед. = " + result + " ед.");
    }

    public static void findCircleLenght() {
        byte circleRadius = 31;
        double result = 2 * Math.PI * circleRadius;

//        для понимания разницы double и float
        float result2 = (float) (2 * Math.PI * circleRadius);

        System.out.println("Длина окружности (double) с радиусом " + circleRadius + " ед. = " + result + " ед.");
//        System.out.println("14 знаков после запятой");
        System.out.println("Длина окружности (float) с радиусом " + circleRadius + " ед. = " + result2 + " ед.");
//        System.out.println("5 знаков после запятой");
    }

    public static void calculateEurBasedOnUSD() {
        double exchangeRate_EUR_USD = 1.1;
        int amount_USD = 4356;

        double result = amount_USD / exchangeRate_EUR_USD;

        System.out.println("При курсе EUR к USD " + exchangeRate_EUR_USD + " поменяв " + amount_USD + " USD можно " +
                "получить " +
                result + " EUR");
    }

    public static void comparisonCountryAreas() {
        double area_UKRAINE = 603_700;
        double area_BELARUS = 207_600;

        double result = area_UKRAINE / area_BELARUS;
        System.out.println("Площадь Беларуси в " + result + " раз меньше чем площадь Украины");
    }

    public static void comparisonCityAreas() {
        short area_MOSKOW = 2_511;
        float area_BERLIN = 891.8f;

        double result = area_MOSKOW / area_BERLIN;

        System.out.println("Площадь Москвы больше площади Берлина в " + result + " раз");
    }

    public static void calculateYield() {
        long initialDeposit_EUR = 1000;
        double interestRate = 3.5 / 100;
        int period_YEARS = 7;

        double result_SIMPLE = initialDeposit_EUR * interestRate * period_YEARS + initialDeposit_EUR;
        double result_COMPOUND_YEARS =
                initialDeposit_EUR * Math.pow(1 + interestRate, period_YEARS) + initialDeposit_EUR;
        double result_COMPOUND_MONTH = initialDeposit_EUR * Math.pow(1 + interestRate / 12, period_YEARS) + initialDeposit_EUR;

        System.out.println("Простые проценты. Через " + period_YEARS + " лет на вкладе будет " + result_SIMPLE + " " +
                " евро");
        System.out.println("Сложные проценты (ежегодная капитализация). Через " + period_YEARS + " лет на вкладе " +
                "будет " + result_COMPOUND_YEARS +
                " евро");
        System.out.println("Сложные проценты (ежемесячная капитализация). Через " + period_YEARS + " лет на вкладе " +
                "будет " + result_COMPOUND_MONTH + " евро");
    }
}
