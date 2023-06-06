public class HW15 {
    public static void main(String[] args) {
        /*
         * Разобраться с методами
         * contains(CharSequence s)
         * endsWith(String suffix)
         * equals(Object anObject)
         * equalsIgnoreCase(String anotherString)
         * isEmpty()
         * length()
         * replace(char oldChar, char newChar)
         * startsWith(String prefix)
         * substring(int beginIndex)
         * toLowerCase()
         * toUpperCase()
         * trim()
         */

        String test0 = "Testing";

        System.out.println(test0.contains("e")); // true
        System.out.println(test0.contains("ee")); // false
        System.out.println(test0.contains("")); // true
        cliHelpers.separator();

        System.out.println(test0.endsWith("ing")); // true
        System.out.println(test0.endsWith("")); // true
        System.out.println(test0.endsWith("n")); // false
        cliHelpers.separator();

        String test1 = "testing";
        System.out.println(test0.equals(test0)); // true
        System.out.println(test0.equals(test1)); // false
        test1 = test0;
        System.out.println(test0.equals(test1)); // true
        cliHelpers.separator();

        System.out.println(test0.equalsIgnoreCase(test1)); // true
        cliHelpers.separator();

        System.out.println(test0.isEmpty()); // false
        String test2 = "";
        test2 += "";
        System.out.println(test2.isEmpty()); // true
        test2 += " ";
        System.out.println(test2.isEmpty()); // false
        cliHelpers.separator();

        System.out.println(test0.length()); // 7
        cliHelpers.separator();

        System.out.println(test0.replace("T", "t")); // then => Testing, after => testing
        cliHelpers.separator();

        System.out.println(test0.startsWith("Te")); // true
        System.out.println(test0.startsWith("Te", 2)); // false
        System.out.println(test0.startsWith("e", 1)); // true
        cliHelpers.separator();

        System.out.println(test0.substring(0)); // Testing
        System.out.println(test0.substring(0, 1)); // T
        System.out.println(test0.substring(test0.length() - 1)); // g
        cliHelpers.separator();

        System.out.println(test0.toLowerCase()); // testing
        cliHelpers.separator();

        System.out.println(test0.toUpperCase()); // TESTING
        cliHelpers.separator();

        test0 = "   "  + " пробелы нас преследуют" + '\u0020' + '\n';
        System.out.println(test0); //     пробелы нас преследуют (+ разрыв строки)
        System.out.println(test0.trim()); // пробелы нас преследуют (все символы пробелов в начале и конце строки
        // удалены)
    }

}