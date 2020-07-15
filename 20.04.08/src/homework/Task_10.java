package homework;

public class Task_10 {
    public static void main(String[] args) {

//        Создать массив целых чисел на 10 элементов.
//        Запомнить его случайными числами в диапазоне от -10 до 10. Вывести массив на экран.
//        Вывести количество отрицательных чисел в массиве и их индексы.
//        Например:
//        Количество отрицательных чисел: 5
//	      Индексы чисел в массиве: 3, 6, 9.

        int []arr = new int[10];
        int sum = 0;
        System.out.print("Массив на 10 элементов из случайных чисел : ");
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (-10 + Math.random()*20);
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

        for (int i: arr) {
            if(i < 0) {
                sum +=1;
            }
        }
        System.out.print("Количество отрицательных чисел: " + sum + " ;\nИндексы чисел в массиве: ");
        for (int i = 0; i < 10; i++) {
            if(arr[i] < 0){
                System.out.print(i + ", ");
            }
        }
    }
}
