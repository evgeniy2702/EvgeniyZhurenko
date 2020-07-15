package ua.kiev.prog;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        //write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа 3 67 9");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        System.out.println("Введите числа 67 6 50");
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();
        System.out.println("Введите числа 4 80 60");
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();
        System.out.println(a1 + "\n" + a2 + "\n" + a3 + "\n" + b1 +
                          "\n" + b2 + "\n" + b3 + "\n" + c1 + "\n" + c2 + "\n" + c3);
        sc.close();
    }
}
