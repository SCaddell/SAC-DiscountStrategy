package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell
 */
public class ProductRecord {

    private String productRecId;
    private String productRecDescription;
    private double productRecPrice;
    private DiscountStrategy productRecDiscountType;

    public ProductRecord(String prodId, String prodDescription,
            double prodPrice, DiscountStrategy prodDiscntType) {
        productRecId = prodId;
        productRecDescription = prodDescription;
        productRecPrice = prodPrice;
        productRecDiscountType = prodDiscntType;
    }

    public String getProductId() {
        return productRecId;
    }

    public void setProductId(String productId) {
        this.productRecId = productId;
    }

    public String getProductDescription() {
        return productRecDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productRecDescription = productDescription;
    }

    public double getProductPrice() {
        return productRecPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productRecPrice = productPrice;
    }

    public DiscountStrategy getProductDiscountType() {
        return productRecDiscountType;
    }

    public void setProductDiscountType(DiscountStrategy productDiscountType) {
        this.productRecDiscountType = productDiscountType;
    }
}
