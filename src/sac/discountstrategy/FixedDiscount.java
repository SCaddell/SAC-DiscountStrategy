package sac.discountstrategy;

import java.text.DecimalFormat;

/**
 *
 * @author Stuart Caddell
 */
public class FixedDiscount implements DiscountStrategy {
    private double discountRate = 0.10;
    
    public FixedDiscount() {
        discountRate = 0.10;
    }
    
    public FixedDiscount(double discountRate) {
        this.discountRate = discountRate;
    }
    
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
    
    public static void main(String[] args) {
        FixedDiscount discount = new FixedDiscount();
        discount.setDiscountRate(.15);
        System.out.println(discount.getDiscount(5, 19.99));
        
    }
}
