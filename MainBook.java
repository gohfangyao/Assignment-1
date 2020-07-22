public class MainBook 
{
    public static void main(String[]args)
    {
    	
   printedBook b1 = new printedBook("<<English Proficiency>>", 50);
   b1.print();
   b1.Content();
   b1.HighlightContent();
   b1.Bulky();
   b1.NeedPower();
   b1.ReadInDark(); 
  
   System.out.println();	
   System.out.println();
   
   EBook b2 = new EBook("<<The Importance of Emotional Metrics>>", 150.48);
   b2.print();
   b2.Content();
   b2.HighlightContent();
   b2.Bulky();
   b2.NeedPower();
   b2.ReadInDark();
   System.out.println("-----------------------------------------------------------");
   System.out.println("<Additional properties>");
   b2.Dictionary();	
   b2.Compact();
   System.out.println();	
   System.out.println();
   
   audioBook b3 = new audioBook("<<Exploiting Poker Tells>>", "200");
   b3.print();
   b3.Content();
   b3.HighlightContent();
   b3.Bulky();
   b3.NeedPower();
   b3.ReadInDark();
   b3.Productive();
   System.out.println("-----------------------------------------------------------"); 
   System.out.println("<Additional properties>"); 
   b3.Feature();
  			
    }
	
}
