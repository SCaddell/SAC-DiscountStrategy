/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sac.discountstrategy;

/**
 *
 * @author Stuart - HP AMD 10
 */
public class Receipt {
    
    private String receiptItem;
    private double totalDue;
    private final static String RECEIPT_HEADING1
            = "Thank you for shopping at Lombardo's\n";
    //public Receipt(String customer, LineItem[] lineItems)
    
    //public void createReceipt(Customer cust, LineItem[] lineItems) {
    public void createReceipt(LineItem[] lineItems) {    
        System.out.println(RECEIPT_HEADING1);
        
        for (int sub = 0; sub < lineItems.length; sub++ ) {
            System.out.println(lineItems[sub].getQuanity() 
                    + "  " + lineItems[sub].getItemId()
                    + "  " + lineItems[sub].getItemDescription()
                    + "\n"
                    + "  " + lineItems[sub].getQuanity()
                    + "  $" + lineItems[sub].getUnitPrice()
                    + "  $" + lineItems[sub].getOriginalRetailPriceTotal()
                    + "  $" + lineItems[sub].getDiscount()
                    + "  $" + lineItems[sub].getNetPrice());
                    
        }
    }
            
    
}
