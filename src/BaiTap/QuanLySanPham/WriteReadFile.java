package BaiTap.QuanLySanPham;
import java.io.*;
import java.util.List;

public class WriteReadFile {
    public static final String PATH_PRODUCT = "src/BaiTap/QuanLySanPham/product.txt";

    public void writeFile(String PATH_FILE, List<Product> list) {
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

    public List<Product> readFile(String PATH_FILE) {
        File file = new File(PATH_FILE);
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        List<Product> list = null;
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            list = (List<Product>) ois.readObject();
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
