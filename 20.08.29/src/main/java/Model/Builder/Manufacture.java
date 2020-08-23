package Model.Builder;

public enum Manufacture {

    PRODUCER_1("Nike"), PRODUCER_2("Puma"),PRODUCER_3("SunYong");

    private String string;

    Manufacture(String s) {
        this.string = s;
    }

    public String getString() {
        return string;
    }
}
