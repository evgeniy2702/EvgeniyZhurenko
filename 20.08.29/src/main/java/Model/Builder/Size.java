package Model.Builder;

public enum Size {
    SIZE_34("Размер 34"),SIZE_36("Размер 36"), SIZE_38("Замер 38"),SIZE_40("Размер 40"),
    SIZE_42("Размер 42"),SIZE_44("Размер 44"),SIZE_46("Размер 46");

    private String string;

    Size(String s) {
        this.string = s;
    }

    public String getString() {
        return string;
    }
}
