package tr.com.turksat.stajyer.magazatakip.domain;

import java.util.Date;

public class Sales extends BaseEntity {

    private int orderId;
    private String paymentMethod;
    private Date productSaleDate;

    public Sales() {
    }

    public Date getProductSaleDate() {
        return productSaleDate;
    }

    public void setProductSaleDate(Date productSaleDate) {
        this.productSaleDate = productSaleDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
