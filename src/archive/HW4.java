package archive;

public class HW4 {
    /*

    Домашнее задание

    Найти в интернете таблицы для типа данных char. Проверить, что они действительно соответствуют тому, что выводит
    Java на экран. Найти "смешные" символы, символ стандартного смайлика, найти символ телефона, параграфа, копирайта
    (C), торговой
    марки(тм), рубля, евро, доллара, знаков зодиака, шахмат, червы.

    Вбить в поисковую строку Windows "charmap".

    Найдите самостоятельно статьи на тему:

    Что такое юникод?
    Что такое ASCII?
    Что такое UTF?
    Что будет, если сложить переменную String с самой собой? Можно ли умножить её на саму себя? Почему?

    Вывести на экран сообщение в кавычках. Например собственное имя + "профессия".

    Вывести на экран построчно анкетные данные: Имя, Фамилия, Адрес, Улица и тд и тп. Пример вывода одной строчки:

    - Имя пользователя: Андрей
    Вырезать из выражения "Вход разрешён" последние 8 символов и добавить "воспрещён".

    Вывести на экран "Осторожно, вход воспрещён" заглавными буквами.
     */
    public static void main(String[] args) {

        printFunnySymbols();
        printCheckMateDesk();

        printNameAndProfession();

        printMyInfo();

        System.out.println(substringTask1());

        substringTask2();

        experimentWithString();
    }

    public static void printFunnySymbols() {
        char smile = '\u263a';
        char phone = '\u260f';
        char paragraph = '\u00b6';
        char copyright = '\u00a9';
        char trademark = '\u2122';
        char ruble = '\u20bd';
        char euro = '\u20ac';
        char dollar = '$';
        char zodiacLeo = '\u264c';
        char checkMate = '\u2655';
        char hearts = '\u2665';
        System.out.println("" + smile + phone + paragraph + copyright + trademark + ruble + euro + dollar + zodiacLeo + checkMate + hearts);
    }

    public static void printCheckMateDesk() {
        char whiteKing = '\u2654';
        char whiteQueen = '\u2655';
        char whiteRook = '\u2656';
        char whiteBishop = '\u2657';
        char whiteKnight = '\u2658';
        char whitePawn = '\u2659';

        char blackKing = '\u265a';
        char blackQueen = '\u265b';
        char blackRook = '\u265c';
        char blackBishop = '\u265d';
        char blackKnight = '\u265e';
        char blackPawn = '\u265f';

        System.out.println("" + whiteRook + whiteKnight + whiteBishop + whiteQueen + whiteKing + whiteBishop + whiteKnight + whiteRook);
        System.out.println("" + whitePawn + whitePawn + whitePawn + whitePawn + whitePawn + whitePawn + whitePawn + whitePawn);
        System.out.println("" + blackPawn + blackPawn + blackPawn + blackPawn + blackPawn + blackPawn + blackPawn + blackPawn);
        System.out.println("" + blackRook + blackKnight + blackBishop + blackKing + blackQueen + blackBishop + blackKnight + blackRook);
    }

    public static void printNameAndProfession() {
        String myName = "Egor";
        String myProfession = "programmer";

//        кавычки можно экранировать и использовать двойные, но тогда сложнее будет визуально воспринять эту часть кода.
        System.out.println("Hi! My name is " + myName + " and i am a " + "'" + myProfession + "'");
    }

    public static void printMyInfo() {
        String userName = "Egor";
        String userLastname = "Samoylov";
        String userPhoneNumber = "+123565888888";
        String userCity = "Buenos Aires";
        String userAdress = "some words";

        System.out.println('\u002d' + " Имя пользователя" + '\u003a' + " " + userName + '\n' + "- Фамилия пользователя: " + userLastname);
        System.out.println("- Телефонный номер пользователя: " + userPhoneNumber);
        System.out.println("- Город пользователя: " + userCity);
        System.out.println("- Адрес пользователя: " + userAdress);
    }

    public static String substringTask1() {
        String startPhrase = "Вход разрешен";
        String result = startPhrase.substring(0, 5) + "воспрещен";

        return result;
    }

    public static void substringTask2() {
        String needAdd = "Осторожно, ";
        String result = (needAdd + substringTask1()).toUpperCase();

        System.out.println(result);
    }

    public static void experimentWithString() {
//        создается объект класса String используя строковый литерал
        String a = "Какая то строка";

//        применить оператор сложения можно - получим конкатенацию
        System.out.println("Будет конкатенация - " + a + a);

//        конкатенация происходит даже если в строку записано число, но результат поменяется если провести
//        дополнительные манипуляции
        String b = "1024";
        System.out.println("Тоже конкатенация - " + b + b);

        int c = Integer.parseInt(b);
        int result = c + c;
        System.out.println("В тут уже произойдет сложение - " + result);

//        операция умножения не доступна для класса String, так как такое действие возможно только с числовым
//        типом данных.
//        System.out.println(a * b); // ошибка.

//        нельзя умножить именно String, но можно умножить ее длину заранее получив через
//        метод .lenght()
    }
}
