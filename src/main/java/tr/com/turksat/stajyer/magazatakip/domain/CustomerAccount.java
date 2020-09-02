package tr.com.turksat.stajyer.magazatakip.domain;

public class CustomerAccount extends BaseEntity {
    private int customerId;
    private  Customer customer;

    public CustomerAccount() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}