package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell
 */
public class StartUp {
    
    //private CashRegister newRegisterTransaction = new CashRegister();
    public static void main(String[] args) {
        
        CashRegister newRegisterTransaction = new CashRegister();  
        newRegisterTransaction.lookupCustomer("200");
        newRegisterTransaction.scannedProduct("A101", 2);
        newRegisterTransaction.scannedProduct("A101", 2);
        newRegisterTransaction.endTransaction();
    }  
}
