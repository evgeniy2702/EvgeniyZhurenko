package HW_Generic;

import java.util.Arrays;


public class Sorting<T> {

//    Задание 3
//Реализуйте шаблонный метод для сортировки массива.

    public <T> void sorting (T[] array) {
        Arrays.sort(array);
        System.out.print("После сортировки наш массив будет выглядеть : " + Arrays.toString(array));
    }

    public static void main(String[] args) {

        Sorting sort1 = new Sorting();

        Integer[] i = new Integer[] {1, 2, 5, 8, 6, 4, 9, 7, 12};
        Double[] d = new Double[] {1.9, 2.8, 5.1, 8.2, 6.5, 4.6, 9.4, 7.9, 12.0};
        String[] s = new String[] {"hello", "hello world", "hello wo", "hello w", "hello worl","hello wor"};

        sort1.sorting(i);
        System.out.println();
        sort1.sorting(d);
        System.out.println();
        sort1.sorting(s);

    }
}
