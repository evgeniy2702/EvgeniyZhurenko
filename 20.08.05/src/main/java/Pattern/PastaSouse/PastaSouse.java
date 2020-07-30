package Pattern.PastaSouse;

import Pattern.Pasta;

public class PastaSouse implements Pasta {

    final static String TYPE_PASTA = "PASTA SOUSE";
    static String souse;

public PastaSouse(){};

    public PastaSouse(String souse) {
        PastaSouse.souse = souse;
    }

    public String getType() {
        return souse;
    }

    public void setSType(String souse) {
        PastaSouse.souse = souse;
    }

    @Override
    public void info() {
        System.out.println("For pasta with souse takes : " + PastaSouse.PASTA + "; " + PastaSouse.souse);
        System.out.println("Type of pasta is : " + PastaSouse.TYPE_PASTA);
    }

    @Override
    public void addIngredient(String souse) {
        PastaSouse.souse = souse;
    }
}
