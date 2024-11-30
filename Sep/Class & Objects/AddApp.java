import java.util.*;
class Add                      //step1 - declaration 
{
   Scanner sc=new Scanner(System.in);
   int a,b;
   void setValue()         //step2- define functions 
   {
 	System.out.println("Enter Two values: ");
	a=sc.nextInt();
	b=sc.nextInt();
   }
   void showAdd()       //step2- define functions 
   {
	System.out.printf("Addition is:%d ", a+b);
   }
}
public class AddApp
{
   public static void main(String args[])
   {
	Add ad=new Add();         //step3- creted object of class for use class data
	ad.setValue();            //step4- call function using object or reference
	ad.showAdd();             //step4- call function using object or reference
   }
}