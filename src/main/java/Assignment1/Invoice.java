package Assignment1;

/**
 * Invoice class with a fixed number of LineItems.
 *
 * LineItems are stored in an Array. For more info on Array's view on of these totorials:
 * W3 Schools https://www.w3schools.com/java/java_arrays.asp
 * Tutorials Point: https://www.tutorialspoint.com/java/java_arrays.htm
 *
 * Note: This invoice doesn't allow LineItems to be deleted but you can change LineItems
 *
 * @author MBlagdon
 */
public class Invoice {

    public static final int MAX_INVOICE_ITEMS = 5; //Thisis for arrays only
    private InvoiceItem[] invoiceItemArray;        //Array store all the invoice line items
    private int numberItems;                       //Track number of lines used

    /**
     * Create an empty invoice with no InvoiceItems
     */

    public Invoice() {
        numberItems = 0;
        invoiceItemArray = new InvoiceItem[MAX_INVOICE_ITEMS];
    }

    /**
     * Add an InvoiceItem to the invoice. Note: it will only add if there are room - if numberItems < MAX_INVOICE_ITEMS.
     * If there is no room on the invoice then nothing will happen.
     * @param invoiceItem invoiceItem to be added
     */
    public void addInvoiceItem(InvoiceItem invoiceItem) {
        if (numberItems < MAX_INVOICE_ITEMS) {
            invoiceItemArray[numberItems] = invoiceItem;
            numberItems++;
        }

    }

    /**
     * Get the invoice item at the position(counting from 1 to 5)
     * @param lineNumber psoition on invoice from line 1 to 5
     * @return
     */
    public InvoiceItem getInvoiceItem(int lineNumber) {
        return invoiceItemArray[lineNumber - 1];
    }

    /**
     * Get number of line items on the invoice
     * @return number of liens on the invoice
     */
    public int getNumberItems() {
        return numberItems;
    }

    /**
     * Get the total on the invoice
     * @return total
     */
    public double getInvoiceTotal() {
        //TODO write this method - loop through line array and add up the lineitem totals
        double total = 0;
        for (int i = 0; i < this.numberItems; i++) {
            total += this.invoiceItemArray[i].getItemTotal();
        }
        return total;
    }
}
