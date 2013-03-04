package sac.discountstrategy;

/**
 * CustomerRecord, layout for the physical data record record.
 * The actual CustomerRecord may contain more fields that is used in the 
 * Customer class of the DiscountStrategy.
 * @author Stuart Caddell, scaddell@my.wctc.edu 
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
