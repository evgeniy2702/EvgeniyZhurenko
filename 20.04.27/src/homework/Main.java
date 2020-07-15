package homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        //Задание: С помощью регулярных выражений напишите проверку ввода номера мобильного телефона
        // * Пример:
        // * +380(99)123-45-67
        // * Номер валидный

        Scanner sc = new Scanner(System.in);
        String index = "+38";
        String fonenumber = new String(new StringBuffer());
        System.out.print("Введите номер телефона : "+ index);
        fonenumber = sc.nextLine();
        System.out.println("Вы ввели следующий номер телефона : " + index + fonenumber);


        final String regex = "^(\\+\\d{3}(|[ -\\/()])\\d{2}(|[ -\\/()])(|[ -\\/()])\\d{3}(|[_ -\\/()])\\d{2}(|[_ -\\/()]))(\\d{2}$)";
        final String string = index + fonenumber;

        System.out.println(string);

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        if (matcher.find()) {
            System.out.println("Номер валидный");
        }
        else {
            System.out.println("Номер не валидный");
        }
        sc.close();
    }
}
