package sac.discountstrategy;

/**
 * NoDiscount implements DiscountStrategy
 * Used for DiscountStrategy when the product has no discount
 * Always returns zero as discount.
 * 
 * @author Stuart Caddell, scaddell@my.wctc.edu 
 */
public class NoDiscount implements DiscountStrategy {
    private double discountRate = 0.00;
    
    @Override
    public double getDiscount(int qty, double cost) {
            return 0;
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
//        DiscountStrategy discount = new NoDiscount();
//        discount.setDiscountRate(.10);
//        System.out.println(discount.getDiscount(5, 10.00));
//        
//    }
}
