package step;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
       // 2.	Составить программу вывода любое числа любое заданное число раз (запросить у пользователя)
        // в виде, аналогичному в задаче 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число :");
        int num = sc.nextInt();
        System.out.println("Введите сколько раз вывести на консоль ваше число :");
        int i = sc.nextInt();
        for (int j = 0; j < i; j++) {
            System.out.print(num + " ");
            }
    }
}
