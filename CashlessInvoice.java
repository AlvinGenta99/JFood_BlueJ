/**
 * Write a description of class CashlessInvoice here.
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

public class CashlessInvoice extends Invoice
{
    private static final PaymentType paymentType = PaymentType.CASHLESS;
    private Promo promo;

    /**
     * Constructor for objects of class CashlessInvoice
     */
    public CashlessInvoice(int id,Food food,Customer customer,InvoiceStatus invoiceStatus)
    {
        super(id, food, customer, invoiceStatus);
    }
    
    public CashlessInvoice(int id,Food food,Customer customer,InvoiceStatus invoiceStatus, Promo promo)
    {
        super(id, food, customer, invoiceStatus);
        this.promo = promo;
    }

    public PaymentType getPaymentType()
    {
        return paymentType;
    }
    
    public Promo getPromo()
    {
        return promo;
    }
    
    public void setPromo()
    {
        this.promo = promo;
    }
    
    public void setTotalPrice()
    {
        if (promo != null && getPromo().getActive() == true && getFood().getPrice() > getPromo().getMinPrice())
        {
            super.totalPrice = (getFood().getPrice()) - promo.getDiscount();
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
        if(promo == null || promo.getActive() == false || getFood().getPrice() < getPromo().getMinPrice()) 
        {
            return "==========INVOICE==========\n" +
            "ID : " + super.getId() +
            "\nFood: " + super.getFood().getName() +
            "\nFDate: " + timeNow +
            "\nCustomer: " + super.getCustomer().getName() +
            "\nTotal Price: " + getTotalPrice() +
            "\nStatus: " + super.getInvoiceStatus() +
            "\nPayment Type: " + paymentType ;
            
        }
        else
        {
            return "==========INVOICE==========\n" +
            "ID : " + super.getId() +
            "\nFood: " + super.getFood().getName() +
            "\nDate: " + timeNow +
            "\nPromo: " + promo.getCode() +
            "\nCustomer: " + super.getCustomer().getName() +
            "\nTotal Price: " + getTotalPrice() +
            "\nStatus: " + super.getInvoiceStatus() +
            "\nPayment Type: " + paymentType ;
        }
    }   
        
    /*public void printData()
    {
        System.out.println("======INVOICE=====");
        System.out.println("ID: " + super.getId());
        System.out.println("Food: " + getFood().getName());
        System.out.println("Date: " + super.getDate());
        System.out.println("Customer: " + super.getCustomer().getName());
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Status: " + super.getInvoiceStatus());
        if ((promo != null) && (getPromo().getActive() == true) && (getFood().getPrice() > promo.getMinPrice()))
        {
        System.out.println("Promo: " + getPromo().getCode());
        }
    }*/
}