package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell
 */
public class StartUp {
    
    //private CashRegister newRegisterTransaction = new CashRegister();
    public static void main(String[] args) {
        
        CashRegister newRegisterTransaction = new CashRegister();  
        newRegisterTransaction.lookupCustomer("100");
        newRegisterTransaction.scannedProduct("A101", 2);
        newRegisterTransaction.scannedProduct("P001", 1);
        newRegisterTransaction.endTransaction();
    }  
}
