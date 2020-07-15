package Homework;

import javax.sound.midi.Soundbank;

public class RunCity {

    public static void main(String[] args) {

        // Создаем объект Сити1 через контсруктор по умолчанию и задаем ему параметры
        // через сеттеры, затем выводим информацию об объекте через геттеры

        City city1 = new City();

        city1.setName("Kiev");
        city1.setCountry("Ukraine");
        city1.setInhabitants(1500_000);

        System.out.println("City name : " + city1.getName() + " capital of " + city1.getCountry());

        // Создаем объект Сити2 через конструктор с параметрами, затем выводим информацию об объекте через геттеры

        City city2 = new City("Kharkov", "_" , "Ukraine");
        city2.setInhabitants(900_000);

        System.out.println("City name change : " + city2.getName() + "; region " + city2.getRegion() + "first capital of  " + city1.getCountry());

        // Вызываем метод переименования названия города и выводим информацию по этому городу
        // на консоль

        city1.renameCity("KIEV");

        System.out.println("City name : " + city1.getName() + " capital of " + city1.getCountry());

        // Вызываем метод определения типа города в зависимости от колличества, проживающего в нем
        // населения и выводим информацию на консоль

        System.out.print(city1.getName() + " with inhabitans " + city1.getInhabitants() + " - ");
        city1.sizeCity(city1.getInhabitants());

        System.out.print(city2.getName() + " with inhabitans " + city2.getInhabitants() + " - ");
        city1.sizeCity(city2.getInhabitants());
    }
}
