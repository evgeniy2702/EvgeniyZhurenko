package Task_2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator;
    double a;
    double b;
    int percent;
    int exponentiation;

    @Before
    public void before(){
        calculator = new Calculator();
        a = 4.0;
        b = 2.5;
        percent = 25;
        exponentiation = 3;
        System.out.println("Before");
    }

    @After
    public void after(){
        System.out.println("After\n");
    }

    @Test
    public void summary() {
        double actual = calculator.summary(a,b);
        double exp = 6.5;
        System.out.println("actual = " + actual);
        Assert.assertEquals(exp, actual, 0.2);
        }

    @Test
    public void deduction() {
        double actual = calculator.deduction(a,b);
        double exp = 1.5;
        System.out.println("actual = " + actual);
        Assert.assertEquals(exp, actual, 0.2);
    }

    @Test
    public void multiplication() {
        double actual = calculator.multiplication(a,b);
        double exp = 10.0;
        System.out.println("actual = " + actual);
        Assert.assertEquals(exp, actual, 0.2);
    }

    @Test
    public void division() {
        double actual = calculator.division(a,b);
        double exp = 1.6;
        System.out.println("actual = " + actual);
        Assert.assertEquals(exp, actual, 0.2);
    }

    @Test
    public void divisionZero() throws ArithmeticException {
        double resDiv = calculator.division(a,0);
        System.out.println(resDiv);
    }

    @Test
    public void max() {
        double actual = calculator.max(a,b);
        double exp = 4.0;
        System.out.println("actual = " + actual);
        Assert.assertEquals(exp, actual, 0.2);
    }

    @Test
    public void min() {
        double actual = calculator.min(a,b);
        double exp = 2.5;
        System.out.println("actual = " + actual);
        Assert.assertEquals(exp, actual, 0.2);
    }

    @Test
    public void percent() {
        double actual = calculator.percent(a,percent);
        double exp = 1;
        System.out.println("actual = " + actual);
        Assert.assertEquals(exp, actual, 0.2);
    }

    @Test
    public void exponentiation() {
        double actual = calculator.exponentiation(a,exponentiation);
        double exp = 64.0;
        System.out.println("actual = " + actual);
        Assert.assertEquals(exp, actual, 0.2);
    }
}