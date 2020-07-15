package step;

import javax.swing.*;
import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
//        Найти:
//
//Произведение всех чисел от 8 до 15.

        int sum = 0;
        for ( int i = 8; i <= 15; i++) {
            sum = sum + i;
        }
        System.out.println("Произведение всех чисел от 8 до 15 = " + sum);
        System.out.println();

//Произведение всех чисел от a до 20 (значение a вводится с клавиатуры; 1 <= a <= 20)

        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Введите число 1 < = а < = 20 :");

        while (true) {

//            вводим число с а консоли
        a = sc.nextInt();

//        проводим проверку - введенное число из заданного диапазона или нет

        if (a >= 1 && a <= 20) break;
        else System.out.println("Вы ввели число не корректно. Попробуйте еще раз ввести число 1 < = а < = 20 :");
        }
            long sum1 = 1;
            for (int i = a; i <= 20; i++) {
                sum1 = sum1 * i;
            }
            System.out.println("Произведение всех чисел от " + a + " до 20 = " + sum1);
            System.out.println();
        System.out.println();


//Произведение всех чисел от 1 до b (значение b вводится с клавиатуры; 1 <= b <= 20)
        int b;
        System.out.println("Введите число 1 < = b < = 20 :");
        while (true) {
            b = sc.nextInt();
            if (b >= 1 && b <= 20) break;
            else System.out.println("Вы ввели число не корректно. Попробуйте еще раз ввести число 1 < = b < = 20 :");
        }
        long sum2 = 1;
        for (int i = 1; i <= b; i++) {
            sum2 = sum2 * i;
        }
        System.out.println("Произведение всех чисел от 1 до " + b + " =  " + sum2);
        System.out.println();
    }
}
