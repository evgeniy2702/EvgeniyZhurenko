package homework;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task_3 {
    public static void main(String[] args) {
//        Задание: Написать программу которая будет подсчитывать количество слов, гласных и
// * согласных букв в строке введённой пользователем. Дополнительно выводить
// * количество знаков пунктуации, цифр и др. символов.
// *
// * Прмер:
// * Для введенной строки: "Hello World"
// * Вывод на консоль будет:
// * Слов - 2
// * Гласных - 3
// * Согласных - 7

        String stringInsert = new String (new StringBuffer());


        System.out.println("Введите строку :");

        while (true) {
            Scanner sc = new Scanner(System.in);
            stringInsert = sc.nextLine();
            if (stringInsert.isEmpty()) {
                System.out.println("Вы ничего не ввели. Попробуйте еще раз : ");
            }
            else {
                break;
            }
        }
        System.out.println("Вы ввели следующую строку : " + stringInsert);

        StringTokenizer stringToken = new StringTokenizer(stringInsert);
        int n = stringToken.countTokens();
        System.out.println("В введеной Вами строке через класс StringTokenizer посчитано :\nCлов - " + n);

        final String regex = "\\b";
        final String regex1 = "([eyuioaEYUIOA]|[уеыаоэяиюУЕЫАОЭЯИЮ])";
        final String regex2 = "([qwrtpsdfghjklzxcvbnmQWRTPSDFGHJKLZXCVBNM]|[йцкнгшщзхъфвпрлджчсмтьбЙЦКНГШЩЗХЪФВПРЛДЖЧСМТЬБ])";

        final String string = stringInsert;
        final String string1 = stringInsert;
        final String string2 = stringInsert;

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Pattern pattern1 = Pattern.compile(regex1, Pattern.MULTILINE);
        final Pattern pattern2 = Pattern.compile(regex2, Pattern.MULTILINE);

        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher1 = pattern1.matcher(string1);
        final Matcher matcher2 = pattern2.matcher(string2);

        int word=0;
        while (matcher.find()) {
            word++;
            }
        System.out.println("В введеной Вами строке через регулярные выражения посчитано :\nCлов - " + word/2);

        int glasnie = 0;
        while ((matcher1.find())){
            glasnie++;
        }
        System.out.println("Гласных - " + glasnie);

        int soglasnie = 0;
        while ((matcher2.find())){
            soglasnie++;
        }
        System.out.println("Согласных - " + soglasnie);
        System.out.println("Знаков пунктуации, цифр и др. символов - " + (stringInsert.length()- glasnie - soglasnie));
        }
    }

