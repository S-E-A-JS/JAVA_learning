package archive;

public class HW24 {
    public static void main(String[] args) {
/*
* You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. Consider the
sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more
than either bc or ac sums, the result is 5. Otherwise the result is 0.
* */

        System.out.println(blueTicket(9, 1, 0)); // 10
        System.out.println(blueTicket(9, 2, 0)); // 0
        System.out.println(blueTicket(6, 1, 4)); // 10
        System.out.println(blueTicket(9, 10, 0)); // 5
        cliHelpers.separator();


     /*
     * You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes, in the
range 0..10, and "date" is the stylishness of your date's clothes. The result getting the table is encoded as an int value with
0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result is 2 (yes). With the exception that if either of
you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
     * */
        System.out.println(dateFashion(5, 10)); // 2
        System.out.println(dateFashion(5, 2)); // 0
        System.out.println(dateFashion(5, 5)); // 1
        cliHelpers.separator();

        /*
         * Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in
         *  that case just return

         * */
        System.out.println(sortaSum(3, 4)); // 7
        System.out.println(sortaSum(9, 4)); // 20
        System.out.println(sortaSum(10, 11)); // 21
    }

    // решение третьей задачи
    public static int sortaSum(int a, int b) {
        int result;

        if (!(a + b >= 10 & a + b <=19)) {
            return a + b;
        } else {
            result = 20;
        }

        return result;
    }

    //    решение второй задачи
    public static int dateFashion(int youreStylishness, int herStylishness) {
        int result = 1;

        if (youreStylishness >= 8 || herStylishness >= 8) result = 2;
        if (youreStylishness <= 2 || herStylishness <= 2) result = 0;

        return result;
    }


    //    решение первой задачи
    public static int blueTicket(int a, int b, int c) {
        int result = 0;
        int abSum, bcSum, acSum;

        abSum = a + b;
        bcSum = b + c;
        acSum = a + c;

        if (isEqual(abSum, 10) | isEqual(bcSum, 10) | isEqual(acSum, 10)) result = 10;
        if (isFirstGreaterThanSecond(abSum, bcSum, 10) | isFirstGreaterThanSecond(abSum, acSum, 10)) result
                = 5;

        return result;
    }

    public static boolean isEqual(int input, int compareTo) {
        return input == compareTo;
    }

    public static boolean isFirstGreaterThanSecond(int first, int second, int exactly) {
        return first - second == exactly;
    }


}
