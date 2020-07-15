package step;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
//        Вывести на экран ряд чисел Фибоначчи, состоящий из n элементов.
//        Числа Фибоначчи – это элементы числовой последовательности
//        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144…
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во элементов последовательности Фибоначи : ");
        int n = sc.nextInt(), z = 1, x = z, y = 0;

        System.out.print("Вывести на экран ряд чисел Фибоначчи, состоящий из " + n + " элементов.\n\n" +
                "Последовательность Фибоначчи будет следующей : ");
        System.out.print(y + "; " + x  + "; " + z + "; ");
        for (int i = 0; i < n; i++) {
            y = z + x;
            z = x;
            x = y;
            System.out.print(y + "; ");
        }
    }
}
