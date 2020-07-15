package HomeWorkTreeMap;

import HomeWorkTreeMap.Gamer.Game;
import HomeWorkTreeMap.Gamer.Gamer;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Logiс {

    Site gameSite = new Site();

    // метод сщздания объекта сканера
    public Scanner scan() {
        return new Scanner(System.in);
    }

    // метод выбора
    public boolean choice(int i) {
        boolean bool = false;
        if (i == 1) {
            bool = true;
        }
        return bool;
    }


    // метод запуска программы
    public void run() {
        while (true) {
            System.out.println("Зайти на сайт : ДА - 1/ НЕТ - 2");
            Scanner sc = scan();
            if (sc.hasNextInt()) {
                int i = sc.nextInt();
                if (choice(i)) {
                    workSite();
                } else {
                    System.out.println("Работу с сайтом заканчиваю!");
                    break;
                }
            } else {
                System.out.println("Вы сделали не корректный выбор.Попробуйте еще раз." +
                        "ДА - 1/ НЕТ - 2");
            }
        }
    }

    //меню сайта

    public void workSite() {

        while (true) {
            System.out.println("Выберите пункт:" +
                    "\n1 - Зарегистрироваться на сайте" +
                    "\n2 - Вывести ТОР 10 лучших игроков сайта" +
                    "\n3 - Вывести ТОР 10 лучших игроков по конкретной игре" +
                    "\n4 - Вывести все игры игроков сайта" +
                    "\n5 - Вывести рейтинг по игроку" +
                    "\n6 - Добавить рейтинг игроку" +
                    "\n7 - Выйти из базы");
            Scanner sc = scan();
            if (sc.hasNextInt()) {
                int i = sc.nextInt();
                switch (i) {
                    case 1:
                        registrationGamer();
                        break;
                    case 2:
                        topTenAll();
                        break;
                    case 3:
                        topTenGame();
                        break;
                    case 4:
                        printAllGames();
                        break;
                    case 5:
                        printRatingByGamer();
                        break;
                    case 6:
                        addRating();
                        break;
                    case 7:
                        System.out.println("Вы выходите из базы");
                        break;
                }
                break;
            } else {
                System.out.println("Ваш выбор не совпадает с предложенным. Повторите еще раз!");

            }
        }
    }

    //метод регистрации игрока на сайте
    public void registrationGamer() {
        String nikName;
        while (true) {
            System.out.println("Введите свой никнейм : ");
            Scanner sc = scan();
            if (sc.hasNextLine()) {
                nikName = sc.nextLine();
                if (gameSite.registerNewGamer(nikName)) {
                    System.out.println("Добавьте игру : ");
                    if(sc.hasNextLine()){
                        String nameGame = sc.nextLine();
                        if (gameSite.gamersData.stream().noneMatch(o->o.getGameList()
                                .stream().noneMatch(a->a.getName().equals(nameGame)))){
                            System.out.println("Введите рейтинг игрока в игре :");
                            if (sc.hasNextDouble()){
                                double rating = sc.nextDouble();
                                Game game = new Game();
                                game.setName(nameGame);
                                game.setRating(rating);
                                gameSite.gamersData.stream().filter(o-> o.getNikName().equals(nikName))
                                        .forEach(o-> o.addRatingGame(nameGame,rating));
                            } else {
                                System.out.println("Пробуйте еще раз.");
                            }
                        } else {
                            Game game = new Game();
                            game.setName(nameGame);
                            game.setRating((double) new Random().nextInt(10));
                            System.out.println("Рейтинг присвоен : " + game.getRating());
                            gameSite.gamersData.stream().filter(o->o.getNikName().equals(nikName))
                            .forEach(o-> {
                                System.out.println(o.getGameList().add(game));
                                o.averageRating();
                            });
                        }
                    } else {
                        System.out.println("Пробуйте еще раз.");
                    }
                    break;
                } else {
                    run();
                }
                break;
            } else {
                System.out.println("Вы ввели белиберду!");
                run();
            }
        }
    }

    // вывод на консоль ТОР 10 игрокок сайта согласно общего рейтинга игрока
    public void topTenAll() {
        if (gameSite.gamersData.size() != 0) {
            gameSite.printBestAllGames();
        } else {
            System.out.println("На сайте никто не зарегистрирован.");
            registrationGamer();
        }
    }
// вывод на печать ТОР 10 игроков сайта по конкретной игре

    public void topTenGame() {
        if (gameSite.gamersData.size() != 0) {
            while (true) {
                System.out.println("Введите название игры : ");
                Scanner sc = scan();
                if (sc.hasNextLine()) {
                    String name = sc.nextLine();
                    if (gameSite.chekSiteElement(name) && gameSite.gamersData.stream()
                            .anyMatch(o -> o.findGame(name)[0].getName().equals(name))) {
                        gameSite.printBestGame(name);
                        break;
                    } else {
                        System.out.println("Такой игры нет.");
                        break;
                    }
                } else {
                    System.out.println("Вы ввели белиберду!");
                    run();
                }
            }
        } else {
            System.out.println("На сайте никто не зарегистрирован.");
            registrationGamer();
        }
    }

    // вывод на печать всех игр ,которые есть на сайте

    public void printAllGames() {
        if (gameSite.gamersData.size() != 0) {
            gameSite.gameList();
        } else {
            System.out.println("На сайте не зарегистрировано ни одной игры");
        }
    }

    // метод вывода рейтинга игрок по его никнейму

    public void printRatingByGamer() {
        if (gameSite.gamersData.size() != 0) {
            while (true) {
                System.out.println("Введите никнейм игрока : ");
                Scanner sc = scan();
                if (sc.hasNextLine()) {
                    String name = sc.nextLine();
                    if (gameSite.chekSiteElement(name)) {
                        gameSite.gamersData.stream().filter(o -> o.getNikName().equals(name))
                                .forEach(o -> System.out.println("Игрок с ником : " + o.getNikName() +
                                        " имеет рейтинг по сайту : " + o.getRatingGamer()));
                        break;
                    } else {
                        System.out.println("На сайте не зарегистрирован такого никнейма.");
                        registrationGamer();
                    }
                } else {
                    System.out.println("Вы ввели белиберду!");
                    run();
                }
            }
        }
    }

    // метод добавления рейтинга игроку по кокретной игре или добавления игры и рейтинга по ней, если ее нет в списке игро
    // игрока
    public void addRating() {
        if (gameSite.gamersData.size() != 0) {
        while (true) {
            System.out.println("Введите никнейм игрока : ");
            Scanner sc = scan();
            if (sc.hasNextLine()) {
                String name = sc.nextLine();
                if (gameSite.chekSiteElement(name) && gameSite.gamersData.stream().anyMatch(o -> o.getNikName().equals(name))) {
                    System.out.println("Введите название игры : ");
                    if(sc.hasNextLine()) {
                        String gameName = sc.nextLine();
                            System.out.println("Введите рейтинг игрока в этой игре : ");
                            if (sc.hasNextDouble()) {
                                double rating = sc.nextDouble();
                                gameSite.gamersData.stream().filter(o -> o.getNikName().equals(name))
                                        .forEach(o -> o.addRatingGame(gameName, rating));
                                gameSite.gamersData.stream().filter(a->a.getNikName().equals(name))
                                        .forEach(o -> System.out.println("Игрок : " +
                                        o.getNikName() + "; общий рейтинг : " + o.getRatingGamer()
                                        + "\n список игр игрока : " + o.getGameList().toString()));
                            }
                    }
                    break;
                }
            } else {
                System.out.println("Вы ввели белиберду!");
                run();
            }
        }
    } else {
        System.out.println("На сайте никто не зарегистрирован.");
        registrationGamer();
    }
}
}

