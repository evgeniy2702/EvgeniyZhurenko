package HW_Generic;

import java.util.Arrays;

public class Binary {

//    Задание 4
//Реализуйте шаблонный метод для двоичного поиска
//в массиве

    public <T> void binary (T[] array, T a) {
        int num = 0;
        Arrays.sort(array);
        System.out.println("Для поиска переменной а = " + a + " мы заданный массив отсортируем :" + Arrays.toString(array));
            for (T value : array) {
                if (a.equals(value)) {
                  num = 1;
                }
            }
            if (num == 1) {
                System.out.println("Индекс заданной переменной а = " + a + " будет равно :" + Arrays.binarySearch(array, a));
            }
            else {
            System.out.println("Значение переменной а = " + a + " в нашем массиве отсутствует");
        }
    }

    public static void main(String[] args) {

        Binary binary = new Binary();
        Integer[] in = new Integer[]{10, 30, 50, 20, 40, 70, 80, 60, 90};
        Double[] doub = new Double[]{10.5, 10.0, 10.6, 10.2, 10.4, 10.3};
        String[] str = new String[]{"hello", "h", "hell", "he", "hel"};
        Sorting sort = new Sorting();

        binary.binary(in,25);
        binary.binary(in,20);
        System.out.println();

        binary.binary(doub,10.6);
        binary.binary(doub,10.9);
        System.out.println();

        System.out.println();
        binary.binary(str,"hell");
        binary.binary(str, "e");
    }
}
