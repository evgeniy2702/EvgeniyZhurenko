package HomeWorkLinkedList.Human;

import HomeWorkLinkedList.Penalty.Penalty;
import HomeWorkLinkedList.Penalty.TypePenalty;
import com.sun.source.doctree.SeeTree;
import org.w3c.dom.html.HTMLDOMImplementation;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BaseHuman {

    Map<Integer, Human> baseHuman = new HashMap<>();

    public Map<Integer, Human> addHuman(Integer pin, Human human) {
        baseHuman.put(pin, human);
        return baseHuman;
    }

    public boolean isEmptyBaseHuman() {
        boolean bool = false;
        if (baseHuman.isEmpty()) {
            bool = true;
        }
        return bool;
    }

    public Collection<Human> getValue() {
        return baseHuman.values();
    }

    public Human getValueHuman(Integer pin) {
        return baseHuman.get(pin);
    }

    public String getValueHuman(Human human) {
        Human h = null;
        Collection<Human> coll = baseHuman.values();
        if (coll.contains(human)) {
            Human[] hum = coll.toArray(Human[]::new);
            for (int i = 0; i < hum.length; i++) {
                if (human.equals(hum[i])) {
                    h = hum[i];
                }
            }
        }
        return h.getName();
    }

    public boolean removeHuman(Integer pin) {
        boolean bool = false;
        Collection<Integer> pins = baseHuman.keySet();
        if (pins.contains(pin)) {
            System.out.println("Из базы удален человек :" + baseHuman.get(pin).getName());
            baseHuman.remove(pin);
            bool = true;
        } else {
            System.out.println("Человека с PIN :" + pin + " не существует!");
        }
        return bool;
    }

    public boolean removeHuman(String name) {
        boolean bool = false;
        for (Map.Entry<Integer, Human> entry : baseHuman.entrySet()) {
            if (entry.getValue().getName().equalsIgnoreCase(name)) {
                System.out.println("Из базы удален человек :" + entry.getValue().getName());
                baseHuman.remove(entry);
                bool = true;
            }
        }
        if(bool == false) {
            System.out.println("Человека с ФИО: " + name + " не существует!");
        }
        return bool;
    }

    public void printBaseHumanID(Integer id) {
        System.out.println("По коду ID = " + id + " находится человек: " + baseHuman.get(id).toString());
    }

    public void printBaseHuman() {
            Collection<Human> values = baseHuman.values();
            values.stream()
                  .sorted((Comparator.comparing(Human::getName)))
                  .collect(Collectors.toList())
                  .forEach(System.out::println);
    }

    public <T> void printBaseHumanChoice(T t) {
        if(t.getClass() == City.class){
            Collection<Human> hum = new ArrayList<>(baseHuman.values());
            hum.forEach(h -> {
                if (h.getAddress().getCity().equals(t)) {
                    System.out.println(h.toString());
                }
        });
        }
        if(t.getClass() == TypePenalty.class){
            Collection<Human> hum = new ArrayList<>(baseHuman.values());
            hum.forEach(h -> {
                h.getPenaltyList().forEach(p -> {
                if(p.getTypePenalty().equals(t)) {
                    System.out.println(h.toString());
                }else {
                    System.out.println("В базе нет штрафа с признаком " + h.toString());
                }
                });
            });
        }
    }
}

