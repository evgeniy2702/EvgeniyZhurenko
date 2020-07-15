package ua.kiev.prog;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ф.И.О. пжл :");
        String fio = sc.nextLine();
        System.out.println("Введите ваш возраст, пжл :");
        int age = sc.nextInt();
        System.out.println("Вы ввели :" + fio + " " + age);

        sc.close();

        }
}
