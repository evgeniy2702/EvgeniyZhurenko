package Задание_1;

import java.io.FileNotFoundException;

public interface Strategy {

    public int[] execute(NewArray newArray) throws FileNotFoundException;
}