package Model.Builder;

public enum Type {
    MAN_TYPE("Мужская"), WOMEN_TYPE("Женская");

    private String string;

    Type(String s) {
        this.string = s;
    }

    public String getString() {
        return string;
    }
}
