package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell 
 */
public class FakeDatabase implements ProductInformationRetrieval, 
        CustomerInformationRetrieval {
    
    private Customer[] customers = {
	        new Customer("100", "John Smith"),
	        new Customer("200", "Sally Jones"),
	        new Customer("300", "Bob Clementi")
	    };

        // Notice we assign a default discount strategy component object to each product
	    Product[] products = {
	        new Product("A101", "Baseball Hat", 19.95, new FixedDiscount(0.15)),
	        new Product("B205", "Men's Dress Shirt", 35.50, new QtyDiscount(.10,5)),
	        new Product("C222", "Women's Socks", 9.50, new NoDiscount())
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
	    public final Product findProduct(final String prodId) {
	        // validation is needed
	        Product product = null;
	        for(Product p : products) {
	            if(prodId.equals(p.getProductId())) {
	                product = p;
	                break;
	            }
	        }

	        return product;
	    }
	} // end of class
	
    
	// When adding an item to a sale you need to look up the item in the database
	// Here we use the prodId to find product in the above array
    public void addItemToSale(String prodId, int qty) {
		FakeDatabase db =  new FakeDatabase();
        Product product = db.findProduct(prodId);
        
		// if found, add the lineItem to the receipt
		// but it's the receipt's job to do this!
        if(product != null) {
            receipt.addLineItem(product, qty);
        }
        
    }

    
}
