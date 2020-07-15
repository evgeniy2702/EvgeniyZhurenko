package HomeWorkExceptions.CoffeeMachine;

    public class RunMachineMilkGroundCoffee {

        public static void main(String[] args) {

            // Создаем экземпляр кофемашины с зерном и задаем ей характеристики

            machineMilkGroundCoffeeConstructorGetSet.setName("SecondGroundMachine");
            machineMilkGroundCoffeeConstructorGetSet.setMaxCoffee(1000);
            machineMilkGroundCoffeeConstructorGetSet.setMaxWater(2000);
            machineMilkGroundCoffeeConstructorGetSet.setMaxMilk(500);
            machineMilkGroundCoffeeConstructorGetSet.setMaxCorn(1000);

            machineMilkGroundCoffeeLogice.describe();

            System.out.println();

            // Описываем ситуацию по факту, что есть сейчас в кофемашине
            // по зерну, помолу, воде и отходов кофе

            machineMilkGroundCoffeeConstructorGetSet.setCoffee(22);
            machineMilkGroundCoffeeConstructorGetSet.setWater(500);
            machineMilkGroundCoffeeConstructorGetSet.setContainer(22);
            machineMilkGroundCoffeeConstructorGetSet.setMilk(50);
            machineMilkGroundCoffeeConstructorGetSet.setCornCoffee(500);

            machineMilkGroundCoffeeLogice.describeCurrent();
            System.out.println();

            // Включение кофемашины и проведение тех осмотра по подготовке к
            // работе. Предложение сделать кофе на выбор или отключить. Выполнение постоянного контроля
            // за загруженностью контейнеров под расходники

            System.out.println();
            machineMilkGroundCoffeeLogice.menu();

            // Вывод на экран текущей ситуации по загрузке кофемашины зерном, водой и
            // отходами помола после выключения аппарата

            System.out.println();
            machineMilkGroundCoffeeLogice.describeCurrent();

        }
    }

