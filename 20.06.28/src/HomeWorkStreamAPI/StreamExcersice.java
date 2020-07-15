package HomeWorkStreamAPI;

import javax.crypto.spec.PSource;
import java.util.*;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class StreamExcersice {

    private static Student student;

    static Collection<Student> students = Arrays.asList(
            new Student("Вася", 16, Sex.MAN),
            new Student("Петя", 23, Sex.MAN),
            new Student("Соня", 18, Sex.WOMEN),
            new Student("Виктор Петрович", 65, Sex.MAN),
            new Student("Дима", 25, Sex.MAN),
            new Student("Катя", 21, Sex.WOMEN),
            new Student("Семен", 33, Sex.MAN),
            new Student("Елена", 42, Sex.WOMEN),
            new Student("Иван Иванович", 69, Sex.MAN)
    );

    static List<Student> ex01() {
        // TODO: Задание 1
        // Выбрать всех мужчин-военнообязанных (возраст от 18 до 27 лет)
       return   students.stream().filter(man -> man.getSex().equals(Sex.MAN) && man.getAge()>=17 &&
               man.getAge()<=27).collect(Collectors.toList());
    }

    static Double ex02() {
        // TODO: Задание 2
        // Найти средний возраст среди мужчин
        return  students.stream().filter(man->man.getSex().equals(Sex.MAN)).collect(Collectors.averagingDouble(Student::getAge));
    }

    static Long ex03() {
        // TODO: Задание 3
        // Найти кол-во потенциально работоспособных
        // студентов в выборке (т.е. от 18 лет и учитывая
        // что женщины выходят в 55 лет, а мужчина в 60)
        students.stream().filter(women->women.getSex().equals(Sex.WOMEN))
                .filter(person -> person.getAge()>=18 && person.getAge()<=55)
                .forEach(System.out::println);
        students.stream().filter(man->man.getSex().equals(Sex.MAN))
                .filter(person -> person.getAge()>=18 && person.getAge()<=60)
                .forEach(System.out::println);
        return students.stream().filter(women->women.getSex().equals(Sex.WOMEN))
                .filter(person -> person.getAge()>=18 && person.getAge()<=55).count() +
                students.stream().filter(man->man.getSex().equals(Sex.MAN))
                .filter(person -> person.getAge()>=18 && person.getAge()<=60)
                .count();
    }

    static List<Student> ex04() {
        // TODO: Задание 4
        // Отсортировать студентов по имени в обратном алфавитном порядке

        return students.stream().sorted((person1,person2)->person2.getName()
                .compareToIgnoreCase(person1.getName()))
                .collect(Collectors.toList());
    }

    static Student ex05() {
        //  TODO: Задание 5
        //  найти студента с максимальным возрастом

        return students.stream().max((Comparator.comparing(Student::getAge))).get(); // почему советует проверить через isPresent() ???
    }

    static Student ex06() {
        // TODO: Задание 6
        // Найти студента с минимальным возрастом

        return students.stream().min(Comparator.comparing(Student::getAge)).orElse(null);

    }

    public static void main(String[] args) {
        // TODO: тестировать здесь

        StreamExcersice.students.forEach(student-> System.out.println(student.toString()));
        System.out.println();
        System.out.println("Военнообязаные мужчины от 18 до 25 лет");
        StreamExcersice.ex01().forEach(man-> System.out.println(man.toString()));
        System.out.println();
        System.out.printf("Средний возраст мужчин - %.2f лет\n",StreamExcersice.ex02());
        System.out.println();
        System.out.println("Список работоспособных студентов : ");
        System.out.println("Колличество роботоспособных студентов  " + StreamExcersice.ex03());
        System.out.println();
        System.out.println("Сортировка студентов в обратном алфавитном порядке :");
        StreamExcersice.ex04().forEach(man-> System.out.println(man.toString()));
        System.out.println();
        System.out.println("Студентом с мax возрастов является : " + StreamExcersice.ex05().toString());
        System.out.println();
        System.out.println("Студентом с міn возрастов является : " + StreamExcersice.ex06().toString());

    }
}

