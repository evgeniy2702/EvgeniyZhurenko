package HomeWorkExceptions.CoffeeMachine;

public class machineMilkGroundCoffeeConstructorGetSet {

    // Задаем конструкторы
    public machineMilkGroundCoffeeConstructorGetSet() {
    }

    public machineMilkGroundCoffeeConstructorGetSet(int maxCorn, int cornCoffee, int cornMilling, int milkChoiceM, int maxMilk, int milk) {
        machineMilkGroundCoffeeVariables.maxCorn = maxCorn;
        machineMilkGroundCoffeeVariables.cornCoffee = cornCoffee;
        machineMilkGroundCoffeeVariables.cornMilling = cornMilling;
        machineMilkGroundCoffeeVariables.milkChoiceM = milkChoiceM;
        machineMilkGroundCoffeeVariables.maxMilk = maxMilk;
        machineMilkGroundCoffeeVariables.milk = milk;
    }
// Геттеры и сеттеры

    static void setMaxCorn(int maxCorn) {
        machineMilkGroundCoffeeVariables.maxCorn = maxCorn;
    }
    static void setCornCoffee(int cornCoffee) {
        machineMilkGroundCoffeeVariables.cornCoffee = cornCoffee;
    }
    static void setMaxMilk(int maxMilk) { machineMilkGroundCoffeeVariables.maxMilk = maxMilk; }
    static void setMilk(int milk) { machineMilkGroundCoffeeVariables.milk = milk; }
    static void setName(String name) {
        machineMilkGroundCoffeeVariables.name = name;
    }
    static void setMaxCoffee(int maxCoffee) {
        machineMilkGroundCoffeeVariables.maxCoffee = maxCoffee;
    }
    static void setMaxWater(int maxWater) {
        machineMilkGroundCoffeeVariables.maxWater = maxWater;
    }
    static void setCoffee(int coffee) {
        machineMilkGroundCoffeeVariables.coffee = coffee;
    }
    static void setWater(int water) { machineMilkGroundCoffeeVariables.water = water;
    }
    static void setContainer(int container) {
        machineMilkGroundCoffeeVariables.container = container;
    }
    static void setChoice(int choice) {machineMilkGroundCoffeeVariables.choice = choice;
    }
    static void setCornMilling(int cornMilling) {
        machineMilkGroundCoffeeVariables.cornMilling = cornMilling;
    }
    static void setMilkChoiceM(int milkChoiceM) {
        machineMilkGroundCoffeeVariables.milkChoiceM = milkChoiceM;
    }

    static int getMaxCorn() {
        return machineMilkGroundCoffeeVariables.maxCorn;
    }
    static int getCornCoffee() {
        return machineMilkGroundCoffeeVariables.cornCoffee;
    }
    static int getMaxMilk() { return machineMilkGroundCoffeeVariables.maxMilk; }
    static int getMilk() { return machineMilkGroundCoffeeVariables.milk; }
    static String getName() {
        return machineMilkGroundCoffeeVariables.name;
    }
    static int getMaxCoffee() {
        return machineMilkGroundCoffeeVariables.maxCoffee;
    }
    static int getMaxWater() {
        return machineMilkGroundCoffeeVariables.maxWater;
    }
    static int getCoffee() {
        return machineMilkGroundCoffeeVariables.coffee;
    }
    static int getWater() {
        return machineMilkGroundCoffeeVariables.water;
    }
    static int getContainer() {
        return machineMilkGroundCoffeeVariables.container;
    }
    static int getChoice() {
        return machineMilkGroundCoffeeVariables.choice;
    }
    static int getCornMilling() {
        return machineMilkGroundCoffeeVariables.cornMilling;
    }
    static int getMilkChoiceM() {
        return machineMilkGroundCoffeeVariables.milkChoiceM;
    }
}
