package HomeworkNasledovanie;

//Создать класс Man (человек), с полями: имя, возраст, пол и вес.
//Определить методы задания имени, возраста и веса.
//Создать производный класс Student, имеющий поле года обучения.
//Определить методы задания и увеличения(изменения) года обучения.
//У обоих классов должны быть конструкторы по умолчанию и с параметрами.
//В классе Man создайте метод show, который будет выводить на консоль информацию о человеке.
//В классе Student метод show нужно переопределить таким образом, чтоб выводилась информация про год обучения.

class Man {

    // поля класса родителя

    private String name;
    private int age;
    private int weight;

    // конструкторы класса наследника

    public Man() {
    }

    public Man(String name) {
        this.name = name;
    }

    public Man(String name, int age, int weight) {
        this(name);
        this.age = age;
        this.weight = weight;
    }

    // геттеры и сеттеры класса наследника


    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setWeight(int weight) { this.weight = weight; }

    public String getName() { return name; }
    public int getAge() { return age; }
    public int getWeight() { return weight; }

    // метод класса родителя

    public void show () {

        System.out.println("Information : ");
        System.out.println("Name - " + this.name);
        System.out.println("Age - " + this.age + " year`s old");
        System.out.println("Weight - " + this.weight + " kg");
    }
}

// Класс наследник Student

class Student extends Man {

    // поле класса наследника

    private int yearOfStudy;

    // конструкторы класса наследника

    public Student() {
    }

    public Student(String name, int yearOfStudy) {
        super(name);
        this.yearOfStudy = yearOfStudy;
    }

    public Student(String name, int age, int weight, int yearOfStudy) {
        super(name, age, weight);
        this.yearOfStudy = yearOfStudy;
    }

    // геттеры и сетторы

    public void setYearOfStudy(int yearOfStudy) { this.yearOfStudy = yearOfStudy; }

    public int getYearOfStudy() { return yearOfStudy; }

    // метод увеличения года обучения

    public int addYearOfStudy ( int addYearOfStudy) {

        yearOfStudy += addYearOfStudy;
        return yearOfStudy;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Year of study - " + this.yearOfStudy + " year`s of study");
    }
}
