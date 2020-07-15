package step;

public class Task_5_6 {
    public static void main(String[] args) {
//        Используя цикл while необходимо вывести на экран следующую последовательность чисел:
//         7 14 21 28 35 42 49 56 63 70 77 84 91 98.

        int i = 7;
        while (i <= 98) {
            System.out.print(i + " ");
            i += 7;
        }
        System.out.println();

//        Используя цикл while необходимо вывести на экран следующую последовательность чисел:
//        1 2 4 8 16 32 64 128 256 512

        int j = 1;
        while (j <= 512) {
            System.out.print(j + " ");
            j *= 2;
        }
    }
}
