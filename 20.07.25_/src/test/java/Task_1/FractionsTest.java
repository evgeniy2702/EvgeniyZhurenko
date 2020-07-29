package Task_1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FractionsTest {

    Fractions fractions ;
    double a;
    double b;

    @Before
    public void before() {
        fractions = new Fractions();
        a = 3.0;
        b = 3.0;
        System.out.println("Before");
    }

    @After
    public void after(){
        System.out.println("After");
    }

    @Test
    public void summary() {
        double resSum = fractions.summary(a,b);
        double exp = 6.0;
        System.out.println("resSum = " + resSum);
        Assert.assertEquals(exp,resSum,0.5);
    }

    @Test
    public void deduction() {
        double resDeduc = fractions.deduction(a,b);
        double exp = 0.0;
        System.out.println("resDeduc = " + resDeduc);
        Assert.assertEquals(exp,resDeduc,0.0);
    }

    @Test
    public void multiplication() {
        double resMulti = fractions.multiplication(a,b);
        double exp = 9.0;
        System.out.println("resMulti = " + resMulti);
        Assert.assertEquals(exp,resMulti,0.0);
    }

    @Test
    public void division() {
        double resDiv = fractions.division(a,b);
        double exp = 1.0;
        System.out.println("resDiv = " + resDiv);
        Assert.assertEquals(exp,resDiv,0.0);
    }

    @Test
    public void divisionZero() throws ArithmeticException {
        double resDiv = fractions.division(a,0);
        System.out.println(resDiv);
    }
}