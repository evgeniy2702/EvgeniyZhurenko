package HomeWorkExceptions.CoffeeMachine;

public class machineMilkGroundCoffeeKind {

    static void latte() {
        machineMilkGroundCoffeeLogice.notEnoughMilk();
        int a = machineMilkGroundCoffeeLogice.choiceCorn();
        while (true) {
            switch (a) {
                case 1:
                    if (machineMilkGroundCoffeeVariables.choice == 2) {
                        if (machineMilkGroundCoffeeVariables.cornCoffee >= 22 && machineMilkGroundCoffeeVariables.water >= 30) {
                            machineMilkGroundCoffeeVariables.cornCoffee = machineMilkGroundCoffeeVariables.cornCoffee - 22;
                            machineMilkGroundCoffeeVariables.water =machineMilkGroundCoffeeVariables. water - 30;
                            machineMilkGroundCoffeeVariables.container = machineMilkGroundCoffeeVariables.container + 22;
                            System.out.println("Пожалуйста, Ваш латте!");
                            break;
                        } else {
                            if (machineMilkGroundCoffeeVariables.cornCoffee < 22) {
                                System.out.println("Недостаточно зерна для приготовления латте !");
                                machineMilkGroundCoffeeLogice.menu();
                            } else {
                                System.out.println("Недостаточно воды для приготовления латте !");
                                machineMilkGroundCoffeeLogice.menu();
                            }
                        }
                    }
                    break;
                case 2:
                    if (machineMilkGroundCoffeeVariables.choice == 2) {
                        if (machineMilkGroundCoffeeVariables.coffee >= 22 && machineMilkGroundCoffeeVariables.water >= 30) {
                            machineMilkGroundCoffeeVariables.coffee = machineMilkGroundCoffeeVariables.coffee - 22;
                            machineMilkGroundCoffeeVariables.water = machineMilkGroundCoffeeVariables.water - 30;
                            machineMilkGroundCoffeeVariables.container = machineMilkGroundCoffeeVariables.container + 22;
                            System.out.println("Пожалуйста, Ваш латте!");
                            break;
                        } else {
                            if (machineMilkGroundCoffeeVariables.coffee < 22) {
                                System.out.println("Недостаточно кофе для приготовления латте !");
                                machineMilkGroundCoffeeLogice.menu();
                            } else {
                                System.out.println("Недостаточно воды для приготовления латте !");
                                machineMilkGroundCoffeeLogice.menu();
                            }
                        }
                    }
                    break;
            }
            break;
        }
        machineMilkGroundCoffeeLogice.menu();
    }

    static void americano () {
        machineMilkGroundCoffeeLogice.notEnoughMilk();
        int a = machineMilkGroundCoffeeLogice.choiceCorn();
        while (true) {
            switch (a) {
                case 1:
                    if (machineMilkGroundCoffeeVariables.choice == 1) {
                        if (machineMilkGroundCoffeeVariables.cornCoffee >= 22 && machineMilkGroundCoffeeVariables.water >= 30) {
                            machineMilkGroundCoffeeVariables.cornCoffee = machineMilkGroundCoffeeVariables.cornCoffee - 22;
                            machineMilkGroundCoffeeVariables.water = machineMilkGroundCoffeeVariables.water - 30;
                            machineMilkGroundCoffeeVariables.container = machineMilkGroundCoffeeVariables.container + 22;
                            System.out.println("Пожалуйста, Ваш американо!");
                            break;
                        } else {
                            if (machineMilkGroundCoffeeVariables.cornCoffee < 22) {
                                System.out.println("Недостаточно зерна для приготовления американо !");
                                machineMilkGroundCoffeeLogice.menu();
                            } else {
                                System.out.println("Недостаточно воды для приготовления американо !");
                                machineMilkGroundCoffeeLogice.menu();
                            }
                        }
                    }
                    break;
                case 2:
                    if (machineMilkGroundCoffeeVariables.choice == 1) {
                        if (machineMilkGroundCoffeeVariables.coffee >= 22 && machineMilkGroundCoffeeVariables.water >= 30) {
                            machineMilkGroundCoffeeVariables.coffee = machineMilkGroundCoffeeVariables.coffee - 22;
                            machineMilkGroundCoffeeVariables.water = machineMilkGroundCoffeeVariables.water - 30;
                            machineMilkGroundCoffeeVariables.container = machineMilkGroundCoffeeVariables.container + 22;
                            System.out.println("Пожалуйста, Ваш американо!");
                            break;
                        } else {
                            if (machineMilkGroundCoffeeVariables.coffee < 22) {
                                System.out.println("Недостаточно кофе для приготовления американо !");
                                machineMilkGroundCoffeeLogice.menu();
                            } else {
                                System.out.println("Недостаточно воды для приготовления американо !");
                                machineMilkGroundCoffeeLogice.menu();
                            }
                        }
                    }
                    break;
            }
            break;
        }
        machineMilkGroundCoffeeLogice.menu();
    }

}
