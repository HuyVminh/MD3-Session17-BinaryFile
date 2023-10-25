package BaiTap.QuanLySanPham;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    static BaiTap.QuanLySanPham.WriteReadFile writeReadFile = new WriteReadFile();
    static List<Product> list;

    static {
        list = writeReadFile.readFile(WriteReadFile.PATH_PRODUCT);
        list = (list == null) ? new ArrayList<Product>() : list;
    }

    public void addProduct(Product product) {
        list.add(product);
        writeReadFile.writeFile(WriteReadFile.PATH_PRODUCT, list);
    }

    public List<Product> findAll() {
        return list;
    }

    public Product findByName(String name) {
        for (Product product : list) {
            if (product.getProductName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }
}
