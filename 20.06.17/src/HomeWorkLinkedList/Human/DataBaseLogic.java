package HomeWorkLinkedList.Human;

import HomeWorkLinkedList.Penalty.BasePenalty;
import HomeWorkLinkedList.Penalty.DescribePenalty;
import HomeWorkLinkedList.Penalty.Penalty;
import HomeWorkLinkedList.Penalty.TypePenalty;

import java.util.*;

public class DataBaseLogic {

    private BaseHuman baseHuman = new BaseHuman();
    private BasePenalty basePenalty = new BasePenalty();

    public boolean choice(int i) {
        boolean bool = false;
        if (i == 1) {
            bool = true;
        }
        return bool;
    }

    public City choiceCity() {
        City[] cites = City.values();
        System.out.println("Выбирите город : ");
        for (int j = 0; j < cites.length; j++) {
            System.out.print((j+1) + "- " + cites[j] + "; ");
        }
        while (true) {
            Scanner sc = scan();
            if (sc.hasNextInt()) {
                int i = sc.nextInt() - 1;
                if (i <= cites.length) {
                    System.out.println("Вы выбрали : " + cites[i]);
                    return cites[i];
                } else {
                    System.out.println("Выбор не корректный. Попробуйте выбрать город снова.");
                }
            } else {
                System.out.println("Выбор не корректный. Попробуйте выбрать город снова.");
            }
        }
    }

    public TypePenalty choiceType() {
        TypePenalty[] type = TypePenalty.values();
        System.out.println("Выбирите тип штрафа : ");
        for (int j = 0; j < type.length; j++) {
            System.out.print((j+1) + "- " + type[j] + "; ");
        }
        while (true) {
            Scanner sc = scan();
            if (sc.hasNextInt()) {
                int i = sc.nextInt() - 1;
                if (i <= type.length) {
                    System.out.println("Вы выбрали : " + type[i]);
                    return type[i];
                } else {
                    System.out.println("Выбор не корректный. Попробуйте выбрать тип штрафа снова.");
                }
            } else {
                System.out.println("Выбор не корректный. Попробуйте выбрать тип штрафа снова.");
            }
        }
    }
    public String choiceStreet() {
        String street = null;
        while (true) {
            Scanner sc = scan();
            if (sc.hasNextLine()) {
                street = sc.nextLine();
                break;
            } else {
                System.out.println("Вы выполнили не корректно название улицы. Попробуйте еще раз!");
            }
        }
        return street;
    }

    public String choiceNumber() {
        String number = null;
        while (true) {
            Scanner sc = scan();
            if (sc.hasNextLine()) {
                number = sc.nextLine();
                break;
            } else {
                System.out.println("Вы выполнили не корректно название улицы. Попробуйте еще раз!");
            }
        }
        return number;
    }

    public Scanner scan() {
        return new Scanner(System.in);
    }

    public void startWork() {
        while (true) {
            System.out.println("Работа с базой : ДА - 1/ НЕТ - 2");
            Scanner sc = scan();
            if (sc.hasNextInt()) {
                int i = sc.nextInt();
                if (choice(i)) {
                    workBase();
                } else {
                    System.out.println("Работу с базой прекращаю!");
                    break;
                }
            } else {
                System.out.println("Вы сделали не корректный выбор.Попробуйте еще раз." +
                        "ДА - 1/ НЕТ - 2");
            }
        }
    }

    public void workBase() {
        while (true) {
            System.out.println("Выберите задачу:" +
                    "\n1 - Добавить нового человека и информациею о нем в базу" +
                    "\n2 - Замена информации о человеке и его штрафах в базе" +
                    "\n3 - Удаление штрафа из базы" +
                    "\n4 - Добавление штрафов для уже существующей записи" +
                    "\n5 - Распечатка базы" +
                    "\n6 - Внести новый штраф в базу штрафов" +
                    "\n7 - Выйти из базы");
            Scanner sc = scan();
            if (sc.hasNextInt()) {
                int i = sc.nextInt();
                switch (i) {
                    case 1:
                        addHumanToBase();
                        break;
                    case 2:
                        changeHuman();
                        break;
                    case 3:
                        removePenaltyFromBase();
                        break;
                    case 4:
                        addPenaltyHuman();
                        break;
                    case 5:
                        printAllBase();
                        break;
                    case 6:
                        addPenaltyToBasePenalty();
                        break;
                    case 7:
                        System.out.println("Вы выходите из базы");
                        break;
                }
                break;
            } else {
                System.out.println("Ваш выбор не совпадает с предложенным. Повторите еще раз!");

            }
        }
    }

//    Удалить штраф из базы штрафов


