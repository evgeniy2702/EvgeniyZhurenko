package Homework;

public class Circle {

//    OOP
//    В примере с классом Circle выполнить:
//    1.Создайте в классе Circle метод, вычисляющий длину окружности.
//    2.Создайте в классе Circle метод, вычисляющий площадь той окружности, к которой метод применён.


    private int radius;

    public static double lengthCircle (int radius) {

        double length = 2 * Math.PI * radius;

        return length;

    }

    public static double squareCircle (int radius){

        double square = Math.PI * Math.pow((double)radius, 2);

        return square;
    }


    public static void main(String[] args) {

        Circle circle = new Circle();
        int r = 20;

        double length = circle.lengthCircle(r);

        double square = circle.squareCircle(r);

        System.out.printf(" Length of circle = %.2f cm ; Square of circle = %.2f cm*cm",  length, square);

    }
}
