package archive;

public class HW13 {
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

//        System.out.println(findNumbers(3000));
//        System.out.println(findEvenNumbers(100));
//        findLeapYear(100);
        findPrimeNumbers(100);
    }

    // Не смог решить сам, посмотрел разбор задания в следующем видео.
    private static void findPrimeNumbers(int limit) {
        String result = "";

        for (int i = 1; i < limit; i++) {
            if (isPrime(i)) {
                result += i + " ";
            }
        }
        System.out.println(result);

    }

    public static boolean isPrime(int n) {
        int range = (int) Math.ceil(Math.sqrt(n));
        for (int i = 2; i < range; i++) { // Понимаю зачем нужна именно такая конструкция цикла - если делить число на
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

