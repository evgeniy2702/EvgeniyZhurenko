package HomeWorkEnumCollectionTask1;

import java.lang.reflect.Array;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayNum {
//    1)Пользователь вводит с клавиатуры набор чисел. Полученные числа необходимо сохранить в список. После
//    чего нужно показать меню, в котором предложить пользователю набор пунктов:
//            1. Добавить элемент в список.
//            2. Удалить элемент из списка.
//            3. Показать содержимое списка.
//            4. Проверить есть ли значение в списке.
//            5. Заменить значение в списке.
//    В зависимости от выбора пользователя выполняется
//    действие, после чего меню отображается снова.

        static ArrayList<Integer> integerList;




        public ArrayNum() {
        }
        public ArrayNum(ArrayList<Integer> integerList) {
            this.integerList = integerList;
        }

        public ArrayList<Integer> getIntegerList() {
            return integerList;
        }

        public void setIntegerList(ArrayList<Integer> integerList) {
            this.integerList = integerList;
        }

    public static boolean printChoice(){
        System.out.println("Добавить число : да - 1 / нет - 2");
        return Logice.choice();
    }

    public static   int enterInteger(){
        System.out.println("Введите  целочисленное число :");
        int elem = 0;
        while (true){
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                elem = sc.nextInt();
                break;
            } else {
                System.out.println("Повторите ввод :");
            }
        }
        return elem;
    }
    }


