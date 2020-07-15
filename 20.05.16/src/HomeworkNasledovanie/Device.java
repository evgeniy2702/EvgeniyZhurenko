package HomeworkNasledovanie;

//Создать базовый класс «Устройство» и производные
//классы «Чайник», «Микроволновка», «Автомобиль»,
//«Пароход». С помощью конструктора установить имя
//каждого устройства и его характеристики.
//Реализуйте для каждого из классов методы:
//* Sound — издает звук устройства (пишем текстом в
//консоль);
//* Show — отображает название устройства;
//* Desc — отображает описание устройства.

// Создаем супперкласс Устройство

class Device {

    // поля супперкласса

    private String name;
    private String sound;

    // констуркторы супперкласса

    Device() {
    }

    public Device(String name) {
        this.name = name;
    }

    public Device(String name, String sound) {
        this(name);
        this.sound = sound;
    }

    // сеттеры и геттеры супперкласса

    public void setName(String name) { this.name = name;}
    public void setSound(String sound) { this.sound = sound; }

    public String getName() { return name;}
    public String getSound() {return sound;}

    // методы супперкласса

    public void show() {
        System.out.println("Name - " + this.name);
    }

    public void sound (){
        System.out.println("Sound - " + this.getSound());
    }

    public void describe () {
        System.out.println("Describe device : ");
        if(name != null && name !=" " && name != "") {
            this.show();
       }
        System.out.println("Sound - " + this.getSound());
    }
}

// Производный класс от класса Device

class Kettle extends Device{

    // поля класса наследника

    private int current;
    private int voltage;
    private String sound;


    // контструкторы класса наследника

    public Kettle() {
    }

    public Kettle(String name, int current, int voltage) {

        super(name);
        this.current = current;
        this.voltage = voltage;
    }

    // сеттеры и геттеры класса наследника

    public void setCurrent(int current) {
        this.current = current;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getCurrent() {
        return current;
    }

    public int getVoltage() {
        return voltage;
    }

    // переопределенные методы класса наследника

    @Override
    public void show(){
        super.show();
    }

    @Override
    public void sound(){
        super.sound();
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Current = " + this.current + " A");
        System.out.println("Voltage = " + this.voltage + " V");
        System.out.println("Power = " + power() + " V*A");
    }

    // метод класса наследника

    public int power (){
        int power = this.current * this.voltage;
        return power;
    }
}

// Класс наследник Device, структура класса см выше

class Microwave extends Device{

    private int current;
    private int voltage;
    private String sound;

    public Microwave() {
    }

    public Microwave (String name, int current, int voltage) {

        super(name);
        this.current = current;
        this.voltage = voltage;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getCurrent() {
        return current;
    }

    public int getVoltage() {
        return voltage;
    }

    @Override
    public void show(){
        super.show();
    }

    @Override
    public void sound(){
        super.sound();
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Current = " + this.current + " A");
        System.out.println("Voltage = " + this.voltage + " V");
        System.out.println("Power = " + this.power() + " V*A");
    }

    public int power (){
        int power = this.current * this.voltage;
        return power;
    }
}

// Класс наследник Device, структура класса см выше

class Car extends Device{

    private int consumption;
    private int fuel;
    private String sound;

    public Car() {
    }

    public Car(String name, int consumption, int fuel) {

        super(name);
        this.consumption = consumption;
        this.fuel = fuel;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getConsumption() {
        return consumption;
    }

    public int getFuel() {
        return fuel;
    }

    @Override
    public void sound() {
        super.sound();
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void describe() {

        super.describe();
        System.out.println("Consumption = " + this.consumption + " l/ 100km");
        System.out.println("Fuel = " + this.fuel + " l");
        System.out.println("Mileage = " + mileage() + " km");
    }

    public int mileage() {
        int mileage = this.fuel / this.consumption;
        return mileage;
    }
}

// Класс наследник Device, структура класса см выше

class Boad extends Device{

    private int consumption;
    private int fuel;
    private String sound;

    public Boad() {
    }

    public Boad (String name, int consumption, int fuel) {

        super(name);
        this.consumption = consumption;
        this.fuel = fuel;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getConsumption() {
        return consumption;
    }

    public int getFuel() {
        return fuel;
    }

    @Override
    public void sound() {
        super.sound();
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Consumption = " + this.consumption + " l/ 100km");
        System.out.println("Fuel = " + this.fuel + " l");
        System.out.println("Mileage = " + mileage() + " km");
    }

    public int mileage() {
        int mileage = this.fuel / this.consumption;
        return mileage;
    }
}
