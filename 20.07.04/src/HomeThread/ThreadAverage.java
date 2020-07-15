package HomeThread;

public class ThreadAverage implements Runnable {

    final ArrayRandom arrayRandom;

    public ThreadAverage(ArrayRandom arrayRandom) {
        this.arrayRandom = arrayRandom;
    }

    @Override
    public void run() {
        synchronized (arrayRandom) {
            System.out.println("Старт потока " + Thread.currentThread().getName());
            try {
                arrayRandom.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\nСр значение массива случайных чисел равно : " + arrayRandom.averageArr());
            System.out.println("Конец потока " + Thread.currentThread().getName());
        }
    }
}
