package View;

import Controller.FootController;
import Model.Builder.*;
import Model.FootManufacture;
import Model.FootWearBuilder;

import java.nio.file.SimpleFileVisitor;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FootView {

    FootWearBuilder foot ;
    FootManufacture footManufacture;
    FootController footController = new FootController();

    public FootView() throws InterruptedException {
        startEnd();
    }

    Scanner scanner(){
        return new Scanner(System.in);
    }

    public FootWearBuilder getFoot() {
        return foot;
    }

    public void startEnd() throws InterruptedException {
        while(true){
            System.out.println("Запускаем производство :\n1. ДА\n2. НЕТ\n3. Посмотреть остатки по складу");
            Scanner scanner = scanner();
            if(scanner.hasNextInt()){
                int answer = scanner.nextInt();
                if(answer >=1 && answer <= 2){
                    switch (answer){
                        case 1:
                            stock(done(getPriceFoot()));
                            startEnd();
                        case 2:
                            break;
                        case 3:
                            footController.getAllFootStock();
                            startEnd();
                    }
                    break;
                }
                else {
                    System.out.println("Сделайте повторный выбор");
                }

            }
        }
    }

    public Type choiceType() throws InterruptedException {
        while(true){
            System.out.println("Какую обувь делаем :\n1. Мужская\n2. Женская\n3. Вернуться к предыдущему меню");
            Scanner scanner = scanner();
            if(scanner.hasNextInt()){
                int answer = scanner.nextInt();
                if(answer >=1 && answer <= 3){
                    Type[] type = Type.values();
                    if(answer != 3) {
                        System.out.println("Вы выбрали " + type[answer]);
                        return type[answer];
                    } else {
                        System.out.println("Возврат к предыдущему меню");
                        choiceType();
                    }
                }
                else {
                    System.out.println("Сделайте повторный выбор");
                }

            }
        }
    }

    public View choiceView() throws InterruptedException {
        while(true){
            System.out.println("Какую обувь делаем :\n1. Кросовки\n2. Сапоги\n3. Сандали\n4. Туфли\n5. Вернуться к предыдущему меню");
            Scanner scanner = scanner();
            if(scanner.hasNextInt()){
                int answer = scanner.nextInt();
                if(answer >=1 && answer <= 5){
                    View[] view = View.values();
                    if(answer != 5) {
                        System.out.println("Вы выбрали " + view[answer]);
                        return view[answer];
                    } else {
                        System.out.println("Возврат к предыдущему меню");
                        choiceType();
                    }
                }
                else {
                    System.out.println("Сделайте повторный выбор");
                }

            }
        }
    }

    public Color choiceColor() throws InterruptedException {
        while(true){
            System.out.println("Выбирите цвет обуви :\n1. Крысный\n2. Черый\n3. Серый\n4. Сининй\n5. Вернуться к предыдущему меню");
            Scanner scanner = scanner();
            if(scanner.hasNextInt()){
                int answer = scanner.nextInt();
                if(answer >=1 && answer <= 5){
                    Color[] color = Color.values();
                    if(answer != 5) {
                        System.out.println("Вы выбрали " + color[answer]);
                        return color[answer];
                    } else {
                        System.out.println("Возврат к предыдущему меню");
                        choiceView();
                    }
                }
                else {
                    System.out.println("Сделайте повторный выбор");
                }
            }
        }
    }

    public Size choiceSize() throws InterruptedException {
        while(true){
            System.out.println("Выбирите цвет обуви :\n1. Крысный\n2. Черый\n3. Серый\n4. Сининй\n5. Вернуться к предыдущему меню");
            Scanner scanner = scanner();
            if(scanner.hasNextInt()){
                int answer = scanner.nextInt();
                if(answer >=1 && answer <= 8){
                    Size[] sizes = Size.values();
                    if(answer != 8) {
                        System.out.println("Вы выбрали " +sizes[answer]);
                        return sizes[answer];
                    } else {
                        System.out.println("Возврат к предыдущему меню");
                        choiceColor();
                    }
                }
                else {
                    System.out.println("Сделайте повторный выбор");
                }
            }
        }
    }

    public Manufacture choiceManufacture() throws InterruptedException {
        while(true){
            System.out.println("Выбирите производителя :\n1. производитель_1\n2. производитель_2\n3. производитель_3\n4. Вернуться к предыдущему меню");
            Scanner scanner = scanner();
            if(scanner.hasNextInt()){
                int answer = scanner.nextInt();
                if(answer >=1 && answer <= 4){
                    Manufacture[] manufactures = Manufacture.values();
                    if(answer != 4) {
                        System.out.println("Вы выбрали " +manufactures[answer]);
                        return manufactures[answer];
                    } else {
                        System.out.println("Возврат к предыдущему меню");
                        choiceColor();
                    }
                }
                else {
                    System.out.println("Сделайте повторный выбор");
                }
            }
        }
    }

    public double getPriceFoot() throws InterruptedException {
        while(true){
            System.out.println("Создаем модель обуви:\n1. ДА\n2. НЕТ\n3. Вернуться к предыдущему меню");
            Scanner scanner = scanner();
            if(scanner.hasNextInt()){
                int answer = scanner.nextInt();
                if(answer >=1 && answer <= 3){
                    double price = 0;
                    Type type = choiceType();
                    View view = choiceView();
                    Color color = choiceColor();
                    Size size = choiceSize();
                    Manufacture manufacture = choiceManufacture();
                    if(answer != 3) {
                        if(type.equals(Type.MAN_TYPE)){
                            price += 2;
                            for (int i = 0; i < View.values().length; i++) {
                                if (view == (View.values()[i])) {
                                    price += (i + 1);
                                }
                            }
                            for (int j = 0; j < Color.values().length; j++) {
                                if (color == Color.values()[j]) {
                                    price += (j + 2);
                                }
                            }
                            for (int y = 0; y < Size.values().length; y++) {
                                if (size == Size.values()[y]) {
                                    price += (y + 1);
                                }
                             }
                            for (int z = 0; z < Manufacture.values().length; z++) {
                                if (manufacture == Manufacture.values()[z]) {
                                    price += (z + 1);
                                }
                            }
                        }else {
                            price += 3;
                            for (int i = 0; i < View.values().length; i++) {
                                if (view == (View.values()[i])) {
                                    price += (i + 1);
                                }
                            }
                            for (int j = 0; j < Color.values().length; j++) {
                                if (color == Color.values()[j]) {
                                    price += (j + 2);
                                }
                            }
                            for (int y = 0; y < Size.values().length; y++) {
                                if (size == Size.values()[y]) {
                                    price += (y + 1);
                                }
                            }
                            for (int z = 0; z < Manufacture.values().length; z++) {
                                if (manufacture == Manufacture.values()[z]) {
                                    price += (z + 1);
                                }
                            }
                        }
                        System.out.println("Цена изделия получилась " + price + " грн");
                        return price;
                    } else {
                        System.out.println("Возврат к предыдущему меню");
                        choiceColor();
                    }
                }
                else {
                    System.out.println("Сделайте повторный выбор");
                }
            }
        }
    }

    public FootManufacture done(double price) throws InterruptedException {
        while (true){
            System.out.println("Создаем модель обуви по расчетной цене " + price + "\n1. ДА\n2. НЕТ");
            Scanner scanner = scanner();
            if(scanner.hasNextInt()){
                int answer = scanner.nextInt();
                if(answer == 1) {
                    System.out.println("Задайте колличество производимой партии");
                    if (scanner.hasNextInt()) {
                        int numbers = scanner.nextInt();
                        footManufacture = new FootManufacture();
                        foot = createFootModel();
                        footManufacture.produceFootwear(foot, numbers);
                        System.out.println("Партия обуви " + foot.toString() + " произведена в колличестве " + numbers + " шт");
                        return footManufacture;
                    } else {
                        System.out.println("Сделайте повторный выбор");
                        done(price);
                    }
                } else if(answer == 2) {
                    getPriceFoot();
                } else {
                    System.out.println("Сделайте повторный выбор");
                    done(price);
                }
            }
        }
    }

    public FootWearBuilder createFootModel() throws InterruptedException {
        foot = new FootWearBuilder();
        foot.setType(choiceType());
        foot.setView(choiceView());
        foot.setColor(choiceColor());
        foot.setSize(choiceSize());
        foot.setManufacturer(choiceManufacture());
        foot.setPrice(getPriceFoot());
        return foot;
    }

    public boolean OTK(){
        while(true){
            System.out.println("Отгружаем партию обуви " + getFoot() + " на склад ?\n1. ДА\n2. НЕТ");
            Scanner scanner = scanner();
            if(scanner.hasNextInt()){
                int answer = scanner.nextInt();
                if(answer >=1 && answer <= 2){
                    switch (answer){
                        case 1:
                            return true;
                        case 2:

                            return false;
                    }
                }
                else {
                    System.out.println("Сделайте повторный выбор");
                }

            }
        }
    }

    public void stock(FootManufacture footManufacture){
        if(OTK()) {
            footController.addToStock(footManufacture);
        } else {
            footManufacture.foots = null;
        }
    }
}
