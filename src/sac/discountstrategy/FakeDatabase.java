package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell
 */
public class FakeDatabase implements ProductInfoRetrieval,
        CustomerInfoRetrieval {

    private CustomerRecord[] customers = {
        new CustomerRecord("100", "John Smith"),
        new CustomerRecord("200", "Sally Jones"),
        new CustomerRecord("300", "Bob Clementi")
    };
    // Notice we assign a default discount strategy component object to each product
    ProductRecord[] products = {
        new ProductRecord("A101", "Baseball Hat", 19.95, new FixedDiscount(0.15)),
        new ProductRecord("B205", "Men's Dress Shirt", 35.50, new QtyDiscount(.10, 5)),
        new ProductRecord("C222", "Women's Socks", 9.50, new NoDiscount()),
        new ProductRecord("P001", "Green Bay Packers Jersey", 49.99, new NoDiscount())
    };

    // Just call this method to find a customer in the array by its id.
    // Returns null if not found.
    @Override
    public final CustomerRecord findCustomer(final String custId) {
        // validation is needed
        CustomerRecord customer = null;
        for (CustomerRecord c : customers) {
            if (custId.equals(c.getCustomerRecId())) {
                customer = c;
                break;
            }
        }

        return customer;
    }

    // Just call this method to find a product in the array by its id.
    // Returns null if not found.
    @Override
    public final ProductRecord findProduct(final String productId) {
        // validation is needed
        ProductRecord product = null;
        for (ProductRecord p : products) {
            if (productId.equals(p.getProductId())) {
                product = p;
                break;
            }
        }

        return product;
    }

    public static void main(String[] args) {
        ProductInfoRetrieval db = new FakeDatabase();
        ProductRecord product = db.findProduct("A101");

        // if found, add the lineItem to the receipt
        // but it's the receipt's job to do this!
        if (product != null) {
            //receipt.addLineItem(product, qty);
            System.out.println(product);
        }
    }
} // end of class