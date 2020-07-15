package step;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
//        Дано число n. Из чисел 1, 4, 7, 10, 13, ... (до заданного вами числа)  напечатать те, которые не превышают n.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число N :");
        double n;
        int z, y = 1;
//        Делаем проверку на предмет какое число ввел пользователь : натуральное или нет

        while (true) {
            n = sc.nextDouble();
            if (n - (int) n == 0 && n > 0) break;
            else System.out.println("Введеное число не натуральное. Введите число еще раз : ");
        }

//      выводим на экран числа, которые не превышают введеного пользователем числа

        z = (int) n;
        System.out.println("Вы ввели след число N = " + z);
        System.out.println();

//      выводим на консоль числа , которые не превышают введеное пользователем число

        System.out.print("Ряд получисля : ");
        for (int i = 0; i < z; i +=3) {
            System.out.print(y + " ");
            y +=3;
        }
    }
}
