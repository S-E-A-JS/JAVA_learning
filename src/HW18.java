public class HW18 {
    public static void main(String[] args) {
/*
циклы while, do while

- Даны целые числа A и B, где B > 0. Вывести B раз число A.
- Вывести в порядке возрастания все числа между А и B, где а = 5, а B = 17.
- "Нарисуйте" (выведите на консоль) треугольник из звёздочек, используя только одну звёздочку и то, что только что
изучили.
 */
        int a = 5;
        int b = 17;
//        printNumberNTimes(a, b);
//        printNumbers(a, b);
        printTriangle(10);
    }

    public static void printNumberNTimes(int n, int repeatTimes) {
        int i = 0;
//        with while loop
        while (i < repeatTimes) {
            System.out.println(n);
            i++;
        }

//        with do while loop
//        do {
//            System.out.println(n);
//            i++;
//        } while (i < repeatTimes);
    }

    public static void printNumbers(int from, int to) {
        int i = from;
        // with while loop
//        while (i < to) {
//            if (i == from) {
//                i++;
//            } else {
//                System.out.println(i);
//                i++;
//            }
//        }

//        with do while loop
        do {
            if (i == from) {
                i++;
            } else {
                System.out.println(i);
                i++;
            }
        } while (i < to);
    }
    public static void printTriangle(int rows){
        String result = "";
        int i = 0;

//        with while loop
//        while (i < rows) {
//            result += '*';
//            System.out.println(result);
//            i++;
//        }

//        with do while loop
        do {
            result += '*';
            System.out.println(result);
            i++;
        } while (i < rows);
    }
}
