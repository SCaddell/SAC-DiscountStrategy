/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sac.discountstrategy;

/**
 *
 * @author Stuart - HP AMD 10
 */
public class ProductInfoRequest {

    public Product productInfoRequest(String productId, int quanity) {

        ProductInfoRetrieval db = new FakeDatabase();
        ProductRecord productRec = db.findProduct(productId);

        if (productRec != null) {
            // instantiate a new Product
            Product productDetails = new Product(productRec.getProductId(),
                    quanity);
            // move (copy) common ProductRecord fields to Product
            productDetails.setProductDescription(
                    productRec.getProductDescription());
            double unitPrice = productRec.getProductPrice();
            productDetails.setUnitPrice(unitPrice);
            // calculate the Product fields not on the ProductRecord
            productDetails.setOriginalRetailPriceTotal(quanity * unitPrice);
            DiscountStrategy discount = productRec.getProductDiscountType();
            productDetails.setDiscount(discount.getDiscount(
                    quanity, unitPrice));
            productDetails.setNetPrice(
                    productDetails.getOriginalRetailPriceTotal()
                    - productDetails.getDiscount());
            return productDetails;
        } else {
            // If product not found, return a null product
            Product productDetails = null;
            return productDetails;
        }
    }

    public static void main(String[] args) {

        ProductInfoRequest testRequest = new ProductInfoRequest();
        Product testProduct = testRequest.productInfoRequest("A101", 10);
        System.out.println(testProduct.toString());
    }
}
//    public Product(String productId, int quanity) {
//        this.productId = productId;
//        this.quanity = quanity;
//        
//        productDescription = prodDescription;
//        productPrice = prodPrice;
//        productDiscount = prodDiscnt;
//    }
//
//}
//// When adding an item to a sale you need to look up the item in the database
//	// Here we use the prodId to find product in the above array
//    public void addItemToSale(String prodId, int qty) {
//		ProductInfoRetrieval db =  new FakeDatabase();
//        Product product = db.findProduct(prodId);