package oop.stream.section2.product;

public class Product {
    private int productNo;
    private String productName;
    private String company;
    private Integer price;

    public Product(int productNo, String productName, String company, Integer price) {
        this.productNo = productNo;
        this.productName = productName;
        this.company = company;
        this.price = price;
    }

    public int getProductNo() {
        return productNo;
    }

    public String getProductName() {
        return productName;
    }

    public String getCompany() {
        return company;
    }

    public Integer getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "productNo=" + productNo +
                ", productName='" + productName + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                '}';
    }
}
