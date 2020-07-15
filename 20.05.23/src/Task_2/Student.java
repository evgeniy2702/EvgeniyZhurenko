package Task_2;

import java.util.Arrays;

public class Student {

    // поля класса студент
    private String surname;
    private int yearBorn;
    private Assessment[] assessment; // связь с классом оценка
    private StudentGroup studentGroup; // связь с классом группа студентов

    // конструкторы по умолчанию и с параметрами
    Student() {};

    Student(String surname, int yearBorn) {
        this.surname = surname;
        this.yearBorn = yearBorn;
    }

    // геттеры и сеттеры
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }
    public void setAssessment(Assessment[] assessment) {
        this.assessment = assessment;
    }
    public void setStudentGroup(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public String getSurname() {
        return surname;
    }
    public int getYearBorn() {
        return yearBorn;
    }
    public Assessment[] getAssessment() {
        return assessment;
    }
    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    // метод определения ср бала
    public double assess(Assessment[] assessment) {
        double sum = 0;
        for (Assessment value : assessment) {
            sum = sum + value.getAssessment();
        }
        return sum/assessment.length;
    }

    // метод возврата всех оценок массивом
    public Assessment[] tabel() {
        return assessment;
    }

    // перегруженый метод вывода информации о студенте на констоль
    @Override
    public String toString() {
        return "Студент : " +
                "Ф.И.О. :'" + surname + '\'' +
                "; год рождения: " + yearBorn +
                "; оценки: " + Arrays.toString(tabel()) +
                "; средний бал: " + assess(assessment);
    }
}
