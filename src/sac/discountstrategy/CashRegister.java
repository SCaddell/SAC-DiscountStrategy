package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell
 */
public class CashRegister {
    
    private LineItem[] lineItems = new LineItem[0];
    SalesTransaction transaction = new SalesTransaction();
    private LineItem newLineItem;
    private Customer customer = null;
    
    public void lookupCustomer(String customerId) {
        customer = transaction.getCustomerInfo(customerId);
    }
    
    public void scannedProduct(String prodId, int qty) {
        newLineItem = transaction.addItemToSale(prodId, qty);
        if (newLineItem != null) {
            addToLineItem(newLineItem);
        }
        else {
            System.out.println("The price and product information for " 
                    + "product " + prodId + " can not found!");
        }
    }
    
    public void endTransaction() {
        Receipt salesReceipt = new Receipt();
        salesReceipt.createReceipt(customer, lineItems);
    }
    
    /*
     * Increase the size of the LineItem array by 1, and add the new line item
     */
    private void addToLineItem(LineItem newLineItem) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = newLineItem;
        lineItems = tempItems;
    }
}
