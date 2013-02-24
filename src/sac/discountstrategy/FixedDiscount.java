package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell
 */
public class FixedDiscount implements DiscountStrategy {
    private double discountRate = 0.00;
    
    @Override
    public double getDiscount(int qty, double cost) {
            return qty * cost * discountRate;
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
        discount.setDiscountRate(.10);
        System.out.println(discount.getDiscount(5, 10.00));
        
    }
}
