package sac.discountstrategy;

/**
 * interface for all discounts used in DiscountStrategy.
 * @author Stuart Caddell, scaddell@my.wctc.edu 
 */
public interface DiscountStrategy {

    double getDiscount(int qty, double cost);

    double getDiscountRate();

    void setDiscountRate(double discountRate);
    
}
