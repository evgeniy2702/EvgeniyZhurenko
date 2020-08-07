package Задание_1.StrategesAdd;

import Задание_1.NewArray;
import Задание_1.Strategy;
import Задание_1.StrategyAdd;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class AddElementFromFile implements StrategyAdd {

    String fileName;
    int[] integers;

    public AddElementFromFile(String fileName, int[] integers) {
        this.fileName = fileName;
        this.integers = integers;
    }

    public String getFileName() {
        return fileName;
    }

    public int[] getIntegers() {
        return integers;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void addElement(NewArray newArray) throws IOException {
        FileReader fileReader = new FileReader(getFileName());
        Scanner scanner = new Scanner(fileReader);
        if(scanner.hasNextLine()){
            String str = scanner.nextLine();
            integers = Arrays.stream(Arrays.stream(str.split(",")).toArray(String[]::new))
                    .mapToInt(Integer::parseInt).toArray();
        }
        newArray.setIntegers(integers);
    }
}
