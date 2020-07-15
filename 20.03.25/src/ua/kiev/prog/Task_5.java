package ua.kiev.prog;

import java.security.PublicKey;
import java.util.Scanner;

public class Task_5 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Введите пжл значения параметров А, В и С :");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        System.out.printf("Вы ввели следующие значения : А = %.2f ; B = %.2f ; C = %.2f\n" , a,b,c);
        System.out.println("ж) (-В + 1/А) / 2/С = " + ((-b + 1/a)/2/c)) ;
        System.out.println("з) 1/(1 + (А+В)/2) = " + (1/(1 + (a + b)/2))) ;


        sc.close();
    }
}
