package Задание_1.Strateges;

import Задание_1.NewArray;
import Задание_1.Strategy;

// Класс, который выполняет алгоритм вывода информации об элементах массива на консоль

public class PrintScreenStrategy implements Strategy {

    NewArray newArray;

    public PrintScreenStrategy(NewArray newArray) {
        this.newArray = newArray;
    }

    @Override
    public int[] execute(NewArray newArray) {
        this.newArray = newArray;
        PrintScreenStrategy printScreenStrategy = new PrintScreenStrategy(newArray);
        System.out.println(printScreenStrategy.newArray.toString());
        return null;
    }
}
