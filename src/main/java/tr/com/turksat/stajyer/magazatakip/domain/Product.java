package tr.com.turksat.stajyer.magazatakip.domain;

public class Product extends BaseEntity {

    private int productDescriptionId;
    private int productPrice;
    private int numberOfProducts;

    public Product() {
    }

    public int getProductDescriptionId() {
        return productDescriptionId;
    }

    public void setProductDescriptionId(int productDescriptionId) {
        this.productDescriptionId = productDescriptionId;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }
}