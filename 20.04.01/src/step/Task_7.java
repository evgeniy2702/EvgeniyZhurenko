package step;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
//        7.	Найти:
//        a.	Сумму всех чисел от 100 до 500;

        Scanner sc = new Scanner(System.in);
        System.out.println("Найти сумму всех чисел от 100 до 500:");
        int sum = 0;
        for (int i = 100; i < 500; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма чисел от 100 до 500 равна " + sum);
        System.out.println();

//        b.	Сумму всех целых чисел от a до 500 (значение a вводится с клавиатуры a <= 500);

            System.out.println("Введите число <= 500 :");
            int num = sc.nextInt();
        System.out.println("Вы ввели число " + num);
        for (;;) {
            if (num > 500) {
                System.out.println("Введеное число больше 500. Введите число еще раз :");
                num = sc.nextInt();
            }
            else break;
        }
        sum = 0;
        for (int i = num; i < 500; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма всех целых чисел от " + num + " до 500 равна " + sum);
        System.out.println();

//        c.	Сумму всех четных чисел от a до b (значение a и b вводится с клавиатуры b >= a);

        double a ;
        double b;
        int c;
        System.out.println("Введите числа А и В :");
        System.out.println("Вы ввели число А = " + (a=sc.nextDouble()) + " и число В = " + (b=sc.nextDouble()));

        for (;;) {
            if (b < a ) {
                System.out.println("Введеное число B = " + b + " меньше числа А = " + a + ". Введите число В еще раз :");
                b = sc.nextDouble();
            } else if ( a%1 != 0 ) {
                System.out.println("Введеное число A = " + a + " не явл целым числом. Введите число А еще раз :");
                a = sc.nextDouble();
            } else if ( b%1 != 0) {
                System.out.println("Введеное число B = " + b + " не явл целым числом. Введите число В еще раз :");
                b = sc.nextDouble();
            } else break;
        }
        sum = 0; c = (int) a;
        for (int i =  (int) c; i <= b; i++) {
            if (c%2 == 0) sum = (int) (sum + c);
            c++;
        }
        System.out.println("Сумму четных чисел от А = " + a + " до В = " + b + " составляет : " + sum);
        System.out.println();

//        d.	Среднее арифметическое всех целых чисел от a до b (значение a и b вводится с клавиатуры b >= 100);


        System.out.println("Введите числа А и В, где В => 100 :");
        System.out.println("Вы ввели число А = " + (a=sc.nextDouble()) + " и число В = " +(b=sc.nextDouble()));

        int j = 0; float sum1 = 0;
        for (;;) {
            if (b < a ) {
                System.out.println("Введеное число B = " + b + " меньше числа А = " + a + ". Введите число В еще раз :");
                b = sc.nextDouble();
            } else if ( b < 100 ) {
                System.out.println("Ваше число В < 100, введите число В еще раз :");
                b = sc.nextDouble();
            } else if ( a%1 != 0 ) {
                System.out.println("Введеное число A = " + a + " не явл целым числом. Введите число А еще раз :");
                a = sc.nextDouble();
            } else if ( b%1 != 0) {
                System.out.println("Введеное число B = " + b + " не явл целым числом. Введите число В еще раз :");
                b = sc.nextDouble();
            } else break;
        }
        c = (int) a;
        for (int i =  c; i <= b; i++) {
            sum1 =  sum1 + c;
            c++; j++;
        }
        System.out.println("Среднее арифметическое всех целых чисел от A до B равно " + sum1/j);
    }
}
