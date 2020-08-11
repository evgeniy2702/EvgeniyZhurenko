package Задание_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Run {
//    Задание 2
// В каждом учебном заведении есть студенты. Студенты
// входят в состав групп. Вам необходимо создать эмуляцию учебного процесса. Приложение должно позволять
// добавлять, удалять, изменять информацию о студентах
// и группах. При реализации используйте паттерн Iterator
//( для отображения студентов, входящих в группу) и другие
// необходимые паттерны

    public static void main(String[] args) {

        // Создание групп студентов
        List<Student> students = new ArrayList<>(List.of(new Student("Иванова"),
                new Student("Петров"),
                new Student("Сидорова"),
                new Student("Журенко")));

        List<Student> students1 = new ArrayList<>(List.of(new Student("Моргунов"),
                new Student("Полосов"),
                new Student("Сидорова"),
                new Student("Мельниченко")));

        // Создание групп на потоке
        List<StudentGroup> groups = new ArrayList<>(List.of( new StudentGroup("#1"),
                new StudentGroup("#2"),
                new StudentGroup("#3")));

        // Создание итераторов по группам студентов и по группам на потоке
        StudentGroupIterator decanat = new StudentGroupIterator(groups);
        StudentIterator filFac1 = new StudentIterator(students);
        StudentIterator filFac2 = new StudentIterator(students1);

        // Добавление в группы на потоке принадлежности учебного заведения и наименование факультета
        decanat.forEach(i -> i.setUniversityName("KPI"));
        decanat.forEach(i -> i.setFacultyName("FilFac"));

        // распределение групп студентов по группам на потоке
        decanat.getGroup(groups.get(0).groupName).setStudentList(students);
        decanat.getGroup(groups.get(1).groupName).setStudentList(students1);

        // внесение изменение в графе "Пол" конкретного студента
        filFac1.studentList.get(2).setGender(Gender.WOMAN);
        filFac2.getStudent(students1.get(0)).setGender(Gender.WOMAN);

        // Внесение изменений в графу имя конкретного студента
        filFac1.getStudent(students.get(0)).setName("Иванова Наталья");

        System.out.println("Вывод групп на потоке на консоль после внесение изменений в поле студента");
        decanat.forEach(i-> System.out.println(i.toString()));

        //Добавление нового студента в конкретную группу
        groups.get(0).addStudToStudentGroup(new Student("Мельник"));

        System.out.println("Вывод групп на потоке на консоль после добавления студента Мельник в группу");
        decanat.forEach(group -> System.out.println(group.toString()));

        System.out.println();

        //Удаление конкретного студента из группы на потоке
        groups.get(0).divStudFromStudentGroup(students.get(1));

        System.out.println();

        System.out.println("Вывод групп на потоке на консоль после удаления студента Петров");
        decanat.forEach(i-> System.out.println(i.toString()));

    }
}
