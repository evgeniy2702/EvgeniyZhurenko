package HW_Generic;

public class Min {

//    Задание 2
//Напишите шаблонный метод, который возвращает
//минимум из пяти переданных параметров.

    public <T extends Comparable<T>> T minOfFive (T[] mas){
        T min = mas[0];
        for (T value: mas) {
            if(min.compareTo(value) > 0){
                min = value;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Min min = new Min();

        System.out.println("Минимальное значение нашего массива Интеджер = " + min.minOfFive(new Integer[]{6,2,3,4,5}));

        System.out.println("Минимальное значение нашего массива Дабл = " + min.minOfFive(new Float[]{1.7f,1.3f,1.4f,1.5f,1.6f}));

        System.out.println("Минимальное значение нашего массива Стринг = " + min.minOfFive(new String[]{"f","bb","ccc","dddd","eeeee"}));
    }
}
