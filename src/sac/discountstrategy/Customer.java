package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell
 */
public class Customer {
    private String customerId;
    private String customerName;
    
    public Customer(String custID, String custName) {
        customerId = custID;
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
    
}
