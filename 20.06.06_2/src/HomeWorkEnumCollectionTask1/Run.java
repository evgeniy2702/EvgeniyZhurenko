package HomeWorkEnumCollectionTask1;

import java.util.ArrayList;

public class Run extends Menu {

    public Run() {
    }

    public static void runStop() {

        ArrayNum.integerList = new ArrayList<>();
        while (true) {
            System.out.println("\nРаботать со списком : да - 1 / нет - 2");
            if (!Logice.choice()) {
                System.out.println("Прекращаю работать со списком !");
                break;
            } else {
                Menu.menu();
            }
        }
    }
}
