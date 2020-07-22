public class printedBook extends Book //inherit from the class Book.
{

	public printedBook(String title, double price) {
		super(title, price);
	}

	public printedBook(String title,  String strprice) {
		super(title,strprice);
		
	}
	
	
	public void Content()
	{
		System.out.println("Content           : Words of the content");	
	}	
	
	public void HighlightContent()
	{
		System.out.println("Highlight Content : Yes");
	}	
	
	public void Bulky()
	{
		System.out.println("Bulky             : Yes");
	}	
	
	public void NeedPower()
	{
		System.out.println("Need Power        : No");
	}	
	
	public void ReadInDark()
	{
		System.out.println("Read In Dark      : No");
	}	
	
	
	public void print() //Overriding the superclass (Book class) method
	{
		System.out.println("Features of Printed Book");
		System.out.println("-----------------------------------------------------------");
		super.print(); //call method print() in superclass (Book class)
	}

}
