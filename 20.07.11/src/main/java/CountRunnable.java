


public class CountRunnable implements Runnable {

    int count = 0;

    public CountRunnable() {
    }

    public int getCount() {
        return count;
    }

    public void run() {
        System.out.println("Старт потока " + Thread.currentThread().getName() + " с приоритетом " +
                Thread.currentThread().getPriority());
        while(true){
            count++;
            if(Thread.currentThread().isInterrupted()){
                System.out.println("Конец работы потока " + Thread.currentThread().getName() +
                        "; приоритет потока " + Thread.currentThread().getPriority() + "; Count = " + count);
                break;
            }
        }
    }
}
