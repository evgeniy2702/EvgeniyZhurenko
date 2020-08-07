package Задание_1.StrategesAdd;

import Задание_1.NewArray;
import Задание_1.StrategyAdd;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class AddElementFromConsole implements StrategyAdd {

    int[] integers;

    public AddElementFromConsole(int[] integers) {
        this.integers = integers;
    }

    @Override
    public void addElement(NewArray newArray) {
        for (int i = 0; i < integers.length; i++) {
            System.out.println("Введите значение : ");
            while (true) {
                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    if (integers[i] == 0) {
                        integers[i] = number;
                        break;
                    }
                } else {
                    System.out.println("Не верное значение. Попробуйте снова.");
                }
            }
        }
        newArray.setIntegers(integers);
    }
}