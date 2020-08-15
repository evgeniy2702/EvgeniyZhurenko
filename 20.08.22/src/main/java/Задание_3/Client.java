package Задание_3;

import Задание_3.MathAction.AddNumbers;
import Задание_3.MathAction.MaxNumbers;
import Задание_3.MathAction.MinNumbers;

import java.io.IOException;
import java.util.Scanner;

public class Client implements ClientInterface {

    WriteNumberList writeNumberList;
    NumberList numberList;
    UpDateNumbers upDateNumbers;

    public Client() {
        load();
    }

    public void load() {

        writeNumberList = new WriteNumberList("Numbers.txt");
        numberList = new NumberList("Numbers.txt");
        upDateNumbers = new UpDateNumbers(writeNumberList);
    }

    @Override
    public void run () throws IOException {
        while (!upDateNumbers.thread.isInterrupted()) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Сделайте выбор :\n 1 - провести математические действия;\n2 - Выйти из приложения;\n");
            if (sc.hasNextInt()) {
                int i = sc.nextInt();
                if(i == 1 || i ==2) {
                    switch (i){
                        case 1:
                            mathAct();
                            break;
                        case 2:
                            upDateNumbers.thread.interrupt();
                            break;
                    }
                } else {
                    System.out.println("Выбор не корректный !");
                    run();
                }
            }
        }
    }

    public void mathAct() throws IOException {

        upDateNumbers.thread.start();
        numberList.getNumberList();

        System.out.println(numberList.toString());
        System.out.println("Сумма всех чисел в файле : " + new AddNumbers(numberList).getAdd());
        System.out.println("МАХ среди всех чисел в файле : " + new MinNumbers(numberList).getMin());
        System.out.println("МIN среди всех чисел в файле : " + new MaxNumbers(numberList).getMax());
    }
}
