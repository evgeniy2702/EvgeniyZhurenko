package HomeworkPolimorfism;

import java.util.Scanner;

class MachineMilk extends Machine {

//    Задание 2
//После модернизации, завод начал выпускать новые кофемашины, позволяющие кроме предыдуших функций готовить капучино и лате.
//Добавилась встроенная емкость для молока, размер емкости зависит от марки кофемашины.
//Добавилась ошибка:
//* Отсутствует молоко.
//Добавились кнопки:
//* Приготовить лате;
//* Приготовить капучино.
//Количество молока, которое тратится на приготовление
//капучино и лате, задается во время приготовления. Количество потребляемого кофе и воды, как при приготовлении
//чашки эспрессо.
//Протестировать новые модели кофемашин. Все предыдушие тесты должны быть зелеными. Переиспользовать код из
//предыдушего задания.

    // Поля класса кофемашин с молоком
    private int maxMilk;
    private int milk;
    private int milkChoice;

    // Контсрукторы моделей с молоком

    MachineMilk() {

    }

    MachineMilk(String name, int maxCoffee, int maxWater, int maxContainer, int maxMilk) {
        super(name, maxCoffee, maxWater, maxContainer);
        this.maxMilk = maxMilk;
        }

    // Геттеры и сеттеры полей

    public void setMaxMilk(int maxMilk) { this.maxMilk = maxMilk; }
    public void setMilk(int milk) { this.milk = milk; }

    public int getMaxMilk() { return maxMilk; }
    public int getMilk() { return milk; }

    @Override
    public Scanner scan() {
        return super.scan();
    }

    // метод по проверке загрузки контейнера с молоком

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
            scan();
            if (!endMilk()) {
                System.out.println("Введите колличество молока в кофе!");
                if (scan().hasNextInt()) {
                    milkChoice = scan().nextInt();
                    if (milkChoice <= milk && milkChoice >= 0) {
                        milk = milk - milkChoice;
                        break;
                    } else {
                        if (milkChoice >= milk && milkChoice <= maxMilk) {
                            System.out.println("Молока недостаточно. Пожалуйста долейте молоко!");
                            milk += scan().nextInt();
                        }
                    }
                }
            } else {
                System.out.println("Молока нет. Пожалуйста долейте молоко!");
                milk += scan().nextInt();
            }
            scan().close();
        }
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

    public void latte() {
        notEnoughMilk();
        while (true) {
            if (choice == 3) {
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
                        if (water < 30) {
                            System.out.println("Недостаточно воды для приготовления латте !");
                            menu();
                        }
                    }
                }
            }
        }
        menu();
    }

    public void cappuccino() {

            notEnoughMilk();
            while (true) {
                if (choice == 4) {
                    if (coffee >= 22 && water >= 30) {
                        coffee = coffee - 22;
                        water = water - 30;
                        container = container + 22;
                        System.out.println("Пожалуйста, Ваш капучино!");
                        break;
                    } else {
                        if (coffee < 22) {
                            System.out.println("Недостаточно кофе для приготовления капучино !");
                            menu();
                        } else {
                            if (water < 30) {
                                System.out.println("Недостаточно воды для приготовления капучино !");
                                menu();
                            }
                        }
                    }
                }
            }
            menu();
        }

    @Override
    public void describe() {
        super.describe();
        System.out.println("контейнер для молока - " + getMaxMilk() + " мл");
    }

    @Override
    public void describeCurrent() {
        super.describeCurrent();
        System.out.println("контейнер для молока - " + getMilk() + " мл");
    }

    public void menu() {
        if (run() == 1) {
            while (true) {
                System.out.println("Ваш выбор : 1 - эспрессо ; 2 - американо ; 3 - лате ; 4 - капучино ; 5 - выключить");
                if (scan().hasNextInt()) {
                    choice = scan().nextInt();
                    if (choice >= 1 && choice <= 5) {
                        switch (choice) {
                            case 1:
                                super.espresso();
                                break;
                            case 2:
                                super.americano();
                                break;
                            case 3:
                                latte();
                                break;
                            case 4:
                                cappuccino();
                                break;
                            case 5:
                                stop();
                                break;
                        }
                        break;
                    } else {
                        System.out.println("Повтрите попытку от 1 до 5");
                    }
                } else {
                    System.out.println("Повтрите попытку от 1 до 5");
                }
            }
        }
    }

    @Override
    public int run() {

        overloadEnoughMilk();
        return super.run();
    }

}
