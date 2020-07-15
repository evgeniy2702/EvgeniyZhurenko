package homework;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {

//        6.	Создать массив целых чисел на 10 элементов.
//        Заполнить его случайными числами в диапазоне от 0 до 10.
//        Вывести массив на экран. Найти наибольшее значение и его индекс.

        int []arr = new int[10];
        int max = 0;

        System.out.print("Массив на 10 элементов из случайных чисел : ");
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random()*10);
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

        for (int i:arr){
            if (max <= arr[i]){
                max = arr[i];
            }
        }
        System.out.print("MAX = " + max + " ; INDEX = ");
        for (int i = 0; i < 10; i++) {
            if (max == arr[i]){
                System.out.print(i + "|");
            }
        }


    }
}
