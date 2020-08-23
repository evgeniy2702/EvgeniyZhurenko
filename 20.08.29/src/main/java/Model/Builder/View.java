package Model.Builder;

public enum View {
SNEAKERS("Кросовки"), BOOTS("Сапоги"), SANDALS("Сандали"), SHOES("Туфли");

private String string;

    View(String s) {
        this.string = s;
    }

    public String getString() {
        return string;
    }
}
