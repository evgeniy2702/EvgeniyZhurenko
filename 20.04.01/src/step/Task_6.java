package step;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        //Напечатать таблицу перевода 1, 2 ... 20 долларов США в гривны
        // по текущему курсу (значение курса вводится с клавиатуры).
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стоимость 1$ в грн :");
        float c = sc.nextFloat();
        System.out.println("Укажите до какого колличества $ вывести расчет :");
        int j = sc.nextInt();
        System.out.println("На сегодня курс гривны следующий : ");
        for (int i = 0; i < j; i++) {
            System.out.println((i+ 1) + " $  -  " + c*(i+1) + " грн");
        }
    }
}
