package step;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
//
// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число : ");
        int number = sc.nextInt();
        if (number%2 == 0) {
            System.out.println("Ваше число четное");
        }
        else System.out.println("Ваше число не четное");

        sc.close();
    }
}