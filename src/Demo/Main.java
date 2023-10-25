package Demo;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Classroom> list = new ArrayList<>();
        WriteReadFile writeReadFile = new WriteReadFile();
        list = writeReadFile.readFile(WriteReadFile.PATH_CLASS);
//        list.add(new Classroom(1, "JV06", true));
//        list.add(new Classroom(2, "JV07", true));
//        list.add(new Classroom(3, "JV08", true));
//        writeReadFile.writeFile(WriteReadFile.PATH_CLASS, list);
        for (Classroom c : list) {
            System.out.println(c);
        }
//        list.add(new Classroom(4,"JV09", true));
//        writeReadFile.writeFile(WriteReadFile.PATH_CLASS, list);
    }
}
