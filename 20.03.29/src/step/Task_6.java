package step;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = (int) (1 + Math.random()*31);
        int j = (int) (1 + Math.random()*12);

        if (j == 1) {
            if (i != 7) System.out.println("Сегодня : " + i + " января.");
            else  System.err.println("Сегодня РОЖДЕСТВО : " + i + " января.");
        }
        else if (j == 2) {
            if (i == 31 || i == 30) System.out.println("Дата: " + i + " февраля" + " не является валидной!");
            else System.out.println("Сегодня :" + i + " февраля.");
        }
        else if (j == 3) System.out.println("Сегодня : " + i + " марта.");
        else if (j == 4) {
            if (i == 31 ) System.out.println("Дата: " + i + "апреля" + " не является валидной!");
            else System.out.println("Сегодня :" + i + " апреля.");
        }
        else if (j == 5) System.out.println("Сегодня : " + i + " мая.");
        else if (j == 6) {
            if (i == 31 ) System.out.println("Дата: " + i + "июня" + " не является валидной!");
            else System.out.println("Сегодня :" + i + " июня.");
        }
        else if (j == 7) System.out.println("Сегодня : " + i + " июля.");
        else if (j == 8) System.out.println("Сегодня : " + i + " августа.");
        else if (j == 9) {
            if (i == 31 ) System.out.println("Дата: " + i + " сентября" + " не является валидной!");
            else System.out.println("Сегодня :" + i + " сентября.");
        }
        else if (j == 10) System.out.println("Сегодня : " + i + " октября.");
        else if (j == 11) {
            if (i == 31 ) System.out.println("Дата: " + i + " ноября" + " не является валидной!");
            else System.out.println("Сегодня :" + i + " ноября.");
        }
        else if (j == 12) {
            if (i < 31) System.out.println("Сегодня : " + i + " декабря.");
            else System.err.println("Сегодня НОВЫЙ ГОД : " + i + " декабря.");
        }

        sc.close();
    }
}
