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
        
        if(productRec != null) {
            Product productDetails = new Product(productRec.getProductId(),
                    quanity);
            productDetails.setProductDescription(
                    productRec.getProductDescription());
            double unitPrice = productRec.getProductPrice();
            productDetails.setUnitPrice(unitPrice);
            productDetails.setOriginalRetailPriceTotal(quanity * unitPrice);
            DiscountStrategy discount = productRec.getProductDiscountType();
            productDetails.setDiscount(discount.getDiscount(
                    quanity, unitPrice));
            productDetails.setNetPrice(
                    productDetails.getOriginalRetailPriceTotal()
                    - productDetails.getDiscount());
            return productDetails;
        }
        else {
            Product productDetails = null;
            return productDetails;
        }
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