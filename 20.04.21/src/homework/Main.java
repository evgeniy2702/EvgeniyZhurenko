package homework;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {

    public static <Int> void main(String[] args) {
//	* Задание1: Ввести с клавиатуры строку текста, а затем один символ. Показать на экран
// * индексы (через пробел) и количество совпадений на следующей строке (ищем вхождения символа в строку).
// * Если символ не найден - выводить -1
// * Примечание: использовать методы строк
// * Пример:
// * Для строки "обороноспособность" и введенного символа "o" вывод будет:
// * 0 2 4 6 9 11 14
// * 7

        String str; // вводим строковую переменную для записи в нее предложения
        String ch; // вводим строковую переменную для записи в нее символа

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите с клавиатуры строку текста : ");
        str = sc.nextLine();

        System.out.println("Введите с клавиатуры один символ : ");
        while (true) {
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextLine()) {
                ch = scan.nextLine();
                if (ch.length() <= 1) {
                    break;
                } else {
                    System.err.println("Вы ввели больше чем одни символ! Пробуйте еще раз :");
                }
            }
        }

        System.out.println("Вы ввели символ : <" + ch + ">");

        System.out.print("Индексы символа <" + ch.toUpperCase() + "> в веденной строке :");

        int s = 0; // вводим переменную для подсчета кол-ва совпадений символа в строке
        int i = 0; //вводим переменную для вывода индекса найденого символа в строке

        while (true) {
            if (i < str.lastIndexOf(ch)) {
                i = str.indexOf(ch, i);
                System.out.print(i + "  ");
                s++;
                i += 1;
                }
            else {
                if (!str.contains(ch)) {
                    System.out.print(" нет нашего символа в строке!!!" + i);
                }
                break;
            }

        }
        System.out.println();
        System.out.println("Колличество совпадений : " + s);
        sc.close();
    }
}

