package step;

import java.util.Scanner;

public class Task_3_4 {
    public static void main(String[] args) {
//        Напечатать таблицу умножения на 9 в обратном порядке:

        for (int i = 9; i > 0 ; i--) {
            System.out.println( i + " * 9 = " + (i*9));
        }

//        Напечатать таблицу умножения на число n (значение n вводится с клавиатуры 1 <= n <= 9)

        System.out.println();
        System.out.println("Введите число для вывода по нему табл умножения :");
        Scanner sc = new Scanner(System.in);

//        вводим число с консоли
        int n = sc.nextInt();

//        выводим введеное число на консоль
        System.out.println("Вы ввели число - " + n);

//        выводим таблицу умножения по введенному числу
        for (int i = 1; i < 10; i++) {
            System.out.println( i + " * " + n + " = " + (i*n));
        }
        sc.close();
    }
}
