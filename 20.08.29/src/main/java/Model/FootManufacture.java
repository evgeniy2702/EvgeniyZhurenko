package Model;

import Model.FootWearBuilder;

import java.util.ArrayList;
import java.util.List;

public class FootManufacture {

    public List<FootWearBuilder> foots = new ArrayList<>();


    // Метод, который иметирует производство партии обуви заданной модели и заданное кол-во шт

    public List<FootWearBuilder> produceFootwear(FootWearBuilder footWearBuilder, int numberOfFoots) {
        for (int i = 0; i< numberOfFoots; i++){
            foots.add(footWearBuilder);
        }
        return foots;
    }
}
