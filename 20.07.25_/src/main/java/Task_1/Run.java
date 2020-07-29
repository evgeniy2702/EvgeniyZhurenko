package Task_1;

import java.util.Scanner;

public class Run {

//    Создайте класс по работе с дробями. В классе должна
//быть реализована следующая функциональность:
//■ Сложение дробей;
//■ Вычитание дробей;
//■ Умножение дробей;
//■ Деление дробей.
//Протестируйте все возможности созданного класса
//с использованием JUnit. 

    public static void main(String[] args) {

        Fractions fractions = new Fractions();

        int b = 0;
        double[] arr = new double[2];

        while (b < 2){
            System.out.println("Введите дробное число");
            for (;;) {
                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNextDouble()) {
                    arr[b] = scanner.nextDouble();
                    System.out.println("Вы ввели : " + arr[b]);
                    b++;
                    break;
                } else {
                    System.out.println("Ваш ввод не корректен.");
                }
            }
        }

        System.out.printf("Сумма дробей %.2f: ", fractions.summary(arr[0], arr[1]));
        System.out.printf("\nВычитание дробей %.2f: ", fractions.deduction(arr[0],arr[1]));
        System.out.printf("\nУмножение дробей %.2f: ", fractions.multiplication(arr[0],arr[1]));
        System.out.printf("\nДеление дробей %.2f: ", fractions.division(arr[0],arr[1]));

    }
}
