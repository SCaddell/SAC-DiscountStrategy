package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell
 */
public interface CustomerInfoRetrieval {
    
    Customer findCustomer(final String custId);
    
}
