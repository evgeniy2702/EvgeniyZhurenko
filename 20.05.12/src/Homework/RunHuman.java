package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class RunHuman {

    public static void main(String[] args) {


        // Мужчина ФИО, др, телефон, полный адресс

        Human humanMan = new Human();
        humanMan.setFirstName("Ivanov");
        humanMan.setSecondName("Ivan");
        humanMan.setDataOfBirth("01.01.1950");
        humanMan.setPhone("067 222 10 22");

        humanMan.setCity("Kiev");
        humanMan.setCountry("Ukraine");
        humanMan.setAddress("Hreschatik street, 21");

        System.out.println("Human : FirstName " + humanMan.getFirstName() + "; Second Name " + humanMan.getSecondName()
                + "; Date of birth " + humanMan.getDateOfBirth() + "; Phone " + humanMan.getPhone());

        System.out.println("Address : Country " + humanMan.getCountry() + "; City " + humanMan.getCity()
                            + "; Address " + humanMan.getAddress());
        System.out.println();

        //Женщина ФИО, др, телефон

        Human humanWoman = new Human("Petrova", "Nadezhda", "02.02.1952", "067 111 20 11");
        System.out.println("Human : FirstName " + humanWoman.getFirstName() + "; Second Name " + humanWoman.getSecondName()
                + "; Date of birth " + humanWoman.getDateOfBirth() + "; Phone " + humanWoman.getPhone());
        System.out.println();

        //Ребенок ФИО, др, телефон, полный адресс

        Human humanChild = new Human("Ivanov", "Sergey", "03.03.2013","null","Kiev",
                "Ukraine","Hreschatik street, 1");
        System.out.println("Human : FirstName " + humanMan.getFirstName() + "; Second Name " + humanMan.getSecondName()
                + "; Date of birth " + humanMan.getDateOfBirth() + "; Phone " + humanMan.getPhone());
        System.out.println("Address : Country " + humanMan.getCountry() + "; City " + humanMan.getCity()
                + "; Address " + humanMan.getAddress());
        System.out.println();

        // Смена номера телефона мужчины и номера телефона и фамилии женщины

        System.out.println("Insert phone num for change : ");
        String numPhoneMan = humanMan.changePhone();
        humanMan.setPhone(numPhoneMan);
        System.out.println("After change of phone Human : FirstName " + humanMan.getFirstName() + "; Date of birth " + humanMan.getDateOfBirth()
                + "; Phone " + humanMan.getPhone());

        System.out.println("Insert phone num for change and Full name : ");
        String numPhoneWoman = humanWoman.changePhone();
        String newFullName = humanWoman.marrige();
        humanWoman.setFirstName(newFullName);
        humanWoman.setPhone(numPhoneWoman);

        System.out.println("Affter marrige and change of phone : First name " + humanWoman.getFirstName() + "; Date of birth "
                + humanWoman.getDateOfBirth() + "; Phone " + humanWoman.getPhone() );
    }
}

