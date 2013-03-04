package sac.discountstrategy;

/**
 * CashRegister for Discount Strategy
 * uses SalesTransaction and Receipt classes
 * @author Stuart Caddell, scaddell@my.wctc.edu
 */
public class CashRegister {
    
    private LineItem[] lineItems = new LineItem[0];
    
    // SalesTransaction could have a Transaction strategy created for Sales, 
    // Returns, and Exchanges. 
    SalesTransaction transaction = new SalesTransaction();
    private LineItem newLineItem;
    private Customer customer = null;
    
    /**
     * method for looking up the customer name (and information)  
     * @param customerId 
     */
    public void lookupCustomer(String customerId) {
        customer = transaction.getCustomerInfo(customerId);
    }
    
    /**
     * method used when products are scanned or entered to be purchased
     * @param prodId
     * @param qty 
     */
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
    
    /**
     * method to end the transaction, and create a receipt
     */
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
