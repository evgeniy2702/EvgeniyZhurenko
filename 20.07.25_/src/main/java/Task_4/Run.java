package Task_4;

import java.io.IOException;

public class Run {

    public static void main(String[] args) {

        Numbers num = new Numbers(345.0);
        num.writeNum(num.getNumber());
        System.out.println(num.readNum());
        System.out.println(num.binaryNum(num.getNumber()));
        System.out.println(num.hexNum(num.getNumber()));
        System.out.println(num.octalNum(num.getNumber()));

    }
}

