package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell
 */
public class SalesTransaction {

    LineItem[] lineItems = new LineItem[0];
    LineItem item = new LineItem();
    
    public void startSale() {
        //  need to flush out, create line item
    }
    
    // When adding an item to a sale you need to look up the item in the database
    // Here we use the prodId to find product in the above array
    public void addItemToSale(String prodId, int qty) {
        // need validation
        ProductInfoRequest nextProduct = new ProductInfoRequest();
        Product productDetails =  nextProduct.productInfoRequest(prodId, qty);
        if (productDetails != null) {
            addToLineItem(productDetails);
        }
    }
    
    private void addToLineItem(Product productDetails) {
        buildNewLineItem(productDetails, item);
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;           
    }
    
    private void buildNewLineItem(Product product, LineItem item) {
        item.setQuanity(product.getQuanity());
        item.setItemId(product.getProductId());
        item.setItemDescription(product.getProductDescription());
        item.setUnitPrice(product.getUnitPrice());
        item.setOriginalRetailPriceTotal(product.getOriginalRetailPriceTotal());
        item.setDiscount(product.getDiscount());
        item.setNetPrice(product.getNetPrice());
        // Comment out or delete the line below after testing
        System.out.println(item.getItemDescription());
    }

    public static void main(String[] args) {
        SalesTransaction transaction = new SalesTransaction();
        transaction.addItemToSale("A101", 2);
    }
}
