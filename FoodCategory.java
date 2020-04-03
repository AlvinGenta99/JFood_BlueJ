public enum FoodCategory
   { 
   COFFEE("Coffee"), WESTERN("Western"), SNACKS("Snacks"), RICE("Rice"), NOODLES("Noodles"), BAKERY("Bakery"), JAPANESE("Japanese");

   private String category;
   private FoodCategory(String category){
       this.category = category;
   }
   public String toString(){
       return category;
   }
}
