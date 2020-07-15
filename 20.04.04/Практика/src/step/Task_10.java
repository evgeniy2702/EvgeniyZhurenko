package step;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
//        Запросить у пользователя натуральное число n. Найти число получаемое при прочтении его цифр справа налево.

        Scanner sc = new Scanner(System.in);
//        Задаем число N и проверяем его на предмет натуральное оно или нет

        System.out.println("Введите натуральное число N :");
        double n;
        int l, s, z, x;
        while (true) {
            n = sc.nextDouble();
            if (n - (int) n == 0 && n > 0) break;
            else System.out.println("Введеное число не натуральное. Введите число еще раз : ");
        }

//        выводим введеное число на консоль

        z = (int) n;
        System.out.println("Вы ввели след число N = " + z);

//        выводим цифры введеного числа в обратном порядке справа на лево

        while (z != 0) {
            l = 10;
            x = z % l;
            z /= 10;
            System.out.print(x);
        }
    }
}
