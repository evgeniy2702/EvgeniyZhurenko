package Pattern.PastaSouse;

import Pattern.Pasta;
import Pattern.PastaFactoryMethod;

public class PastaSouseFactoryMethod implements PastaFactoryMethod {

    public PastaSouseFactoryMethod(){};

    @Override
    public Pasta createPasta() {
        return new PastaSouse();
    }

}