    //1. Pаспечатка базы данных. \
    public void printAllBase() {
        System.out.println("Распечатка базы : ВСЯ - 1/ ПО ГОРОДУ - 2/ПО ТИПУ ШТРАФА - 3/ ТОЛЬКО ШТРАФЫ - 4 / ТОЛЬКО ЛЮДИ -5");
        while (true){
            Scanner sc = scan();
            if(sc.hasNextInt()){
                int i = sc.nextInt();
                switch (i) {
                    case 1:
                        baseHuman.printBaseHuman();
                        break;
                    case 2:
                        City str = choiceCity();
                        baseHuman.printBaseHumanChoice(str);
                        break;
                    case 3:
                        baseHuman.printBaseHumanChoice(choiceType());
                        break;
                    case 4:
                        basePenalty.printBase();
                        break;
                    case 5:
                        System.out.println(baseHuman.getValue().toString());
                        break;
                }
                break;
            } else {
                System.out.println("Вы сделали не корректный выбор. Повторите : ВСЯ - 1/ ПО ГОРОДУ - 2/ПО ТИПУ ШТРАФА - 3");
            }
        }

    }

    public Human createHuman() {
        return new Human();
    }

//    Внести новый штраф в базу штрафов"

    public void addPenaltyToBasePenalty(){
        Scanner sc = scan();
        System.out.println("Опишите новый штраф:");
        System.out.println("Внесите наименование штрафа :");
        String name = sc.nextLine();
        System.out.println("Внесите описание штрафа :");
        DescribePenalty describe = new DescribePenalty(sc.nextLine());
        TypePenalty type = TypePenalty.ADMINISTRATIVE_RESPONSIBILITY;
        while (true) {
            int i = 0;
            System.out.println("Присвойте тип ответственности штрафу : Админ - 1 / Уголовная - 2");
            if(sc.hasNextInt()){
                i = sc.nextInt();
                if( i>=1 && i<=2){
                    switch (i){
                        case 1:
                            type = TypePenalty.ADMINISTRATIVE_RESPONSIBILITY;
                            break;
                        case 2:
                            type = TypePenalty.CRIMINAL_RESPONSIBILITY;
                            break;
                    }
                    break;
                } else {
                    System.out.println("Попробуйте снова : Админ - 1 / Уголовная - 2");
                }
            } else {
                System.out.println("Некорректный ввод. Еще разок.");
            }

        }
        int id = 0;
        while (true) {
            System.out.println("Присвойте штрафу ID :");
            if (sc.hasNextInt()) {
                id = sc.nextInt();
                break;
            } else {
                System.out.println("Некорректный ввод. Еще разок.");
            }
        }
        basePenalty.addPenalty(id, new Penalty(name,type,describe));
    }

    //    Добавить нового человека и информациею о нем в базу
    public void addHumanToBase() {
        Human human = createHuman();
        human.setInn(addHumanInnToBase());
        human.setName(addHumanNameToBase());
        human.setAge(addHumanAgeToBase());
        human.setGender(addHumanGenderToBase());
        human.setAddress(addHumanAddressToBase());
        baseHuman.addHuman(Integer.valueOf(human.getInn()), human);
    }

    public String addHumanInnToBase() {
        String inn;
        while (true) {
            Scanner sc = scan();
            System.out.println("Введите ИНН :");
            inn = sc.nextLine();
            if (Integer.valueOf(inn).getClass() == Integer.class) {
                break;
            } else {
                System.out.println("ИНН должен содеражть только цифры.\nПопробуйте снова");
            }
        }
        return inn;
    }

    public String addHumanNameToBase() {
        String name;
        while (true) {
            Scanner sc = scan();
            System.out.println("Введите ФИО :");
            if (sc.hasNextLine()) {
                name = sc.nextLine();
                break;
            } else {
                System.out.println("Попробуйте снова ввести Ф.И.О.");
            }
        }
        return name;
    }

    public Integer addHumanAgeToBase() {
        int age;
        while (true) {
            Scanner sc = scan();
            System.out.println("Введите возраст :");
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                break;
            } else {
                System.out.println("Вы ввели не корректно возраст.\nПопробуйте снова.");
            }
        }
        return age;
    }

    public Gender addHumanGenderToBase() {
        Gender gender = Gender.WOMAN;
        while (true) {
            System.out.println("Выберите пол : М - 1/ Ж - 2");
            Scanner sc = scan();
            if (sc.hasNextInt()) {
                int i = sc.nextInt();
                switch (i) {
                    case 1:
                        gender = Gender.MAN;
                        break;
                    case 2:
                        gender = Gender.WOMAN;
                        break;
                    default:
                        System.out.println("Сделайте выбор еще раз : М - 1/ Ж - 2");
                        addHumanGenderToBase();
                        break;
                }
                break;
            } else {
                System.out.println("Попробуйте снова : М - 1/ Ж - 2");
            }
        }
        return gender;
    }

    public Address addHumanAddressToBase() {
        Address address = new Address();
        System.out.println("Введите адресс :");
        address.setCity(choiceCity());
        System.out.println("Введите улицу :");
        address.setStreet(choiceStreet());
        System.out.println("Введите номер дома: ");
        address.setNumber(choiceNumber());
        return address;
    }

