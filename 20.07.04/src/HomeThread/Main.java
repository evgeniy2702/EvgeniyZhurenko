package HomeThread;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
//    Задание 1
//    При старте приложения запускаются три потока.
//    Первый поток заполняет массив случайными числами.
//    Два других потока ожидают заполнения. Когда массив
//    заполнен оба потока запускаются. Первый поток находит
//    сумму элементов массива, второй поток среднеарифметическое значение в массиве. Полученный массив, сумма
//    и среднеарифметическое возвращаются в метод main,
//    где должны быть отображены.

    public static void main(String[] args) throws InterruptedException {

        ArrayRandom arrayRandom = new ArrayRandom(3);

        Thread array = new Thread(new ThreadArray(arrayRandom),"Array");
        Thread sum = new Thread(new ThreadSum(arrayRandom),"Sum");
        Thread average = new Thread(new ThreadAverage(arrayRandom),"Average");

        sum.start();
        average.start();

        Thread.sleep(2000);

        array.start();



    }
}