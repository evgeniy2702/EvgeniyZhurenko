package Singletone;

public class Singleton {

    public String data;
    public static final Singleton INSTANCE = new Singleton();

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "data='" + data + '\'' +
                '}';
    }

    public static Singleton getInstance() {
        return Singleton.INSTANCE;
    }
}
