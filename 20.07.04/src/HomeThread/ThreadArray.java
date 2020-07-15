package HomeThread;

import java.util.Arrays;

public class ThreadArray implements Runnable{

    final ArrayRandom arrayRandom;

    public ThreadArray(ArrayRandom arrayRandom) {
        this.arrayRandom = arrayRandom;
    }

    @Override
    public void run() {
        synchronized (arrayRandom) {
            System.out.println("Старт потока " + Thread.currentThread().getName());
            for (int i = 0; i < arrayRandom.l; i++) {
                arrayRandom.fullArr();
            }
            System.out.println("Массив случайных чисел заполнился : ");
            Arrays.stream(arrayRandom.arr).forEach(o -> System.out.print(o + "; "));
            System.out.println("\nКонец потока " + Thread.currentThread().getName());
            arrayRandom.notifyAll();
        }
    }
}
