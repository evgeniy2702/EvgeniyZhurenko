package ua.kiev.prog;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        double x, y, a, b, al, bt, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значения : х ; y ; a ; b ; al ; bt ; n");
        x = sc.nextDouble();
        y = sc.nextDouble();
        a = sc.nextDouble();
        b = sc.nextDouble();
        al = sc.nextDouble();
        bt = sc.nextDouble();
        n = sc.nextDouble();
        System.out.printf( "Вы ввели : х = %.2f ; y = %.2f ; a = %.2f; b = %.2f ; al = %.2f ;" +
                " bt = %.2f; n = %.2f\n", x , y , a , b , al , bt, n);
        System.out.printf("a) 2*x = %.2f\n" ,2*x);
        System.out.printf("б) sin x = %.2f\n" , Math.sin(x));
        System.out.printf("в) a2  = %.2f\n" , Math.pow(a,2));
        System.out.printf("г) √x = %.2f\n" , Math.sqrt(x));
        System.out.printf("д) |n| = %.2f\n" , Math.abs(n));
        System.out.printf("е) 5*cos(y) = %.2f\n" , Math.cos(y));
        System.out.printf("ж) -7,5*a2 = %.2f\n" , -7.5 * Math.pow(a,2));
        System.out.printf("з) 3* √x = %.2f\n" , 3 * Math.sqrt(x));
        System.out.printf("и) sin(al)*cos(bt) + cos(al)*sin(bt) = %.2f\n" , Math.sin(al)*Math.cos(bt) + Math.cos(al)*Math.sin(bt));
        System.out.printf("к) a* √2*b = %.2f\n" , a * Math.sqrt(2*b));
        System.out.printf("л) 3*sin(2*al)*cos(3*bt) = %.2f\n" , 3 * Math.sin(2*al)*Math.cos(3*bt));
        System.out.printf("ь) -5*√x*√y = %.2f\n" , -5 * Math.sqrt(x * Math.sqrt(y)));

        sc.close();
    }
}


