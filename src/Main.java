/*
найдите применение каждому типу данных из заголовка и напишите программу с использованием byte,
short, int, long:

- найти площадь и периметр квадрата
- -\\- прямоугольника
- -\\- куба
- Найти количество зерен на шахматной доске, если на первую клетку положить одно зернышко, на
вторую клетку два зернышка, на третью в два раза больше, чем на предыдущей, то есть 4 и так далее
 */

public class Main {
    public static void main(String[] args) {
        byte squareSideLenght = 10;

        byte rectangleSideLenght_A = 5;
        byte rectangleSideLenght_B = 10;

        byte cubeSideLenght = 5;

        byte checkMateDeskSideLenght = 8;

        System.out.println("Периметр квадрата равен: " + findSquarePerimeter(squareSideLenght));
        System.out.println("Площадь квадрата равна: " + findSquareArea(squareSideLenght));

        System.out.println("Периметр прямоугольника равен: " + findRectanglePerimeter(rectangleSideLenght_A,
                rectangleSideLenght_B));

        System.out.println("Площадь прямоугольника равна: " + findRectangleArea(rectangleSideLenght_A, rectangleSideLenght_B));
        System.out.println("Периметр куба равен: " + findCubePerimeter(cubeSideLenght));
        System.out.println("Площадь куба равна: " + findCubeArea(cubeSideLenght));

        System.out.println("Количество зерен на шахматной доске равно : " + findSeedsQuantity());
        ;

    }

    public static int findSquarePerimeter(byte squareSideLenght) {
        int result = 4 * squareSideLenght;

        return result;
    }

    public static int findSquareArea(byte squareSideLenght) {
        int result = squareSideLenght * squareSideLenght;

        return result;
    }

    public static int findRectanglePerimeter(byte rectangleSideLenght_A, byte rectangleSideLenght_B) {
        int result = 2 * (rectangleSideLenght_A + rectangleSideLenght_B);

        return result;
    }

    public static int findRectangleArea(byte rectangleSideLenght_A, byte rectangleSideLenght_B) {
        int result = rectangleSideLenght_A * rectangleSideLenght_B;

        return result;
    }

    public static int findCubePerimeter(byte cubeSideLenght) {
        int result = 12 * cubeSideLenght;

        return result;
    }

    public static int findCubeArea(byte cubeSideLenght) {
        int result = 6 * (cubeSideLenght * cubeSideLenght);

        return result;
    }

    public static long findSeedsQuantity() {
        long chunk1 = 1;
        long chunk2 = chunk1 * 2;
        long chunk3 = chunk2 * 2;
        long chunk4 = chunk3 * 2;
        long chunk5 = chunk4 * 2;
        long chunk6 = chunk5 * 2;
        long chunk7 = chunk6 * 2;
        long chunk8 = chunk7 * 2;
        long chunk9 = chunk8 * 2;
        long chunk10 = chunk9 * 2;
        long chunk11 = chunk10 * 2;
        long chunk12 = chunk11 * 2;
        long chunk13 = chunk12 * 2;
        long chunk14 = chunk13 * 2;
        long chunk15 = chunk14 * 2;
        long chunk16 = chunk15 * 2;
        long chunk17 = chunk16 * 2;
        long chunk18 = chunk17 * 2;
        long chunk19 = chunk18 * 2;
        long chunk20 = chunk19 * 2;
        long chunk21 = chunk20 * 2;
        long chunk22 = chunk21 * 2;
        long chunk23 = chunk22 * 2;
        long chunk24 = chunk23 * 2;
        long chunk25 = chunk24 * 2;
        long chunk26 = chunk25 * 2;
        long chunk27 = chunk26 * 2;
        long chunk28 = chunk27 * 2;
        long chunk29 = chunk28 * 2;
        long chunk30 = chunk29 * 2;
        long chunk31 = chunk30 * 2;
        long chunk32 = chunk31 * 2;
        long chunk33 = chunk32 * 2;
        long chunk34 = chunk33 * 2;
        long chunk35 = chunk34 * 2;
        long chunk36 = chunk35 * 2;
        long chunk37 = chunk36 * 2;
        long chunk38 = chunk37 * 2;
        long chunk39 = chunk38 * 2;
        long chunk40 = chunk39 * 2;
        long chunk41 = chunk40 * 2;
        long chunk42 = chunk41 * 2;
        long chunk43 = chunk42 * 2;
        long chunk44 = chunk43 * 2;
        long chunk45 = chunk44 * 2;
        long chunk46 = chunk45 * 2;
        long chunk47 = chunk46 * 2;
        long chunk48 = chunk47 * 2;
        long chunk49 = chunk48 * 2;
        long chunk50 = chunk49 * 2;
        long chunk51 = chunk50 * 2;
        long chunk52 = chunk51 * 2;
        long chunk53 = chunk52 * 2;
        long chunk54 = chunk53 * 2;
        long chunk55 = chunk54 * 2;
        long chunk56 = chunk55 * 2;
        long chunk57 = chunk56 * 2;
        long chunk58 = chunk57 * 2;
        long chunk59 = chunk58 * 2;
        long chunk60 = chunk59 * 2;
        long chunk61 = chunk60 * 2;
        long chunk62 = chunk61 * 2;
        long chunk63 = chunk62 * 2;
        long chunk64 = chunk63 * 2;
        long total =
                chunk1 + chunk2 + chunk3 + chunk4 + chunk5 + chunk6 + chunk7 + chunk8 + chunk9 + chunk10 + chunk11 + chunk12 + chunk13 + chunk14 + chunk15 + chunk16 + chunk17 + chunk18 + chunk19 + chunk20 + chunk21 + chunk22 + chunk23 + chunk24 + chunk25 + chunk26 + chunk27 + chunk28 + chunk29 + chunk30 + chunk31 + chunk32 + chunk33 + chunk34 + chunk35 + chunk36 + chunk37 + chunk38 + chunk39 + chunk40 + chunk41 + chunk42 + chunk43 + chunk44 + chunk45 + chunk46 + chunk47 + chunk48 + chunk49 + chunk50 + chunk51 + chunk52 + chunk53 + chunk54 + chunk55 + chunk56 + chunk57 + chunk58 + chunk59 + chunk60 + chunk61 + chunk62 + chunk63 + chunk64;


        return total;
    }
}

