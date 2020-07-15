package step;

public class Task_3 {
    public static void main(String[] args) {
//        3.	Напечатать числа в виде:
//        20 20 20 20 20
//        20 20 20 20 20
        int num = 20;
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
