package homework;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

//  Задание2: Подсчитать среднюю длину слова во введённом с клавиатуры предложении
//  Дробную часть при выводе отбросить.
//  Пример:  Для входной строки "Hello World" Результат будет 5

        Scanner scanner = new Scanner(System.in);
        String string; // вводим строковую переменную для записи в нее предложения
        String []split; //объявляем строковый массив, куда будем записывать слова из введеного предложения
        int sum = 0; // создаем переменную, куда запишем средную длинну слов предложения

    while (true) {
        System.out.println("Введите предложение : ");
        string = scanner.nextLine();
        if (string.isEmpty()) {
            System.out.println("Вы не ввели ни одного слова.");
        } else {
                split = string.split(" ");
            for (String s : split) {
                sum += s.length();
            }
            break;
        }
    }
        System.out.println("Средняя длинна слова в предложении равна : " + sum/split.length);
        scanner.close();
    }
}
