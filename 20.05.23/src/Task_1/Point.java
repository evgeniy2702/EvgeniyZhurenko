package Task_1;

public class Point {

    // поля класса Точка
    private double x;
    private double y;
    private Triangle triangle; // связь класса Точка с классм Треугольник

    //контсрукторы по умолчанию и с параметрами
    public Point() {}
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // геттеры и сеттеры
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    public double[] getPoint() {
        return new double[]{x, y};
    }
    public Triangle getTriangle() {
        return triangle;
    }

    // перегруженый метод вывода информации о точке
    @Override
    public String toString() {
        return "Point{" +
                "X=" + x +
                ", Y=" + y +
                '}';
    }

    // метод по имзенению положения точки в системе координат
    public Point changePlace(double a) {
        x += a;
        y += a;
        return new Point();
    }
}
