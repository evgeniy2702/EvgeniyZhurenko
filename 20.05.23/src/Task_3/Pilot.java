package Task_3;

import java.util.Scanner;

public class Pilot extends Profession {

    // поля класса
    private String typePlane;
    private String answer;

    // конструкторы
    Pilot() {};

    Pilot( String name, String industry, String typePlane) {
        super.name = name;
        super.industry = industry;
        this.typePlane = typePlane;
    }

    // геттеры
    public String getIndustry() {
        return super.industry;
    }

    // абстрактный метод Делает работу
    @Override
    public String doWork(String industry) {
        super.industry = industry;
        Scanner sc = new Scanner(System.in);
        System.out.println(industry);
        answer = sc.nextLine();
        return answer;
    }

    // Перегруженый метод вывода описания на консоль
    @Override
    public String toString() {
        return "Профессия :\n1)название: " + name + ";\n2)индустрия: " + industry + ";\n3)тип самолета :" + typePlane +
                ";\n4)выполняет работу: " + answer + "\n";
    }
}
