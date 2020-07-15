package HW_Generic;

import java.lang.reflect.Array;

class Max {

//Задание 1
//Напишите шаблонный метод, который возвращает
//максимум из трёх переданных параметров.

    public <T extends Comparable<T>> T  maxOfThree(T a, T b, T c){
        T max = a;
        if(max.compareTo(b) < 0) {
            max = b;
        }
        if(max.compareTo(c) < 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {

        Max max = new Max();
        System.out.println("Максимальное значение нашего массива Интеджер = " + max.maxOfThree(2,3,4));

        System.out.println("Максимальное значение нашего массива Дабл = " + max.maxOfThree(2.6,2.5,2.7));

        System.out.println("Максимальное значение нашего массива Стринг = " + max.maxOfThree("aaa","ccc","bbb"));
    }
}
