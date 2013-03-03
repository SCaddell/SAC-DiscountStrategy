package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell
 */
public interface CustomerInfoRetrieval {
    
    CustomerRecord findCustomer(final String custId);
    
}
