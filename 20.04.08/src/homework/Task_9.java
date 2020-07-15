package homework;

public class Task_9 {
    public static void main(String[] args) {

//        9.	Создать массив целых чисел на 10 элементов.
//        Запомнить его случайными числами в диапазоне от -10 до 10.
//        Вывести массив на экран. Найти наименьшее значение и его индекс.

        int []arr = new int[10];
        int min = 0;
        System.out.print("Массив на 10 элементов из случайных чисел : ");
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (-10 + Math.random()*20);
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

        for (int i: arr) {
            if (min > i){
                min = i;
            }
        }
        System.out.print("MIN = " + min + " ; INDEX = ");
        for (int i = 0; i < 10; i++) {
            if(min == arr[i]){
                System.out.print(i + "|");
            }
        }
    }
}
