package archive;/*
найдите применение каждому типу данных из заголовка и напишите программу с использованием byte,
short, int, long:

- найти площадь и периметр квадрата
- -\\- прямоугольника
- -\\- куба
- Найти количество зерен на шахматной доске, если на первую клетку положить одно зернышко, на
вторую клетку два зернышка, на третью в два раза больше, чем на предыдущей, то есть 4 и так далее
 */

public class HW2 {
    public static void main(String[] args) {
        findSquarePerimeter();
        findSquareArea();

        findRectanglePerimeter();
        findRectangleArea();

        findCubePerimeter();
        findCubeArea();

        findSeedsQuantity();

        experiment();
    }

    public static void findSquarePerimeter() {
        byte squareSideLenght = 10;

        int result = 4 * squareSideLenght;

        System.out.println(result);
    }

    public static void findSquareArea() {
        byte squareSideLenght = 10;

        int result = squareSideLenght * squareSideLenght;

        System.out.println(result);
    }

    public static void findRectanglePerimeter() {
        byte rectangleSideLenght_A = 5;
        byte rectangleSideLenght_B = 10;

        int result = 2 * (rectangleSideLenght_A + rectangleSideLenght_B);

        System.out.println(result);
    }

    public static void findRectangleArea() {
        byte rectangleSideLenght_A = 5;
        byte rectangleSideLenght_B = 10;

        int result = rectangleSideLenght_A * rectangleSideLenght_B;

        System.out.println(result);
    }

    public static void findCubePerimeter() {
        byte cubeSideLenght = 5;

        int result = 12 * cubeSideLenght;

        System.out.println(result);
    }

    public static void findCubeArea() {
        byte cubeSideLenght = 5;

        int result = 6 * (cubeSideLenght * cubeSideLenght);

        System.out.println(result);
    }

    public static void findSeedsQuantity() {
        long result = (long) Math.pow(2, 64) - 1;

        System.out.println("Количество зерен " + result);
    }

    public static void experiment() {
        byte b = 1;
        short s = 2;
        int i = 1;
        long l = 4;

        System.out.println(b == i);
    }
}

