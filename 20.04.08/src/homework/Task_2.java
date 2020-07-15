package homework;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {


//     2.	Создать массив целых чисел на 20 элементов. Заполнить его значениями от
//     1 до 20 по возрастающей. Вывести его значения на экран.


        int []array = new int[20];


        System.out.print("Наш массив : ");
        for (int i = 0; i < 20; i++) {
            array[i] = i + 1 ;
            System.out.print(array[i] + "  ");
        }
    }
}
