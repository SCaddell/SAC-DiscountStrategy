package sac.discountstrategy;

/**
 * Interface for retrieving the CustomerRecord from the current data storage
 * system.
 * Used for the DiscountStrategy
 * @author Stuart Caddell, scaddell@my.wctc.edu 
 */
public interface CustomerInfoRetrieval {
    
    CustomerRecord findCustomer(final String custId);
    
}
