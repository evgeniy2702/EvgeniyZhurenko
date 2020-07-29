package Task_3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class IntegerClassTest {

    IntegerClass integerClass ;

    @Before
    public void before(){
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,0};
        integerClass = new IntegerClass();
        integerClass.setArrInt(arr);
        System.out.println("Before");
    }

    @After
    public void after(){
        System.out.println("After");
    }

    @Test
    public void getArrInt() {
        String array = integerClass.toString();
        String exp = "IntegerClass{arrInt=[1, 2, 3, 4, 5, 6, 7, 8, 9, 0]}";
        System.out.println(array);
        assertEquals(exp,array);
    }

    @Test
    public void sumArr() {
        int res = integerClass.sumArr(integerClass.getArrInt());
        int exp = 45;
        System.out.println("res = " + res);
        assertEquals(exp,res);
    }

    @Test
    public void averageArr() {
        double res = integerClass.averageArr(integerClass.getArrInt());
        double exp = 4.5;
        System.out.println("res = " + res);
        assertEquals(exp,res,0.01);
    }

    @Test
    public void maxArrElem() {
        int res = integerClass.maxArrElem(integerClass.getArrInt());
        int exp = 9;
        System.out.println("res = " + res);
        assertEquals(exp,res);
    }

    @Test
    public void minArrElem() {
        int res = integerClass.minArrElem(integerClass.getArrInt());
        int exp = 0;
        System.out.println("res = " + res);
        assertEquals(exp,res);
    }
}