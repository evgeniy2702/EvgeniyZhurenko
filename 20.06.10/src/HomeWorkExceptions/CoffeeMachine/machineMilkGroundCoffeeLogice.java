package HomeWorkExceptions.CoffeeMachine;

import java.util.Scanner;

public class machineMilkGroundCoffeeLogice {

    static Scanner scan() {
        return new Scanner(System.in);
    }

    static void describe() {
        System.out.println("Кофемашина марки : " + machineMilkGroundCoffeeConstructorGetSet.getName());
        System.out.println("Характеристики : \nконтейнер для молотого кофе - " + machineMilkGroundCoffeeConstructorGetSet.getMaxCoffee() + " г\n"
                + "контейнер для воды - " + machineMilkGroundCoffeeConstructorGetSet.getMaxWater() + " мл\n"
                + "контейнер отходов - " + machineMilkGroundCoffeeConstructorGetSet.getMaxCoffee() + " г");
        System.out.println("контейнер для зерна - " + machineMilkGroundCoffeeConstructorGetSet.getMaxCorn() + " г");
        System.out.println("контейнер для молока - " + machineMilkGroundCoffeeConstructorGetSet.getMaxMilk() + " мл");
    }

    static void describeCurrent() {
        System.out.println("Кофемашина марки : " + machineMilkGroundCoffeeConstructorGetSet.getName());
        System.out.println("Загружено : \nконтейнер для молотого кофе - " + machineMilkGroundCoffeeConstructorGetSet.getCoffee() + " г\n"
                + "контейнер для воды - " + machineMilkGroundCoffeeConstructorGetSet.getWater() + " мл\n"
                + "контейнер отходов - " + machineMilkGroundCoffeeConstructorGetSet.getContainer() + " г");
        System.out.println("контейнер для зерна - " + machineMilkGroundCoffeeConstructorGetSet.getCornCoffee() + " г");
        System.out.println("контейнер для молока - " + machineMilkGroundCoffeeConstructorGetSet.getMilk() + " мл");
    }

    static boolean endCorn() {
        if (machineMilkGroundCoffeeConstructorGetSet.getCornCoffee() < 0) {
            System.out.println("Зерна нет. Пожалуйста добавьте зерно!");
            return true;
        } else {
            return false;
        }
    }

