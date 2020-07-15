package Homework;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_3 {

//    Пользователь вводит текст, в котором имеются несколько идущих подряд цифр.
//    Написать метод, который получает число, образованное этими цифрами
//    (сделать проверку на наличие цифр в тексте, вывести первые идущие подряд цифры, остальные не нужно).

    public static void main(String[] args) {

        String text;
        int num = 0;

        text = Task_3.stringChek();
        if (Task_3.numChek(text)){
            num = Task_3.printNum(text);
            System.out.println("В вашем тексте первые идущие подряд цифры составили число : " + num);
        }
        else {
            System.out.println("В вашем тексте нет цифр!!!");
        }

    }

//    Подключаемые методы

    // Метод на проверку введен текст или нет, если введено одно слово или ничего не введено, то
    // просим ввести ткст еще раз
    public static String stringChek () {

        String arg = "";

        while (true) {

            System.out.println("Введите текст на свое усмотрение : ");

            Scanner scanner = new Scanner(System.in);

            if (scanner.hasNextLine()) {

                arg = scanner.nextLine();

                if (new StringTokenizer(arg).countTokens() != 0 && new StringTokenizer(arg).countTokens() >= 2) {

                    System.out.println("Вы ввели следующий текст : " + arg);
                    break;
                } else {
                    System.err.println("Вы ничего не ввели или  ввели одно слово. Попытайтесь еще раз.");
                }
            }
        }
        return arg;
    }

    // Метод проверяет есть цифры в тексте или нет
    public static boolean numChek ( String arg) {

            boolean bool = false;
            final String regex = "\\d+";

            final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
            final Matcher matcher = pattern.matcher(arg);

            if (matcher.find()) {
                bool = true;
            }

            return bool;

    }

    // Метод который находит цифры в тексте и выводит первые идущие подряд цифры
    public static int printNum (String arg){

        int num = 0;
        final String regex = "\\d+";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(arg);

        if (matcher.find()) {
            num = Integer.valueOf(matcher.group(0));
        }
        return num;
    }

    }
