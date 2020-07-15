package step;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите три числа :");
        float a, b, c;
        a = sc.nextFloat(); b = sc.nextFloat(); c = sc.nextFloat();
        if (a>=b && b>=c) System.out.printf("%.0f  %.0f  %.0f\n", c, b, a);
            else if (b>=c && c>=a) System.out.printf("%.0f  %.0f  %.0f\n", a, c, b);
            else System.out.printf("%.0f  %.0f  %.0f\n", a, b, c);

        sc.close();
    }
}
