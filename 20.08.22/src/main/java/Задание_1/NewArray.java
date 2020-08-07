package Задание_1;

import Задание_1.StrategesAdd.AddElementFromConsole;
import Задание_1.StrategesAdd.AddElementFromFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class NewArray  {

    String name;
    int[] integers;
    int length;

    public NewArray(int length) {
        this.length = length;
        this.integers = new int[length];
    }

    public NewArray(String name, int length) {
        this.name = name;
        this.length = length;
        this.integers = new int[length];
    }

    public int[] getIntegers() {
        return integers;
    }
    public String getName(){
        return this.name;
    }
    public int getLength(){
        return length;
    }

    public void setIntegers(int[] integers) {
        this.integers = integers;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLength(int length){
        this.length = length;
    }

//    public <T> void  addElementToArray(T object) throws IOException {
//        if(object.getClass() == AddElementFromConsole.class){
//            ((AddElementFromConsole) object).addElement();
//        }
//        else if(object instanceof AddElementFromFile){
//            ((AddElementFromFile) object).addElement();
//            this.integers = ((AddElementFromFile) object).getIntegers();
//        }
//    }

    @Override
    public String toString() {
        return getName() + Arrays.toString(integers);
    }
}
