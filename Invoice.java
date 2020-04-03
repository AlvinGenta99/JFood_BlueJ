/**
 * class Invoice digunakan untuk memberi info tentang tagihan sebuah pesanan. 
 * Masing-masing komponen memiliki fungsi get (untuk mengambil value yang ada) dan set (untuk memperbarui value dari komponen).
 * customer tidak dpapat diubah dari class Invoice secara langsung.
 * @author Alvin Genta Pratama
 * @version 1.1.27.20
 */

import java.util.*;
import java.util.regex.*;
import java.text.Format;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public abstract class Invoice
{
   /**
    * Variable Invoice
    */
   private int id;
   private Food food;
   private Calendar date;
   protected int totalPrice;
   private Customer customer;
   private InvoiceStatus invoiceStatus;
   
   /**
    * Constructor Invoice
    * @param id (ID Invoice)
    * @param idFood (ID Makanan)
    * @param date (Tanggal)
    * @param totalPrice (Total Harga)
    * @param customer (detail pelanggan), Di refernsikan dari class Customer
    */
   public Invoice(int id, Food food, Customer customer, 
   InvoiceStatus invoiceStatus){
       this.id = id;
       this.food = food;
       this.date = new GregorianCalendar();
       this.customer = customer;
       this.invoiceStatus = invoiceStatus;
    }
   
   /**
    * Mengambil id dari class Invoice
    * @return id
    */
   public int getId()
   {
       return id;
   }
   
   /**
    * Mengambil idFood dari class Invoice
    * @return idFood
    */
   public Food getFood()
   {
       return food;
   }
   
   /**
    * Mengambil dtae dari class Invoice
    * @return date
    */
   public Calendar getDate()
   {
       return date;
   }
   
   /**
    * Mengambil totalPrice dari class Invoice
    * @return totalPrice
    */
   public int getTotalPrice()
   {
       return totalPrice;
   }
   
   /**
    * Mengambil customer dari class Invoice
    * @return customer
    */
   public Customer getCustomer(){
       return customer;
   }
   
   public abstract PaymentType getPaymentType();
   
   public InvoiceStatus getInvoiceStatus(){
       return invoiceStatus;
   }
   
   /**
    * Menetapkan value idFood dari class Invoice
    * @param idFood
    */
   public void setFood (int Food)
   {
       this.food = food;
   }
   
   /**
    * Menetapkan value date dari class Invoice
    * @param date
    */
   public void setDate (Calendar date)
   {
       this.date = date;
   }
   
   public void setDate (int year, int month, int dayOfMonth)
   {
       this.date = new GregorianCalendar(year, month-1, dayOfMonth);
   }
   
   /**
    * Menetapkan value totalPrice dari class Invoice
    * @param totalPrice
    */
   public abstract void setTotalPrice();
   
   public void setInvoiceStatus(InvoiceStatus invoiceStatus)
   {
       this.invoiceStatus = this.invoiceStatus;
   }
   
   public abstract String toString();
   
    
   
   //public abstract void printData();
   /*{
       System.out.println("====================INVOICE====================");
       System.out.println("Id: "+ id);
       System.out.println("Food ID: "+ Food);
       System.out.println("Date " + date);
       System.out.println("Customer " + customer.getName());
       System.out.println("Total Price: " + totalPrice);
       System.out.println("Status: " + invoiceStatus);
   }*/
}
