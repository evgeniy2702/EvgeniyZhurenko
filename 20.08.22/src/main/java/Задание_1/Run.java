package Задание_1;

import Задание_1.Strateges.*;
import Задание_1.StrategesAdd.AddElementFromConsole;
import Задание_1.StrategesAdd.AddElementFromFile;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Run {

//    Задание 1
//    Создайте класс, выполняющий операции с массивом:
//    отображение данных в файл или на экран, переворот
//    данных, нахождение максимума, нахождение минимума.
//    Класс может получить набор значений с клавиатуры
//    или из файла. При реализации используйте паттерн
//    Strategy и другие необходимые паттерны.

    public static void main(String[] args) throws IOException {

        Context context = new Context();

        ContextAdd contextAdd = new ContextAdd();

        NewArray arr2 = new NewArray("Integer2", 10);

        contextAdd.setStrategyAdd(new AddElementFromFile("InputArray.txt",arr2.getIntegers()));
        contextAdd.executeStrategyAdd(arr2);

        context.setStrategy(new PrintScreenStrategy(arr2));

        context.executeStrategy(arr2);

        context.setStrategy(new PrintFileStrategy(arr2));

        context.executeStrategy(arr2);
    }

}
