package Задание_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WriteNumberList {

    String fileName;

    public WriteNumberList() {
    }

    public WriteNumberList(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void changeNumberList() {
            try (FileWriter fw = new FileWriter(getFileName())) {
                for (int i = 0; i < 10; i++) {
                    String string = (int) (10 * Math.random()) + " ";
                    fw.write(string);
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
    }
}
