package step;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        // 8.	Даны натуральные числа x и y. Вычислить произведение x * y, используя лишь оператор сложения.
        Scanner sc = new Scanner(System.in);

        float x = 0, y = 0;

        System.out.println("Введите натуральное число Х :");
        x = sc.nextFloat();
        for (; ; ) {
            if (x % 1 != 0 || x < 0) {
                System.out.println("Ваше число не явл натуральным. Введите число Х еще раз :");
                x = sc.nextFloat();
            } else break;
        }
            System.out.println("Введите натуральное число Y :");
        y = sc.nextFloat();
        for (; ; ) {
                if (y % 1 != 0 || y < 0) {
                    System.out.println("Ваше число не явл натуральным. Введите число Y еще раз :");
                    y = sc.nextFloat();
                } else break;
            }

            System.out.println("Вы ввели следующие натуральные числа : " + (int) x + " ; " + (int) y);

        int sum = 0;
        for (int i = 0; i < y; i++) {
            sum = (int) x + sum;
            }
        System.out.println("Произведение чисел " + (int) x + " на " + (int) y + ", используя лишь оператор сложения, будет равно : " + sum);
        }
    }
