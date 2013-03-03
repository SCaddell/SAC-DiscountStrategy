package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell
 */
public class StartUp {
    
    //private CashRegister newRegisterTransaction = new CashRegister();
    public static void main(String[] args) {
        
        CashRegister newRegisterTransaction = new CashRegister();  
        newRegisterTransaction.getScannedProductInfo("A101", 2);
        newRegisterTransaction.getScannedProductInfo("A101", 2);
        newRegisterTransaction.endTransaction();
//        //System.out.println(newRegisterTransaction.getScannedProductInfo("A101", 5));
          System.out.println("test");
    }  
}
