package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell
 */
public class QtyDiscount implements DiscountStrategy, HasMinimumForDiscount {
    private double discountRate = 0.00;
    private int minimumQty = 2;

    
    @Override
    public double getDiscount(int qty, double cost) {
        if (qty >= minimumQty)
        {
            return qty * cost * discountRate;
        }
        else
        {
            return 0;
        }
}

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
    public int getMinimumQty() {
        return minimumQty;
    }

    public void setMinimumQty(int minimumQty) {
        this.minimumQty = minimumQty;
    }
    
    public static void main(String[] args) {
        DiscountStrategy discount = new QtyDiscount();
        discount.setDiscountRate(.10);
        discount.setMinimumQty(6);
        System.out.println(discount.getDiscount(5, 10.00));
    }
    
}
