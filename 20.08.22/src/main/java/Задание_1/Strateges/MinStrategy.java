package Задание_1.Strateges;

import Задание_1.NewArray;
import Задание_1.Strategy;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class MinStrategy implements Strategy {

    NewArray newArray;

    public MinStrategy(NewArray newArray) {
        this.newArray = newArray;
    }

    @Override
    public int[] execute(NewArray newArray) {
        this.newArray = newArray;
        int[] min = new int[1];
        min[0] = Arrays.stream(newArray.getIntegers()).min().getAsInt();
        return min;
    }
}
