package HomeWorkLinkedList;

import HomeWorkLinkedList.Human.*;
import HomeWorkLinkedList.Penalty.BasePenalty;
import HomeWorkLinkedList.Penalty.Penalty;
import HomeWorkLinkedList.Penalty.DescribePenalty;
import HomeWorkLinkedList.Penalty.TypePenalty;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class Run {

    public static void main(String[] args) {
	// Задание 3
        //Реализовать базу данных налоговой инспекции по
        //штрафам. Идентифицировать конкретного человека будет его персональный идентификационный код. У одного
        //человека может быть много штрафов.
        //Реализовать:
        //1. Полная распечатка базы данных. \
        //2. Распечатка данных по конкретному коду. \
        //3. Распечатка данных по конкретному типу штрафа.\
        //4. Распечатка данных по конкретному городу.\
        //5. Добавление нового человека с информацией о нем.\
        //6. Добавление новых штрафов для уже существующей \
        //записи.
        //7. Удаление штрафа.\
        //8. Замена информации о человеке и его штрафах.\

        DataBaseLogic dataBaseLogic = new DataBaseLogic();
        dataBaseLogic.startWork();

//
//        Penalty penalty2 = new Penalty( "pen2", TypePenalty.CRIMINAL_RESPONSIBILITY,new DescribePenalty("admin2"));
//        Penalty penalty4 =  new Penalty("pen4", TypePenalty.CRIMINAL_RESPONSIBILITY, new DescribePenalty("admin4"));
//        Penalty penalty3 = new Penalty("pen3",TypePenalty.ADMINISTRATIVE_RESPONSIBILITY,new DescribePenalty("admin3"));
//        Penalty penalty1 = new Penalty("pen1",TypePenalty.ADMINISTRATIVE_RESPONSIBILITY,new DescribePenalty("admin1"));
//
//        BasePenalty base = new BasePenalty();
//        base.addPenalty (1, penalty1);
//        base.addPenalty (2, penalty2);
//        base.addPenalty (3, penalty3);
//        base.addPenalty (4, penalty4);
//
//        base.printBase();
//
//        ArrayList<Penalty> pen1 = new ArrayList<>();
//        pen1.add(penalty1);
//        pen1.add(penalty4);
//
//        ArrayList<Penalty> pen2 = new ArrayList<>();
//        pen2.add(penalty3);
//
//        ArrayList<Penalty> pen3 = new ArrayList<>();
//        pen3.add(penalty2);
//
//        ArrayList<Penalty> pen4 = new ArrayList<>();
//
//        Address address1 = new Address("City1","Street1", "1");
//        Address address2 = new Address("City2","Street2", "2");
//        Address address3 = new Address("City3","Street3", "3");
//
//        Human human1 = new Human("FIO 1", 22, Gender.MAN,address1, pen1);
//        Human human4 = new Human("FIO 4", 34, Gender.WOMAN,address3, pen4);
//        Human human2 = new Human("FIO 2", 42, Gender.WOMAN,address2, pen2);
//        Human human3 = new Human("FIO 3", 35, Gender.MAN, address3, pen3);
//
//        human1.changeDataHuman("FIO 1", 55);
//        System.out.println(human1.toString());
//        System.out.println();
//        human1.changeDataHuman("FIO 1", Gender.WOMAN);
//        System.out.println(human1.toString());
//        System.out.println();
//        human1.changeDataHuman("FIO 4", 46);
//        System.out.println(human1.toString());
//        System.out.println();
//        human1.changeDataHuman("FIO 1", address2);
//        System.out.println(human1.toString());
//        System.out.println();
//        human1.changePenaltyListHuman(penalty1,penalty4);
//        System.out.println(human1.toString());
//
//
//        BaseHuman baseHuman = new BaseHuman();
//        baseHuman.addHuman(111, human1);
//        baseHuman.addHuman(112, human2);
//        baseHuman.addHuman(113, human3);
//        baseHuman.addHuman(110, human4);
//
////        baseHuman.printBaseHuman();
////        System.out.println();
////
////        baseHuman.removeHuman("FIO 5");
////        baseHuman.removeHuman(110);
////        baseHuman.removeHuman(115);
////        System.out.println();
////
////       baseHuman.printBaseHumanID(111);
////        System.out.println();
//
////        baseHuman.printBaseHumanChoice("City1");
////        System.out.println();
////
////        baseHuman.printBaseHumanChoice(TypePenalty.ADMINISTRATIVE_RESPONSIBILITY);
//
//
//
//
////        TreeMap<Integer,Penalty> tree = new TreeMap<>();
////        tree = base.TreeBase();
////        Collection<TypePenalty> cods = tree.values();
////        cods.forEach(value -> {
////            System.out.println(value);
////        });
    }
}
