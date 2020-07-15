package HomeWorkTreeMap;

import HomeWorkTreeMap.Gamer.Game;
import HomeWorkTreeMap.Gamer.Gamer;
import com.sun.jdi.ObjectCollectedException;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Site {

   Set<Gamer> gamersData = new TreeSet<>((Comparator.comparing(Gamer::getNikName)));

    public Site(SortedSet<Gamer> gamersData) {
        this.gamersData = gamersData;
    }

    public Site() {
    }

// метод регитсрации игрока в базе

    public boolean registerNewGamer (String nikName) {
       if(gamersData.stream().noneMatch(o -> o.getNikName().equals(nikName))){
           return gamersData.add(new Gamer(nikName));
       } else {
           System.out.println("Ник " + nikName + " уже зрегистрирован.");
           return false;
       }
   }

   // метод добавдения игрока в базу

   public void addGamer(Gamer gamer) {
        if(gamersData.contains(gamer)) {
            System.out.println("Такой игрок уже существует.");
        } else {
            gamersData.add(gamer);
        }
   }

   // метод поиска либо по имени игрока , либо по названию игры

   public <T>boolean chekSiteElement(T t) {
        boolean bool = false;
        if(t.getClass() == String.class) {
            if (gamersData.stream().anyMatch(o -> o.getGameList().stream()
                    .anyMatch(a -> a.getName().equals(t)))) {
                bool = true;
            } else {
                if (gamersData.stream().anyMatch(o -> o.getNikName().equals(t))){
                    bool = true;
                }
            }
        }
       return bool;
   }

   // метод сортировки и вывода на печать всех игр на сайте
   public void gameList () {
        ArrayList<Game> games = new ArrayList<>();
        ArrayList<String> nameList = new ArrayList<>();
       gamersData.forEach(o -> games.addAll(o.getGameList()));
       games.forEach(o-> nameList.add(o.getName()));
       nameList.stream().distinct().sorted(String::compareToIgnoreCase).forEach(System.out::println);
   }

// вывод на консоль всех игроков сайта
    public void printAllGamers() {
        System.out.println("На сайте игроков зарегистрированы игроки : ");
        gamersData.stream().sorted((o1, o2) -> o1.getNikName().compareToIgnoreCase(o2.getNikName())).forEach(System.out::println);
    }

    // вывод на консоль ТОР 10 лучших игроков согласно общего рейтинга , зарегистрированных на сайте
    public void printBestAllGames() {
        Gamer[] maxTen = gamersData.stream().sorted((o1,o2) -> o2.getRatingGamer().compareTo(o1.getRatingGamer()))
                .collect(Collectors.toCollection(LinkedHashSet::new)).toArray(Gamer[]::new);
        System.out.println("TOP 10 общий : ");
        for (int i = 0; i < 10 && i < maxTen.length; i++) {
            System.out.println(maxTen[i].getNikName() + " " + maxTen[i].getRatingGamer());
        }
    }

    // метод вывода на печать ТОР 10 игроков по конкретной игре согласно
    // их рейтингу в этой игре

    public void printBestGame(String gameName) {
        Gamer[] gameList = gamersData.stream()
                .filter(o -> o.getGameList().stream().anyMatch(a-> a.getName().equals(gameName)))
                .collect(Collectors.toCollection(LinkedHashSet::new)).toArray(Gamer[]::new);
        System.out.println("TOP 10 по игре : " + gameName);
        Arrays.stream(gameList)
                .sorted((o1,o2)->o2.findGame(gameName)[0].getRating().compareTo(o1.findGame(gameName)[0].getRating()))
                .forEach(o -> System.out.println("Никнейм игрока : " + o.getNikName() + "; рейтинг игрока : "
                         + o.findGame(gameName)[0].getRating()));
    }
}
