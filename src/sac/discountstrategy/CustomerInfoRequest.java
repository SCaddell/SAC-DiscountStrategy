package sac.discountstrategy;

/**
 * CustomerInfoRequest populates appropriate data from the CustomerRecord
 * to the Customer Class
 * used for Discount Strategy
 * @author Stuart Caddell, scaddell@my.wctc.edu 
 */
public class CustomerInfoRequest {

    public Customer customerInfoRequest(String customerId) {

        CustomerInfoRetrieval db = new FakeDatabase();
        CustomerRecord customerRec = db.findCustomer(customerId);

        if (customerRec != null) {
            // instantiate a new Customer
            Customer customerDetails 
                    = new Customer(customerRec.getCustomerRecId());
            // move (copy) common CustomerRecord fields to Customer
            customerDetails.setCustomerName(
                    customerRec.getCustomerRecName());
            return customerDetails;
        } else {
            // If customer not found, return a null customer
            System.out.println("Customer Id # " + customerId + " not found.");
            Customer customerDetails = null;
            return customerDetails;
        }
    }

    public static void main(String[] args) {

        CustomerInfoRequest testRequest = new CustomerInfoRequest();
        Customer testCustomer = testRequest.customerInfoRequest("600");
        //System.out.println(testCustomer.toString());
    }
}