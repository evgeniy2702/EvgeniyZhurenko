package Homework;

import java.util.Arrays;
import java.util.Scanner;

class Human {
//  Задание 1
//  Создайте класс «Человек» (Human). Необходимо хранить
//  в полях класса: ФИО (fullName), дату рождения (String dateOfBirth), контактный теле-
//  фон (phone), город (city), страну (country), домашний адрес (address).
//  Реализуйте методы класса для ввода данных, вывода данных, реализуйте
//  доступ к отдельным полям через методы класса, конструктор с параметрами
//  и по умолчанию


    // Поля класса
    private String firstName;
    private String secondName;
    private String dateOfBirth;
    private String phone;
    private String city;
    private String country;
    private String address;

// Конструкторы класса по умолчанию и с параметрами

    Human () {

    }

    Human ( String firstName, String secondName, String dateOfBirth, String phone) {

        this.firstName = firstName;
        this.secondName = secondName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    Human (String firstName, String secondName, String dateOfBirth, String phone, String city, String country, String address) {

        this(firstName, secondName, dateOfBirth, phone);
        this.city = city;
        this.country = country;
        this.address = address;
    }

// Геттеры класса

    public String getFirstName () { return firstName; }

    public String getSecondName () {
        return secondName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity (){ return city;}

    public String getCountry() { return country; }

    public String getAddress() { return address; }

// Сеттеры класса

    public void setFirstName (String firstName) { this.firstName = firstName;}

    public void setSecondName (String secondName) { this.secondName = secondName;}

    public void setDataOfBirth (String dateOfBirth) { this.dateOfBirth = dateOfBirth;}

    public void setPhone (String phone) { this.phone = phone;}

    public void setCity (String city) { this.city = city; }

    public void setCountry (String country) { this.country = country; }

    public void setAddress (String address) { this.address = address; }

// Методы доступа к полям класса
    public String marrige () {

        Scanner scanner = new Scanner(System.in);
        String newFirstName = scanner.nextLine();
        return newFirstName;
    }

    public String changePhone (){

        Scanner scanner = new Scanner(System.in);
        String newPhone = scanner.nextLine();
        return newPhone;
    }
}

