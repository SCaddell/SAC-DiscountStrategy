package sac.discountstrategy;

/**
 * ProductInfoRequest uses the ProductInfoRetrieval to get the ProductRecord
 * for the current data storage system.  It then uses the ProductRecord data
 * to populate the Product class thru 1-to-1 sets, or thru data calculations.
 * 
 * @author Stuart Caddell, scaddell@my.wctc.edu 
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
            System.out.println("Product Id # " + productId + " not found.");
            Product productDetails = null;
            return productDetails;
        }
    }

//    //UNIT TEST CODE
//    public static void main(String[] args) {
//
//        ProductInfoRequest testRequest = new ProductInfoRequest();
//        Product testProduct = testRequest.productInfoRequest("A101", 10);
//        System.out.println(testProduct.toString());
//    }
}