    synchronized static void overLoadCorn() {
        while (true) {
            Scanner scan = scan();
            scan.reset();
            if(endCorn()) {
                try {
                if (scan.hasNextInt()) {
                    machineMilkGroundCoffeeVariables.cornCoffee += scan.nextInt();
                    if (machineMilkGroundCoffeeVariables.cornCoffee >= 0 && machineMilkGroundCoffeeVariables.cornCoffee <= machineMilkGroundCoffeeVariables.maxCorn) {
                        System.out.println("Зерно - " + machineMilkGroundCoffeeConstructorGetSet.getCornCoffee());
                        break;
                    } else {
                        if (machineMilkGroundCoffeeVariables.cornCoffee > machineMilkGroundCoffeeVariables.maxCorn) {
                            System.out.println("Перебор! Уберите лишнее зерно!");
                            machineMilkGroundCoffeeVariables.cornCoffee += scan().nextInt();
                        } else {
                            System.out.println("Недостаточно! Добавьте зерно!");
                            machineMilkGroundCoffeeVariables.cornCoffee += scan().nextInt();
                        }
                    }
                } else {
                    System.out.println("Вы ввели не корректное значение зерна!! Попробуйте снова.");
                }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                System.out.println("Зерно - " + machineMilkGroundCoffeeConstructorGetSet.getCornCoffee());
                break;
            }
        }
    }

    synchronized static int choiceCorn() {

        Scanner scan = scan();
        scan.reset();
        System.out.println("Зерно или Молотый - <1> ЗЕРНО / <2> МОЛОТЫЙ");
        try {
        if(scan.hasNextInt()) {
            machineMilkGroundCoffeeVariables.cornMilling = scan.nextInt();
        } else {
            choiceCorn();
        }
        if (machineMilkGroundCoffeeVariables.cornMilling != 1 && machineMilkGroundCoffeeVariables.cornMilling != 2) {
            System.out.println("Сделайте выбор - <1> ЗЕРНО / <2> МОЛОТЫЙ");
            choiceCorn();
        }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return machineMilkGroundCoffeeVariables.cornMilling;
    }

    static boolean endCoffee () {
        if (machineMilkGroundCoffeeConstructorGetSet.getCoffee() <= machineMilkGroundCoffeeVariables.COFFEE) {
            System.out.println("Кофе нет. Пожалуйста засыпте кофе!");
            return true;
        } else {
            return false;
        }
    }

    static boolean endWater () {
        if (machineMilkGroundCoffeeConstructorGetSet.getWater() < machineMilkGroundCoffeeVariables.WATER) {
            System.out.println("Воды нет. Пожалуйста залейте воду!");
            return true;
        } else {
            return false;
        }
    }

    synchronized static void overloadEnoughCoffee() {

        while (true) {
            Scanner scan = scan();
            scan.reset();
            if (endCoffee()) {
                try {
                if (scan.hasNextInt()) {
                    machineMilkGroundCoffeeVariables.coffee += scan.nextInt();
                    if (machineMilkGroundCoffeeVariables.coffee <= machineMilkGroundCoffeeVariables.maxCoffee && machineMilkGroundCoffeeVariables.coffee >= 22) {
                        System.out.println("Помол кофе  - " + machineMilkGroundCoffeeConstructorGetSet.getCoffee());
                        break;
                    } else {
                        if (machineMilkGroundCoffeeVariables.coffee > machineMilkGroundCoffeeVariables.maxCoffee) {
                            System.out.println("Перебор! Уберите кофе!");
                            machineMilkGroundCoffeeVariables.coffee = scan.nextInt();
                        } else {
                            if (machineMilkGroundCoffeeVariables.coffee < 22) {
                                System.out.println("Недостаточно! Добавьте кофе!");
                                machineMilkGroundCoffeeVariables.coffee += scan().nextInt();
                            }
                        }
                    }
                } else {
                    System.out.println("Вы ввели не корректное значение кофе!! Попробуйте снова.");
                }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                System.out.println("Помол кофе - " + machineMilkGroundCoffeeConstructorGetSet.getCoffee());
                break;
            }
        }
    }

    synchronized static void overloadEnoughWater() {

        while (true) {
            Scanner scan = scan();
            scan.reset();
            if (endWater()) {
                try {
                   if (scan.hasNextInt()) {
                    machineMilkGroundCoffeeVariables.water += scan.nextInt();
                    if (machineMilkGroundCoffeeVariables.water <= machineMilkGroundCoffeeVariables.maxWater && machineMilkGroundCoffeeVariables.water >= 100) {
                        System.out.println("Вода - " + machineMilkGroundCoffeeConstructorGetSet.getWater());
                        break;
                    } else {
                        if (machineMilkGroundCoffeeVariables.water > machineMilkGroundCoffeeVariables.maxWater) {
                            System.out.println("Перебор! Уберите воду!");
                            machineMilkGroundCoffeeVariables.water -= scan.nextInt();
                        } else {
                            if (machineMilkGroundCoffeeVariables.water < 100) {
                                System.out.println("Недостаточно! Добавьте воду!");
                                machineMilkGroundCoffeeVariables.water += scan().nextInt();
                            }
                        }
                    }
                } else {
                    System.out.println("Вы ввели не корректно количество воды!! Попробуйте снова.");
                }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                System.out.println("Вода - " + machineMilkGroundCoffeeConstructorGetSet.getWater());
                break;
            }
        }
    }

    static void emptyContainer() {
        machineMilkGroundCoffeeVariables.container = machineMilkGroundCoffeeVariables.CONTAINER;
        System.out.println("Контейнер пустой!");
    }

    synchronized static void cleanContainer() {
        Scanner scan = scan();
        scan.reset();
        if (scan.hasNextInt()) {
            System.out.println("Контейнер полный. Пожалуйста нажмите <1>, чтобы ОЧИСТИТЬ КОНТЕЙНЕР!");
            if (scan.nextInt() == 1) {
                emptyContainer();
            } else {
                System.out.println("Повторите попытку!");
            }
        } else {
            System.out.println("Повторите попытку!");
        }
    }

    synchronized static int choice() {
        while (true) {

            Scanner scan = scan();
            try {
                if(scan.hasNextInt()) {
                    machineMilkGroundCoffeeVariables.choice = scan.nextInt();
                    switch (machineMilkGroundCoffeeVariables.choice) {
                        case 1:
                            machineMilkGroundCoffeeVariables.choice = 1;
                            break;
                        case 2:
                            machineMilkGroundCoffeeVariables.choice = 2;
                            break;
                    }
                    break;
                } else {
                    System.out.println("Попробуйте УРА!");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            }
        return machineMilkGroundCoffeeVariables.choice;
    }

    static boolean overContainer () {
        if (machineMilkGroundCoffeeVariables.container >= machineMilkGroundCoffeeVariables.maxCoffee) {
            return true;
        } else {
            return false;
        }
    }

    synchronized static int turnOnTurnOff() {
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

    synchronized static void overloadEnoughMilk() {

        while (true) {
            Scanner scan = scan();
            scan.reset();
            if (endMilk()) {
                try {
                if(scan.hasNextInt()) {
                    machineMilkGroundCoffeeVariables.milk += scan.nextInt();
                    if (machineMilkGroundCoffeeVariables.milk <= machineMilkGroundCoffeeVariables.maxMilk && machineMilkGroundCoffeeVariables.milk >= 0) {
                        System.out.println("Молоко - " + machineMilkGroundCoffeeConstructorGetSet.getMilk());
                        break;
                    } else {
                        if (machineMilkGroundCoffeeVariables.milk > machineMilkGroundCoffeeVariables.maxMilk) {
                            System.out.println("Перебор! Уберите лишнее молоко!");
                            machineMilkGroundCoffeeVariables.milk += scan.nextInt();
                        } else {
                            if (machineMilkGroundCoffeeVariables.milk <= 0) {
                                System.out.println("Недостаточно! Добавьте молока!");
                                machineMilkGroundCoffeeVariables.milk += scan.nextInt();
                            }
                        }
                    }
                }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                System.out.println("Молоко - " + machineMilkGroundCoffeeConstructorGetSet.getMilk());
                break;
            }
        }
    }

    synchronized static int run() {
        overLoadCorn();
        overloadEnoughCoffee();
        overloadEnoughWater();
        overloadEnoughMilk();
        machineMilkGroundCoffeeVariables.choice = turnOnTurnOff();
        return machineMilkGroundCoffeeVariables.choice;
    }

    static void stop () {
        System.out.println("Выключаюсь! До скорой встречи!");

    }

    synchronized static void menu() {
        if (run() == 1) {
            while (true) {
                Scanner scan = scan();
                System.out.println("Ваш выбор : 1 - американо ; 2 - лате ; 3 - выключить");
                try {
                    if(scan.hasNextInt()){
                        int choice2 = scan.nextInt();
                        if (choice2 >= 1 && choice2 <= 3) {
                            switch (choice2) {
                                case 1:
                                    machineMilkGroundCoffeeKind.americano();
                                    break;
                                case 2:
                                    machineMilkGroundCoffeeKind.latte();
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
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    static boolean endMilk() {
        if (machineMilkGroundCoffeeConstructorGetSet.getMilk() <= 0) {
            System.out.println("Молока нет. Пожалуйста долейте молоко!");
            return true;
        } else {
            return false;
        }
    }

    static void notEnoughMilk() {
        while (true) {
            Scanner scan = scan();
            if (!endMilk()) {
                System.out.println("Введите колличество молока в кофе!");
                try {
                    if(scan.hasNextInt()){
                    machineMilkGroundCoffeeVariables.milkChoiceM = scan.nextInt();
                    if (machineMilkGroundCoffeeVariables.milkChoiceM <= machineMilkGroundCoffeeVariables.milk && machineMilkGroundCoffeeVariables.milkChoiceM >= 0) {
                        machineMilkGroundCoffeeVariables.milk = machineMilkGroundCoffeeVariables.milk - machineMilkGroundCoffeeVariables.milkChoiceM;
                        break;
                    } else {
                        if (machineMilkGroundCoffeeVariables.milkChoiceM >= machineMilkGroundCoffeeVariables.milk && machineMilkGroundCoffeeVariables.milkChoiceM <= machineMilkGroundCoffeeVariables.maxMilk) {
                            System.out.println("Молока недостаточно. Пожалуйста долейте молоко!");
                            machineMilkGroundCoffeeVariables.milk += scan.nextInt();
                        }
                    }
                } else {
                        System.out.println("Вы ввели не корректное значени. Попробуйте еще раз!");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                System.out.println("Молока нет. Пожалуйста долейте молоко!");
                machineMilkGroundCoffeeVariables.milk += scan.nextInt();
            }
        }
    }

}
