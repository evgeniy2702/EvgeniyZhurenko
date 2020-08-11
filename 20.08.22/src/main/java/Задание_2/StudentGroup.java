package Задание_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentGroup {

    String groupName;
    String facultyName;
    String universityName;
    List<Student> studentList = new ArrayList<>();

    public StudentGroup(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudToStudentGroup(Student student){
        if(!studentList.contains(student)) {
            studentList.add(student);
        } else {
            System.out.println("Такой студент уже есть");
        }
    }

    public void divStudFromStudentGroup(Student student){
        if(studentList.contains(student)) {
            studentList.remove(student);
        } else {
            System.out.println("Такого студента нет");
        }
    }

    public Student getStudent(Student stud){
        return studentList.stream().filter(student -> student == stud).collect(Collectors.toList()).get(0);
    }

    @Override
    public String toString() {
        return "group='" + groupName + '\'' +
                "faculty='" + facultyName + '\'' +
                ", universityName='" + universityName +
                "\nstudentList= \n" + studentList + '\'';
    }
}
