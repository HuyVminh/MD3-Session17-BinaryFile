package BaiTap.QuanLySanPham;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("* * * * * * * * * * * * MENU* * * * * * * * * * * * *");
            System.out.println("*   1. Thêm sản phẩm                                *");
            System.out.println("*   2. Hiển thị sản phẩm                            *");
            System.out.println("*   3. Tìm kiếm sản phẩm                            *");
            System.out.println("*   4. Thoát                                        *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * *");
            System.out.print("Nhập lựa chọn của bạn : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    scanner.nextLine();
                    Product product = new Product();
                    System.out.println("Mã sản phẩm : " + product.getProductId());
                    System.out.println("Nhập tên sản phẩm : ");
                    product.setProductName(scanner.nextLine());
                    System.out.println("Nhập hãng sản xuất : ");
                    product.setBrandName(scanner.nextLine());
                    System.out.println("Nhập giá sản phẩm : ");
                    product.setPrice(Float.parseFloat(scanner.nextLine()));
                    System.out.println("Nhập mô tả sản phẩm : ");
                    product.setDescription(scanner.nextLine());
                    productService.addProduct(product);
                    break;
                case 2:
                    System.out.println("DANH SÁCH SẢN PHẨM :");
                    List<Product> products = productService.findAll();
                    for (Product p : products) {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.println("Nhập tên sản phẩm bạn muốn tìm :");
                    String name = scanner.nextLine();
                    productService.findByName(name);
                    break;
                case 4:
                    System.out.println("Đang thoát chương trình...");

                    break;
                default:
                    break;
            }
        }
    }
}
