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
    private int quanity;                        // number of items purchased
    private String productId;                   // mechandise product id
    private String productDescription;          // general product description
    private double unitPrice;                   // cost of single product
    private double originalRetailPriceTotal;    // quanity * unit price
    private double discount;                    // discount applied to line item
    private double netPrice;                    // original price minus discount
    
    public Product(String productId, int quanity) {
        this.productId = productId;
        this.quanity = quanity;
        
        productDescription = prodDescription;
        productPrice = prodPrice;
        productDiscount = prodDiscnt;
    }

}
