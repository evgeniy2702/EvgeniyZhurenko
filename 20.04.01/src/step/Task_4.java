package step;

public class Task_4 {
    public static void main(String[] args) {
//        4.	Напечатать в консоли треугольник используя символ +.
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
