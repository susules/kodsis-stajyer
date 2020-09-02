package tr.com.turksat.stajyer.magazatakip.domain;
import java.util.Date;
//import java.sql.Date;
public class ProductDescription extends BaseEntity {
    private int productTypeId;
    private Date productManufacturingDate;
    private String productBrand;
    private String productModel;
    private String productColour;
    private int productWarrantyPeriod;
    private int productWeight;

    public ProductDescription(){
    }

    public int getProductTypeId(){
        return productTypeId;
    }

    public void setProductTypeId(int productTypeId){
        this.productTypeId=productTypeId;
    }

    public java.sql.Date getProductManufacturingDate() {
        return (java.sql.Date) productManufacturingDate;
    }

    public void setProductManufacturingDate(Date productManufacturingDate) {
        this.productManufacturingDate = productManufacturingDate;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public String getProductColour() {
        return productColour;
    }

    public void setProductColour(String productColour) {
        this.productColour = productColour;
    }

    public int getProductWarrantyPeriod(){
        return productWarrantyPeriod;
    }

    public void setProductWarrantyPeriod(int productWarrantyPeriod){
        this.productWarrantyPeriod=productWarrantyPeriod;
    }

    public int getProductWeight(){
        return productWeight;
    }

    public void setProductWeight(int productWeight){
        this.productWeight=productWeight;
    }

}
