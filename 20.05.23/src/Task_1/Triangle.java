package Task_1;

import java.util.Arrays;

public class Triangle {

    // поле класса
    private Point[] p; //связm класса треугольник с классом Точка

    // констуркторы по умоляанию и с параметрами
    Triangle() {

    }
    Triangle(Point[] p) {
        this.p = p;
    }

    //Геттеры и сеттеры
    public void setP(Point[] p) {
        this.p = p;

    }
    public Point[] getPoint() {
        return  p;
    }

    // метод по имзенению положения треугольника в системе координат
    public void changePlaceTriangle( double a) {
        if (p.length == 3) {
            for (int i = 0; i < p.length; i++) {
                p[i].changePlace(a);
            }
        } else {
            System.out.println("Треугольник имеет 3-и вершины!!");
        }
    }

    // перегруженый метод вывода информации о треугольнике
    @Override
    public String toString() {
        if (p.length == 3) {
            return "Triangle{p1=" + Arrays.toString(p) + "}";
        } else {
            return "Треугольник имеет 3-и вершины!!";
        }
    }
}



