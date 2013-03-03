package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell
 */
public class SalesTransaction {
    
    public Customer getCustomerInfo(String customerId) {
        CustomerInfoRequest nextCustomer = new CustomerInfoRequest();
        Customer customer = nextCustomer.customerInfoRequest(customerId);
        return customer;
    }

    // When adding an item to a sale you need to look up the item in the database
    // Here we use the prodId to find product in the above array
    public LineItem addItemToSale(String prodId, int qty) {
        // need validation
        ProductInfoRequest nextProduct = new ProductInfoRequest();
        Product productDetails =  nextProduct.productInfoRequest(prodId, qty);
        if (productDetails != null) {
            LineItem lineItem = buildNewLineItem(productDetails);
            return lineItem;
        }
        else {
            LineItem lineItem = null;
            return lineItem;
        }
    }
    
    /*
     * Moves the appropriate data from the product request to the line item.
     * This is done because the product fields and line item fields may not 
     * always be in sync.
     */
    private LineItem buildNewLineItem(Product product) {
        LineItem lineItem = new LineItem();
        lineItem.setQuanity(product.getQuanity());
        lineItem.setItemId(product.getProductId());
        lineItem.setItemDescription(product.getProductDescription());
        lineItem.setUnitPrice(product.getUnitPrice());
        lineItem.setOriginalRetailPriceTotal(product.getOriginalRetailPriceTotal());
        lineItem.setDiscount(product.getDiscount());
        lineItem.setNetPrice(product.getNetPrice());
        // Comment out or delete the line below after testing
        // System.out.println(lineItem.getItemDescription());
        return lineItem;
    }

    public static void main(String[] args) {
        SalesTransaction transaction = new SalesTransaction();
        transaction.addItemToSale("A101", 2);
    }
}
