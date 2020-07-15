package homework;

public class Task_8 {
    public static void main(String[] args) {

//        8.	Создать массив целых чисел на 10 элементов.
//        Запомнить его случайными числами в диапазоне от 10 до 100.
//        Вывести массив на экран. Вывести сумму всех элементов массива.

    int []arr = new int[10];
    int sumArr = 0;
    System.out.print("Массив на 10 элементов из случайных чисел : ");
    for (int i = 0; i < 10; i++) {
        arr[i] = (int) (10 + Math.random()*100);
        System.out.print(arr[i] + "  ");
    }
    System.out.println();
    for (int i: arr) {
        sumArr +=i;
    }
    System.out.println("Сумма всех элементов массива будет равна : " + sumArr);
}
}
