public class BookLibApp
{
   public static void main(String args[])
   {
	Library l=new Library();
	
	Book b1=new Book();
	b1.setId(1);
	b1.setName("ABC");
	b1.setAuthor("Baba Amte");

	Book b2=new Book();
	b2.setId(2);
	b2.setName("PQR");
	b2.setAuthor("Prakash Amte");

	Book b3=new Book();
	b3.setId(3);
	b3.setName("XYZ");
	b3.setAuthor("Selena Amte");

	l.setBooks(b1,b2,b3);
   }
}