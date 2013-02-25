package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell
 */
public class LineItem {
    private int quanity;                        // number of items purchased
    private String productId;                   // mechandise product id
    private String productDescription;          // general product description
    private double unitPrice;                   // cost of single product
    private double originalRetailPriceTotal;    // quanity * unit price
    private double discount;                    // discount applied to line item
    private double netPrice;                    // original price minus discount
    
    public LineItem(int quanity, String productId) {
        this.quanity = quanity;
        this.productId = productId;
        productDescription = null;
        unitPrice = 0.00;
        originalRetailPriceTotal = 0.00;
        discount = 0.00;
        netPrice = 0.00;
    }

    public int getQuanity() {
        return quanity;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getOriginalRetailPriceTotal() {
        return originalRetailPriceTotal;
    }

    public void setOriginalRetailPriceTotal(double originalRetailPriceTotal) {
        this.originalRetailPriceTotal = originalRetailPriceTotal;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }    
}
