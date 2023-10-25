package BaiTap.QuanLySanPham;

import java.io.Serializable;

public class Product implements Serializable {
    private int productId;
    private String productName;
    private String brandName;
    private float price;
    private String description;
    private static int count = 1;

    public Product() {
        this.productId = count++;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = count++;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", brandName='" + brandName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
