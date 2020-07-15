package step;

import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
//        Найти 15 первых натуральных чисел, делящихся нацело на 19 и
//        находящихся в интервале, левая граница которого равна 100.

//        Вводим данные на предмет СКОЛЬКО надо вывести чисел из интервала , начинающегося со 100,
//        и НА СКОЛЬКО они должны делиться. Делаем проверку введеные числа явл натуральными или нет.

        int a, b;
        System.out.println("Введите какое кол-во натуральных чисел надо найти, начиная со 100 :");
        while (true){
            Scanner scan = new Scanner(System.in);

            if (scan.hasNextInt()) {
                a = scan.nextInt();
                if (a < 0) {
                    System.err.println("Вы ввели не корректное число !!! Введите ще раз : ");
                }
                else {
                    System.out.println("Вы ввели : " + a);
                    break;
                }
            }
            else System.err.println("Вы ввели не корректное число !!! Введите ще раз : ");
        }
        System.out.println("Введите число, на которое нацело должны делиться числа из интервала, начиная со 100 :");
        while (true){
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                b = scan.nextInt();
                if (b < 0) {
                    System.err.println("Вы ввели не корректное число !!! Введите ще раз : ");
                }
                else {
                    System.out.println("Вы ввели : " + b);
                    break;
                }
            }
            else System.err.println("Вы ввели не корректное число !!! Введите ще раз : ");
        }

//        Ищем, удовлетворяющих нашим требованиям, числа из интеравала и выводим их на консоль

        int x = 100, i = 0, j = 0;
        System.out.print("От 100 и выше нацело на " + b + " делятся следующие " + a + " членов :");
        while (true){
            if ((x + i)% b == 0) {
                System.out.print((x + i) + " ");
                i++; j++;
                if (j >= a) break;;
            }
           else ++i;
        }

    }
}
