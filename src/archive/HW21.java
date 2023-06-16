package archive;

import java.util.Scanner;

public class HW21 {
    public static void main(String[] args) {
        guessNumber();
        System.out.println(passwordGenerator());
    }
    /*
     * 1 задачка на отгадывание чисел
     * программа должна загадать число от 1 до n
     * у пользователя k попыток отгадать
     * после каждой попытки программа отвечает больше или меньше загаданное число
     * в конце игры вывод текста
     *   "Вы угадали"
     * или
     *   "Попытки закончились"
     * */

    //    усложненная версия - количество попыток и диапазон загадываемого числа устанавливается пользователем
    public static void guessNumber() {
        Scanner userInput = new Scanner(System.in);
        int userGuess, k, min, max, randomNumber;

        System.out.println("Введите количество ваших попыток");
        k = userInput.nextInt();

        System.out.println("Введите начало диапазона для генерации загадываемого числа");
        min = userInput.nextInt();

        System.out.println("Введите конец диапазона для генерации загадываемого числа");
        max = userInput.nextInt();

        randomNumber = getRandomNumber(min, max);

        for (int i = 1; i <= k; i++) {
            System.out.println("Введите ваше число");
            userGuess = userInput.nextInt();

            if (userGuess > randomNumber) {
                System.out.println("Алгоритмом загадано меньшее число");
            } else if (userGuess < randomNumber) {
                System.out.println("Алгоритмом загадано большее число");
            } else if (i == k) {
                System.out.println("Ваши попытки закончились");
            } else {
                System.out.println("Верно! Загаданное число = " + randomNumber);
            }
        }
    }

    /*
     *  Сделайте генератор паролей. У пользователя компьютер должен спросить длину пароля и должны ли содежаться
     * только буквы или буквы и цифры. */

    public static String passwordGenerator() {
        String result = "";
        Scanner userInput = new Scanner(System.in);

        System.out.println("Установите длину пароля");
        int passwordLength = userInput.nextInt();

        System.out.println("Введите \"1\" если хотите сгенерировать пароль только из букв, или введите \"2\" если " +
                "хотите пароль из цифр и букв");
        int passwordVariant = userInput.nextInt();

        String charsCollection = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbersCollection = "0123456789";

        int i = 0;
        while (i < passwordLength) {
            int randomNumberForCharsCollection = getRandomNumber(1, charsCollection.length());

            if (passwordVariant == 2) {
                int randomNumberForNumbersCollection = getRandomNumber(1, numbersCollection.length());
                result += "" + charsCollection.charAt(randomNumberForCharsCollection - 1) + numbersCollection.charAt(randomNumberForNumbersCollection - 1);
            } else {
                result += charsCollection.charAt(randomNumberForCharsCollection);
            }
            i++;
        }
        return result;
    }

    public static int getRandomNumber(int startRange, int endRange) {
        return (int) (Math.random() * (endRange - startRange + 1)) + startRange;
    }
}
