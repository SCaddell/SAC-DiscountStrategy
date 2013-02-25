package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell 
 */
public class FakeDatabase implements ProductInfoRetrieval, 
        CustomerInformationRetrieval {
    
    private Customer[] customers = {
	        new Customer("100", "John Smith"),
	        new Customer("200", "Sally Jones"),
	        new Customer("300", "Bob Clementi")
	    };

        // Notice we assign a default discount strategy component object to each product
	    ProductRecord[] products = {
	        new ProductRecord("A101", "Baseball Hat", 19.95, new FixedDiscount(0.15)),
	        new ProductRecord("B205", "Men's Dress Shirt", 35.50, new QtyDiscount(.10,5)),
	        new ProductRecord("C222", "Women's Socks", 9.50, new NoDiscount())
	    };

        // Just call this method to find a customer in the array by its id.
        // Returns null if not found.
    @Override
	    public final Customer findCustomer(final String custId) {
	        // validation is needed
	        Customer customer = null;
	        for(Customer c : customers) {
	            if(custId.equals(c.getCustomerId())) {
	                customer = c;
	                break;
	            }
	        }

	        return customer;
	    }

        // Just call this method to find a product in the array by its id.
        // Returns null if not found.
    @Override
	    public final ProductRecord findProduct(final String prodId) {
	        // validation is needed
	       ProductRecord product = null;
	        for(ProductRecord p : products) {
	            if(prodId.equals(p.getProductId())) {
	                product = p;
	                break;
	            }
	        }

	        return product;
	    }
   
    public static void main(String[] args) {
        ProductInfoRetrieval db =  new FakeDatabase();
       ProductRecord product = db.findProduct("A101");
        
		// if found, add the lineItem to the receipt
		// but it's the receipt's job to do this!
        if(product != null) {
            //receipt.addLineItem(product, qty);
            System.out.println(product);
        }
    }
	} // end of class