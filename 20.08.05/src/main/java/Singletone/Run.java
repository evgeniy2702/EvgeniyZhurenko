package Singletone;

public class Run {

//    Задание 1
//    Создайте классическую реализацию паттерна Singleton.
//    Протестируйте работу созданного класса.

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        singleton1.setData("Data1");
        System.out.println("singleton1 = " + singleton1.toString());

        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton2 = " + singleton2.toString());

        singleton2.setData("Data2");
        System.out.println("singleton1 = " + singleton1.toString());
        System.out.println("singleton2 = " + singleton2.toString());

    }
}
