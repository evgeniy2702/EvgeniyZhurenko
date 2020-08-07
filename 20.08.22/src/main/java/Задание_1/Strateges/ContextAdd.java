package Задание_1.Strateges;

import Задание_1.NewArray;
import Задание_1.StrategyAdd;

import java.io.IOException;

public class ContextAdd {

    StrategyAdd strategyAdd;

    public void setStrategyAdd(StrategyAdd strategyAdd) {
        this.strategyAdd = strategyAdd;
    }

    public void executeStrategyAdd(NewArray newArray) throws IOException {
        strategyAdd.addElement(newArray);
    }
}
