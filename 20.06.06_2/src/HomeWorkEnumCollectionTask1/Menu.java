package HomeWorkEnumCollectionTask1;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static int menu() {
        int i = 0;
        while (true) {
            System.out.print("Меню работы со списком чисел :\n" +
                    "1 - показать список чисел\n" +
                    "2 - добавть число в список\n" +
                    "3 - удалить число из списка\n" +
                    "4 - найти число в  списке\n" +
                    "5 - Заменить значение в списке\n");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                switch (sc.nextInt()) {
                    case 1:
                        i = 1;
                        if (ArrayNum.integerList.size() != 0) {
                            for (Integer integer : ArrayNum.integerList) {
                                System.out.print(integer + "; ");
                            }
                            break;
                        } else {
                            System.out.println("Список пуст !");
                        }
                        break;
                    case 2:
                        i = 2;
                        if (ArrayNum.printChoice()) {
                            int elem = ArrayNum.enterInteger();
                            System.out.println("Вы добавили число :" + elem);
                            ArrayNum.integerList.add(elem);
                        }
                        break;
                    case 3:
                        if (ArrayNum.integerList.size() != 0) {
                            i = 3;
                            System.out.println("Удаление числа :");
                            Integer elem = ArrayNum.enterInteger();
                            Logice.removeInteger(elem);
                        } else {
                            System.out.println("Список пуст !");
                        }
                        break;
                    case 4:
                        i = 4;
                        if (ArrayNum.integerList.size() != 0) {
                            System.out.println("Найти число :");
                            Integer elem = ArrayNum.enterInteger();
                            Logice.findInteger(elem);
                            break;
                        } else {
                            System.out.println("Список пуст !");
                        }
                        break;
                case 5:
                    i = 5;
                    if (ArrayNum.integerList.size() != 0) {
                        System.out.println("Надо заменить число :");
                        Integer elem = ArrayNum.enterInteger();
                        System.out.println("на число :");
                        Integer change = ArrayNum.enterInteger();
                        Logice.changeInteger(elem,change);
                        System.out.println("После замены числа список выглядит так : ");
                        for (Integer integer : ArrayNum.integerList) {
                            System.out.print(integer + "; ");
                        }
                        break;
                    } else {
                        System.out.println("Список пуст !");
                    }
            }
            break;
            } else {
                System.out.println("Повторите попытку!");
            }
        }
        return i;
    }
}
