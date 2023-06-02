public class HW14 {
    public static void main(String[] args) {
        /*
         * Given two strings, append them together (known as "concatenation") and return the result. However, if the strings
         * are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello"
         *  and "Hi" yield "loHi". The strings may be any length.
         *
         */
        System.out.println(minCat("Hello", "Hi")); // "loHi"
        System.out.println(minCat("Hello", "java")); // "ellojava"
        System.out.println(minCat("java", "Hello")); // "javaello"
        /*
Given a string, return a string where for every char in the original, there are two chars.
*/
        System.out.println(doubleChar("The"));//"TThhee"
        System.out.println(doubleChar("AAbb"));// "AAAAbbbb"
        System.out.println(doubleChar("Hi-There"));// "HHii--TThheerree"

        /*
Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.
*/
        System.out.println(loneSum(1, 2, 3));// 6
        System.out.println(loneSum(3, 2, 3));// 2
        System.out.println(loneSum(3, 3, 3));// 0

        /*
Дано целое трехзначное число. Написать метод, который возвращает сумму разрядов этого числа, например:
* */
        System.out.println(sumOfNumberDigits(123)); // 6
        System.out.println(sumOfNumberDigits(768)); // 21
    }

    public static String minCat(String first, String second) {
        String result = "";

        if (first.length() > second.length()) {
            result = first.substring(compareStringsLength(first, second)) + second;
        } else {
            result = first + second.substring(compareStringsLength(first, second));
        }
        return result;
    }

    public static int compareStringsLength(String first, String second) {
        int result = 0;

        result = first.length() - second.length();

        if (result < 0) result = -result;

        return result;
    }

    public static String doubleChar(String someString) {
        String result = "";

        for (int i = 0; i < someString.length(); i++) {
            String stringChar = someString.substring(i, i + 1);
            result += stringChar + stringChar;
        }

        return result;
    }

    public static int loneSum(int a, int b, int c) {
        if (a + b == a + c) {
            return 0;
        } else if (a == c) {
            return b;
        } else if (a == b) {
            return c;
        }
        return a + b + c;
    }

    public static int sumOfNumberDigits(int n) {
        return n / 100 + (n % 100 / 10) + n % 10;
    }

}
