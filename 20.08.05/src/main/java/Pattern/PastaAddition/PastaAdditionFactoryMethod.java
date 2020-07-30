package Pattern.PastaAddition;

import Pattern.Pasta;
import Pattern.PastaFactoryMethod;

public class PastaAdditionFactoryMethod implements PastaFactoryMethod {

    public PastaAdditionFactoryMethod() {};
    @Override
    public Pasta createPasta() {
        return new PastaAddition();
    }
}
