package HomeThread;

import java.awt.font.TextHitInfo;

public class ThreadSum implements Runnable {

    final ArrayRandom arrayRandom;

    public ThreadSum(ArrayRandom arrayRandom) {
        this.arrayRandom = arrayRandom;
    }

    @Override
    public void run() {
        synchronized (arrayRandom) {
            System.out.println("\nСтарт потока " + Thread.currentThread().getName());
            try {
                arrayRandom.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\nСумма всех значений массива случайных чисел равно : " + arrayRandom.sumArr());
            System.out.println("Конец потока " + Thread.currentThread().getName());
        }
    }
}
