public class EBook extends Book //inherit from the class Book.
{

	public EBook(String title, double price) {
		super(title,price);
		
	}
	public EBook(String title,  String strprice) {
		super(title,strprice);
		
	}

	public static void Content()
	{
		System.out.println("Content           : Words of the content");	
	}	
	
	public void HighlightContent()
	{
		System.out.println("Highlight Content : Yes");
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
		System.out.println("Read In Dark      : Yes, Using Backlight");
	}	
	
	public static void Dictionary()
	{
		System.out.println("Dictionary (Available in kindle)");
	}	
	
	public static void Compact()
	{
		System.out.println("Compact (Small, easy to carry)");
	}	
	
	
	public void print() //Overriding the superclass (Book class) method
	{
		System.out.println("Features of EBook");
		 System.out.println("-----------------------------------------------------------");
		super.print(); //call method print() in superclass (Book class)
	}
	
}
