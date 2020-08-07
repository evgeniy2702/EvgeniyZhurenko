package Pattern;


import Pattern.PastaAddition.PastaAdditionFactoryMethod;
import Pattern.PastaSouse.PastaSouse;
import Pattern.PastaSouse.PastaSouseFactoryMethod;
import Pattern.PastaStuffing.PastaStaffingFactoryMethod;

import java.util.Objects;


public class Run {

//    Задание 4
//    Создайте приложение для приготовления пасты.
//    Приложение должно уметь создавать минимум три вида
//    пасты. Классы различной пасты должны иметь следующие методы:
//■ Тип пасты;
//■ Соус;
//■ Начинка;
//■ Добавки.
//    Для реализации используйте порождающие паттерны.


    public Run(){};

    static PastaFactoryMethod configure(String type) {
        if (type.equalsIgnoreCase("PASTA SOUSE")) {
            return new PastaSouseFactoryMethod();
        } else if(type.equalsIgnoreCase("pasta with staffing")){
            return  new PastaStaffingFactoryMethod();
        } else if(type.equalsIgnoreCase("pasta with addition")){
            return new PastaAdditionFactoryMethod();
        } else {
            return null;
        }
    }
    public static void main(String[] args) {

        Pasta pastaSouse = Objects.requireNonNull(configure("PASTA SOUSE")).createPasta();
        pastaSouse.addIngredient("Tar Tar souse");
        pastaSouse.info();

        Pasta pastaStaffing = Objects.requireNonNull(configure("pasta with staffing")).createPasta();
        pastaStaffing.addIngredient("Mushrooms and pork");
        pastaStaffing.info();

        Pasta pastaAddition = Objects.requireNonNull(configure("pasta with addition")).createPasta();
        pastaAddition.addIngredient("Mushrooms");
        pastaAddition.addIngredient("Salt");
        pastaAddition.addIngredient("Pepper");
        pastaAddition.addIngredient("Pork meat");
        pastaAddition.info();
    }
}