//    Замена информации о человеке и его штрафах в базе

    public void changeHuman() {
        while (true) {
            System.out.println("Что будем менять : ДАННЫЕ - 1 / ШТРАФЫ - 2");
            Scanner sc = scan();
            if (sc.hasNextInt()) {
                int i = sc.nextInt();
                switch (i) {
                    case 1:
                        changePersonalInfoHuman();
                        break;
                    case 2:
                        changePersonalInfoPenalty();
                        break;
                }
                break;
            } else {
                System.out.println("Вы выполнили не корректный выбор. Попробуйте снова.");
            }
        }
    }

    public void changePersonalInfoHuman() {
        System.out.println("Изменить персональные данные : ДА - 1/ НЕТ - 2.");
        Collection<Human> base = new ArrayList<>(baseHuman.getValue());
        while (true) {
            Scanner sc = scan();
            Scanner scan = scan();
            if (sc.hasNextInt()) {
                int i = sc.nextInt();
                if (choice(i)) {
                    System.out.println("Введите ФИО человека, данные которого необходимо изменить :");
                    if (scan.hasNextLine()) {
                        String name = scan.nextLine();
                        for (Human human : base) {
                            if (human.getName().equals(name)) {
                                System.out.println("Какие данные необходимо изменить : ИНН - 1/ ФИО - 2/ ВОЗРАСТ - 3/АДРЕСС - 4/ ПОЛ - 5");
                                if (sc.hasNextInt()) {
                                    int j = sc.nextInt();
                                    switch (j) {
                                        case 1:
                                            System.out.println("Введите новый ИНН :");
                                            String inn = scan().nextLine();
                                            System.out.println("Изменяем ИНН: " + human.getInn() + " на ИНН: " + inn);
                                            human.changeDataHuman(inn);
                                            System.out.println("Получили: " + human.toString());
                                            break;
                                        case 2:
                                            System.out.println("Введите новые ФИО :");
                                            String fio = scan().nextLine();
                                            System.out.println("Изменяем ФИО: " + human.getName() + " на ФИО:" + fio);
                                            human.setName(fio);
                                            System.out.println("Получили: " + human.toString());
                                            break;
                                        case 3:
                                            while (true) {
                                                System.out.println("Введите новый возраст :");
                                                if (sc.hasNextInt()) {
                                                    Integer age = sc.nextInt();
                                                    System.out.println("Изменяем ВОЗРАСТ: " + human.getAge() + " на ВОЗРАСТ:" + age);
                                                    human.changeDataHuman(age);
                                                    break;
                                                } else {
                                                    System.out.println("Вы ввели не корректный возрастю Пробуйте снова.");
                                                }
                                            }
                                            System.out.println("Получили: " + human.toString());
                                            break;
                                        case 4:
                                            System.out.println("Введите новый адресс :");
                                            System.out.println("Изменяем адрес регистарции: " + human.getAddress() + " на :");
                                            human.changeDataHuman(addHumanAddressToBase());
                                            System.out.println("Получили: " + human.toString());
                                            break;
                                        case 5:
                                            System.out.println("Введите новый Половой признак :");
                                            System.out.println("Изменяем пол : " + human.getGender() + " на :");
                                            human.changeDataHuman(addHumanGenderToBase());
                                            System.out.println("Получили: " + human.toString());
                                            break;
                                    }
                                    break;
                                } else {
                                    System.out.println("Не попали. Пробуйте снова.");
                                }
                            } else {
                                System.out.println("Человека с ФИО: " + name + " не существует!");
                                addHumanToBase();
                                break;
                            }
                        }
                        break;
                    } else {
                        System.out.println("Не попали. Пробуйте снова.");
                    }
                }
                    else {
                    System.out.println("Выход из опции изменения данных.");
                    break;
                }
            }
        }
    }
    public void changePersonalInfoPenalty() {
        System.out.println("Изменить персональные штрафы : ДА - 1/ НЕТ - 2.");
        Collection<Human> base = new ArrayList<>(baseHuman.getValue());
            while (true) {
                Scanner sc = scan();
                Scanner scan = scan();
                if (sc.hasNextInt()) {
                    int i = sc.nextInt();
                    if (choice(i)) {
                        System.out.println("Введите ФИО человека, штрафы которого необходимо изменить :");
                        if (scan.hasNextLine()) {
                            String name = scan.nextLine();
                            for (Human human : base) {
                            if (name.equals(human.getName())) {
                                System.out.println("По данному человеку есть следующие штрафы :");
                                System.out.println(human.getPenaltyList().toString());
                                System.out.println("\nСществующая база штрафов : ");
                                basePenalty.printBase();
                                System.out.println("Введите ID штрафа, который вы хотите поменять :");
                                int id1, id2;
                                Penalty p1 = null, p2 = null;
                                if (sc.hasNextInt()) {
                                    id1 = sc.nextInt();
                                    if(basePenalty.getValuePenalty(id1) != null)
                                    p1 = basePenalty.getValuePenalty(id1);
                                    else addPenaltyToBasePenalty();
                                } else {
                                    System.out.println("Не корректный ввод ID штрафа!");
                                    break;
                                }
                                System.out.println("Введите ID штрафа, на который вы хотите поменять :");
                                if (sc.hasNextInt()) {
                                    id2 = sc.nextInt();
                                    if(basePenalty.getValuePenalty(id2) != null)
                                    p2 = basePenalty.getValuePenalty(id2);
                                    else addPenaltyToBasePenalty();
                                    p2 = p2;
                                } else {
                                    System.out.println("Не корректный ввод ID штрафа!");
                                    break;
                                }
                                human.changePenaltyListHuman(p1, p2);
                                System.out.println("После замены данные выгляжят след образом :");
                                System.out.println(human.toString());
                            } else {
                                System.out.println("Нет человека с ФИО : " + name + ". Создайте человека.");
                                addHumanToBase();
                                break;
                            }
                        }
                            break;
                    } else {
                        System.out.println(" Не корректный выбор. Повторите плиз.");
                    }
                } else {
                    System.out.println(" Не корректный выбор. Повторите пжл.");
                }
            }
        }
    }

