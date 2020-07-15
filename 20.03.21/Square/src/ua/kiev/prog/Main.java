package ua.kiev.prog;

public class Main {
    // метод main является точкой входа в программу класса, в данном случае public class Main
    public static void main(String[] args) {

        System.out.println("Задание 1.Hарисовать квадрат используя метод print() и переносы строк \"\\t\\n\"");
        System.out.print(" ----\n");
        System.out.print("|    |\n");
        System.out.print(" ----\n");
        System.out.println();
        System.out.println("Задание 2.Написать короткое резюме в методе main используя методы вывода текста на экран");
        String name = "Евгений";
        String mail = "мужской";
        int age = 42;
        float height = 1.77f;
        System.out.printf("Имя: %s\nПол: %s\nВозраст: %d\nРост: %.2f\n",name,mail,age,height);


        byte b = 2;
        byte c = 3;
        byte a = b*c;
        System.out.println(a);
    }
}
