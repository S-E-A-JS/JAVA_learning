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

        setPuhishment(60);
        cliHelpers.separator();


        String left = "left";
        String right = "right";
        String forward = "forward";

        warriorDestiny(forward);
        cliHelpers.separator();

        findNumbers();

    }

    public static void setPuhishment(int carSpeed) {
        if (carSpeed < 50) {
            System.out.println("Рядовая проверка документов.");
        } else if (carSpeed > 50 & carSpeed < 65) {
            System.out.printf("Вы превысили сокрость на %d км в час.\n", carSpeed - 50);
            System.out.println("Устное предупреждение на 5 минут.");
        } else if (carSpeed > 65 & carSpeed < 100) {
            System.out.printf("Вы превысили сокрость на %d км в час.\n", carSpeed - 65);
            setFine(40);
        } else if (carSpeed > 100 & carSpeed < 130) {
            System.out.printf("Вы превысили сокрость на %d км в час.\n", carSpeed - 100);
            setFine(500);
        } else {
            System.out.printf("Вы превысили сокрость на %d км в час.\n", carSpeed - 130);
            setFine(1000);
            carConfiscation();
            driveLisenceConfiscation(3);
        }
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

    public static void warriorDestiny(String destination) {
        if (destination == "left") {
            System.out.println("Витязь обогатился");
        } else if (destination == "right") {
            System.out.println("Женили витязя");
        } else if (destination == "forward") {
            System.out.println("Смерть витязя");
        }

        System.out.printf("Результаты выбора витязя: %s", destination);
    }

    public static void findNumbers() {
//        Дано число меньше 3000. При делении числа на 32 получается остаток 30, при делении на 58 - остаток 44. Найдите
//        число или число.

// ????

    }
}


