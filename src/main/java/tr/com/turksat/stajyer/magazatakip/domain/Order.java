package tr.com.turksat.stajyer.magazatakip.domain;

public class Order extends BaseEntity {
    private int customerAccountId;
    private int productId;

    public Order(){
    }

    public int getCustomerAccountId() {
        return customerAccountId;
    }

    public void setCustomerAccountId(int customerAccountId) {
        this.customerAccountId = customerAccountId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
