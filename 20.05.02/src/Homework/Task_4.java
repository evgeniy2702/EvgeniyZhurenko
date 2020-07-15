package Homework;

import java.util.Arrays;
import java.util.Random;

public class Task_4 {
//    В функцию передаётся массив случайных чисел в диапазоне от -20 до +20.
//    Необходимо найти позиции крайних отрицательных элементов (самого левого отрицательного элемента и
//    самого правого отрицательного элемента) и отсортировать элементы, находящиеся между ними.

    public static String RandomSort(int []array){

        //Вводим переменные для записи индексов первых отрицательных значений
        // массива с левой и правой стороны соответсвенно, и проводим их поиск
        // по массиву
        int minLeft = 0;
        int minRight = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                minLeft = i;
                break;
            }
        }
        for (int i = array.length-1; i > 0 ; i--) {
            if (array[i] < 0) {
                minRight = i;
                break;
            }
        }
        // проводим отсортироку массива между найденными нами выше первыми
        //отрицательными значениями с левой и правой стороны
        Arrays.sort(array,minLeft ,minRight);
        return Arrays.toString(array);
    }

    public static void main(String[] args) {

        // Задаем размер массива и выполняем проверку размера через метод IntChek
        // на предмет целого числа
        int l = 0;
        System.out.println("Введите размер массива.");
        l = Main.IntChek();


//      Вводим переменную для введения границ массива по принципу
//      от -bound до bound
        int bound = 0;
        System.out.println("Введите границы массива по принципу от - до +.");
        bound = Main.IntChek();

        // Задаем и выводим на консоль массив из случайных чисел
        System.out.print("Выводим на консоль наш массив случайных чисел : ");
        int []arr = new int[l];
        Random random = new Random();
        for (int i = 0; i < l; i++) {
            arr[i] = random.nextInt(bound*2)-bound;
            System.out.print(arr[i] + "; ");
        }
        System.out.println();

        // Выводим на консоль полученный массив в результате использования написанного
        // нами выше метода
        System.out.println("\nПосле сортировки согласно условиям задачи получили массив : " + "\n" + RandomSort(arr));
    }
}
