package Задание_3.MathAction;

import Задание_3.NumberList;

public class MaxNumbers {

    NumberList numberList;

    public MaxNumbers(NumberList numberList) {
        this.numberList = numberList;
    }

    public Integer getMax() {
        if (numberList.getListNumber() != null) {
            return numberList.getListNumber().stream().max(Integer::compareTo).get();
        }
        return 0;
    }
}
