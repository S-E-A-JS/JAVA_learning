package archive;

public class HW12 {
    public static void main(String[] args) {
//        rectangle(5, 7); // рисуем прямоугольник
//        findNaturalNumbers(36); // найти натуральные числа
//        printCheckMateDesk(8,8); // рисуем шахматную доску
//        printMultiplicationTable(); // вывести таблицу умножения
//        printRightPartArrowDown(); // вывод треугольника (правая половина стрелки вниз)
//        printRightPartArrowUp(); // вывод треугольника (левая половина стрелки вверх)
//        printArrowUp(); // стрелка вверх
//        printArrowDown(); // -\\- вниз
//        printDiamond(); // вывод ромба
//        firstTriangleOfNumbers();
    }

    public static void rectangle(int height, int width) {
        char asterisk = '*';
        char newLine = '\n';
        String row = "";

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                row += asterisk;
            }
            row += newLine;
        }

        System.out.println(row);

    }

    public static void findNaturalNumbers(int numbersLimit) {
        /*
         * нужно написать алгоритм вывода на экран всех возможных комбинаций 3-х натуральных чисел до 36 с
         * определенными условиями:
         *
         * необходимо использовать вложенные циклы
         * x <= y <= z
         * xyz = 36
         *
         * например:
         * x=1, y=1, z=36
         * x=1; y=3; z=12
         * */

        String result = "";

        for (int x = 0; x <= numbersLimit; x++) {
            for (int y = 0; y <= numbersLimit; y++) {
                for (int z = 0; z <= numbersLimit; z++) {
                    if (((x * y * z) == numbersLimit) && (x <= y && y <= z)) {
                        result += x + " " + y + " " + z + '\n';
                    }
                }
            }
        }

        System.out.println(result);
    }

    public static void printCheckMateDesk(double height, double width) {
        /* вывести на экран символы * и _ в шахматном порядке (должно быть похоже на шахматную доску 8*8)
         * */
        String result = "";

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < (width - width % 2) / 2; j++) {
                if (i % 2 == 0) {
                    result += "*" + "_";
                } else {
                    result += "_" + "*";
                }

            }
            result += '\n';
        }
        System.out.println(result);
    }

    public static void printMultiplicationTable() {
        String result = "";

        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= 10; column++) {
                if (column < 2 && row != 10) {
                    result += " " + column * row;
                } else if (column * row < 10) {
                    result += "   " + column * row;
                } else if (row == 10 && column == 1) {
                    result += column * row;
                } else if (column == 10 && row != 10) {
                    result += "   " + column * row;
                } else {
                    result += "  " + column * row;
                }
            }
            result += '\n';

        }
//        дольше думал над тем как пробелы правильно расставить что бы смотрелось красиво
        System.out.println(result);

    }

    public static void printRightPartArrowUp() {
        String forAsterikses = "";
        char asterisk = '*';
        char space = ' ';
        for (int i = 0; i < 10; i++) {
            String forSpaces = "";
            for (int j = 0 + i; j < 10; j++) {
                forSpaces += space;
            }
            forAsterikses += asterisk;

            System.out.println(forSpaces + forAsterikses);
        }
    }

    public static void printRightPartArrowDown() {
        String forAsterikses = "";
        char asterisk = '*';

        for (int row = 0; row < 10; row++) {
            for (int column = 0 + row; column < 10; column++) {
                forAsterikses += asterisk;
            }
            forAsterikses += '\n';
        }

        System.out.println(forAsterikses);
    }

    public static void printArrowUp() {
        String result = "";
        String forAsterikses = "";
        String forSpaces = "";

        for (int i = 0; i < 12; i++) {
            for (int j = 1; j < 12 - i; j++) {
                forSpaces += " ";
            }
            for (int k = 0; k < i + i + 1; k++) {
                forAsterikses += "*";
            }
            if (i != 11) {
                result += forSpaces + forAsterikses + '\n';
            } else {
                result += forSpaces + forAsterikses;
            }
            forSpaces = "";
            forAsterikses = "";
        }

        System.out.println(result);
    }

    public static void printArrowDown() {
        String result = "";
        String forAsterikses = "";
        String forSpaces = "";

        for (int i = 0; i < 11; i++) {
            for (int k = 0; k < i + 1; k++) {
                forSpaces += " ";
            }
// Долго думал над этим циклом. Почему-то показалось что он сложнее чем со стрелкой вверх, но не понял почему.
            for (int j = 1; j < 2 * 11 - i - i; j++) {
                forAsterikses += "*";
            }
            result += forSpaces + forAsterikses + '\n';
            forAsterikses = "";
            forSpaces = "";
        }
        System.out.println(result);
    }

    public static void printDiamond() {
        printArrowUp();
        printArrowDown();
    }

    public static void firstTriangleOfNumbers() {
        String result = "";
        String forNumbers = "";
        String forSpaces = "";

        for (int i = 0; i < 6; i++) {
            for (int j = 1; j < 6 - i; j++) {
                forSpaces += " ";
            }
            for (int k = 0; k < i + i + 1; k++) {
                forNumbers += i + 1;
            }
            result += forSpaces + forNumbers;
            forSpaces = "";
            forNumbers = "";
        }

        System.out.println(result);
    }

    public static class HW13 {
        public static void main(String[] args) {
            /*
    *
    Дано число меньше 3000. При делении числа на 32 получается остаток 30, при делении на 58 - остаток 44. Найдите число или числа.

    * Программы, которая находит:

    високосный год
    простые числа
    чётные числа
    Отсюда следует распределение високосных годов:

    год, номер которого кратен 400, — високосный;
    остальные годы, номер которых кратен 100, — невисокосные (например, годы 1700, 1800, 1900, 2100);
    остальные годы, номер которых кратен 4, — високосные[
            * */

            System.out.println(findNumbers(3000));
            System.out.println(findEvenNumbers(100));
            findLeapYear(100);
            findPrimeNumbers(100);
        }

        // Не смог решить сам, посмотрел разбор задания в следующем видео.
        private static void findPrimeNumbers(int limit) {
            String result = "";

            for (int i = 1; i < limit; i++) {
                if (checkIsPrime(i)) {
                    result += i + " ";
                }
            }
            System.out.println(result);

        }

        public static boolean checkIsPrime(int n) {
            for (int i = 2; i < n; i++) { // Понимаю зачем нужна именно такая конструкция цикла - если делить число на
                // большее то всегда будет остаток от деления

                /*
                 * НО! Я не смог понять почему если начинать цикл из этого метода с 1 (ведь простым числом является число
                 * которое может делиться только на само себя и на 1), то в
                 * консоль выведет только 1 и больше ничего...*/
                if (n % i == 0) {
                    return false; // по моей логике тут надо возвращать true, но я не понял почему с true выходит
                    // неверный результат
                }
            }
            return true;
        }

    //    если брать более простое условие вычисления високосного года
        public static void findLeapYear(int limit) {
            String result = "";

            for (int i = 0; i <= limit; i++) {
                if (i % 4 == 0) {
                    result += i + " ";
                }
            }

            System.out.println(result);
        }

        public static String findNumbers(int limit) {
            String result = "";

            for (int i = 0; i < limit; i++) {
                if (i % 32 == 30 && i % 58 == 44) {
                    result += i + " ";
                }
            }
            return result;
        }

        public static String findEvenNumbers(int limit) {
            String result = "";

            for (int i = 0; i < limit; i++) {
                if (i % 2 == 0) {
                    result += i + " ";
                }
            }
            return result;
        }
    }
}
