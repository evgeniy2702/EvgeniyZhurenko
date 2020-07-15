package HomeWorkLinkedList.Penalty;

import java.util.*;


public class BasePenalty  {

    Map<Integer, Penalty> basePenalty = new HashMap<Integer, Penalty>();

    public boolean isEmptyBase() {
        boolean bool = false;
        if (basePenalty.isEmpty()) {
            bool = true;
        }
        return bool;
    }

    public void addPenalty(Integer id, Penalty penalty) {
        basePenalty.put(id, penalty);
    }

    public Penalty getValuePenalty(Integer id) {
        return basePenalty.get(id);
    }

    public void printBase() {
        Set<Integer> keySet =  basePenalty.keySet();
        for (Integer i : keySet) {
            Penalty value = basePenalty.get(i);
            System.out.println("ID : " + i.toString() + " " + value.toString());
        }
    }

    public void printBaseTypePenalty(int i) {
        Collection<Penalty> values = basePenalty.values();
        if(i == 1) {
            values.forEach(value -> {
                        if (value.getTypePenalty() == TypePenalty.ADMINISTRATIVE_RESPONSIBILITY) {
                            System.out.println(value);
                        }
                    }
            );
        }
        if(i == 2) {
            values.forEach(value -> {
                        if (value.getTypePenalty() == TypePenalty.CRIMINAL_RESPONSIBILITY) {
                            System.out.println(value);
                        }
                    }
            );
        }
    }

    public int size() {
        int i = 0;
        i = basePenalty.size();
        return i;
    }

    public boolean remove(Integer id) {
        boolean bool = false;
        if (id <= basePenalty.size()) {
            System.out.println("Из базы удален штраф :" + basePenalty.get(id).getNamePenalty());
            basePenalty.remove(id);
            bool = true;
        } else {
            System.out.println("Штрафа с ID :" + id + " не существует!");
        }
        return bool;
    }

    public Map<Integer, Penalty> replacePenalty(Integer id, Penalty penalty) {
        basePenalty.replace(id, penalty);
        return basePenalty;
    }
}
