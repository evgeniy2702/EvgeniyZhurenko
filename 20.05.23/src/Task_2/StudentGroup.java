package Task_2;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class StudentGroup {

    // поле класса группа студентов
    private Student[] students; // связь с классом студент

    // констуркторы по умолчанию и с параметрами
    StudentGroup() {};

    StudentGroup(Student[] students) {
        this.students = students;
    }

    // геттеры и сеттеры
    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        for (int i = 0; i < students.length; i++) {
            students[i].getStudentGroup();
        }
        return students;
    }

    // метод вывода сводной информации о студентах группы
    public void group(Student[] student) {
        for (int i = 0; i < student.length; i++) {
            System.out.println(students[i]);
        }
    }
}
