class Library
{
   void setBooks(Book ...b)
   {
	for(int i=0;i<b.length;i++)
	{
	   System.out.print(b[i].getId()+"\t"+b[i].getName()+"\t"+b[i].getAuthor()+"\n");
	}
   }
}