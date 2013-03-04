package sac.discountstrategy;

/**
 * DiscountStrategy driver.
 * Provides customer and products purchased info to the CashRegister.
 * 
 * @author Stuart Caddell, scaddell@my.wctc.edu 
 */
public class StartUp {
    
    public static void main(String[] args) {
        
        CashRegister transaction1 = new CashRegister();  
        transaction1.lookupCustomer("100");
        transaction1.scannedProduct("A101", 1);
        transaction1.scannedProduct("B205", 3);
        transaction1.endTransaction();
        
        System.out.println("\n------------------------------------------\n");
        
        CashRegister transaction2 = new CashRegister();  
        transaction2.lookupCustomer("200");
        transaction2.scannedProduct("C222", 2);
        transaction2.scannedProduct("P001", 1);
        transaction2.endTransaction();
        
        System.out.println("\n------------------------------------------\n");
        
        CashRegister transaction3 = new CashRegister();  
        transaction3.lookupCustomer("300");
        transaction3.scannedProduct("B205", 2);
        transaction3.scannedProduct("P001", 1);
        transaction3.endTransaction();
    }  
}
