package DAO;

import Model.FootManufacture;

import java.util.*;

public class Stock {

    Map<Integer, FootManufacture> footBuilderStock;

    public Stock() {
        this.footBuilderStock = new HashMap<>();
    }

    public void addToStock(FootManufacture footManufacture){
        if(footBuilderStock.values().stream().anyMatch(o -> o.foots.get(0).equals(footManufacture.foots.get(0)))) {
            footBuilderStock.values().stream().filter( o -> o.foots.get(0).equals(footManufacture.foots.get(0)))
                    .map(o -> o.foots.addAll(footManufacture.foots));
        }
        else {
            int numberOfPart = footBuilderStock.size() + 1;
            footBuilderStock.put(numberOfPart, footManufacture);
        }
    }

    public void getAllFootInStock(){
        if(footBuilderStock.size() != 0) {
            System.out.println("На складе имеется :\n");
            footBuilderStock.values().forEach(o -> System.out.println("Модель : " + o.foots.get(0).toString() + " в кол-ве :"
                    + o.foots.size() + " шт\n"));
        } else {
            System.out.println("На складе пока нет продукции");
        }
    }


}
