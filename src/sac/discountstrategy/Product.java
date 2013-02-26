package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell
 */
public class Product {

    private int quanity;                        // number of items purchased
    private String productId;                   // mechandise product id
    private String productDescription;          // general product description
    private double unitPrice;                   // cost of single product
    private double originalRetailPriceTotal;    // quanity * unit price
    private double discount;                    // discount applied to line item
    private double netPrice;                    // original price minus discount

    public Product(String productId, int quanity) {
        this.productId = productId;
        this.quanity = quanity;
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

    @Override
    public String toString() {
        String toStringInfo = "quanity = " + quanity
                + "\nproductId = " + productId
                + "\nDecscription = " + productDescription
                + "\nunitPrice = " + unitPrice
                + "\noriginalPrice = " + originalRetailPriceTotal
                + "\ndiscount = " + discount
                + "\nnetPrice = " + netPrice;

        return toStringInfo;
    }
}
