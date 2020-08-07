package Задание_1.Strateges;

import Задание_1.NewArray;
import Задание_1.Strategy;

import java.util.Arrays;
import java.util.stream.Collectors;

// Класс, который выполняет алгоритм переворота данных массива и выводит на экран либо в файл.

public class CoupStrategy implements Strategy {

    NewArray newArray;

    public CoupStrategy(NewArray newArray) {
        this.newArray = newArray;
    }

    @Override
    public int[] execute(NewArray newArray) {
        this.newArray = newArray;
        int num ;
        for (int i = 0; i < newArray.getIntegers().length/2; i++) {
            num = newArray.getIntegers()[i];
            newArray.getIntegers()[i] = newArray.getIntegers()[newArray.getIntegers().length-i-1];
            newArray.getIntegers()[newArray.getIntegers().length-i-1] = num;
        }
        return newArray.getIntegers();
    }

    @Override
    public String toString() {
        return newArray.toString();
    }
}
