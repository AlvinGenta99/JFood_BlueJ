import java.util.*;
public class JFood
{
 static void main (String[] args){
     Customer customer1 = new Customer(1,"Alvin","Alvin@gmail.com","Test123",new GregorianCalendar(TimeZone.getTimeZone("Asia/Jakarta")));
     Customer customer2 = new Customer(1,"Bedu","Bebu&_12","Password12",2020, 3, 19);
     //System.out.println(customer1.toString());
    
     Promo promo1 = new Promo(2,"FESTIVAL",1000,10000,true);
     Location location1 = new Location("DKI","Srengseng","Jakbar");
     Seller seller1 = new Seller (12,"Alvin Genta","Kurisaki00@gmail.com","0812-xxx",location1);
     Food food1 = new Food(1,"Caramel Mochaasdada",20000,FoodCategory.COFFEE,seller1);
     Food food2 = new Food(2,"Burger Edam",10000,FoodCategory.SNACKS,seller1);   
     CashlessInvoice cashlessInvoice1 = new CashlessInvoice(01, food1,customer1, InvoiceStatus.FINISHED,promo1);
     //CashlessInvoice cashInvoice2 = new CashlessInvoice(02, food2,"13/3/2020", customer1,InvoiceStatus.ONGOING,promo1);
     //CashlessInvoice cashInvoice3 = new CashlessInvoice(03, food1,"14/3/2020", customer1,InvoiceStatus.ONGOING,promo1);
     CashInvoice cashInvoice1 = new CashInvoice(02, food2, customer1,InvoiceStatus.FINISHED, 12000);
     //CashInvoice cashInvoice2 = new CashInvoice(02, food2,"13/3/2020", customer1,InvoiceStatus.ONGOING,12000);
     //Invoice invoice = new Invoice(1,1, "2020-01-01", 45000, customer1, PaymentType.CASH, InvoiceStatus.FINISHED);
     System.out.println(cashlessInvoice1.toString()+"\n");
     System.out.println(cashInvoice1.toString());
 }
}