//    Удаление штрафа из базы

    public void removePenaltyFromBase(){
        while (true) {
            Scanner sc = scan();
            System.out.println("Вы хотите удалить штраф из базы штрафов. ДА -1/ НЕТ - 2");
            if (sc.hasNextInt()) {
                int i = sc.nextInt();
                if(choice(i)){
                    System.out.println("\nСществующая база штрафов : ");
                    basePenalty.printBase();
                    System.out.println("Введите ID штрафа, который вы хотите удалить :");
                    if(sc.hasNextInt()) {
                        int id = sc.nextInt();
                        if(basePenalty.getValuePenalty(id) != null) {
                            System.out.println("Штраф с ID: " + basePenalty.getValuePenalty(id) + " удален из базы.");
                            basePenalty.remove(id);
                            System.out.println(" Теперь база штрафов выглядит так :");
                            basePenalty.printBase();
                            break;
                        } else {
                            System.out.println("Штрафа с таким ID не существует.Попробуйте еще раз");
                        }
                    } else {
                        System.out.println("Некорректный выбор ID штрафа. Повторите пжл");
                    }
                } else {
                    System.out.println("Выход из режима удаления штрафов из базы");
                    break;
                }
            } else {
                System.out.println("Повторите выбор. ДА -1/ НЕТ - 2");
            }
        }
    }

//    Добавление штрафов для уже существующей записи

    public void addPenaltyHuman() {
        Collection<Human> base = baseHuman.getValue();
        for (Human human : base) {
        while (true) {
            System.out.println("Введите ИНН человека, которому необходимо добавить штраф :");
            Scanner sc = scan();
            String inn = sc.nextLine();
                if (inn.equals(human.getInn())) {
                    System.out.println("Введите ID штрафа , который необходимо добавить человеку :");
                    basePenalty.printBase();
                    Penalty p;
                    if (sc.hasNextInt()) {
                        int id = sc.nextInt();
                        if(basePenalty.getValuePenalty(id) != null) {
                            p = basePenalty.getValuePenalty(id);
                            human.setPenaltyList(p);
                            System.out.println(human.toString());
                            break;
                        } else {
                            System.out.println("Такого ID в базе нет !!");
                            addPenaltyToBasePenalty();
                        }
                    } else {
                        System.out.println("Вы не корректно выполнили ввод ID штрафа. Повторите еще раз.");
                    }
                    break;
                }
                else {
                    System.out.println("Вы не корректно выполнили ввод ID штрафа. Повторите еще раз.");
                }
            }

        }
    }

}

