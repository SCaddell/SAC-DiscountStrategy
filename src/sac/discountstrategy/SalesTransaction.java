package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell
 */
public class SalesTransaction {

    // When adding an item to a sale you need to look up the item in the database
    // Here we use the prodId to find product in the above array
    public void addItemToSale(String prodId, int qty) {
        ProductInfoRetrieval db = new FakeDatabase();
        Product product = db.findProduct(prodId);

        // if found, add the lineItem to the receipt
        // but it's the receipt's job to do this!
        if (product != null) {
            receipt.addLineItem(product, qty);
        }

    }

    public static void main(String[] args) {
    }
}
