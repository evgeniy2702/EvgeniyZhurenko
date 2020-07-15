package HomeworkPolimorfism;

public class RunMachineMilk {

    public static void main(String[] args) {

        // Создаем экземпляр кофемашины с молоком и задаем ей характеристики

        MachineMilk coffeeMachineMilk = new MachineMilk();

        coffeeMachineMilk.setName("FirstMilkMachine");
        coffeeMachineMilk.setMaxCoffee(1000);
        coffeeMachineMilk.setMaxWater(2000);
        coffeeMachineMilk.setMaxMilk(500);

        coffeeMachineMilk.describe();

        System.out.println();
        // Описываем ситуацию по факту, что есть сейчас в кофемашине
        // по помолу, воде и отходов от помолки кофе

        coffeeMachineMilk.setCoffee(22);
        coffeeMachineMilk.setWater(100);
        coffeeMachineMilk.setContainer(22);
        coffeeMachineMilk.setMilk(50);

        coffeeMachineMilk.describeCurrent();
        System.out.println();

        // Включение кофемашины и проведение тех осмотра по подготовке к
        // работе. Предложение сделать кофе на выбор или отключить. Выполнение постоянного контроля
        // за загруженностью контейнеров под расходники

        System.out.println();
        coffeeMachineMilk.menu();

        // Вывод на экран текущей ситуации по загрузке кофемашины зерном, водой и
        // отходами помола после выключения аппарата

        System.out.println();
        coffeeMachineMilk.describeCurrent();

    }
}
