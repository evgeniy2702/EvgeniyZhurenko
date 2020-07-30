package Singletone_thread;

public class Run {

//    Задание 2
//    Измените созданный в первом задании класс, так
//    чтобы он поддерживал многопоточность.


    public static void main(String[] args) {

        Thread thread0 = new Thread(() -> {
                Singleton_threads sing = Singleton_threads.getInstance();
                sing.setData("Data 0");
                System.out.println(Thread.currentThread().getName() + " before start " + sing.toString());
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread.currentThread().interrupt();
                if(Thread.currentThread().isInterrupted())
                System.out.println(Thread.currentThread().getName() + " after start " + sing.toString());
        });

        Thread thread1 = new Thread(() -> {
                Singleton_threads sing = Singleton_threads.getInstance();
                sing.setData("Data 1");
                System.out.println(Thread.currentThread().getName() + " before start " + sing.toString());
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
                Thread.currentThread().interrupt();
                if(Thread.currentThread().isInterrupted())
                System.out.println(Thread.currentThread().getName() + " after start " + sing.toString());

        });
        Thread thread2 = new Thread(() -> {
            Singleton_threads sing = Singleton_threads.getInstance();
            sing.setData("Data 2");
            System.out.println(Thread.currentThread().getName() + " before start " + sing.toString());
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread.currentThread().interrupt();
            if(Thread.currentThread().isInterrupted())
            System.out.println(Thread.currentThread().getName() + " after start " + sing.toString());
        });

        thread0.start();
        thread1.start();
        thread2.start();

    }
}
