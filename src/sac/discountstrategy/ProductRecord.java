package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell
 */
public class ProductRecord {
    private String productId;
    private String productDescription;
    private double productPrice;
    private DiscountStrategy productDiscountType;

    public ProductRecord(String prodId, String prodDescription, 
            double prodPrice, DiscountStrategy prodDiscntType) {
        productId = prodId;
        productDescription = prodDescription;
        productPrice = prodPrice;
        productDiscountType = prodDiscntType;
    }
    
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public DiscountStrategy getProductDiscountType() {
        return productDiscountType;
    }

    public void setProductDiscountType(DiscountStrategy productDiscountType) {
        this.productDiscountType = productDiscountType;
    }
    
    
}
