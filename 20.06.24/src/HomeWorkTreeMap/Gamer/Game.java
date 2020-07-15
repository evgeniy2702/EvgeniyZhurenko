package HomeWorkTreeMap.Gamer;


public class Game {
    String name;
    Double rating;

    public Game(String name, Double rating) {
        this.name = name;
        this.rating = rating;
    }

    public Game() {
    }

    public String getName() {
        return name;
    }
    public Double getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Игра : " +
                 name + "; " +
                "рейтинг : " + rating ;
    }

}
