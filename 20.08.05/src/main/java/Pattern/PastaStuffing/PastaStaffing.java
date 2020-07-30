package Pattern.PastaStuffing;

import Pattern.Pasta;

public class PastaStaffing implements Pasta {

    final static String TYPE_PASTA = "PASTA with STAFFING";
    static String staffing;

    @Override
    public void info() {
        System.out.println("For pasta with staffing takes : " + PastaStaffing.PASTA + "; " + PastaStaffing.staffing);
        System.out.println("Type of pasta is : " + PastaStaffing.TYPE_PASTA);
    }

    @Override
    public void addIngredient(String staffing) {
        PastaStaffing.staffing = staffing;
    }
}
