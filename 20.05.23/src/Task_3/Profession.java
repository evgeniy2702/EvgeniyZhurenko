package Task_3;

public abstract class Profession {

    // поля класса
    String name;
    String industry;

    // абстрактный метод Делает работу
    abstract String doWork(String industry);

    // Перегруженый метод вывода описания на консоль
    @Override
    public String toString() {
        return "Профессия :" +
                "название - " + name + '\'' +
                ", индустрия - " + industry + "\n";
    }
}
