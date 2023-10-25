package Demo;

import java.io.*;
import java.util.List;

public class WriteReadFile {
    public static final String PATH_CLASS = "src/Demo/classroom.txt";

    public void writeFile(String PATH_FILE, List<Classroom> list) {
        File file = new File(PATH_FILE);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            fos.close();
            oos.close();
        } catch (Exception e) {
            System.out.println("Write File error");
        }
    }

    public List<Classroom> readFile(String PATH_FILE) {
        File file = new File(PATH_FILE);
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        List<Classroom> list = null;
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            list = (List<Classroom>) ois.readObject();
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không có file !");
        } catch (IOException e) {
            System.out.println("File rỗng !");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
