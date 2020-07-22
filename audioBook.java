public class audioBook extends Book //inherit from the class Book.
{

	public audioBook(String title, double price) {
		super(title, price);
		
	}
	public audioBook(String title,  String strprice) {
		super(title,strprice);
		
	}
	
	public static void Content()
	{
		System.out.println("Content           : Read aloud of content");	
	}	
	
	public void HighlightContent()
	{
		System.out.println("Highlight Content : No");
	}	
	
	public void Bulky()
	{
		System.out.println("Bulky             : No");
	}	
	
	public void NeedPower()
	{
		System.out.println("Need Power        : Yes");
	}	
	
	public void ReadInDark()
	{
		System.out.println("Read In Dark      : Yes");
	}	
	
	public static void Productive()
	{
		System.out.println("Productive        : Can multi task while listening");
	}	
	
	public static void Feature()
	{
		System.out.println("Audio!!!");
	}	
	

	public void print() //Overriding the superclass (Book class) method
	{
		System.out.println("Features of Audio Book");
		 System.out.println("-----------------------------------------------------------");
		super.print(); //call method print() in superclass (Book class)
	}
	
}
