package Task_3;

public class Run {

    public static void main(String[] args) {
//3)Создайте абстрактный класс Profession с приватными полями «Имя» и «Промышленность».
//У этого класса должен быть абстрактный метод «Делать Работу».
// Создайте класс «Разработчик» с приватным полем «Специальность»,
//который наследует класс Profession и реализует абстрактный метод.
//Так же создайте класс «Пилот», с приватным полем «Тип самолета»,
//который также наследует класс Profession и реализует абстрактный метод.
// В классе Runner должны быть созданы экземпляры классов «Пилот» и «Разработчик»,
//а также экземпляр типа Profession который создает еще одного разработчика.
//Все параметры задаются в конструкторе, конструкторы классов наследников основаны на конструкторе класса родителя.
//Так же во всех классах где необходимо должны быть созданы методы для работы с параметрами и организован вывод данных (toString).

    String[] industry = { "ИТ", "Самолетостроение", "Строительство", "Маркетинг", "Транспортная авиация" };

    Pilot pilot = new Pilot("Пилот", industry[4], "Транспортный самолет Ан12");



     Developer developer1 = new Developer("Разработчик программ", industry[0], "программист");
     Developer developer2 = new Developer("Инженер", industry[1], "конструктор авиационных двигателей");
     Developer developer3 = new Developer("Строитель", industry[2], "архитектор");

        System.out.println("Записываем род занятий по той или иной професии взависимости от индустрии");
     pilot.doWork(pilot.getIndustry());
     developer1.doWork(developer1.getIndustry());
     developer2.doWork((developer2.getIndustry()));
     System.out.println();

     Profession profession = new Developer("Менеджер", industry[3], "менеджер по продвижению товаров");


     System.out.println(pilot.toString());

     System.out.println(developer2.toString());
     System.out.println(developer3.toString());

     System.out.println(profession.toString());
    }
}
