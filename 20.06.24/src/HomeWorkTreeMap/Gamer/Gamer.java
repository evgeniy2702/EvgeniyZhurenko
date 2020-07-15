package HomeWorkTreeMap.Gamer;

import java.util.*;
import java.util.stream.Collectors;

public class Gamer {

    private String nikName;
    private ArrayList<Game> gameList = new ArrayList<>();
    private Double ratingGamer;

    public Gamer(String nikName, ArrayList<Game> gameList) {
        this.nikName = nikName;
        this.gameList = gameList;
    }
    public Gamer(String nikName) {
        this.nikName = nikName;
    }
    public Gamer() {
    }

    public String getNikName() {
        return nikName;
    }
    public List<Game> getGameList() {
        return gameList;
    }
    public Double getRatingGamer() {
        return ratingGamer;
    }


    public void setNikName(String nikName) {
        this.nikName = nikName;
    }
    public void setGameList(ArrayList<Game> gameList) {
        this.gameList = gameList;
    }
    public void setRatingGamer(Double ratingGamer) {
        this.ratingGamer = ratingGamer;
    }

//    метод добавления рейтинга игроку по Никнейму

    public void addRatingGame(String gameName, Double rat) {
        if (gameList.stream().anyMatch(o -> o.getName().equals(gameName))) {
            gameList.stream().filter(o -> o.getName().equals(gameName))
                    .forEach(a-> a.rating = (a.rating + rat)/2);
            averageRating();
        } else {
            Game game = new Game();
            game.setName(gameName);
            game.setRating(rat);
            averageRating();
            gameList.add(game);
        }
    }

    // метод подсчета общего рейтинга игрока по всем его играм

    public Double averageRating() {
        if(gameList.size() != 0) {
            ratingGamer = 0.0;
            gameList.forEach(o -> ratingGamer = ratingGamer +  o.getRating());
            return ratingGamer = ratingGamer / gameList.size();
        } else {
            return ratingGamer = 0.0;
        }
    }

    // метод сортировки игр игрока
    public void sortedGameList () {
         gameList = gameList.stream()
                .sorted((o1,o2) -> String.valueOf(o1.getName().charAt(0)).compareToIgnoreCase(String.valueOf(o2.getName().charAt(0))))
                .collect(Collectors.toCollection(ArrayList::new));
        new Gamer();
    }

    // метод поиска игры в списке игрока по названию игры

    public Game[] findGame (String gameName) {
        if (gameList.stream().anyMatch(o -> o.getName().equals(gameName))) {
            return  gameList.stream().filter(o -> o.getName().equals(gameName)).toArray(Game[]::new);
        }
        else return new Game[]{null};
     }

    @Override
    public String toString() {
        return "Игрок : " +
                "НикНейм :" + nikName + "; средний рейтинг : " + averageRating() +
                "\nсписок игр, в которые играет : " + gameList.toString();
    }
}
