package homework;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
//        5.	Дан массив:
//a.	Все его элементы увеличить в два раза.
//b.	Умножить все элементы на последний элемент.

//        Задаем длинну массива

        System.out.println("Введите длину будущего массива :");
        int l;
        while (true){
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()){
                l = sc.nextInt();
                if (l > 0) {
                    break;
                }
                else {
                    System.err.println("Длинна массива введена не корректно, попробуйте ще раз!!!!");
                }
            }
            else {
                System.err.println("Длинна массива введена не корректно, попробуйте ще раз!!!!");
            }
        }

//        Заполняем массив значенимями случайных чисел от 0 до 10 и выводим значения нашего массива на экран

        int []arr = new int[l];

        System.out.print("Дан массив случайных чисель на " + l  + " элементов: ");
        for (int i = 0; i < l; i++) {
            arr[i] = (int)(Math.random()*10);
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

//        a) Все элементы массива увеличить в два раза.

        System.out.print("В результате увеличения всех элементов массива в 2 раза получим след : ");
        for (int i:arr) {
            System.out.print((i*2) + "  ");
        }
        System.out.println();

//        Умножить все элементы массива на последний элемент.

        System.out.print("Умножаем все элементы массива на последний элемент " + arr[l-1] + " : ");
        int num = arr[l - 1];
        for (int i : arr) {
            System.out.print((i*num) + "  ");
        }

    }
}
