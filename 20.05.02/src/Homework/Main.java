package Homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    // * Написать метод, определяющую среднее
    // арифметическое элементов передаваемого ей массива.

    //    Описываем метод определения среднеарифметического значения элементов массива

    public static Float MidleArifmaticfunction (int[] array){
        float MidleAr = 0;
        for (int value : array) {
            MidleAr += value;
        }
        return MidleAr/array.length;
    }

    // Описываем метод проверки введения целочисленного числа больше 0

    public static int IntChek (){
        while (true){
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()){
                int arg = scanner.nextInt();
                System.out.println("Вы ввели целое число равное : " + arg);
                return arg;
            }
            else {
                System.err.println("Вы ввели не целое число. Пробуйте еще раз!!");
            }
        }
    }


    public static void main(String[] args) {

        // Задаем размер массива и выполняем проверку размера через метод IntChek
        //на предмет целого числа

        int n = 0;
        System.out.println("Введите длину массива !");
        n = IntChek();
        int bound = 0;
        System.out.println("Введите верхнюю границу массива !");
        bound = IntChek();

        // Создаем массив размером n , заполняем его случайными числами
        int[] arr = new int[n];
        float midle = 0;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(bound);
            System.out.print(arr[i] + " ");
        }

        // используя метод MidleArifmaticfunction находим среднее арифметическое
        // значение элементов созданного массива и выыводим его на экран

        midle = MidleArifmaticfunction(arr);
        System.out.println("\nСреднее арифметическое значение элементов нашего массива равно : " + midle);
    }
}
