package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell
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