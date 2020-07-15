package step;

public class Task_4 {
    public static void main(String[] args) {
        int i = (int) (Math.random()*1000);
        System.out.println("Сгенерированное случайное трехзначное число равно = " + i);
        int a,b,c;
        a = i/100;
        c = i%100;
        b = c/10;
        c = c%10;
        if ( a>= b && a>=c) System.out.println("Наибольшая цифра случайного трехзначного числа = " + a);
        else if (b>=c) System.out.println("Наибольшая цифра случайного трехзначного числа = " + b);
        else System.out.println("Наибольшая цифра случайного трехзначного числа = " + c);

    }
}
