package Задание_3.MathAction;

import Задание_3.NumberList;

import java.util.List;

public class AddNumbers {

    NumberList numberList;

    public AddNumbers(NumberList numberList) {
        this.numberList = numberList;
    }

    public Integer getAdd(){
        if(numberList.getListNumber() != null) {
            return numberList.getListNumber().stream().reduce((sum, num) -> sum += num).get();
        }
        return 0;
    }
}
