package Задание_3;

import javax.xml.crypto.Data;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumberList {

    String fileName;
    List<Integer> listNumber ;

    public NumberList(String fileName) {
        this.fileName = fileName;
    }

    public List<Integer> getListNumber() {
        return listNumber;
    }

    public void setListNumber(List<Integer> listNumber) {
        this.listNumber = listNumber;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void getNumberList() throws IOException {
        try(FileReader fileReader = new FileReader(getFileName());
            FileWriter fw = new FileWriter("LogFile.txt", true)){
            Scanner scanner = new Scanner(fileReader);
            if(scanner.hasNextLine()) {
                String string = scanner.nextLine();
                listNumber = Arrays.stream(string.split(" ")).map(Integer::parseInt)
                        .collect(Collectors.toCollection(ArrayList::new));
                fw.write(ZonedDateTime.now() + "\n");
                fw.write(listNumber + "\n");
            }
        } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "NumberList{" +
                "fileName='" + fileName + '\'' +
                ", listNumber=" + listNumber +
                '}';
    }
}
