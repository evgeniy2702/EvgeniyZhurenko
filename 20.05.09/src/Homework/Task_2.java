package Homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_2 {

//    *Пользователь вводит слово. Сделать проверку на то чтобы слово
//    состояло из четного числа букв. Поменять местами его половины.

    public static void main(String[] args) {

        String word;

        word = stringChek();

        while (true) {
            if (evenOdd(word)) {
                word = changeHalf(word);
                System.out.println("В результате замены половин слова местами получили : " + word);
                break;
            } else {
                System.err.println("Ваше слово содержит нечетное колличество букв. Постарайтесь еще раз!");
                word = stringChek();
            }
        }
    }

//        Подключаемые методы

    // Метод проверки ввели ли строковую переменную или нет,  1 слово или больше, содержит ли оно цифры или нет, или ввели пустую строку
    public static String stringChek() {

        String string ="";
        int num = 0;

        while (true) {

            System.out.println("Введите слово с четным колличеством букв : ");

            Scanner scanner = new Scanner(System.in);

            if (scanner.hasNextLine()) {
                string = scanner.nextLine();

                if ( new StringTokenizer(string).countTokens() > 1){
                    System.err.println("Вы ввели больше одного слова. Попробуйте еще раз.");
                }
                else if (string.length() == 0){
                    System.err.println("Вы ничего не ввели! Попробуйте еще раз!");
                }
                else {

                    final String regex = "\\d+";

                    final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
                    final Matcher matcher = pattern.matcher(string);

                    if (matcher.find()) {
                        System.err.println("Вы ввели не корректно слово, оно содержит цифры. Попробуйте еще раз !");
                    } else {
                        System.out.println("Вы ввели слово : " + string);
                        break;
                    }
                }
            } else {
                System.err.println("Вы ввели не слово. Попробуйте еще раз!");
            }
        }
        return string;
    }

    // Метод проверки на четное или нет колличество букв в слове
    public static boolean evenOdd (String arg) {

        boolean bool = false;
        if( arg.length() % 2 == 0) {
            bool = true;
        }
        return bool;
    }

    // Метод замены первой и последней половин слова местами
    public static String changeHalf (String arg) {

        char[] array = new char[arg.length()];
        arg.getChars(0,arg.length()/2 ,array,arg.length()/2);
        arg.getChars(arg.length()/2, arg.length(),array, 0);

        return  String.valueOf(array);
    }

}

