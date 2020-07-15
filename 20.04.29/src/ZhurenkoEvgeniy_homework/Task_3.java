package ZhurenkoEvgeniy_homework;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.*;

public class Task_3 {
    public static void main(String[] args) {
// * Задние3.Заполните n мерный квадратный массив числами, которые увеличиваются на 1 по
// * спирали (число n должно задаваться с клавиатуры). Выведите результат на экран
// * с соблюдением ширины столбцов. Выполнить задачу с использованием только одного цикла.
// * Для примера массив 4 на 4 должен выглядеть как
// * указано ниже.
// *
// *   1  2  3  4
// *  12 13 14  5
// *  11 16 15  6
// *  10  9  8  7

        System.out.println("Задайте размер квадратного массива.");
        int n;
        while (true) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                System.out.println("Вы задали размер массива N = " + n);
                break;
            } else {
                System.err.println("Вы задали не верный размер массива!! Попробйуте еще раз.");
            }
        }
        int[][] spiralArray = new int[n][n];

        int x = 0;
        int y = 0;
        int z = n;
        for (int i = 0, j = n * n; i < j; ) {
            spiralArray[x][y] = ++i;

            if (y < z + (n - z) / 2 - 1 && x == (n - z) / 2) {
                y++;
            } else if (y == z + (n - z) / 2 - 1 && x < z + (n - z) / 2 - 1) {
                x++;
            } else if (y > (n - z) / 2 && x == z + (n - z) / 2 - 1) {
                y--;
            } else if (x > (n - z) / 2 + 1) {
                x--;
            } else {
                y++;
                z -= 2;
            }
        }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(spiralArray[i][j] + " |");
                }
                System.out.println();
            }
        }
    }
