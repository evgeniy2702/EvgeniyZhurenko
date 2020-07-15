package HomeWorkExceptions.Task_1;

import java.util.Random;
import java.util.Scanner;

public class Division {

    //    Задание 1
//    Создать метод, который выводит в консоль результат целочисленного деления числа, введенного с клавиатуры, на
//    значения элементов одномерного массива целых чисел, заполненный случайным образом – от -10 до 10. Длина массива случайная – от 1 до 10.
//    Обработать все возможные исключительные ситуации в
//    данном методе.

    private static int a;

    public static void test() throws MyException {
        while (true) {
            Scanner scan = Scan.scan();
            System.out.println("Введите целочисленное число : ");
            if (scan.hasNextInt()) {
                a = scan.nextInt();
                if(a <= 0) {
                    throw new MyException("Число не должно быть меньше или равно нулю!!");
                }
                break;
               }
            else {
                System.out.println("Попробуйте снова!");
            }
        }

        System.out.println("Выполним деление числа " + a + " на элементы массива :");
        int l = new Random().nextInt(10);
        if (l <= 0) {
            throw new MyException("Длинна массива не может быть меньше или равна нулю");
        }
            int[] arr = new int[l];
            for (int i = 0; i < l; i++) {
                arr[i] = (-10 + new Random().nextInt(20));
                System.out.print(arr[i] + "; ");
            }
        System.out.println();
        System.out.println("Выводим результат деления :");
        for (int i : arr) {
            try {
                int num = a / i;
            } catch (ArithmeticException ex) {
                ex.printStackTrace();
            }
            System.out.print(a/i + "; ");
        }

        }





//        try {
//            int a = 2 / 0;
//            System.out.println(a);
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//            try {
//                throw new NoSuchElementException();// nextInt()
//            } catch (NoSuchElementException ex) {
//                ex.printStackTrace();
//                System.out.println("Внутреный перехват");
//            }
//        }




    public static void main(String[] args) throws MyException {
        test();


    }

    }
