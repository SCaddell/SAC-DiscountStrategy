package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell
 */
public class CashRegister {
    
    private LineItem[] lineItems = new LineItem[0];
    private LineItem newLineItem;
    
    public void getScannedProductInfo(String prodId, int qty) {
        SalesTransaction purchasedProduct = new SalesTransaction();
        newLineItem = purchasedProduct.addItemToSale(prodId, qty);
        if (newLineItem != null) {
            addToLineItem(lineItems, newLineItem);
        }
        else {
            System.out.println("The price and product information for " 
                    + "product " + prodId + " can not found!");
        }
    }
    
    /*
     * Increase the size of the LineItem array by 1, and add the new line item
     */
    private void addToLineItem(LineItem[] lineItems, LineItem newLineItem) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = newLineItem;
        lineItems = tempItems;
    }
    
}
