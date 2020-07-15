package HomeWorkEnumCollectionTask1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Logice extends ArrayNum {

    public static boolean choice() {
        boolean choice = false;
        int i = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                if(i == 1 || i == 2 ) {
                    switch (i) {
                        case 1:
                            choice = true;
                            break;
                        case 2:
                            break;
                    }
                    break;
                } else {
                    System.out.println("Повторите ввод :");
                }
            } else {
                System.out.println("Повторите ввод :");
            }
        }
        return choice;
    }

    public static void removeInteger (Integer integer) {
        System.out.println("Удалить число ? да - 1 / нет - 2");
        if (choice()) {
            ArrayNum.integerList.removeIf(i -> (i == integer));
            System.out.println("Число " + integer+ " удалено");
        } else {
            System.out.println("Число " + integer+ " не удалено");
        }

    }

    public static ArrayList<Integer> findInteger(Integer num) {
        ArrayList<Integer> find = new ArrayList<>();
        if(ArrayNum.integerList.size() != 0) {
            ArrayNum.integerList.toArray();
            for (int i = 0; i < ArrayNum.integerList.toArray().length; i++) {
                if(num == ArrayNum.integerList.toArray()[i]){
                    find.add(i);
                }
            }
        } else {
                find = null;
                System.out.println("Нет совпадений");
            }
                if (find.size() != 0) {
                    System.out.println("Искомое число " + num + " находится в списке под индексом :");
                    for (Integer value : find) {
                        System.out.println(value + "; ");
                    }
                } else {
                    find = null;
                    System.out.println("Нет совпадений");
                }

        return find;
    }

    public static ArrayList<Integer> changeInteger(Integer elem, Integer change) {
        int pin = 0;
        for (int i = 0; i < ArrayNum.integerList.size(); i++) {
            if (elem.equals(ArrayNum.integerList.get(i))) {
                int index = ArrayNum.integerList.indexOf(elem);
                ArrayNum.integerList.set(index, change);
                pin += 1;
            }
        }
        if(pin == 0) {
            System.out.println("Числа " + elem + " в списке нет!");
        }
        return ArrayNum.integerList;
    }
}
