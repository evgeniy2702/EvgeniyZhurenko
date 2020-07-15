package Task_2;

public class Run {
//    2)Программа должна выводить на экран список студентов группы, указывая в
//    строчку через пробел фамилию, год рождения, три оценки и средний бал.
//    Необходимо разработать систему классов для реализации программы. Для
//    хранения информации о студенте создайте класс Student.

    public static void main(String[] args) {

        // создание оценок для студента 1
        Assessment as1 = new Assessment(11);
        Assessment as2 = new Assessment(12);
        Assessment as3 = new Assessment(10);

        // формирование массива оценок и создание студента 1
        Assessment[] asSt1 = new Assessment[]{as1, as2, as3};
        Student student1 = new Student("Толстой Л.Н.", 2000);
        student1.setAssessment(asSt1);

        // вывод информации о студенте 1
        System.out.println(student1.toString());
        System.out.println();

        //создание экземпляров оценок для студента 2
        Assessment[] asSt2 = {
                new Assessment(8),
                new Assessment(11),
                new Assessment(8)
        };

        // создание студента 2
        Student student2 = new Student("Пушкин А.С.", 2002);
        student2.setAssessment(asSt2);

        // вывод информации о студенте 2 на консоль
        System.out.println(student2.toString());
        System.out.println();

        // формирование массива студентов группы и создание экземпляра группы
        Student[] students = new Student[] {student1, student2};
        StudentGroup group = new StudentGroup();
        group.setStudents(students);

        // вывод информации о студентах группы
        System.out.println("Группа студентов :");
        group.group(students);
    }
}