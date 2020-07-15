package step;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
//        9.	Игра Угадайка. Сгенерируйте число от 0 до 100.
//        Пользователь должен угадать полученное число за 7 попыток.
//        После каждой попытки выводим сообщение «Мало» или «Много» (подсказка для пользователя).
//        Если после 7 попыток пользователь не смог угадать число,
//        сообщите ему о проигрыше и какое число было загадано.

        Scanner sc = new Scanner(System.in);
        int x = (int) (Math.random()*100);
        int s;
        System.out.print("Сгенерировано число от 0 до 100 случайным образом\n" + "Вы должны угадать это число с 7 попыток\n");
        for (int i = 0; i < 7; i++) {
            System.out.println("Попытка №" + (i+1) + " . Введите пжл число: ");
            s = sc.nextInt();
            if (x == s) {
                System.out.println("Вы выиграли. Число " + x + " угадано с " + (i+1) + " попытки !!!");
                break;
            }
            else if (x > s) System.out.println("Мало!!! Пробуйте еще!");
            else System.out.println("Много!!! Пробуйте еще!");
        }
    }
}
