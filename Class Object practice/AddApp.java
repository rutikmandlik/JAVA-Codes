class Add
{
   int m[];
   void setValue(int a[])
   {
	m=a;
   }
   void showAddition()
   {
	int sum=0;
	for(int i=0;i<m.length;i++)
 	{
	   sum += m[i];
	}
	System.out.println("Addition is: "+sum);
   }
}
public class AddApp
{
   public static void main(String args[])
   {
	Add ad=new Add();
	int arr[]=new int[]{10,20,30,40,50};
	ad.setValue(arr);
	ad.showAddition();
   }
}