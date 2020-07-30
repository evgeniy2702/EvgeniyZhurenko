package Pattern.PastaStuffing;

import Pattern.Pasta;
import Pattern.PastaFactoryMethod;

public class PastaStaffingFactoryMethod implements PastaFactoryMethod {

    public PastaStaffingFactoryMethod(){};

    @Override
    public Pasta createPasta() {
        return new PastaStaffing();
    }
}
