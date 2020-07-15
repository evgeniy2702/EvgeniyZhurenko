package HomeworkPolimorfism;

import java.util.Scanner;

public class MachineMilkGroundCoffee implements CoffeeMachine {

//      Задание 3
//        После модернизации, завод начал выпускать новые кофемашины, в которые можно загружать, кроме молотого кофе,
//        еще и немолотый кофе. Машина сама мелет кофе. Размер
//        бака для немолотого кофе зависит от модели. Зерновое кофе
//        после помолки попадает в бак для молотого кофе и уже оттуда идет в приготовление.
//        Чтобы удешевить машины, маркетинговый отдел придумал сократить функции этих кофемашин.
//        Данные кофемашины умеют готовить только:
//        * американо;
//        * лате.
//        Протестировать новую кофемашину.
//        Предыдушие тесты должны быть зелеными.
//        Добавились ошибки:
//        * Отсутвует зерновое кофе.

//    Задаем поле для кофе в зернах

    protected int maxCorn;
    protected int cornCoffee;
    protected int cornMilling;
    private int milkChoiceM;
    private int maxMilk;
    private int milk;
    private String name;
    protected int maxCoffee;
    protected int maxWater;
    protected int coffee;
    protected int water;
    protected int container;
    protected int choice;

    // Задаем конструкторы
    MachineMilkGroundCoffee () {

    }

    public MachineMilkGroundCoffee(int maxCorn, int cornCoffee, int cornMilling, int milkChoiceM, int maxMilk, int milk) {
        this.maxCorn = maxCorn;
        this.cornCoffee = cornCoffee;
        this.cornMilling = cornMilling;
        this.milkChoiceM = milkChoiceM;
        this.maxMilk = maxMilk;
        this.milk = milk;
    }
// Геттеры и сеттеры

