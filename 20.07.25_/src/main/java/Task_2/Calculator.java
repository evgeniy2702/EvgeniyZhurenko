package Task_2;

import java.util.Scanner;

public class Calculator {

//    Создайте класс Калькулятор. В классе должна быть
//реализована следующая функциональность:
//■ Сложение двух чисел;
//■ Вычитание двух чисел;
//■ Умножение двух чисел;
//■ Деление двух чисел;
//■ Максимум из двух чисел;
//■ Минимум из двух чисел;
//■ Процент числа;
//■ Возведение числа в степень.
//    Протестируйте все возможности созданного класса
//    с использованием JUnit.

    double a;
    double b;
    int percent;
    int exponentiation;

    public Calculator() {
    }

    //Метод сложения
    public double summary(double a, double b) {
        return a + b;
    }

    //Метод вычитания
    public double deduction(double a, double b) {
        return a - b;
    }

    //Метож умножения
    public double multiplication(double a, double b) {
        return a * b;
    }

    //Метод деления
    public double division(double a, double b) {
        double res = 0;
        try {
            res = a / b;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return res;
    }

    //Метод определения максимального значения
    public double max(double a, double b) {
        return Math.max(a, b);
    }

    //Метод определения минимального значения
    public double min(double a, double b) {
        return Math.min(a, b);
    }

    //Метод нахождения процента от числа
    public double percent(double a, int percent) {
        return (a * percent) / 100;
    }

    //Метод возведения в степень
    public double exponentiation(double a, int exponentiation) {
        double res = 1;
        int i = 0;
        if( a != 0) {

            do {
                if (exponentiation != 0) {
                    res *= a;
                }
//                } else if (exponentiation == i) {
//                    res = a;
//                } else {
//                    res *= a;
//                }
                i++;
            } while (i < exponentiation);
        } else {
            res = 0;
        }
        return res;
    }

    //Методы раобты с пользователем
    public Scanner scanner() {
        return new Scanner(System.in);
    }

    public double inputNumDouble() {
        double x = 0;
        System.out.println("Введите число : ");
        x = scanner().nextDouble();
        System.out.println("Вы ввели а = " + x);
        return x;
    }

    public int inputNumInt() {
        int x = 0;
        System.out.println("Введите число : ");
        x = scanner().nextInt();
        System.out.println("Вы ввели а = " + x);
        return x;
    }

    public void percExp(int i) {
        switch (i) {
            case 7:
                percent = inputNumInt();
                System.out.println("a % x = " + percent(a, percent));
                break;
            case 8:
                exponentiation = inputNumInt();
                System.out.println("a exp = " + exponentiation(a, exponentiation));
                break;
        }
    }

        public void sumDedMultiDivMaxMin ( int i){
            b = inputNumDouble();
            switch (i) {
                case 1:
                    System.out.println("a + b = " + summary(a, b));
                    break;
                case 2:
                    System.out.println("a - b = " + deduction(a, b));
                    break;
                case 3:
                    System.out.println("a * b = " + multiplication(a, b));
                    break;
                case 4:
                    System.out.println("a / b = " + division(a, b));
                    break;
                case 5:
                    System.out.println("max = " + max(a, b));
                    break;
                case 6:
                    System.out.println("min = " + min(a, b));
                    break;
            }
        }

        public int ask () {
            System.out.println("Выберите операцию : 1 - '+' / 2 - '-' / 3 - '*' / 4 - '/' / 5 - 'max' " +
                    "/ 6 - 'min' / 7 - '%' / 8 - 'exp' / 9 - 'stop' ");
            return scanner().nextInt();
        }

        public void choice (int i) {
            a = inputNumDouble();
            while (true) {
                if (i >= 1 && i <= 6) {
                    sumDedMultiDivMaxMin(i);
                    break;
                }
                else if (i >= 7 && i <= 8) {
                    percExp(i);
                    break;
                }
                else System.out.println("Проверьте выбор !");
            }
        }

        public void run() {
            while (true) {
                int i = ask();
                if (i == 9) {
                    System.out.println("END RUN");
                    break;
                } else choice(i);
            }
        }
}
