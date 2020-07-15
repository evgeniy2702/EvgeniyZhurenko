package ZhurenkoEvgeniy_homework;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // *Здание1. Заполните двухмерный массив размерностью NxM
        // случайными числами и построчно перенесите эти
        // * числа в одномерный массив. Вывести исходный массив и полученный масcивы.

        int n, m ;

        System.out.println("Введите размер N двухмерного массива." );
        while (true) {
            Scanner scanInside = new Scanner(System.in);
            if (scanInside.hasNextInt()) {
                n = scanInside.nextInt();
                System.out.println("N = " + n + "\n");
                break;
            } else {
                System.err.println("Вы ввели неверную величину N. Пробуйте снова !");
            }
        }

        System.out.println("Введите размер M двухмерного массива.");
        while (true) {
            Scanner scanInside = new Scanner(System.in);
            if (scanInside.hasNextInt()) {
                m = scanInside.nextInt();
                System.out.println("M = " + m + "\n");
                break;
            } else {
                System.err.println("Вы ввели неверную величину M. Пробуйте снова !");
            }
        }

//      Заполняем массив с заданными размерами N*M

        Random random = new Random();
        int[][] Array = new int[n][m];

        System.out.println("Наш массив размером " + n + "*" + m);
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + "-я строка нашего массива размером " );
            for (int j = 0; j < m; j++) {
                Array[i][j] = random.nextInt(10);
                System.out.print(Array[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println();

        //      Построчно переносим числа из массива N*M в одномерные массивы

        System.out.println("Наш массив построчно в одномерных массивах");

        int[] stringArr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + "-й одномерный массив : ");
            for (int j = 0; j < m; j++) {
                stringArr[i] = Array[i][j];
                System.out.print(stringArr[i] + "|");
            }
            System.out.println();
        }
    }
}
