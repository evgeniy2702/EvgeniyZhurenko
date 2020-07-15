package HomeWorkSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Task_2 {

//    * ---------
//    * Задание 2
//    * ---------
//    * Напишите метод, который принимает имя файла в качестве входного параметра для
//    * чтения данных из файла, содержащего ряд целых чисел, а также выводить различные статистические данные о
//    * целых числах.
//    * Предположить, что существует по крайней мере одно целое число в файле.
//    * Вывести следующую статистику:
//    * Общее количество чисел ,
//    * сумма чисел
//    * количество четных чисел и процент четных чисел.
//    * Например, если входной файл numbers.txt содержит следующий текст:
//    * 5 7 2 8 9 10 12 98 7 14 20 22
//    * то вызов метода должен приводить к следующему результату:
//    * 12 чисел, сумма = 214
//    * 8 четных (66.67%)

    public  static void statisticReadFile (String nameFile) {

        try(InputStream in = new FileInputStream(nameFile.concat(".txt"))) {
            int elem;
            String str = "";
            ArrayList<String> arr = new ArrayList<>();
            while (( elem = in.read()) != -1) {
                str = str.concat((String.valueOf((char) elem)));
            }
            System.out.println(Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).count());
            System.out.println(Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).sum());
            double a = (double) Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt)
                    .filter(num -> num % 2 == 0).count() / Arrays.stream(str.split(" "))
                    .mapToInt(Integer::parseInt).count();
            System.out.printf("%x четных (%.2f%s)",Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt)
                    .filter(num -> num % 2 == 0).count(), a*100,"%");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        statisticReadFile("numbers");
    }
}
