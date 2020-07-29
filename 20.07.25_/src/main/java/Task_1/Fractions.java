package Task_1;

public class Fractions {

    double a;
    double b;

    public Fractions() {
    }

    public Fractions(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Метод сложения
    public double summary(double a,double b) {
        return a + b;
    }

    //Метод вычиатния
    public double deduction(double a,double b) {
        return a - b;
    }

    //Метод умножения
    public double multiplication(double a,double b) {
        return a * b;
    }

    //Метод деления
    public double division(double a,double b) {
        double res = 0;
        try {
            res =   a / b;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       return res;
    }
}
