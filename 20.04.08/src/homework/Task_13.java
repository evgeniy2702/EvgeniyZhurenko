package homework;

public class Task_13 {
    public static void main(String[] args) {

//        13.	 Создать массив на 10 элементов. Заполнить его случайными числами в диапазоне от 0 до 20.
//        Создать копию первого массива. Вывести оба массива на экран.
//        Увеличить все элементы второго массива в 2 раза.
//        Вывести оба массива на экран. (
//        Ожидаемый результат: только элементы второго массива должны быть изменены)

        int []arr = new int[10];
        int []arr1 = new int[10];

        System.out.print("Массив на 10 элементов из случайных чисел : ");
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (10*Math.random());
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print("Копия массив на 10 элементов из случайных чисел : ");
        for (int i = 0; i < 10; i++) {
            arr1[i] = arr[i];
            System.out.print(arr1[i] + " ");
        }

        System.out.println();
        System.out.print(" 1-й массив : ");
        for (int i: arr){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.print(" Копия 1-го массива :");
        for (int i = 0; i < 10; i++) {
            arr1[i] *=2;
            System.out.print(arr1[i] + " ");
        }
    }
}
