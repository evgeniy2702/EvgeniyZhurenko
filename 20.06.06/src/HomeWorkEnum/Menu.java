package HomeWorkEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    public static int menu() {
        int i = 0;

        while (true) {
            System.out.print("Меню тел книги :\n" +
                    "1 - показать список\n" +
                    "2 - добавть контакт\n" +
                    "3 - удалить контакт\n" +
                    "4 - найти контак\n");
            Scanner sc = new Scanner(System.in) ;
            if(sc.hasNextInt()){
                switch (sc.nextInt()){
                    case 1:
                        i = 1;
                        Logice.showContactList();
                        break;
                    case 2:
                        i = 2;
                        PhoneBook.person = PhoneBook.addContact();
                        System.out.println("Вы добавили контакт :" + Arrays.toString(PhoneBook.person));
                        PhoneBook.phoneBook.add(PhoneBook.person);
                        break;
                    case 3:
                        if(PhoneBook.phoneBook.size() != 0) {
                            System.out.println("Удаление контакта :");
                            i = 3;
                            ArrayList<String[]> find = Logice.findContact();
                            for (String[] value : find) {
                                Logice.removeContact(value);
                            }
                        } else {
                            System.out.println("Список пуст!");
                        }
                        break;
                    case 4:
                        i = 4;
                        if(PhoneBook.phoneBook.size() != 0) {
                            System.out.println("Найти контакт :");
                            Logice.findContact();
                            break;
                        } else {
                            System.out.println("Список пуст!");
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
