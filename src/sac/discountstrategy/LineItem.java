package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell
 */
public class LineItem {
    private int quanity;                        // number of items purchased
    private String itemId;                      // mechandise item id
    private String itemDescription;             // general item description
    private double unitPrice;                   // cost of single item
    private double originalRetailPriceTotal;    // quanity * unit price
    private double discount;                    // discount applied to line item
    private double netPrice;                    // original price minus discount

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
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
