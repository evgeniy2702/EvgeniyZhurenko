package homework;

public class Main {

    public static void main(String[] args) {
        // 1.	Создать массив целых чисел на 4 элемента. Вывести его значения на экран.

        int []arr = new int[4];
        System.out.print("Значения созданного нами массива из 4-х элементов : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

