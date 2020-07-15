package Homework;

public class City {

//    Задание 2
// * Создайте класс «Город» (City). Необходимо хранить в по-
// * лях класса: название города (name), название региона (region), название
// * страны (country), количество жителей в городе (inhabitants), почтовый индекс
// * города (index), телефонный код города (code). Реализуйте методы клас-
// * са для ввода данных, вывода данных, реализуйте конструктор с параметром и по умолчанию.


    // Поля класса

    private String name;
    private String region;
    private String country;
    private int inhabitants;
    private int index;
    private int code;

    // Конструкторы класса

    City () {

    }

    City ( String name, String region, String country) {

        this.country = country;
        this.region = region;
        this.name = name;
    }

    City (int index, int code, int inhabitants) {

        this.index = index;
        this.code = code;
        this.inhabitants = inhabitants;
    }

    City ( String country, String region, String name, int index, int code, int inhabitants) {

        this(country, region, name);
        this.index = index;
        this.code = code;
        this.inhabitants = inhabitants;
    }

    // Сеттеры класса

    public void setCountry ( String country) { this.country = country; }
    public void setRegion ( String region) { this.region = region; }
    public void setName ( String name ) { this.name = name; }
    public void setIndex ( int index ) { this.index = index; }
    public void setCode ( int code ) { this.code = code; }
    public void setInhabitants ( int inhabitants ) { this.inhabitants = inhabitants; }

    // Геттеры класса

    public String getCountry() { return country; }
    public String getRegion() { return region; }
    public String getName() { return name; }
    public int getIndex() { return index; }
    public int getCode() { return code; }
    public int getInhabitants() { return inhabitants; }

    // Методы доступf к полям класса

    public String renameCity ( String newName) {
        this.name = newName;
        return name;
    }

    // Метод по определению типа населенного пункта

    public void sizeCity ( int inhabitants) {

        if (inhabitants > 0 && inhabitants <= 100_000) {
            System.out.println("TOWN");
        } else {
            if (inhabitants > 100_000 && inhabitants <= 1000_000) {
                System.out.println("CITY");
            } else {
                System.out.println("MEGAPOLIS");
            }
        }
    }
}
