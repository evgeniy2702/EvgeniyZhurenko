package Задание_2;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentIterator implements Iterable<Student> {

    List<Student> studentList;

    public StudentIterator(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return studentList.iterator();
    }

    public Student getStudent(Student stud){
        return studentList.stream().filter(student -> student == stud).collect(Collectors.toList()).get(0);
    }

    public void addStud(Student student){
        if(!studentList.contains(student)) {
            studentList.add(student);
        } else {
            System.out.println("Такой студент уже есть");
        }
    }

    public void divStudent(Student student){
        if(studentList.contains(student)) {
            studentList.remove(student);
        } else {
            System.out.println("Такого студента нет");
        }
    }
}
