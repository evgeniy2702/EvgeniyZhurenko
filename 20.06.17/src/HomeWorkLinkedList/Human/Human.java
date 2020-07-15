package HomeWorkLinkedList.Human;

import HomeWorkLinkedList.Penalty.Penalty;

import java.util.ArrayList;
import java.util.Objects;

public class Human {

    private String inn;
    private String name;
    private Integer age;
    private Address address;
    private Gender gender;
    private ArrayList<Penalty> penaltyList = new ArrayList<>();

    public Human(String inn, String name, Integer age, Gender gender, Address address, ArrayList<Penalty> penaltyList) {
        this.inn = inn;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.penaltyList = penaltyList;
    }

    public Human() {
    }

    public String getInn() {
        return  inn;
    }
    public String getName() {
        return name;
    }
    public Address getAddress() {
        return address;
    }
    public Integer getAge() {
        return age;
    }
    public Gender getGender(){
        return  gender;
    }
    public ArrayList<Penalty> getPenaltyList() {
        return penaltyList;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void setGender(Gender gender){
        this.gender = gender;
    }
    public void setPenaltyList(Penalty penalty) {
        this.penaltyList.add(penalty);
    }

    public <T> boolean changeDataHuman (T t) {
        boolean bool = false;
            if (t.getClass() == String.class) {
                setInn((String) t);
            }
            if (t.getClass() == Integer.class) {
                setAge((Integer) t);
            }
            if (t.getClass() == Address.class) {
                setAddress((Address) t);
            }
            if (t.getClass() == Gender.class) {
                setGender((Gender) t);
            }
        return bool;
    }

    public void changePenaltyListHuman(Penalty p1, Penalty p2) {
        if(!penaltyList.isEmpty()) {
            if(!penaltyList.contains(p2)) {
                penaltyList.remove(p1);
                penaltyList.add(p2);
            } else {
                penaltyList.remove(p1);
            }
        }
        else {
            penaltyList.add(p2);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o.getClass() != Human.class) return false;
        Human human = (Human) o;
        return inn.equals(human.inn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inn);
    }


    @Override
    public String toString() {
        return "Данные личности:" +
                "ИНН : " + inn +
                "\nФ.И.О.:'" + name +
                "\nпол: " + gender.toString() +
                "\nвозраст: " + age +
                ", адрес проживания: " + address.toString() +
                "\nштрафы : " + penaltyList.toString();
    }
}
