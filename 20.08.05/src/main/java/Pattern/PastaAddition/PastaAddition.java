package Pattern.PastaAddition;

import Pattern.Pasta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PastaAddition implements Pasta {

    final static String TYPE_PASTA = "PASTA with ADDITION";
    static List<String> addition = new ArrayList<>();

    @Override
    public void info() {
        System.out.println("For pasta with addition takes : " + PastaAddition.PASTA + "; "
                + PastaAddition.addition);
        System.out.println("Type of pasta is : " + PastaAddition.TYPE_PASTA);
    }

    @Override
    public void addIngredient(String addition) {
        PastaAddition.addition.add(addition);
    }
}
