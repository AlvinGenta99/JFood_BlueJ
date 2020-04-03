/**
 * Write a description of class CashInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
import java.util.regex.*;
import java.text.Format;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class CashInvoice extends Invoice
{
    private static final PaymentType paymentType = PaymentType.CASH;
    private int deliveryFee;

    /**
     * Constructor for objects of class CashlessInvoice
     */
    public CashInvoice(int id,Food food,Customer customer,InvoiceStatus invoiceStatus)
    {
        super(id, food, customer, invoiceStatus);
    }
    
    public CashInvoice(int id,Food food,Customer customer,InvoiceStatus invoiceStatus, int deliveryFee)
    {
        super(id, food, customer, invoiceStatus);
        this.deliveryFee = deliveryFee;
    }

    public PaymentType getPaymentType()
    {
        return paymentType;
    }
    
    public int getDeliveryFee()
    {
        return deliveryFee;
    }
    
    public void setDeliveryFee(int deliveryFee)
    {
        this.deliveryFee = deliveryFee;
    }
    
    public void setTotalPrice()
    {
        if (deliveryFee != 0)
        {
            super.totalPrice = (getFood().getPrice()) + deliveryFee;
        }
        else
        {
            super.totalPrice = getFood().getPrice();
        }
    }
    
    public String toString()
    {
        setTotalPrice();
        String timeNow = "";
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        timeNow = sdf.format(super.getDate().getTime());
        if(deliveryFee != 0) 
        {
            return "==========INVOICE==========\n" +
            "ID : " + super.getId() +
            "\nFood: " + super.getFood().getName() +
            "\nFDate: " + timeNow +
            "\nCustomer: " + super.getCustomer().getName() +
            "\nTotal Price: " + getTotalPrice() +
            "\nStatus: " + super.getInvoiceStatus() +
            "\nPayment Type: " + paymentType +
            "\nDelivery Fee: " + getDeliveryFee() ;
            
        }
        else
        {
            return "==========INVOICE==========\n" +
            "ID : " + super.getId() +
            "\nFood: " + super.getFood().getName() +
            "\nDate: " + timeNow +
            "\nCustomer: " + super.getCustomer().getName() +
            "\nTotal Price: " + getTotalPrice() +
            "\nStatus: " + super.getInvoiceStatus() +
            "\nPayment Type: " + paymentType +
            "\nDelivery Fee: " + "None" ;
        }
    } 
    
    /*public void printData()
    {
        System.out.println("======INVOICE=====");
        System.out.println("ID: " + getId());
        System.out.println("Food: " + getFood().getName());
        System.out.println("Date: " + getDate());
        System.out.println("Customer: " + getCustomer().getName());
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Status: " + getInvoiceStatus());
        System.out.println("Delivery Fee: " + deliveryFee);
    }*/
}