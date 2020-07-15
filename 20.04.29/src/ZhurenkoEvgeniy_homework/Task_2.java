package ZhurenkoEvgeniy_homework;

import javax.management.timer.Timer;
import java.sql.Time;
import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
//        * Задание2.Создать квадратный массив размерностью NxN заполненный случайными числами,
// * вывести массив на экран в виде таблицы, найти наименьший и наибольший элемент
// * массива и вывести их на экран (если найдено несколько одинаковых элементов —
// * вывести через запятую индексы строки и столбца, где есть повторения). Вывести на экран
// * время выполнения поиска, в миллисекундах. Размерность массива должна
// * задаваться с клавиатуры.

        long time = System.nanoTime();
        int n;

        System.out.println("Введите размер N двухмерного массива N*N" );
        while (true) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                System.out.println("Вы ввели размер нашего массива равный : " + n);
                break;
            } else {
                System.err.println("Вы ввели неверную величину N. Пробуйте снова !");
            }
        }

        // Заполняем наш массив значениями элементов

        Random random = new Random();
        int[][] Array = new int[n][n];

        System.out.println("Наш массив размером " + n + "*" + n);
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + " строка нашего массива размером " );
            for (int j = 0; j < n; j++) {
                Array[i][j] = random.nextInt(5);
                System.out.print(Array[i][j] + "|");
            }
            System.out.println();
        }

        // Проводим поиск мах и мин значения нашего массива

        int max = 0;
        int min = Array[1][1];
        int numMax = 0, numMin = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(Array[i][j] > max){
                    max = Array[i][j];
                }
                if(Array[i][j] < min) {
                    min = Array[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("MAX = " + max + "\nMIN = " + min);

       // Проводим поиск на предмет нескольких значений мах и мин в нашем массиве
        // Выводим номера столбцов и строк, где произошли совпадения

        int [][] indexMax = new int[2][n*n];
        int [][] indexMin = new int[2][n*n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(max == Array[i][j]){
                    indexMax[0][numMax] = i;
                    indexMax[1][numMax] = j;
                    numMax++;
                }
                if(min == Array[i][j]){
                    indexMin[0][numMin] = i;
                    indexMin[1][numMin] = j;
                    numMin++;
                }
            }
        }
        if (numMax > 1) {
            System.out.println("Совпадений с MAX значением в заданном массиве равно : " + numMax);
            System.out.println("Координаты совпадений МАХ значений");
                for (int j = 0; j < numMax; j++) {
                    System.out.print("Строка № " + indexMax[0][j] + " Столбец № " + indexMax[1][j] + "\n");
                }

        }


        if (numMin > 1) {
            System.out.println("Совпадений с MIN значением в заданном массиве равно : " + numMin);
            System.out.println("Координаты совпадений МIN значений");
            for (int j = 0; j < numMin; j++) {
                    System.out.print("Строка № " + indexMin[0][j] + " Столбец № " + indexMin[1][j] + "\n");
                }
        }

        time = System.nanoTime() - time;
        System.out.printf("\nВремя исполнения кода  %,9.0f мсек\n", time/1_000_000.0);
    }
}
