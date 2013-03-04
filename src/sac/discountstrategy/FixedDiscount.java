package sac.discountstrategy;

import java.text.DecimalFormat;

/**
 * Fixed Discount implements DiscountStrategy
 * Used to calculate a fixed product discount.
 * @author Stuart Caddell, scaddell@my.wctc.edu 
 */
public class FixedDiscount implements DiscountStrategy {
    private double discountRate = 0.10;
    
    /**
     * Default constructor sets the fixed discount rate to 10%
     */
    public FixedDiscount() {
        discountRate = 0.10;
    }
    
    /**
     * constructor that provides the initial discount rate
     * @param discountRate 
     */
    public FixedDiscount(double discountRate) {
        this.discountRate = discountRate;
    }
    
    /**
     * calculates the discount based upon quantity and cost
     * @param qty
     * @param cost
     * @return double discount
     */
    @Override
    public double getDiscount(int qty, double cost) {
        DecimalFormat dollars = new DecimalFormat("0.00");
        Double discount = 
                Double.parseDouble((dollars.format(qty * cost * discountRate)));
        return discount;
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
//    UNIT TEST CODE    
//    public static void main(String[] args) {
//        FixedDiscount discount = new FixedDiscount();
//        discount.setDiscountRate(.15);
//        System.out.println(discount.getDiscount(5, 19.99));
//        
//    }
}
