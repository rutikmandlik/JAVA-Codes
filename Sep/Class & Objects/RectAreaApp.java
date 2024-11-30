import java.util.*;
class RectArea
{
   int len;
   int wid;
   
   void setLengthWidth(int width,int length)
   {
	wid=width;
	len=length;
   }
   void showArea()
   {
	int area=len * wid;
	System.out.print("Area of Reactangle is: "+area);
   }
}
public class RectAreaApp
{
   public static void main(String args[])
   {
	RectArea ra=new RectArea();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Width: ");
	int w=sc.nextInt();
	System.out.print("Enter Length: ");
	int l=sc.nextInt();
	ra.setLengthWidth(w,l);
	ra.showArea();
   }
}