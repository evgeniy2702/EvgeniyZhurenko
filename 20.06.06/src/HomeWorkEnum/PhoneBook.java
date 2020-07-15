package HomeWorkEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class PhoneBook {

// Создайте приложение «Телефонная книга». Необходимо
// хранить данные об абоненте (ФИО, домашний телефон,
// рабочий телефон, мобильный телефон, дополнительная
// информация о контакте) внутри соответствующего класса.
// Наполните класс переменными, методами, конструкторами.
// Предоставьте пользователю возможность добавлять
// новых абонентов, удалять абонентов, искать абонентов
// по ФИО, показывать всех абонентов.

    static ArrayList<String[]> phoneBook;
    static String[] person;
    private static String name;
    private static String homePhone;
    private static String mobile;
    private static String workPhone;
    private static String addInfo;

    public PhoneBook() {
    }
    public PhoneBook(ArrayList<String[]> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public ArrayList<String[]> getPhoneBook() {
        return phoneBook;
    }
    public String getName() {
        return name;
    }
    public String getHomePhone() {
        return homePhone;
    }
    public String getMobile() {
        return mobile;
    }
    public String getWorkPhone() {
        return workPhone;
    }
    public String getAddInfo() {
        return addInfo;
    }
    public String[] getPerson() {
        return person;
    }

    public void setPhoneBook(ArrayList<String[]> phoneBook) {
        this.phoneBook = phoneBook;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }
    public void setAddInfo(String addInfo) {
        this.addInfo = addInfo;
    }
    public void setPerson(String[] person) {
        this.person = person;
    }

    public static boolean printChoice(){
        System.out.println("Добавить конакт : да - 1 / нет - 2");
       return Logice.choice();
    }

    public static String enterElem(){
        String elem = null;
        while (true){
            Scanner sc = new Scanner(System.in);

                if (sc.hasNextLine()) {
                    elem = sc.nextLine();
                    break;
                } else {
                    System.out.println("Повторите ввод :");
                }
        }
        return elem;
    }

    public static String[] addContact() {
        String[] pers = new String[5];
        if(printChoice()) {
            System.out.println("Введите имя :");
            name = enterElem();
            pers[0] = name;
            System.out.println("Введите домашний телефон в формате +38(011)111-11-11 :");
            while (true) {
                homePhone = enterElem();
                    if (validNum(homePhone)) {
                        pers[1] = homePhone;
                        break;
                    }
            }
            System.out.println("Введите мобильный телефон  в формате +38(011)111-11-11 :");
            while (true) {
                mobile = enterElem();
                if (validNum(mobile)) {
                    pers[2] = mobile;
                    break;
                }
            }
            System.out.println("Введите рабочий телефон  в формате +38(011)111-11-11 :");
            while (true) {
                workPhone = enterElem();
                if (validNum(workPhone)) {
                    pers[3] = workPhone;
                    break;
                }
            }
            System.out.println("Введите доп инфо :");
            addInfo = enterElem();
            pers[4] = addInfo;
        } else {
            Menu.menu();
        }
        return pers;
    }

    public static boolean validNum(String fonenumber) {

        boolean bool = false;

            final String regex = "^\\+\\d{2}([(])\\d{3}(|[)])(|[-])\\d{3}(|[-])\\d{2}(|[-])\\d{2}$";
            final String string = fonenumber;

            System.out.println(string);

            final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
            final Matcher matcher = pattern.matcher(string);

            if (matcher.find()) {
                System.out.println("Номер валидный");
                bool = true;
            } else if (fonenumber.equals("")) {
                    bool = true;
            } else {
                    System.out.println("Номер не валидный. Повторите ввод в формате : +38(011)111-11-11");
                }
    return bool;
    }

}
