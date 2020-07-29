package Task_3;

import java.util.Arrays;
import java.util.Random;

public class IntegerClass {

//    Задание 3
//Создайте класс, содержащий набор целых чисел.
//В классе должна быть реализована следующая функциональность:
//■ Сумма элементов набора;
//■ Среднеарифметическое элементов набора;
//■ Максимум из элементов набора;
//■ Минимум из элементов набора.
//Протестируйте все возможности созданного класса
//с использованием JUnit.

    int[] arrInt;
    int length;

    public IntegerClass() {
    }

    public IntegerClass(int length) {
        this.length = length;
        this.arrInt = new int[length];
        for (int i = 0; i < length; i++) {
            arrInt[i] = new Random().nextInt(100);
        }
    }

    public int[] getArrInt() {
        return arrInt;
    }

    public void setArrInt(int[] arrInt) {
        this.arrInt = arrInt;
    }

    @Override
    public String toString() {
        return "IntegerClass{" +
                "arrInt=" + Arrays.toString(arrInt) +
                '}';
    }

    public int sumArr(int[] arrInt) {
        return Arrays.stream(arrInt).sum();
    }

    public double averageArr(int[] arrInt) {
        double res = 0;
        if(Arrays.stream(arrInt).average().isPresent()) {
            res = Arrays.stream(arrInt).average().getAsDouble();
        }
        return res;
    }

    public int maxArrElem(int[] arrInt) {
        int max = 0;
        if(Arrays.stream(arrInt).max().isPresent()) {
            max = Arrays.stream(arrInt).max().getAsInt();
        }
        return max;
    }

    public int minArrElem(int[] arrInt) {
        int min = 0;
        if(Arrays.stream(arrInt).min().isPresent()) {
            min = Arrays.stream(arrInt).min().getAsInt();
        }
        return min  ;
    }
}
