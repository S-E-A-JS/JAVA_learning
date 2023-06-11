public class HW19 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("А роза упала на лапу Азора")); // true
        System.out.println(isPalindrome("не палиндром")); // false
        cliHelpers.separator();

//      Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
        System.out.println(bobThere("abcbob"));// → true
        System.out.println(bobThere("b9b")); //→ true
        System.out.println(bobThere("bac")); //→ false

    }

    //    моя реализация задачи на палиндром
    public static boolean isPalindrome(String input) {
        String unifyString = input.replace(" ", "").toLowerCase();

        String reversedString = "";
        for (int i = unifyString.length(); i >= 0; i--) {
            if (i == unifyString.length()) {
                reversedString += unifyString.substring(i);
            } else {
                reversedString += unifyString.substring(i, i + 1);
            }
        }

        return reversedString.equals(unifyString);
    }

    public static boolean bobThere(String input) {
        char b = 'b';

        for (int i = 0; i < input.length(); i++) {
            if ((i + 2) > input.length()) break; // нужно что бы остановить перебор до получения ошибки
            if (input.charAt(i) == b && input.charAt(i + 2) == b) {
                return true;
            }
        }
        return false;
    }
}
