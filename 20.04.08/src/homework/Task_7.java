package homework;

public class Task_7 {
    public static void main(String[] args) {

//        7.	Создать массив целых чисел на 10 элементов.
//        Запомнить его случайными числами в диапазоне от 0 до 10.
//        Вывести на экран массив в обратном порядке.

    int []arr = new int[10];
    int num = 0;

    System.out.print("Массив на 10 элементов из случайных чисел : ");
    for (int i = 0; i < 10; i++) {
        arr[i] = (int) (Math.random()*10);
        System.out.print(arr[i] + "  ");
    }
    System.out.println();

    for (int i = 0; i < 5 ; i++){
        num = arr[i];
        arr[i] = arr[9 - i];
        arr[9 - i] = num;
    }

    System.out.print("В обратном порядке наш массив будет выглядеть так : ");
    for (int i : arr) {
        System.out.print(i + "  ");
    }
}
}
