package sac.discountstrategy;

import java.text.DecimalFormat;

/**
 * QtyDiscount implements QtyBasedDiscountStrategy
 * Used to calculate discount based on the condition of x number of items
 * purchased.
 * @author Stuart Caddell, scaddell@my.wctc.edu 
 */
public class QtyDiscount implements QtyBasedDiscountStrategy {
    private double discountRate = 0.00;
    private int minimumQty = 2;

    
    public QtyDiscount() {
        discountRate = 0;
        minimumQty = 2;
    }
    public QtyDiscount(double percentOff, int qty) {
        discountRate = percentOff;
        minimumQty = qty;
    }
    
    @Override
    public double getDiscount(int qty, double cost) {
        if (qty >= minimumQty)
        {
            DecimalFormat dollars = new DecimalFormat("0.00");
            Double discount = 
                Double.parseDouble((dollars.format(qty * cost * discountRate)));
            return discount;
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

    @Override
    public void setMinimumQty(int minimumQty) {
        this.minimumQty = minimumQty;
    }
    
//    // UNIT TEST CODE
//    public static void main(String[] args) {
//        DiscountStrategy discount = new QtyDiscount();
//        discount.setDiscountRate(.20);
//        System.out.println(discount.getDiscount(5, 10.00));
//    }
    
}
