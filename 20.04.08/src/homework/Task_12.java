package homework;

public class Task_12 {
    public static void main(String[] args) {

//        12.	 Создать массив целых чисел на 10 элементов.
//        Запомнить его случайными числами в диапазоне от 0 до 10.
//        Вывести массив на экран. Вывести сколько раз в массиве встречается число 5.

        int []arr = new int[10];
        int sum = 0;
        System.out.print("Массив на 10 элементов из случайных чисел : ");
        for (int i = 0; i < 10; i++) {
            arr[i] = (int)(10 * Math.random());
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (arr[i] == 5) {
                sum +=1;
            }
        }
        if ( sum == 0){
            System.out.println("В массиве встречается число 5 : ни разу.");
        }
        else {
            System.out.println("В массиве встречается число 5 : " + sum + " раз.");
        }
    }
}
