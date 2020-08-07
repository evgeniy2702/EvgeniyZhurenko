package Задание_1.Strateges;

import Задание_1.NewArray;
import Задание_1.Strategy;

import java.io.*;

// Класс, который выполняет алгоритм вывода информации об элементах массива в текстовый файл

public class PrintFileStrategy implements Strategy {

    NewArray newArray;

    public PrintFileStrategy(NewArray newArray) {
        this.newArray = newArray;
    }

    @Override
    public int[] execute(NewArray newArray) throws FileNotFoundException {
        this.newArray = newArray;
        try(PrintWriter printWriter = new PrintWriter("Array.txt")) {
                printWriter.print(newArray.toString());
                return null;
        }
    }
}
