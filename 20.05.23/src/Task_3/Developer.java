package Task_3;

import java.util.Arrays;
import java.util.Scanner;

public class Developer extends Profession {

    // поля класса
    private String specialty;
    private String answer;

    // конструкторы
    Developer() {
    }

    Developer(String specialty) {
        this.specialty = specialty;
    }

    Developer(String name, String industry, String specialty) {
        super.name = name;
        super.industry = industry;
        this.specialty = specialty;
    }

    // геттеры
    public String getIndustry() {
        return super.industry;
    }

    // Перегруженый метод вывода описания на консоль
    @Override
    public String toString() {
        return "Профессия :\n1)азвание: " + name + ";\n2)индустрия: " + industry + ";\n3)специальность :" + specialty +
                ";\n4)выполняет работу :" + answer + "\n";
    }

    // абстрактный метод Делает работу
    @Override
    String doWork(String industry) {
        super.industry = industry;
        Scanner sc = new Scanner(System.in);
        System.out.println(industry);
        answer = sc.nextLine();
        return answer;
    }
}


