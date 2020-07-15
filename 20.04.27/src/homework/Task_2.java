package homework;


import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_2 {
    public static <simbol> void main(String[] args) {
//        Следующие задания можете выполнить или с применением методов класса String или с регулярными выражениями,
//на Ваше усмотрение.
//
// * Задание: Пользователь вводит с клавиатуры строку. Поменять все большие буквы на
// * маленькие, а маленькие на большие.
// *
// * Пример:
// * При введенной строке: iTsTEP
// * Вывод на консоль должен быть: ItStep


        System.out.println("Применение методов класса String!");

        String stringInsert = new String(new StringBuffer());


        System.out.println("Введите строку :");

        while (true) {
            Scanner sc = new Scanner(System.in);
            stringInsert = sc.nextLine();
            if (stringInsert.isEmpty()) {
                System.out.println("Вы ничего не ввели. Попробуйте еще раз : ");
            } else {
                System.out.println("Вы ввели : \n" + stringInsert);
                break;
            }
        }

        char[] simbol = new char[stringInsert.length()];
        for (int i = 0; i < stringInsert.length(); i++) {
            simbol[i] = stringInsert.charAt(i);
            if (stringInsert.toUpperCase().charAt(i) == simbol[i]) {
                simbol[i] = stringInsert.toLowerCase().charAt(i);
            } else {
                simbol[i] = stringInsert.toUpperCase().charAt(i);
            }
        }

        stringInsert = String.valueOf(simbol);
        System.out.println("После преобразования регистров методами String() получили : \n" + stringInsert);
        System.out.println();


        System.out.println("Применение регулярных выражений!");

        final String regexUpp = "[A-Z]";
        final String regexLower = "[a-z]";
        final String string = stringInsert;

        System.out.println("В предыдущем примере мы получили строку : \n" + string);


        final Pattern patternUpp = Pattern.compile(regexUpp, Pattern.MULTILINE);
        final Pattern patternLower = Pattern.compile(regexLower, Pattern.MULTILINE);

        final Matcher matcherUpp = patternUpp.matcher(string);
        final Matcher matcherLower = patternLower.matcher(string);

        int index = 0;
        char stringChar[] = new char[string.length()];
        String stringArray[] = new String[string.length()];
        for (int i = 0; i < string.length(); i++) {
            stringArray[i] = string.substring(i,i+1);
        }
        string.getChars(0,string.length(),stringChar,0);

        while (matcherLower.find()) {
            index = matcherLower.start();
            stringArray[index] = String.valueOf(stringChar[index]).toUpperCase();
            }
        while (matcherUpp.find()){
            index = matcherUpp.start();
            stringArray[index] = String.valueOf(stringChar[index]).toLowerCase();
        }

        System.out.print("После преобразования регистров методом регулярных выражений получили : \n" );
        for (String s : stringArray) {
            System.out.print(s);

        }
    }
}



