package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell
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
            Customer customerDetails = null;
            return customerDetails;
        }
    }

    public static void main(String[] args) {

        CustomerInfoRequest testRequest = new CustomerInfoRequest();
        Customer testCustomer = testRequest.customerInfoRequest("200");
        System.out.println(testCustomer.toString());
    }
}