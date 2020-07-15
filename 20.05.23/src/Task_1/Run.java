package Task_1;

public class Run {

//    1)В рамках некоторой системы необходимо разработать набор классов
//    для хранения информации о треугольниках на плоскости.
//    Известно, что треугольник состоит из трех точек.



    public static void main(String[] args) {

// Создаем новые объекты точек вершин треугольника, присваиваем им координаты и
//  запихиваем их в массив вершин треугольника
        Point[] points = {
                new Point(1, 1),
                new Point(1, 2),
                new Point(2, 1)
        };

    // создаем объект треугольника
        Triangle triangle = new Triangle(points);

     // выводим информацию о треугольнике
        System.out.println(triangle);
        System.out.println();

     // имзеняем координаты вершин треугольника, перемещая таким образом его в плоскости координат
        double a = 10;
        triangle.changePlaceTriangle(a);
        System.out.println("После смещения координат на " + a + " мы получим следующие координаты вершин треугольника");
        System.out.println(triangle);

    }
}
