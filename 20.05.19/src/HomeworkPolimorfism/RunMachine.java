package HomeworkPolimorfism;

public class RunMachine {

    public static void main(String[] args) {

        // Создаем экземпляр кофемашины и задаем ей характеристики

        Machine coffeeMachine = new Machine();
        coffeeMachine.setName("FirstMachine");
        coffeeMachine.setMaxCoffee(1000);
        coffeeMachine.setMaxWater(2000);
        coffeeMachine.describe();

        // Описываем ситуацию по факту, что есть сейчас в кофемашине
        // по зерну, воде и отходов от помолки кофе

        coffeeMachine.setCoffee(22);
        coffeeMachine.setWater(100);
        coffeeMachine.setContainer(22);

        // Выводим описание текущей ситуации по загрузке кофемашины помолом, водой,
        // отходами после помола

        System.out.println();
        coffeeMachine.describeCurrent();

        // Включение кофемашины и проведение тех осмотра по подготовке к
        // работе. Предложение сделать кофе на выбор или отключить. Выполнение постоянного контроля
        // за загруженностью контейнеров под расходники

        System.out.println();
        coffeeMachine.menu();

        // Вывод на экран текущей ситуации по загрузке кофемашины зерном, водой и
        // отходами помола после выключения аппарата

        System.out.println();
        coffeeMachine.describeCurrent();

    }
}
