package step;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
//        Запросить у пользователя натуральное число n. Вывести в консоль все его цифры через пробел.

        Scanner sc = new Scanner(System.in);

//        вводим с консоли произвольное число и делаем проверку на предмет натуральное оно или нет

        int n, l, s, z, x = 1;

        while (true) {
            System.out.println("Введите натуральное числа N :");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                n = scan.nextInt();
                if (n < 0) {
                    System.out.println("Чило N не натуральное. Введите число еще раз : ");
                }
                else break;;
            } else {
                System.out.println("Чило N не натуральное. Введите число еще раз : ");
            }
        }


//        выводим на консоль число ,которое мы ввели

        z = (int) n;
        System.out.println("Вы ввели след число N = " + z);

//        определяем длинну введеного нами числа

        s = ( z == 0 ) ? 1 : 0;
        while ( z != 0) {
            s++;
            z /=10;
        }

//        задаем порядок числа через его длинну и выводим все цифры числа на консоль через пробел

        System.out.print("Ваше число состоит из след. чисел : ");
        for ( int j = 0; j < s - 1; j++) {
            x *=10;
        }
        if (n == 0) System.out.print("1");
        else {
            while ( n != 0) {
                l = (int) n / x;
                n = n - (x * l);
                x /=10;
                System.out.print( l + " ");
            }
        }
    }
}
