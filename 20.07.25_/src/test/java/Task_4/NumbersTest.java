package Task_4;

import org.junit.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class NumbersTest {

    Numbers num = mock(Numbers.class);
    static double number;
    static Numbers numb;

    @BeforeClass
    public static void before(){
        number = 345.0;
        numb = new Numbers(number);
        System.out.println("Beffore");
    }

    @After
    public void after(){
        System.out.println("After");
    }

    @Test
    public void testWriteNum() {
        num.writeNum(any());
        verify(num).writeNum(any());
        doAnswer(InvocationOnMock-> InvocationOnMock.getMock().equals(num));

    }

    @Test
    public void testReadNum1() {
        num.writeNum(number);
        when(num.readNum()).thenReturn(String.valueOf(number));
        String actual = num.readNum();
        String exp = String.valueOf(number);
        assertEquals(exp,actual);
    }

    @Test
    public void testReadNum2() {
        numb.writeNum(number);
        String actual = numb.readNum();
        String exp = "345.0";
        System.out.println("actual = " + actual);;
        assertEquals(exp,actual);
    }

    @Test
    public void testBinaryNum() {
        String actual = numb.binaryNum(number);
        String exp = "101011001";
        System.out.println("actual = " + actual);;
        assertEquals(exp,actual);
    }

    @Test
    public void hexNum() {
        String actual = numb.hexNum(number);
        String exp = "0x1.59p8";
        System.out.println("actual = " + actual);;
        assertEquals(exp,actual);
    }

    @Test
    public void octalNum() {
        String actual = numb.octalNum(number);
        String exp = "531";
        System.out.println("actual = " + actual);;
        assertEquals(exp,actual);
    }
}