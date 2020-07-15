package step;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число А и число В");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Вы ввели число А =" + a + " и число В =" +b);
        System.out.println("Выберите арифметическую операцию где : 1  + ; 2  - ; 3  * ; 4  / ");
        int ch = sc.nextInt();
        switch (ch) {
                case 1:
                    System.out.println(a + b);
                    break;
                case 2:
                    System.out.println(a - b);
                    break;
                case 3:
                    System.out.println(a * b);
                    break;
                case 4:{
                if (b!=0) {
                    System.out.println(a / b);
                }
                else System.out.println("Деление на 0 заперещенно");
                break;
                }
                default:
                    System.out.println("Не верный выбор номера арифметической оперции");
                    break;
            }

        sc.close();
    }
}
