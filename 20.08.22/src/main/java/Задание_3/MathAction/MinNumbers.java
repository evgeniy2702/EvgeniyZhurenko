package Задание_3.MathAction;

import Задание_3.NumberList;

public class MinNumbers {

    NumberList numberList;

    public MinNumbers(NumberList numberList) {
        this.numberList = numberList;
    }

    public Integer getMin(){
        if(numberList.getListNumber() != null) {
            return numberList.getListNumber().stream().min(Integer::compareTo).get();
        }
        return 0;
    }
}
