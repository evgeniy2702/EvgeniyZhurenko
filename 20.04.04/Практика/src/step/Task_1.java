package step;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
//  Определить количество цифр в введённом числе.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свое число : ");

//        вводим число
        int num = sc.nextInt();

//      определяем длинну введенного введенного числа
        int l = (num == 0)? 1: 0;
        while ( num != 0 ) {
            l++;
            num /=10;
        }

//        вывод колличества цифр в числе
        System.out.println("Число состоит из " + l + " цифр.");
        sc.close();
    }
}
