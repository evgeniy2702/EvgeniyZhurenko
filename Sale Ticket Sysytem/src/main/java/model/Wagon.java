package model;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


/**
 @author Evgeniy Zhurenko
 */

public class Wagon {

    public Integer idWagon;
    public Map<String, Integer> typeWagon ;

    public Wagon() {
    }

    public Wagon(Map<String, Integer> typeWagon) {
        this.typeWagon = typeWagon;
    }

    public Integer getIdWagon() {
        return idWagon;
    }

    public void setIdWagon(Integer idWagon) {
        this.idWagon = idWagon;
    }

    public Map<String, Integer> getTypeWagon() {
        return typeWagon;
    }

    public void setTypeWagon(Map<String, Integer> typeWagon) {
        this.typeWagon = typeWagon;
    }

    public String toString(Integer num) {
        if(!typeWagon.isEmpty() && typeWagon.containsValue(num))
            return "Тип вагона :" + typeWagon.keySet().toArray()[num-1];
        else {
            return "Вагон отсутствует";
        }
    }

    public void allTypes() {
        if (!typeWagon.isEmpty()) {
            System.out.println("Существующие типы вагонов : ");
            typeWagon.forEach((K, V) -> System.out.println("Тип вагона : " + K + "; Номер в списке : " + V));
        }
    }
}
