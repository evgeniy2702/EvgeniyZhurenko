package Задание_1;

import java.io.FileNotFoundException;

public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int[] executeStrategy (NewArray newArray) throws FileNotFoundException {
        return strategy.execute(newArray);
    }
}
