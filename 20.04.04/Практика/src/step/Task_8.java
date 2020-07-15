package step;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
//        Даны натуральные числа x и y. Вычислить произведение x y, используя лишь оператор сложения.

        Scanner sc = new Scanner(System.in);
        int x, y, z, sum = 0;

//        вводим с консоли числа Х и У и проверяем их на предмет натуральные они или нет

//        ввод и проверка Х
        while (true) {
            System.out.println("Введите натуральное число Х :");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                x = scan.nextInt();
                if (x < 0) {
                    System.out.println("Чило Х не натуральное. Введите число еще раз : ");
                }
                else break;;
            } else {
                System.out.println("Чило Х не натуральное. Введите число еще раз : ");
            }
        }

//            ввод и проверка У
        while (true) {
            System.out.println("Введите натуральное числа Y :");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                y = scan.nextInt();
                if (y < 0) {
                    System.out.println("Чило Y не натуральное. Введите число еще раз : ");
            }
                else break;;
            } else {
                System.out.println("Чило Y не натуральное. Введите число еще раз : ");
            }
        }

//        производим вычисление произведения числе Х на У путем сложения

        z = x;
        for (int i = x; i < x +y; i++) {
            sum = sum +z;
        }
        System.out.println("Произведение Х на У, используя лишь оператор сложения, будет равно : " + sum);
    }
}
