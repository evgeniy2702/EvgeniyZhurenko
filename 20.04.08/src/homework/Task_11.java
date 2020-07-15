package homework;

public class Task_11 {
    public static void main(String[] args) {

//        11.	 Создать массив целых чисел на 10 элементов.
//        Запомнить его случайными числами в диапазоне от -20 до 10.
//        Вывести массив на экран. Вывести количество положительных
//        чисел в массиве и их индексы (аналогично предыдущему примеру).

        int []arr = new int[10];
        int sum = 0;
        System.out.print("Массив на 10 элементов из случайных чисел : ");
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (-20*Math.random() + 10*Math.random());
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

        for (int i: arr) {
            if (i > 0) {
                sum +=1;
            }
        }

        System.out.print("Количество положительных чисел: " + sum + " ;\nИндексы чисел в массиве: ");
        for (int i = 0; i < 10; i++) {
            if (arr[i] > 0) {
                System.out.print( i + "; ");
            }
        }
    }
}
