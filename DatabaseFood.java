/**
 * class DatabaseFood digunakan untuk memanage Database makanan.
 * Terdapat fungsi untuk menambah dan menghapus makanan di dalam database.
 * @author Alvin Genta Pratama
 * @version 1.1.27.20
 */
public class DatabaseFood
{   
   /**
    * Variable DatabaseFood
    */
   private static String[] listFood;
   
   /**
    * Constructor DatabaseFood
    */
   public DatabaseFood(){
   }
   
   /**
    * Mengambil Boolean untuk menambah food (makanan) di class DatabaseFood
    * @return true
    */
   public static boolean addFood(Food food){
       return true;
   }
   
   /**
    * Mengambil Boolean untuk menghapus food (makanan) di class DatabaseFood
    * @return true
    */
   public static boolean removeFood(Food food){
       return true;
   }
   
   public static Food getFood(){
        return null;
    }
    
   /**
    * Mengambil Boolean mengambil list food di class DatabaseFood
    * @return listFood
    */
   public static String[] getListFood(){
       return listFood;
   }
}
