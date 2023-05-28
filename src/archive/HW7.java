package archive;

public class HW7 {
    public static void main(String[] args) {

        /*
         * Given a string, return true if the string starts with "hi" and false otherwise.
         */
        System.out.println(startHi("hi there")); // true
        System.out.println(startHi("hi")); // true
        System.out.println(startHi("hello hi")); //false
        cliHelpers.separator();

        /*
         * We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true
         * if 1 or more of them are teen.
         */
        System.out.println(hasTeen(13, 20, 10)); // true
        System.out.println(hasTeen(20, 19, 10)); // true
        System.out.println(hasTeen(20, 10, 13)); // true
        System.out.println(hasTeen(20, 10, 12)); // false
    }

    public static boolean startHi(String initialString) {
        String compareWith = "hi";

        // нашел метод .equals() - если правильно все понял то он как раз подходит для сравнения строк.
        return initialString.substring(0, 2).equals(compareWith);
    }

    public static boolean hasTeen(int a, int b, int c) {
        boolean result = false;

        if (checkIntHelper(a)) {
            result = true;
        } else if (checkIntHelper(b)) {
            result = true;
        } else if (checkIntHelper(c)) {
            result = true;
        }
        return result;
    }

    public static boolean checkIntHelper(int someInt){
        return someInt >=13 & someInt <=19;
    }
}

