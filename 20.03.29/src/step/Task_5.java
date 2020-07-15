package step;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = (int) (Math.random()*100);
        System.out.println("Число задано случайным образом от 0 до 100. Угадайте его пжл за 7 попыток.");
        for (int j = 0; j<=6; ++j) {
            System.out.println("Попытка " + (j+1) + ". Введите пжл свое число :");
            int r = sc.nextInt();
            if (r == i) {System.out.println("Поздравляем Вас! Вы угадали число c " + (j+1) + " попытки!");
            break;}
            else if (r > i) System.out.println("Заданное случайное число меньше " + r);
            else System.out.println("Заданное случайное число больше " + r);
            if (j == 6) System.out.println("Повезет в следующий раз! Заданное случайное число = " + i);
        }

        sc.close();

    }
}
