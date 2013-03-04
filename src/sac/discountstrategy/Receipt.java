package sac.discountstrategy;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Generates a fixed format receipt at the end of a customer transaction
 * 
 * @author Stuart Caddell, scaddell@my.wctc.edu 
 */
public class Receipt {
    
    private String receiptItem;
    private double totalDue;
    
    // [0] = grand total before discount, [1] = discount total, [2] is total due
    private double[] totals = new double[3];
    
    private final static String RECEIPT_HEADING1
            = "Thank you for shopping at Lombardo's\n";
    //public Receipt(String customer, LineItem[] lineItems)
    
    //public void createReceipt(Customer cust, LineItem[] lineItems) {
    public void createReceipt(Customer customer, LineItem[] lineItems) {    
        System.out.println(customer.getCustomerName());
        System.out.println(RECEIPT_HEADING1);
        DecimalFormat dollars = new DecimalFormat("##0.00");
        for (int sub = 0; sub < lineItems.length; sub++ ) {
//            System.out.println(lineItems[sub].getItemId()
//                    + "\t" + lineItems[sub].getItemDescription()
//                    + "\n"
//                    + lineItems[sub].getQuanity()
//                    + "\t$" + dollars.format(lineItems[sub].getUnitPrice())
//                    + "\t$" + dollars.format(lineItems[sub].getOriginalRetailPriceTotal())
//                    + "\n\t\t$" + dollars.format(lineItems[sub].getDiscount())
//                    + "\t$" + dollars.format(lineItems[sub].getNetPrice()));
//            System.out.println("************************");
            System.out.println(lineItems[sub].getItemId()
                    + "\t" + lineItems[sub].getItemDescription());
            System.out.print(lineItems[sub].getQuanity());
            System.out.printf("\t%3.2f", lineItems[sub].getUnitPrice());
            System.out.printf("\t%3.2f", 
                    lineItems[sub].getOriginalRetailPriceTotal());
            System.out.printf("\n    discount\t%3.2f", lineItems[sub].getDiscount());
            System.out.printf("\t%3.2f", lineItems[sub].getNetPrice());
            System.out.println("");
        }
        calculateTotals(lineItems);
        if (totals[1] > 0) {
            System.out.println("\nOriginal Total\t\t" + totals[0]);
            System.out.println("Your discounts today\t" + totals[1]);
            System.out.println("Total Due \t\t" + totals[2]);
        }
        else {
            System.out.println("Total Due \t\t" + totals[2]);
        }
        
        // Get current date/time and convert to a Date object because
        // SimpleDateFormat only works with Date objects
        Calendar c = Calendar.getInstance();
        Date date = new Date();
        // Now format the date object as a String
        String format = "M/d/yyyy h:mm a";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String formattedDate = sdf.format(date);
        System.out.println("\n" + formattedDate);
    }
            
    // Here's how to loop through all the line items and get a grand total
    private void calculateTotals(LineItem[] lineItems) {
        totals[0] = 0.0;    // grand total before discount
        totals[1] = 0.0;    // total discounts
        totals[2] = 0.0;    // total (net) amount due
        for(LineItem item : lineItems) {
            totals[0] += item.getOriginalRetailPriceTotal();
            totals[1] += item.getDiscount();
            totals[2] += item.getNetPrice();
        }
        // check to make sure the grand total minus the discounts equals
        // the net amount due.
        if ((totals[0] - totals[1]) != totals[2]) {
            System.out.println("Receipt totals are not in balance!");
        }
    }
}
