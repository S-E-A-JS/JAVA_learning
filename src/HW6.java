public class HW6 {
    public static void main(String[] args) {
        /*
        Напишите программу действий для сотрудника дорожной полиции, который остановил машину:
при езде до 50 км/час нарушений нет;
за езду от 50 км/час до 65 км/час — устное порицание и лекция на 5 минут;
за превышение скорости от 16 км/час — 40 евро штрафа;
за езду от 100 км/час до 130 км/час — штраф 500 евро;
и за езду свыше 130 км/час — штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного
средства.

Напишите программу, которая объяснит наступление определённых событий, в зависимости от выбора "витязя".

***** Дано число меньше 3000. При делении числа на 32 получается остаток 30, при делении на 58 - остаток 44. Найдите
число или числф.
         */

        System.out.println(setPuhishment(1000));
        cliHelpers.separator();


        String left = "left";
        String right = "right";
        String forward = "forward";

        System.out.println(warriorDestiny(forward)); // смерть
        System.out.println(warriorDestiny(right)); // женился
        System.out.println(warriorDestiny(left)); // обогатился
        cliHelpers.separator();

        System.out.println(findNumbers()); // выведет в консоль 798 1726 2654

    }

    public static String setPuhishment(int carSpeed) {
        String policemanMessage = "";
        String lectureFiveMinutes = "Какая то лекция на 5 минут";
        String fineAmount0 = lectureFiveMinutes;
        int speedLimit = 50;
        int speedDifference = carSpeed - speedLimit;
        int fineAmount1 = 40;
        int fineAmount2 = 500;
        int fineAmount3 = 1000;

        if (carSpeed < 50) {
            policemanMessage = "Рядовая проверка документов.";
        } else if (carSpeed > speedLimit & carSpeed < 65) {
            policemanMessage += " Вы превысили сокрость на " + speedDifference + "км в час. " + fineAmount0;
        } else if (carSpeed > 65 & carSpeed < 100) {
            policemanMessage += " Вы превысили сокрость на " + speedDifference + "км в час.";
            setFine(fineAmount1);
        } else if (carSpeed > 100 & carSpeed < 130) {
            policemanMessage += " Вы превысили сокрость на " + speedDifference + "км в час.";
            setFine(fineAmount2);
        } else {
            policemanMessage += " Вы превысили сокрость на " + speedDifference + "км в час.";
            setFine(fineAmount3);
            carConfiscation();
            driveLisenceConfiscation(3);
        }
        return policemanMessage;
    }

    public static void setFine(int fineSize) {
        System.out.printf("Вам назначен штраф %d евро \n", fineSize);
    }

    public static void carConfiscation() {
        System.out.println("Ваша машина будет конфискована");
    }

    public static void driveLisenceConfiscation(int years) {
        System.out.printf("У Вас будут изъяты права на %d года \n", years);
    }

    public static String warriorDestiny(String destination) {
        String result = "";

        if (destination == "left") {
            result = "Витязь обогатился";
        } else if (destination == "right") {
            result = "Женили витязя";
        } else if (destination == "forward") {
            result = "Смерть витязя";
        }

        return result;
    }

    public static String findNumbers() {
//        Дано число меньше 3000. При делении числа на 32 получается остаток 30, при делении на 58 - остаток 44. Найдите
//        число или числа.
        String result = "";

        for (int i = 0; i < 3000; i++) {
            if (i % 32 == 30 & i % 58 == 44) {
                result += " " + i;
            }
        }
        return result;
    }
}


