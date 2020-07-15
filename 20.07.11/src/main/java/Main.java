import javax.sound.midi.Soundbank;

public class Main {

//    Напишите класс, реализующий интерфейс Runnable, содержащий поле-счетчик. Метод run()
//должен наращивать этот счетчик. Создайте пять экземпляров этого класса и запустите их в пяти
//потоках с разными приоритетами. После 3 секунд работы остановите потоки и сравните значения
//счетчиков.

    public static void main(String[] args) throws InterruptedException {

        // Cоздаем массив объектов countRunnablе и потоков
        CountRunnable[] countRunnable = new CountRunnable[5];
        Thread[] threads = new Thread[5];

        // Заполняем массив новыми экземплярами класса countRunnablе
        for (int i = 0; i< 5; i++) {
            countRunnable[i] = new CountRunnable();
        }

        //Создаем массив потоков класса countRunnablе , задаем приоритет этим потокам
        //и запускаем потоки
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(countRunnable[i]);
            threads[i].setPriority((i+1) * 2);
            threads[i].start();
        }

        // Делаем задержку главного потока на 3 сек
        Thread.sleep(3000);


        //По очереди закрываем потоки и выводим результат счетчика объектов countRunnablе
        for (int i = 0; i < 5; i++) {
            threads[i].interrupt();
            System.out.print(threads[i].getName() + " " + countRunnable[i].getCount() + ";\n");
        }
    }
}
