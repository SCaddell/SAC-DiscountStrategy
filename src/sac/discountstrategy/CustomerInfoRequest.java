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
            Customer customerDetails = new Customer(customerRec.getCustomerId());
            // move (copy) common CustomerRecord fields to Customer
            customerDetails.setCustomerName(
                    customerRec.getCustomerName());
            double unitPrice = customerRec.getCustomerPrice();
            customerDetails.setUnitPrice(unitPrice);
            // calculate the Customer fields not on the CustomerRecord
            customerDetails.setOriginalRetailPriceTotal(quanity * unitPrice);
            DiscountStrategy discount = customerRec.getCustomerDiscountType();
            customerDetails.setDiscount(discount.getDiscount(
                    quanity, unitPrice));
            customerDetails.setNetPrice(
                    customerDetails.getOriginalRetailPriceTotal()
                    - customerDetails.getDiscount());
            return customerDetails;
        } else {
            // If customer not found, return a null customer
            Customer customerDetails = null;
            return customerDetails;
        }
    }

    public static void main(String[] args) {

        CustomerInfoRequest testRequest = new CustomerInfoRequest();
        Customer testCustomer = testRequest.customerInfoRequest("A101", 10);
        System.out.println(testCustomer.toString());
    }
}
//    public Customer(String customerId, int quanity) {
//        this.customerId = customerId;
//        this.quanity = quanity;
//        
//        customerDescription = prodDescription;
//        customerPrice = prodPrice;
//        customerDiscount = prodDiscnt;
//    }
//
//}
//// When adding an item to a sale you need to look up the item in the database
//	// Here we use the prodId to find customer in the above array
//    public void addItemToSale(String prodId, int qty) {
//		CustomerInfoRetrieval db =  new FakeDatabase();
//        Customer customer = db.findCustomer(prodId);