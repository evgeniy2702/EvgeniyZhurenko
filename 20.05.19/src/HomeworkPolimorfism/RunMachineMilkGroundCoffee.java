package HomeworkPolimorfism;

public class RunMachineMilkGroundCoffee {

    public static void main(String[] args) {

        // Создаем экземпляр кофемашины с зерном и задаем ей характеристики

        MachineMilkGroundCoffee coffeeMachineMilkGround = new MachineMilkGroundCoffee();

        coffeeMachineMilkGround.setName("SecondGroundMachine");
        coffeeMachineMilkGround.setMaxCoffee(1000);
        coffeeMachineMilkGround.setMaxWater(2000);
        coffeeMachineMilkGround.setMaxMilk(500);
        coffeeMachineMilkGround.setMaxCorn(1000);

        coffeeMachineMilkGround.describe();

        System.out.println();

        // Описываем ситуацию по факту, что есть сейчас в кофемашине
        // по зерну, помолу, воде и отходов кофе

        coffeeMachineMilkGround.setCoffee(22);
        coffeeMachineMilkGround.setWater(500);
        coffeeMachineMilkGround.setContainer(22);
        coffeeMachineMilkGround.setMilk(50);
        coffeeMachineMilkGround.setCornCoffee(500);

        coffeeMachineMilkGround.describeCurrent();
        System.out.println();

        // Включение кофемашины и проведение тех осмотра по подготовке к
        // работе. Предложение сделать кофе на выбор или отключить. Выполнение постоянного контроля
        // за загруженностью контейнеров под расходники

        System.out.println();
        coffeeMachineMilkGround.menu();

        // Вывод на экран текущей ситуации по загрузке кофемашины зерном, водой и
        // отходами помола после выключения аппарата

        System.out.println();
        coffeeMachineMilkGround.describeCurrent();

    }
}
