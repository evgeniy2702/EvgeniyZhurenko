package Homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    //Написать функцию, определяющую минимум и максимум (значение и номер)
    //элементов передаваемого ей массива.

    public static void MaxMin (int[]array){
        // Вводим переменные для поиска мах и мин значений в заданном массиве
        int max = 0;
        int min = array[0];

        // Проводим определение макс и мин значений в заданном массиве
        // и выводим эти значения на консоль
        for (int value : array) {
            if (value >= max) {
                max = value;
            }
            if (value <= min) {
                min = value;
            }
        }
        System.out.println("Max = " + max + " Min = " + min );

        // Определеяем инексы макс и мин значений массива, если таковых не одно значение, и выводим на консоль
        System.out.print("Индексы элементов с МАХ значением : ");
        for (int i = 0; i < array.length; i++) {
            if (max == array[i]) {
                System.out.print(i + "; ");
            }
        }
        System.out.print("\nИндексы элементов с MIN значением : ");
        for (int i = 0; i < array.length; i++) {
            if (min == array[i]) {
                System.out.print(i + "; ");
            }
        }
    }

    public static void main(String[] args) {
        // Задаем размер массива и выполняем проверку размера через метод IntChek
        //на предмет целого числа
        int n = 0;
        System.out.println("Введите длину массива !");
        n = Main.IntChek();

        // Создаем массив размером n , заполняем его случайными числами
        int[] arr = new int[n];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(5);
            System.out.print(arr[i] + " ");
        }

        // Определяем макс и мин значения элемента и их индекс в массиве

        System.out.println("\nВ полученном массиве определяем МАХ и МIN значения и их индексы .");
        MaxMin(arr);

    }
}
