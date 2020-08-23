package Model.Builder;

public enum Color {
    RED("Красный"), BLACK("Черный"), GRAY("Серый"), BLUE("Синий");

    private String string;

    Color(String s) {
        this.string = s;
    }

    public String getString() {
        return string;
    }
}
