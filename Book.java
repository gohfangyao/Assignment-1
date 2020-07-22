public class Book //intended to be extended to create a full implementation
{
   //private because it cannot be directly accessed in other class
   private String title;
   private double price;
   
   
   public Book(String strTitle, double dbPrice) //constructor method assigns values to the corresponding fields
   {
      setTitle(strTitle);
      setPrice(dbPrice);
   }
   
   public Book(String strTitle, String strPrice) //constructor method assigns values to the corresponding fields
   {
      setTitle(strTitle);
      setPrice(strPrice);
     
   }
   //OVERLOADING 
   //OVERLOADING set price in Double
   public void setPrice(double dbPrice) {
	
	price=dbPrice;
}
   
   //OVERLOADING 
   //OVERLOADING set price in String
   //so user can type the price in letters instead of numbers
   public void setPrice(String strPrice) {
		
		price=Double.parseDouble(strPrice);
	}

public void setTitle(String strTitle) {
	
	title=strTitle;
}

   public String getTitle()
   {
      return title;
   
   }
   public double getPrice()
   {
      return price;
   
   }
   public void print()
   {
      System.out.println("Book title:" + getTitle());
      System.out.println("Book price(RM):" +getPrice());
   
   }
}
