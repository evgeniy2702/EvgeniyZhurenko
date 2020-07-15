package Homework;

import java.util.Scanner;


public class Task_2 {
    public static void main(String[] args) {
//        Необходимо написать программу, которая бы вычисляла сумму цифр в числе.
//* Затем в получившемся числе опять вычисляла сумму цифр.
//* Эти действия необходимо выполнять до тех пор, пока не останется число, состоящее из одной цифры.
//* Например, если ввести число 555, то, посчитав сумму цифр в нем, получим 5+5+5=15.
//* Так как получившееся число 15 состоит не из одной цифры, то необходимо посчитать сумму цифр в нем, т.е. 1+5=6.
//* Теперь было получено число 6, состоящее из одной цифры, значит 6 - это и есть ответ.

//      Проводим проверку введеного числа на принадлежность его к целым

        int number = Task_2.intChek();

//      Выполняем сложение всех цифр введенного числа и его производных, и выводим
//      результат на консоль

        do {
            number = Task_2.addNumber(number);
        }
        while (number >= 10);

        System.out.println("При сложении всех цифр, полученных чисел из введеного\n" +
                "путем сложения цифр, из которых они состоят,\nполучили следующее простое число :  " + number);
         }


//    Описание используемых в main() методов

//  Метод проверки на принадлженость числа к целому или типу int

    public static int intChek() {

        System.out.println("Введите целое число : ");

        while (true) {

            Scanner scanner = new Scanner(System.in);

            if (scanner.hasNextInt()) {
                int arg = scanner.nextInt();
                System.out.println("Вы ввели целое число, равное : " + arg);
                System.out.println();
                return arg;
            } else {
                System.err.println("Вы ввели не верное число. Пробуйте еще раз.");
            }
        }

    }

//  Метод вычисления суммы всех цифр, из которых состоит целое число

    public static int addNumber(int arg) {

        if ( arg < 0) {
            arg = Math.abs(arg);
        }
        int num = arg % 10;
        arg = (arg - num) / 10;
        if (arg >= 10) {
            num += addNumber(arg);
        }
        else {
            num += arg;
        }
        return num ;
    }
}

