package step;

import java.util.Scanner;

public class Task_12_13 {
    public static void main(String[] args) {
//        12. Дано натуральное число. Определить максимальную и минимальную цифру.
//        13. Дано натуральное число. Определить насколько максимальная цифра превышает минимальную.

        Scanner sc = new Scanner(System.in);

//        вводим число с конооли и проверяем натуральное оно или нет

        int s,x = 1, l, max = 0 , min = 9 ; long n, l1, z;
        while (true) {
            System.out.println("Введите натуральное числа N :");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                n = scan.nextInt();
                if (n < 0) {
                    System.out.println("1.Число N не натуральное. Введите число еще раз : ");
                }
                else break;;
            } else {
                System.out.println("2.Число N не натуральное. Введите число еще раз : ");
            }
        }


        System.out.println();

//        выводим на консоль наше введеное с консоли число
        System.out.println("Вы ввели след число N = " + n);
        System.out.println();

//        определяем разрядность введеного с коносоли числа и выводим его на консоль
        z = n;
        s = ( z == 0 ) ? 1 : 0;
        while ( z != 0) {
            s++;
            z /=10;
        }
        System.out.println ("Ваше число длинной : " + s);

//        используя разрядность введенного с консоли числа определяем МАКС и МИН его цифры
        for ( int j = 0; j < s - 1; j++) {
            x *=10;
        }
        l1 = n;
        if (n == 0) System.out.println("max = min = " + n);
        else {
            for (int i = 0; i < s; i++) {
                l = (int) l1 / x;
                l1 = l1 - (x * l);
                if (max <= l) max = l;
                if (min > l) min = l;
                x /= 10;
            }
            System.out.println("max = " + max + "; min = " + min);
        }

        System.out.println();


//        Определяем на сколько МАКС цифра нашего числа больше ее МИН цифры

        if (n == 0) System.out.println("MAX и MIN числа равны : " + n);
        else System.out.println(" МАХ > MIN на : " + (max-min));

        sc.close();
    }
}
