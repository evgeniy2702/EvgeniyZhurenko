package homework;


import java.util.Random;

public class Task_4 {
    public static void main(String[] args) {

//        4.	Создать массив целых чисел на 10 элементов. Запомнить его случайными числами в диапазоне от 10 до 50.
//        Вывести его значения на экран.

        int []arr = new int[10];

        System.out.print("Массив на 10 элементов из случайных чисел : ");
        for (int i = 0; i < 10 ; i++) {
            arr[i] = (int)(10 + Math.random()*40);
            System.out.print(arr[i] + "  ");
        }
    }
}
