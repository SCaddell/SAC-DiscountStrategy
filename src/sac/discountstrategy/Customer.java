package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell
 */
public class Customer {
    private String customerId;
    private String customerName;
    
    public Customer(String custId) {
        customerId = custId;
        customerName = null;
    }
    
    public Customer(String custId, String custName) {
        customerId = custId;
        customerName = custName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    @Override
    public String toString() {
        String toStringInfo = "customerId = " + customerId
                + "\ncustomerName = " + customerName;
        return toStringInfo;
    }
    
}
