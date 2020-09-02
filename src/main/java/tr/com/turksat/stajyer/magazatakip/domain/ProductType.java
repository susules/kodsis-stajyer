package tr.com.turksat.stajyer.magazatakip.domain;

public class ProductType extends BaseEntity {

    private String ProductTypeName;

    public ProductType(){
    }

    public String getProductTypeName(){
        return ProductTypeName;
    }

    public void setProductTypeName(String ProductTypeName){
        this.ProductTypeName=ProductTypeName;
    }
}