/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sac.discountstrategy;

/**
 *
 * @author Stuart - HP AMD 10
 */
public interface DiscountStrategy {

    double getDiscount(int qty, double cost);

    double getDiscountRate();

    void setDiscountRate(double discountRate);
    
}
