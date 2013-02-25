package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell
 */
public class Product {
    private String productID;
    private String productDescription;
    private double productPrice;
    private DiscountStrategy productDiscount;
    
    public Product(String prodId, String prodDescription, double prodPrice,
            DiscountStrategy prodDiscnt) {
        productID = prodId;
        productDescription = prodDescription;
        productPrice = prodPrice;
        productDiscount = prodDiscnt;
    }

    public String getProductId() {
        return productID;
    }

    public void setProductId(String productID) {
        this.productID = productID;
    }

    public String getProductDesciption() {
        return productDescription;
    }

    public void setProductDesciption(String productDesciption) {
        this.productDescription = productDesciption;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public DiscountStrategy getProductDiscount() {
        return productDiscount;
    }

    public void setProductDiscount(DiscountStrategy productDiscount) {
        this.productDiscount = productDiscount;
    }
    
    
}
