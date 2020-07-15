package Task_2;

public class Assessment {

    // поля класса оценка
    private int assessment;
    private Student student; // связь с классом студент

    // контсрукторы по умолчанию и с параметрами
    Assessment(){};

    Assessment(int assessment) {
        this.assessment = assessment;
    }

    // сеттеры и геттеры
    public void setAssessment(int assessment) {
        this.assessment =  assessment;
    }
    public int getAssessment() {
        return assessment;
    }
    public void setStudent(Student student){
        this.student = student;
    }
    public Student getStudent() {
        return student;
    }

    // метод вывода оценки на консоль
    @Override
    public String toString() {
        return "" + assessment;
    }
}
