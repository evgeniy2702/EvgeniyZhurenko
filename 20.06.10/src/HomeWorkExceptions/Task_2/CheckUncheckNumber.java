package HomeWorkExceptions.Task_2;

public class CheckUncheckNumber {

//    Задание 2
//   Создать метод, принимающий на вход число. В случае,
//   если число отрицательное, в методе должно быть брошено
//   проверяемое исключение. Если число больше 100, должно
//   быть брошено непроверяемое исключение. Создать свои исключения для данного примера.


    public void Check(int a) throws Exception {

            if (a < 0) {
                throw new Exception("Данное число не может быть отрицательным!");
            }
            if (a > 100) {
                throw new RuntimeException("Данное число не может быть больше 100!!");
            }
            try {
                int c = 100/a;
                System.out.println("При делении 100 на " + a + " получили число, равное " + c);
            } catch (ArithmeticException e) {
                throw new MyException("Деление на ноль невозможно!", e);
            } finally {
                System.out.println("Отработка finally - Наше число: " + a);
            }
    }
}
