package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell
 */
public class CustomerRecord {
    
    private String customerRecId;   
    private String customerRecName;
    
    public CustomerRecord(String customerId) {
        customerRecId = customerId;
        customerRecName = null;
    }
    
    public CustomerRecord(String customerId, String customerName) {
        customerRecId = customerId;
        customerRecName = customerName;
    }

     public String getCustomerRecId() {
        return customerRecId;
    }

    public void setCustomerRecId(String customerRecId) {
        this.customerRecId = customerRecId;
    }

    public void setCustomerRecName(String customerRecName) {
        this.customerRecName = customerRecName;
    }

   public String getCustomerRecName() {
        return customerRecName;
    }
}
