package HomeWorkSerialization;

import java.io.*;

public class Task_1 {

//     * ---------
//     * Задание 1
//     * ---------
//     * Написать метод, который принимает имя файла, в качестве параметра метода,
//     * затем считывает этот файл и возвращает все текстовое содержимое
//     * этого файла в виде строки.

    public static void fileRead(String nameFile) {
        String str = "";
        try (InputStream in = new FileInputStream(nameFile.concat(".txt"))) {
            int count;
            while ((count = in.read()) != -1) {
                str = str.concat(String.valueOf((char) count));
            }
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        fileRead("index");
    }
}