    public void setMaxCorn(int maxCorn) {
        this.maxCorn = maxCorn;
    }
    public void setCornCoffee(int cornCoffee) {
        this.cornCoffee = cornCoffee;
    }
    public void setMaxMilk(int maxMilk) { this.maxMilk = maxMilk; }
    public void setMilk(int milk) { this.milk = milk; }
    public void setName(String name) {
        this.name = name;
    }
    public void setMaxCoffee(int maxCoffee) {
        this.maxCoffee = maxCoffee;
    }
    public void setMaxWater(int maxWater) {
        this.maxWater = maxWater;
    }
    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }
    public void setWater(int water) {
        this.water = water;
    }
    public void setContainer(int container) {
        this.container = container;
    }
    public void setChoice(int choice) {
        this.choice = choice;
    }
    public void setCornMilling(int cornMilling) {
        this.cornMilling = cornMilling;
    }
    public void setMilkChoiceM(int milkChoiceM) {
        this.milkChoiceM = milkChoiceM;
    }

    public int getMaxCorn() {
        return maxCorn;
    }
    public int getCornCoffee() {
        return cornCoffee;
    }
    public int getMaxMilk() { return maxMilk; }
    public int getMilk() { return milk; }
    public String getName() {
        return name;
    }
    public int getMaxCoffee() {
        return maxCoffee;
    }
    public int getMaxWater() {
        return maxWater;
    }
    public int getCoffee() {
        return coffee;
    }
    public int getWater() {
        return water;
    }
    public int getContainer() {
        return container;
    }
    public int getChoice() {
        return choice;
    }
    public int getCornMilling() {
        return cornMilling;
    }
    public int getMilkChoiceM() {
        return milkChoiceM;
    }

    public Scanner scan() {
        return new Scanner(System.in);
    }

    @Override
    public void describe() {
        System.out.println("Кофемашина марки : " + getName());
        System.out.println("Характеристики : \nконтейнер для молотого кофе - " + getMaxCoffee() + " г\n"
                + "контейнер для воды - " + getMaxWater() + " мл\n"
                + "контейнер отходов - " + getMaxCoffee() + " г");
        System.out.println("контейнер для зерна - " + getMaxCorn() + " г");
        System.out.println("контейнер для молока - " + getMaxMilk() + " мл");
    }

    public void describeCurrent() {
        System.out.println("Кофемашина марки : " + getName());
        System.out.println("Загружено : \nконтейнер для молотого кофе - " + getCoffee() + " г\n"
                + "контейнер для воды - " + getWater() + " мл\n"
                + "контейнер отходов - " + getContainer() + " г");
        System.out.println("контейнер для зерна - " + getCornCoffee() + " г");
        System.out.println("контейнер для молока - " + getMilk() + " мл");
    }

    public boolean endCorn() {
        if (getCornCoffee() <0) {
            System.out.println("Зерна нет. Пожалуйста добавьте зерно!");
            return true;
        } else {
            return false;
        }
    }

    public void overLoadCorn() {
        while (true) {
            if(endCorn()) {
                if (scan().hasNextInt()) {
                    cornCoffee += scan().nextInt();
                    if (cornCoffee >= 0 && cornCoffee <= maxCorn) {
                        System.out.println("Зерно - " + getCornCoffee());
                        break;
                    } else {
                        if (cornCoffee > maxCorn) {
                            System.out.println("Перебор! Уберите лишнее зерно!");
                            cornCoffee += scan().nextInt();
                        } else {
                            System.out.println("Недостаточно! Добавьте зерно!");
                            cornCoffee += scan().nextInt();
                        }
                    }
                } else {
                    System.out.println("Вы ввели не корректное значение зерна!! Попробуйте снова.");
                }
                scan().close();
            } else {
                System.out.println("Зерно - " + getCornCoffee());
                break;
            }
        }
    }

    public int choiceCorn() {

        System.out.println("Зерно или Молотый - <1> ЗЕРНО / <2> МОЛОТЫЙ");
        if(scan().hasNextInt()) {
            cornMilling = scan().nextInt();
        } else {
            choiceCorn();
        }
        if (cornMilling != 1 && cornMilling != 2) {
                System.out.println("Сделайте выбор - <1> ЗЕРНО / <2> МОЛОТЫЙ");
                choiceCorn();
        }
        scan().close();
        return cornMilling;
    }

    @Override
    public boolean endCoffee () {
        if (getCoffee() <= COFFEE) {
            System.out.println("Кофе нет. Пожалуйста засыпте кофе!");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean endWater () {
        if (getWater() < WATER) {
            System.out.println("Воды нет. Пожалуйста залейте воду!");
            return true;
        } else {
            return false;
        }
    }

    public void overloadEnoughCoffee() {

        while (true) {
            if (endCoffee()) {
                if (scan().hasNextInt()) {
                    coffee += scan().nextInt();
                    if (coffee <= maxCoffee && coffee >= 22) {
                        System.out.println("Помол кофе  - " + getCoffee());
                        break;
                    } else {
                        if (coffee > maxCoffee) {
                            System.out.println("Перебор! Уберите кофе!");
                            coffee = scan().nextInt();
                        } else {
                            if (coffee < 22) {
                                System.out.println("Недостаточно! Добавьте кофе!");
                                coffee += scan().nextInt();
                            }
                        }
                    }
                } else {
                    System.out.println("Вы ввели не корректное значение кофе!! Попробуйте снова.");
                }
                scan().close();
            } else {
                System.out.println("Помол кофе - " + getCoffee());
                break;
            }
        }
    }

    public void overloadEnoughWater() {

        while (true) {
            if (endWater()) {
                if (scan().hasNextInt()) {
                    water += scan().nextInt();
                    if (water <= maxWater && water >= 100) {
                        System.out.println("Вода - " + getWater());
                        break;
                    } else {
                        if (water > maxWater) {
                            System.out.println("Перебор! Уберите воду!");
                            water -= scan().nextInt();
                        } else {
                            if (water < 100) {
                                System.out.println("Недостаточно! Добавьте воду!");
                                water += scan().nextInt();
                            }
                        }
                    }
                } else {
                    System.out.println("Вы ввели не корректно количество воды!! Попробуйте снова.");
                }
                scan().close();
            } else {
                System.out.println("Вода - " + getWater());
                break;
            }
        }
    }

    @Override
    public void emptyContainer() {
        container = CONTAINER;
        System.out.println("Контейнер пустой!");
    }

    @Override
    public void espresso() {

    }

    public void cleanContainer() {
        if (scan().hasNextInt()) {
            System.out.println("Контейнер полный. Пожалуйста нажмите <1>, чтобы ОЧИСТИТЬ КОНТЕЙНЕР!");
            if (scan().nextInt() == 1) {
                emptyContainer();
            } else {
                System.out.println("Повторите попытку!");
            }
        } else {
            System.out.println("Повторите попытку!");
        }
    }

    public int choice() {
        while (true) {
            scan().reset();
            if( scan().hasNextInt()) {
                    choice = scan().nextInt();
                    switch (choice) {
                        case 1:
                            choice = 1;
                            break;
                        case 2:
                            choice = 2;
                            break;
                    }
                    break;
            }else {
                System.out.println("Попробуйте УРА!");
            }
        }
        return choice;
    }

    public boolean overContainer () {
        if (container >= maxCoffee) {
            return true;
        } else {
            return false;
        }
    }

    synchronized public int turnOnTurnOff() {
        int i = 0;
        while (true) {
            if (overContainer()) {
                cleanContainer();
            } else {
                System.out.println("Кофемашина готова! Сделать кофе - нажмите <1>, Выключить - нажмите <2>");
                i = choice();
                break;
            }
        }
        return i;
    }

    public void overloadEnoughMilk() {

        while (true) {
            if (endMilk()) {
                if(scan().hasNextInt()) {
                    milk += scan().nextInt();
                    if (milk <= maxMilk && milk >= 0) {
                        System.out.println("Молоко - " + getMilk());
                        break;
                    } else {
                        if (milk > maxMilk) {
                            System.out.println("Перебор! Уберите лишнее молоко!");
                            milk += scan().nextInt();
                        } else {
                            if (milk <= 0) {
                                System.out.println("Недостаточно! Добавьте молока!");
                                milk += scan().nextInt();
                            }
                        }
                    }
                }
            } else {
                System.out.println("Молоко - " + getMilk());
                break;
            }
        }
    }

    @Override
    public int run() {
        overLoadCorn();
        overloadEnoughCoffee();
        overloadEnoughWater();
        overloadEnoughMilk();
        choice = turnOnTurnOff();
        return choice;
    }

    @Override
    public void stop () {
        System.out.println("Выключаюсь! До скорой встречи!");

    }

    @Override
    public void menu() {
        if (run() == 1) {
            while (true) {
                System.out.println("Ваш выбор : 1 - американо ; 2 - лате ; 3 - выключить");
                if (scan().hasNextInt()) {
                    int choice2 = scan().nextInt();
                    if (choice2 >= 1 && choice2 <= 3) {
                        switch (choice2) {
                            case 1:
                                americano();
                                break;
                            case 2:
                                latte();
                                break;
                            case 3:
                                stop();
                                break;
                        }
                        break;
                    } else {
                        System.out.println("Не корректно введено значение");
                    }
                } else {
                    System.out.println("Не корректно введено значение");
                }
            }
        }
    }

    public boolean endMilk() {
        if (getMilk() <= 0) {
            System.out.println("Молока нет. Пожалуйста долейте молоко!");
            return true;
        } else {
            return false;
        }
    }

    public void notEnoughMilk() {
        while (true) {
            if (!endMilk()) {
                System.out.println("Введите колличество молока в кофе!");
                if (scan().hasNextInt()) {
                    milkChoiceM = scan().nextInt();
                    if (milkChoiceM <= milk && milkChoiceM >= 0) {
                        milk = milk - milkChoiceM;
                        break;
                    } else {
                        if (milkChoiceM >= milk && milkChoiceM <= maxMilk) {
                            System.out.println("Молока недостаточно. Пожалуйста долейте молоко!");
                            milk += scan().nextInt();
                        }
                    }
                }
            } else {
                System.out.println("Молока нет. Пожалуйста долейте молоко!");
                milk += scan().nextInt();
            }
        }
    }

    public void latte() {
        notEnoughMilk();
        int a = choiceCorn();
        while (true) {
            switch (a) {
                case 1:
                if (choice == 2) {
                    if (cornCoffee >= 22 && water >= 30) {
                        cornCoffee = cornCoffee - 22;
                        water = water - 30;
                        container = container + 22;
                        System.out.println("Пожалуйста, Ваш латте!");
                        break;
                    } else {
                        if (cornCoffee < 22) {
                            System.out.println("Недостаточно зерна для приготовления латте !");
                            menu();
                        } else {
                            System.out.println("Недостаточно воды для приготовления латте !");
                            menu();
                        }
                    }
                }
                break;
                case 2:
                    if (choice == 2) {
                        if (coffee >= 22 && water >= 30) {
                            coffee = coffee - 22;
                            water = water - 30;
                            container = container + 22;
                            System.out.println("Пожалуйста, Ваш латте!");
                            break;
                        } else {
                            if (coffee < 22) {
                                System.out.println("Недостаточно кофе для приготовления латте !");
                                menu();
                            } else {
                                System.out.println("Недостаточно воды для приготовления латте !");
                                menu();
                            }
                        }
                    }
                    break;
            }
            break;
        }
        menu();
    }

    @Override
    public void americano () {
        notEnoughMilk();
        int a = choiceCorn();
        while (true) {
            switch (a) {
                case 1:
                    if (choice == 1) {
                        if (cornCoffee >= 22 && water >= 30) {
                            cornCoffee = cornCoffee - 22;
                            water = water - 30;
                            container = container + 22;
                            System.out.println("Пожалуйста, Ваш американо!");
                            break;
                        } else {
                            if (cornCoffee < 22) {
                                System.out.println("Недостаточно зерна для приготовления американо !");
                                menu();
                            } else {
                                System.out.println("Недостаточно воды для приготовления американо !");
                                menu();
                            }
                        }
                    }
                    break;
                case 2:
                    if (choice == 1) {
                        if (coffee >= 22 && water >= 30) {
                            coffee = coffee - 22;
                            water = water - 30;
                            container = container + 22;
                            System.out.println("Пожалуйста, Ваш американо!");
                            break;
                        } else {
                            if (coffee < 22) {
                                System.out.println("Недостаточно кофе для приготовления американо !");
                                menu();
                            } else {
                                System.out.println("Недостаточно воды для приготовления американо !");
                                menu();
                            }
                        }
                    }
                    break;
            }
            break;
        }
        menu();
    }
}