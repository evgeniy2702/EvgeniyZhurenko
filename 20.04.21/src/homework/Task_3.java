package homework;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

//   Задание3: Ввести строку с клавиатуры. Из введённой строки выбрать все слова
//   начинающиеся на гласные буквы (e, o, a, u, i или y) и заканчивающиеся на согласные. Вывести
//   отобранные слова на консоль.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести строку с клавиатуры :");
        String string = scanner.nextLine();

        String[] words; // объявляем стринговый массив для записи в него слов из введеного предложения
        char[] glasnieRus = {'а', 'е', 'ё', 'и', 'о', 'у',
                +'я', 'э', 'ю', 'і', 'ї', 'ы', 'є'};     // объявляем символьный массив из гласных бук
        // русского/ украинского алфавита
        char[] glasnieEng = {'a', 'e', 'i', 'o', 'u', 'y'};// объявляем символьный массив из гласных букв
        // английского алфавита
        int l; //вводим переменную для подсчета совпадений последней буквы слова с элементом из массива гласных


        words = string.split(" ");

        System.out.println();
        System.out.print("Выводим слова, которые начинаются с гласных и заканчиваются на согласные : ");
        for (String word : words) {
            for (char Rus : glasnieRus) {
                l = 0;
                if (word.charAt(0) == Rus) {
                    for (char Rus1 : glasnieRus) {
                        if (word.charAt(word.length() - 1) == Rus1) {
                            l++;
                            break;
                        }
                    }
                    if (l == 0) {
                        System.out.print(word + "  ");
                        break;
                    }
                }
            }
            for (char Eng : glasnieEng) {
                l = 0;
                if (word.charAt(0) == Eng) {
                    for (char Eng1 : glasnieEng) {
                        if (word.charAt(word.length() - 1) == Eng1) {
                            l++;
                            break;
                        }
                    }
                    if (l == 0) {
                        System.out.print(word + "  ");
                        break;
                    }
                }
            }
        }
    }
}


