package Task_4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Numbers {
//    Создайте класс для числа. В классе должна быть реализована следующая функциональность:
//            ■ Запись и чтение значения;
//■ Перевод числа в восьмеричную систему исчисления;
//■ Перевод числа в шестнадцатеричную систему исчисления;
//■ Перевод числа в двоичную систему исчисления.
//    Протестируйте все возможности созданного класса
//    с использованием JUnit.

    Double number;

    public Numbers(Double number) {
        this.number = number;
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public void writeNum(Double number){
       try(FileWriter writer = new FileWriter("Number.txt", false);) {
           writer.write(String.valueOf(number));
       } catch (IOException ex) {
           System.out.println(ex.getMessage());
       }
    }

    public String readNum(){
        StringBuilder str = new StringBuilder();
        try(FileReader reader = new FileReader("Number.txt");
            Scanner scanner = new Scanner(reader)) {
            while (scanner.hasNext()) {
                str.append(scanner.next());
            }
        } catch (IOException e) {
            e.getMessage();
        }
        return str.toString();
    }

    public String binaryNum(Double number) {
        return Integer.toBinaryString(number.intValue());
    }

    public String hexNum(Double number) {
        return Double.toHexString(number);
    }

    public String octalNum(Double number) {
        return Integer.toOctalString(number.intValue());
    }
}
