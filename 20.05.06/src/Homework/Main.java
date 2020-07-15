package Homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Разложение на множители с помощью рекурсии.
        //* Разложить целое число n > 1 на простые множители.
        //* Вывести в консоль через пробел все множители в порядке возрастания.
        //* Написать рекурсивный метод для вычисления простых множителей.
        //*          Пример:
        //*          132
        //*
        //*  Вывод на консоль:
        //*           2 2 3 11

        System.out.println("Insert argument : ");

        int i = Main.intChek();

        System.out.println("You are insert : " + i);

        Main.simpleFactor(i);

    }

//    Описание используемых в main() методов

//  Метод определения простых множителей, на которые можно разложить введеное число

    public static void simpleFactor(int arg) {

            int i = 2;
            int j = 0;
            do {
                if (arg % i == 0) {
                    System.out.print(i + " ");
                    arg = arg / i;
                        j = 1;
                    } else {
                        i += 1;
                    }
            }
            while (i * i <= arg & j != 1);
            if ( j == 1) {
                simpleFactor(arg);
            }
            else {
                System.out.print(arg + " ");
            }
        }

//  Метод проверки числа на принадлежность его к целому и больше 0

    public static int intChek() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                int arg = sc.nextInt();
                if (arg > 1) {
                    return arg;
                }
            } else {
                System.out.println("Try again.");
                intChek();
            }
        }
    }
}
