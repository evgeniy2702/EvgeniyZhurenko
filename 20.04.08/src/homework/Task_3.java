package homework;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

//        3.	Создать массив целых чисел на 4 элемента. Заполнить его значениями от 10 до 20.
//        Поменять местами первый и последний элемент, а так же второй и третий.


//        Задаем массив и его переменные, проверяем значения переменных на предмет
//        принадлежнмоти к целым чилам :

        int []array = new int[4];

        System.out.println("Введите значения переменных массива Array :");
        for (int i = 0; i < 4; i++) {

//        Выполняем проверку на предмет явл ли введенные значения переменных массива целыми числами

            while (true) {
                Scanner sc = new Scanner(System.in);
                if (sc.hasNextInt()) {
                    System.out.println("Введите следующее значение массива :");
                    array[i] = sc.nextInt();
                    if (array[i] >= 10 && array[i] <= 20) {
                        break;
                    }
                    else {
                        System.err.println("Вы ввели не корректное значение переменной массива. Попробуйте еще раз :");
                    }
                } else {
                    System.err.println("Вы ввели не корректное значение переменной массива. Попробуйте еще раз :");
                }
            }
        }



//        Выводим значения переменных масива на экран

        System.out.print("Вы ввели следующие значения массива : ");
        for (int j:array) System.out.print(j + "  ");
        System.out.println();

//        Меняем местами 1 с 4 и 2 с 3 элементами и выводи на консоль

        System.out.print("После замены местами значений переменных массива получили следющий массив :");

        int c; // задаем переменную как транзитную для значений элементов массива

        for (int z = 0; z < 2 ; z++) {
            c = array[z];
            array[z] = array[3-z];
            array[3-z] = c;
        }
        for (int i :array) {
            System.out.print(i + "  ");
        }
    }
}
