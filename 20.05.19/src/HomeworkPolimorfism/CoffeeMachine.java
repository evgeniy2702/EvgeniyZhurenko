package HomeworkPolimorfism;

public interface CoffeeMachine {

    // Поля интерфейса
    int COFFEE = 0;
    int WATER = 100;
    int CONTAINER = 0;

    // метод вкл аппарата

    int run();

    // метод выключения аппарата

    void stop();

    // метод вывода характеристик аппарата

    void describe();

    // метод проверки загруженности контейнера кофейным зерном

    boolean endCoffee() ;

    // метод проверки загруженности контейнера водой

    boolean endWater() ;

    // метод проверки загруженности контейнера отходами от помола зерна

    boolean overContainer();

    // метод очистки контейнера от отходов помола зерна

    void emptyContainer();

    // метод описывающий как сделать эспрессо

    void espresso();

    // метод описывающий как сделать американо

    void americano();

    // метод выбора какой кофе приготовить

    void menu();

}
