package HW_Generic.ArrayGeneric;

import com.sun.source.tree.WhileLoopTree;

import java.lang.reflect.Array;
import java.net.SecureCacheResponse;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.lang.Integer;
import java.util.Random;
import java.util.Scanner;

class ArrayIs <T extends Comparable<T>> {

//    Создайте шаблонный класс Array, который представляет собой массив, позволяющий хранить объекты
//  заданного типа. Необходимо реализовать:
//* заполнение массива с клавиатуры;
//* заполнение массива случайными числами;
//* отображение массива;
//* поиск максимального значения;
//* поиск минимального значения;
//* подсчет среднеарифметического значения;
//* сортировка массива по возрастанию;
//* сортировка массива по убыванию;
//* поиск значения в массиве, используя бинарный поиск;
//* замена значения в массиве на новое значение.

    T[] mas;


    public ArrayIs() {
    }

    public ArrayIs(T[] mas) {
        this.mas = mas;
    }

    public void maxOfArray(T[] mas) {
        T max = mas[0];
        for (T value : mas) {
            if (max.compareTo(value) < 0) {
                max = value;
            }
        }
        System.out.println("Максимальный элемент массива : " + max);
    }

    public void minOfArray(T[] mas) {
        T min = mas[0];
        for (T value : mas) {
            if (min.compareTo(value) > 0) {
                min = value;
            }
        }
        System.out.println("Минимальный элемент массива : " + min);
    }

    public <T> void sortHi(T[] mas) {
        Arrays.sort(mas);
        System.out.println("Массив отсортированный по возрастаанию : " + Arrays.toString(mas));
    }

    public <T> void sortLow(T[] mas) {
        Arrays.sort(mas);
        T num;
        for (int i = 0; i < mas.length / 2; i++) {
            num = mas[i];
            mas[i] = mas[mas.length - i - 1];
            mas[mas.length - i - 1] = num;
        }
        System.out.println("Массив отсортированный по убыванию: " + Arrays.toString(mas));
    }

    public void binary(T[] mas, T a) {
        int num = 0;
        int index = 0;
        Arrays.sort(mas);
        for (T value : mas) {
            if (a.equals(value)) {
                index = 1;
                num += 1;
            }
        }
        if (index == 1) {
            System.out.println("Индекс заданной переменной а = " + a + " будет равно :" + Arrays.binarySearch(mas, a));
            System.out.println("Всего совпадений : " + num);
        } else {
            System.out.println("Значение переменной а = " + a + " в нашем массиве отсутствует");
        }
    }

    public Double meanArithmetic(T[] mas, Class<T> clazz) {
        Double sumMeanArith = 0.0;
        if (clazz == Integer.class) {
            for (T value : mas) {
                sumMeanArith += (Integer) value;
            }
            sumMeanArith = sumMeanArith / mas.length;
        }
        if (clazz == Double.class) {
            for (T value : mas) {
                sumMeanArith += (Double) value;
            }
            sumMeanArith = sumMeanArith / mas.length;
        }
        if (clazz == String.class) {
            System.out.println("Массив типа String, среднее арифметическое не считается");
        }
        return sumMeanArith;
    }

    public T[] getMas() {
        return mas;
    }

    public void setMas(T[] mas) {
        this.mas = mas;
    }

