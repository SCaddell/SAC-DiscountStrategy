package sac.discountstrategy;

/**
 * DiscountStrategy driver.
 * Provides customer and products purchased info to the CashRegister.
 * @author Stuart Caddell, scaddell@my.wctc.edu 
 */
public class StartUp {
    
    public static void main(String[] args) {
        
        CashRegister newRegisterTransaction = new CashRegister();  
        newRegisterTransaction.lookupCustomer("100");
        newRegisterTransaction.scannedProduct("A101", 2);
        newRegisterTransaction.scannedProduct("P001", 1);
        newRegisterTransaction.endTransaction();
    }  
}
