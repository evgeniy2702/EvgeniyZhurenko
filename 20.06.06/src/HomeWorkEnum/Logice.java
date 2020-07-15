package HomeWorkEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Logice {

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

    public static void showContactList(){
        if(PhoneBook.phoneBook.size() == 0){
            System.out.println("Список пуст !");
        } else {
            System.out.println("Список имеющихся контактов :");
            for(String[] value: PhoneBook.phoneBook) {
                System.out.println(Arrays.toString(value));
            }
        }
    }

    public static void removeContact(String[] person) {
        System.out.println("Удалить контакт ? да - 1 / нет - 2");
        if (choice()) {
            PhoneBook.phoneBook.remove(person);
            System.out.println("Контакт " + Arrays.toString(person)+ " удален");
        } else {
            System.out.println("Контакт " + Arrays.toString(person)+ " не удален");
        }

    }

    public static ArrayList<String[]> findContact() {
        ArrayList<String[]> find = new ArrayList<>();
        String contact = null;
        if(PhoneBook.phoneBook.size() != 0) {
            while (true) {
                Scanner sc = new Scanner(System.in);
                if (sc.hasNextLine()) {
                    String str = sc.nextLine();
                    for (String[] strings : PhoneBook.phoneBook) {
                        for (String s : strings) {
                            if (s.contains(str)) {
                                find.add(strings);
                                break;
                            }
                        }
                    }
                    break;
                } else {
                    System.out.println("Повторите попытку!");
                }
            }
            if (find.size() != 0) {
                System.out.println("Совпадения контактов :" );
                for (String[] value: find) {
                    System.out.println(Arrays.toString(value));
                }
            }
            else {
                find = null;
                contact = "Нет совпадений";
                System.out.println(contact);
            }
        } else {
            find = null;
            contact = "Нет совпадений";
            System.out.println(contact);
        }
        return find;
    }
}