    public T[] keyBoard(Scanner in, Class<T> clazz) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива : ");
        int size = choiceLengthMas();
        T[] arr = (T[]) java.lang.reflect.Array.newInstance(clazz, size);
        for (int i = 0; i < arr.length; i++) {
            Object elem = null;
            if (clazz == Integer.class) {
                elem = scanner.nextInt();
            } else if (clazz == Double.class) {
                elem = scanner.nextDouble();
            } else if (clazz == String.class) {
                elem = scanner.nextLine();
            }
            arr[i] = clazz.cast(elem);
        }
        return arr;
    }

    public T[] keyRandom(Class<T> clazz) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите длинну массива : ");
        int size = choiceLengthMas();
        T[] arr = (T[]) Array.newInstance(clazz, size);
        for (int i = 0; i < arr.length; i++) {
            java.lang.constant.Constable elem = null;
            if (clazz == Integer.class) {
                elem = random.nextInt(10);
            } else if (clazz == Double.class) {
                elem = random.nextDouble();
            } else if (clazz == String.class) {
                Random random1 = new Random();
                String[] word = new String[]{"Q","W","E","R","T","Y","U","I","O","P","A","S","D","F","G","H","J","K","L","Z","X","C","V","B","N","M"};
                elem = word[random1.nextInt(word.length)];
                }
            arr[i] = clazz.cast(elem);
        }
        return arr;
    }

    public <T> T[] changeElement(T[] mas, int index, Class<T> clazz) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение переменной , на которую надо заменить :");
        Object element = null;
        if (clazz == Integer.class && scanner.hasNextInt()) {
            element = scanner.nextInt();
            mas[index] = (T) element;
        }
        if (clazz == Double.class && scanner.hasNextDouble()) {
            element = scanner.nextDouble();
            mas[index] = (T) element;
        }
        if (clazz == String.class && scanner.hasNextLine()) {
            element = scanner.nextLine();
            mas[index] = (T) element;
        }
        return mas;
    }

    public Class<T> choiceType() {
        Class clazz = Object.class;
        System.out.println("Выбирите тип массива : 1 - String/ 2 - Integer/ 3 - Double");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                switch (i) {
                    case 1:
                        System.out.println("Вы выбрали тип String");
                        clazz = String.class;
                        break;
                    case 2:
                        System.out.println("Вы выбрали тип Integer");
                        clazz = Integer.class;
                        break;
                    case 3:
                        System.out.println("Вы выбрали тип Double");
                        clazz = Double.class;
                        break;
                    default:
                        System.out.println("Попробуйте снова сделать выбор!");
                        this.choiceType();
                        break;
                }
                break;
            } else {
                System.out.println("Попробуйте снова сделать выбор!");
                this.choiceType();
            }
        }
        return clazz;
    }

    public int choiceLengthMas (){
        int size = 0;
        while (true){
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()) {
                size = scanner.nextInt();
                if (size > 0) {
                    System.out.println("Вы выбрали длинну массива ,равную : " + size);
                    break;
            } else {
                    System.out.println("Попробуйте снова, вы не верно задали размер массива. Введите целочисленное число.");
                }
            } else {
                System.out.println("Попробуйте снова, вы не верно задали размер массива. Введите целочисленное число.");
            }
        }
        return size;
    }

    public int choiceEnterMas() {
        System.out.println("Создать массив случайным образом или с клавиатуры ? - Случайно - 1 / С клавиатуры - 2");
        int choice = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()){
                choice = scanner.nextInt();
                if(choice == 1 || choice == 2){
                    switch (choice){
                        case 1:
                            System.out.println("Вы выбрали ввод случайным образом");
                            choice = 1;
                            break;
                        case 2:
                            System.out.println("Вы выбрали ввод с клавиатуры");
                            choice = 2;
                            break;
                    }
                    break;
                } else {
                    System.out.println("Попробуйте снова.");
                }
                break;
            } else {
                System.out.println("Попробуйте снова.");
            }
        }
        return choice;
    }

    public int choiceActMas() {
        System.out.println("Выберите вариант действий над массивом :\n1 - " +
                "Выбрать Мах элемент;\n2 - Выбрать Мин элемент;\n3 -" +
                " Найти среднеарифметическое значение массива;\n4 - Отсортировать по возрастанию;\n5 -" +
                " Отсортировать по убыванию;\n6 - Бинарный поиск;\n7 - Заменить элемент массива;\n" +
                "8 - Закончить работу с массивом;");
        System.out.println("Сделайте свой выбор :");
        int i = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                i = scanner.nextInt();
                if (i >= 1 & i <= 8) {
                    break;
                } else {
                    System.out.println("Попробуйте снова.");
                    choiceActMas();
                }

            }
        }
            return i;
    }

    public <T> T choiceElem(Class<T> clazz){
        Scanner scanner = new Scanner(System.in);
        java.lang.constant.Constable a = null;
        while (true) {
            if (clazz == Integer.class) {
                if (clazz == Integer.class) {
                    a = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Тип вашей переменной не соответствует типу массива : " + clazz.getName());
                }
            }
            if (clazz == Double.class) {
                if (scanner.hasNextDouble()) {
                    a = scanner.nextDouble();
                    break;
                } else {
                    System.out.println("Тип вашей переменной не соответствует типу массива : " + clazz.getName());
                }
            }
            if (clazz == String.class) {
                if (scanner.hasNextLine()) {
                    a = scanner.nextLine();
                    break;
                } else {
                    System.out.println("Тип вашей переменной не соответствует типу массива : " + clazz.getName());
                }
            }
        }
        return clazz.cast(a);
    }

    public void run () {


        Class clazz = choiceType();
        int i = 0;
        while (true) {
            i = choiceEnterMas();
            if(i== 1 || i==2){
                break;
            }
        }
        ArrayIs<T> arr = new ArrayIs<>(mas);
        switch (i){
            case 1:
                mas = (T[]) keyRandom(clazz);
                System.out.println("Мы плучили следующий массив :" + Arrays.toString(mas));
                break;
            case 2:
                Scanner scanner = new Scanner(System.in);
                mas = (T[]) keyBoard(scanner, clazz); // почему подсвечивает непроверяемое приведение ????????
                System.out.println("Мы ввели с клавиатуры следующий массив :" + Arrays.toString(mas));
                scanner.close();
                break;
        }
        while (true) {
            int j = choiceActMas();
            switch (j) {
                case 1:
                    System.out.println("Вы выбрали операцию 1 - найти макс элемент массива");
                    arr.maxOfArray(mas);
                    break;
                case 2:
                    System.out.println("Вы выбрали операцию 2 - найти мин элемент массива");
                    arr.minOfArray(mas);
                    break;
                case 3:
                    System.out.println("Вы выбрали операцию 3 - найти ср арифметическое значение массива");
                    System.out.println("Среднее арифметическое массива : " + arr.meanArithmetic(mas, clazz));
                    break;
                case 4:
                    System.out.println("Вы выбрали операцию 4 - отсортировать массив по возрастанию");
                    arr.sortHi(mas);
                    break;
                case 5:
                    System.out.println("Вы выбрали операцию 5 - отсортировать массив по убыванию");
                    arr.sortLow(mas);
                    break;
                case 6:
                    System.out.println("Вы выбрали операцию 6 - бинарный поиск");
                    System.out.println("Введите пжл переменную :");
                    T a = (T) choiceElem(clazz);
                    arr.binary(mas,a);
                    break;
                case 7:
                    System.out.println("Вы выбрали операцию 7 - замена переменной массива по индексу");
                    System.out.println("Введите индекс переменной, которую требуеться заменить : ");
                    Scanner scanner = new Scanner(System.in);
                    while (true) {
                        if (scanner.hasNextInt()) {
                            int index = scanner.nextInt();
                            if(index < mas.length) {
                                arr.changeElement(mas, index, clazz);
                                System.out.println("После змены переменной массив будет выглядеть так : " + Arrays.toString(mas));
                                break;
                            } else {
                                System.out.println("Вы ввели не корректный индекс. Повторите .");
                            }
                        } else {
                            System.out.println("Вы ввели не корректный индекс. Повторите .");
                        }
                    }
                    break;
                case 8:
                    System.out.println("Вы выбрали операцию 8 - выход из программы");
                    System.out.println("Заканчиваю работу с массивом.");
                    break;
                default:
                    System.out.println("Повторите выбор!!");
                    break;
            }
            if(j == 8) {
                break;
            }
        }
    }



}
