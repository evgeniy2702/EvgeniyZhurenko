package Homework;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.spi.AbstractResourceBundleProvider;

public class Task_1 {

    public static void main(String[] args) {
        //  Написать метод, который получает слово и определяет
        //  одинаковы ли второй и четвертый символы в нем.


        String string;
        String word;
        int num = 0;
        int firstSing = 0;
        int secondSing = 0;

        System.out.println("Введите строку на свое усмотрение : ");

        string = Task_1.stringLength();

        System.out.println("Введите номер слова в строке, в котором надо выполнить проверку :");

        while (true) {

            num = Task_1.intChek();

            if (num <= new StringTokenizer(string).countTokens()) {
                word = Task_1.numWordSearch(string, num - 1);
                break;
            } else {
                System.err.println("Вы превысели колличество слов в строке!!Попробуйте еще раз.");
            }
        }

        System.out.println("Вы выбрали слово : " + word);

        System.out.println("Введите пжл индексы букв, которые вы хотите поменять местами : ");
        firstSing = Task_1.intChek();
        secondSing = Task_1.intChek();

        Task_1.changeSingPlace(word, firstSing, secondSing);

    }

//    Подключаемые методы

//    Метод поиска заданного пользователем слова по номеру его в тексте

    public static String numWordSearch(String arg, int call) {

        int i = 0;

            final String regex = "([a-zA-Z0-9]+)|([а-яA-Z0-9]+)";

            final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
            final Matcher matcher = pattern.matcher(arg);

            String[] array = new String[new StringTokenizer(arg).countTokens()];
            while (matcher.find()) {
                array[i] = matcher.group(0);
                i++;
            }

            return array[call];
    }

//      Метод проверки числа на целочисленное

    public static int intChek () {

            int arg = 0 ;

            while (true) {

                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    arg = scanner.nextInt();
                    System.out.println("Вы ввели целочисленное значение : " + arg);
                    break;
                } else {
                    System.err.println("Вы ввели не целочисленное значение. Попробуйте еще раз.");
                    intChek();
                }
            }
            return arg;
        }


//      Метод замены букв в слове с заданными индексами

    public static void changeSingPlace (String arg, int first, int second){

        char character ;
        char [] sing = new char[arg.length()];

        arg.getChars(0,arg.length(),sing,0);

        if (arg.length() >= 4) {
            character = sing[first-1];
            sing[first-1] = sing[second-1];
            sing[second-1] = character;
            System.out.println("При замене " + first + " элемента на " + second + " мы получим слово : " + String.valueOf(sing));
        }
        else {
            System.err.println("Выбранное слово имеет меньше 4-х букв. Попробуйте еще раз.");


        }

        }

//        Метод проверки что введено в качестве строки

    public static String stringLength () {

        String arg;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                arg = scanner.nextLine();
                if (arg.length() == 0) {
                    System.err.println("Вы ничего не ввели. Попробуйте еще раз !");
                } else {
                    System.out.println("Вы ввели следующую строку : " + arg);
                    break;
                }
            }
            else {
                System.out.println("Вы не корректно ввели строку. Повторите пжл еще раз!");
            }
        }
        return arg;
    }
}
