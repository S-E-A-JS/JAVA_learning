public class HW20 {
    public static void main(String[] args) {
        /*
        * Всю неделю в Европе держится одна погода. Увеличивая всего на один градус ежедневно.

Нам известно, что в Берлине в понедельник было 20 градусов тепла,
в Лондоне 17 градустов тепла,
в Лиссабоне 25 градусов тепла,
в Париже 23 градуса тепла,
в Москве 19 градусов тепла,
в Минске 18 градусов тепла,
в Саратове 15 градусов тепла.

Напишите программу, которая принимает название города и возвращает температуру в воскресение.
Пример:
citiWeather("Минск") -> 24.

Задача на звёздочку. Напишите программу, которая принимает название города и день недели и возвращает температуру.
Пример:
citiWeather("Минск", "Пятница") -> 22.
* */

        System.out.println(cityWeather("Берлин", "Вторник"));
        System.out.println(cityWeather("Минск", "Пятница"));
    }

//    простое решение
//    public static int cityWeather(String cityName) {
//        int temperatureBerlin, temperatureLondon, temperatureLissabon, temperatureParis, temperatureMoskow,
//                temperatureMinsk, temperatureSaratov;
//        int output = 0;
//
//        switch (cityName) {
//            case "Берлин":
//                temperatureBerlin = 20;
//                output = calculateTemperature(temperatureBerlin);
//                break;
//            case "Лондон":
//                temperatureLondon = 17;
//                output = calculateTemperature(temperatureLondon);
//                break;
//            case "Лиссабон":
//                temperatureLissabon = 25;
//                output = calculateTemperature(temperatureLissabon);
//                break;
//            case "Париж":
//                temperatureParis = 23;
//                output = calculateTemperature(temperatureParis);
//                break;
//            case "Москва":
//                temperatureMoskow = 19;
//                output = calculateTemperature(temperatureMoskow);
//                break;
//            case "Минск":
//                temperatureMinsk = 18;
//                output = calculateTemperature(temperatureMinsk);
//                break;
//            case "Саратов":
//                temperatureSaratov = 15;
//                output = calculateTemperature(temperatureSaratov);
//            default:
//                System.out.println("Такого города нет в списке");
//        }
//        return output;
//    }

//    public static int calculateTemperature(int cityTemp) {
//        for (int i = 0; i < 6; i++) {
//            cityTemp += 1;
//        }
//        return cityTemp;
//    }

    //    решение на звездочку
    public static int cityWeather(String cityName, String weekDay) {
        int temperatureBerlin, temperatureLondon, temperatureLissabon, temperatureParis, temperatureMoskow,
                temperatureMinsk, temperatureSaratov;
        int output = 0;

        switch (cityName) {
            case "Берлин":
                temperatureBerlin = 20;
                output = calculateTemperature(temperatureBerlin, weekDay);
                break;
            case "Лондон":
                temperatureLondon = 17;
                output = calculateTemperature(temperatureLondon, weekDay);
                break;
            case "Лиссабон":
                temperatureLissabon = 25;
                output = calculateTemperature(temperatureLissabon, weekDay);
                break;
            case "Париж":
                temperatureParis = 23;
                output = calculateTemperature(temperatureParis, weekDay);
                break;
            case "Москва":
                temperatureMoskow = 19;
                output = calculateTemperature(temperatureMoskow, weekDay);
                break;
            case "Минск":
                temperatureMinsk = 18;
                output = calculateTemperature(temperatureMinsk, weekDay);
                break;
            case "Саратов":
                temperatureSaratov = 15;
                output = calculateTemperature(temperatureSaratov, weekDay);
            default:
                System.out.println("Такого города нет в списке");
        }
        return output;
    }

    public static int calculateTemperature(int cityTemp, String day) {
        int weekDayIndex = getWeekDayIndex(day);

        for (int i = 1; i < weekDayIndex; i++) {
            cityTemp += 1;
        }
        return cityTemp;
    }

    public static int getWeekDayIndex(String weekDay) {
        int output = 0;

        switch (weekDay.toLowerCase()) {
            case "понедельник" -> output = 1;
            case "вторник" -> output = 2;
            case "среда" -> output = 3;
            case "четверг" -> output = 4;
            case "пятница" -> output = 5;
            case "суббота" -> output = 6;
            case "воскресение" -> output = 7;
            default -> System.out.println("Допущена ошибка в названии дня недели, попробуйте еще раз");
        }

        return output;
    }
}
