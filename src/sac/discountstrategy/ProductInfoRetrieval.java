package sac.discountstrategy;

/**
 *
 * @author Stuart Caddell
 */
public interface ProductInfoRetrieval {

    ProductRecord findProduct(final String prodId);
}
