package Задание_1.Strateges;

import Задание_1.NewArray;
import Задание_1.Strategy;

import java.util.Arrays;

public class MaxStrategy implements Strategy {

    NewArray newArray;

    public MaxStrategy(NewArray newArray) {
        this.newArray = newArray;
    }

    @Override
    public int[] execute(NewArray newArray) {
        this.newArray = newArray;
        int[] max = new int[1];
        if( Arrays.stream(newArray.getIntegers()).max().isPresent()) {
            max[0] = Arrays.stream(newArray.getIntegers()).max().getAsInt();
        }
        return max;
    }
}
