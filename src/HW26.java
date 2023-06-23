public class HW26 {
    public static void main(String[] args) {
        System.out.println(starOut("ab*cd")); // "ad"
        System.out.println(starOut("ab**cd")); // "ad"
        System.out.println(starOut("sm*eilly")); // "silly"
        cliHelpers.separator();

        System.out.println(countHi("abc hi ho")); // 1
        System.out.println(countHi("ABChi hi")); // 2
        System.out.println(countHi("hihi")); // 2
    }



    /*
     * Return a version of the given string, where for every star () in the string the star and the chars immediately
     * to its left and right are gone. So "abcd" yields "ad" and "ab**cd" also yields "ad".
     * */

    public static String starOut(String input) {
        String result = "";
        char asterisk = '*';

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == asterisk && input.charAt(i + 1) == asterisk) {
                result = input.substring(0, i - 1) + input.substring(i + input.indexOf(input.charAt(i)) + 1);
                break;
            } else if (input.charAt(i) == asterisk && input.charAt(i + 1) != asterisk) {
                result = input.substring(0, i - 1) + input.substring(i + input.indexOf(input.charAt(i)));
                break;
            } else {
                result = input;
            }
        }

        return result;
    }

    /*
     * Return the number of times that the string "hi" appears anywhere in the given string.*/
    public static int countHi(String input) {
        int result = 0;
        String target = "hi";
        input += " "; // не могу придумать способ как иначе обходить ошибку если i это последний символ

        for (int i = 0; i < input.length() - 1; i++) {
            if (target.equals("" + input.charAt(i) + input.charAt(i + 1))) {
                result++;
            }
        }

        return result;
    }
}
