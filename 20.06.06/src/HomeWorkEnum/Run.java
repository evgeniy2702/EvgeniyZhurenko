package HomeWorkEnum;

import java.util.ArrayList;

public class Run {

    public static void runStop() {
        PhoneBook.phoneBook = new ArrayList<>();
        while (true) {
            System.out.println("Работать с телефонной книгой : да - 1 / нет - 2");
            if (!Logice.choice()) {
                System.out.println("Прекращаю работать с телефонной книгой !");
                break;
            } else {
                Menu.menu();
            }
        }
    }
}
