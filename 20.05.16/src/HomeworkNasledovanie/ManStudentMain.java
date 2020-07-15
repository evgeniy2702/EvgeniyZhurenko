package HomeworkNasledovanie;

public class ManStudentMain {

    public static void main(String[] args) {

        // Создание объекта человек с характеристиками

    Man man = new Man();
    man.setAge(55);
    man.setName("Vladymir");
    man.setWeight(90);
    man.show();
        System.out.println();

        // Создание объекта студент с характеристиками

    Student student = new Student("Bob",2);
    student.setAge(20);
    student.setWeight(70);
    student.show();

    // после использования метода увеличения обучения

        System.out.println();
        System.out.println("After 2 years of study will be :");
    student.addYearOfStudy(2);
    student.show();
    }
}
