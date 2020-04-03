
/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseCustomer
{
   private static String[] listCustomer;

   public DatabaseCustomer()
   {
   }
   public static boolean addCustomer(Customer customer){
       return true;
   }
   public static boolean removeCustomer(Customer customer){
       return true;
   }
   public static Customer getCustomer(){
       return null;
   }
   public static String[] getListCustomer(){
       return listCustomer;
   }
}
