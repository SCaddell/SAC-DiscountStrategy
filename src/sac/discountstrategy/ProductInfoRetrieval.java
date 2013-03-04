package sac.discountstrategy;

/**
 * Interface for retrieving the ProductRecord from the current data storage 
 * system.
 * 
 * @author Stuart Caddell, scaddell@my.wctc.edu 
 */
public interface ProductInfoRetrieval {

    ProductRecord findProduct(final String prodId);
}
