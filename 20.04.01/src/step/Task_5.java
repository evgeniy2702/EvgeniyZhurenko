package step;

public class Task_5 {
    public static void main(String[] args) {
       // 5.	Одна единица некоторого товара стоит 24,5 грн.
        // Напечатать таблицу стоимости 2, 3 ... 20 штук этого товара.
        float price = 24.5f;
        for (int i = 0; i < 20; i++) {
            System.out.printf("Цена "+ (i+1) +" ед товара : %.2f грн\n", price*(i+1));
        }

    }
}
