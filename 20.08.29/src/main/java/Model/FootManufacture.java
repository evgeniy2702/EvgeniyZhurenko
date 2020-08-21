package Model;

import Model.FootWearBuilder;

import java.util.ArrayList;
import java.util.List;

public class FootManufacture {

    public List<FootWearBuilder> foots = new ArrayList<>();


    public List<FootWearBuilder> produceFootwear(FootWearBuilder footWearBuilder, int numberOfFoots) {
        for (int i = 0; i< numberOfFoots; i++){
            foots.add(footWearBuilder);
        }
        return foots;
    }


}
