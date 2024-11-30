import java.util.*;
public class Wages
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Employee Age: ");
      int Age=sc.nextInt();
      System.out.print("Enter Employee Gender(M/F): ");
      char Gender=sc.next().charAt(0);
      System.out.print("Enter Days of Working:");
      int Nod=sc.nextInt();
   
      String res=(Age>=18 && Age<30 && Gender=='M')? "Daily Wages are RS "+Nod*700 :
                 (Age>=18 && Age<30 && Gender=='F')? "Daily Wages are RS "+Nod*750 :
                 (Age>=30 && Age<=40 && Gender=='M')? "Daily Wages are RS "+Nod*800 :
                 (Age>=30 && Age<=40 && Gender=='F')? "Daily Wages are RS "+Nod*850 :
                 (Age>=40 && Age<=50 && Gender=='M')? "Daily Wages are RS "+Nod*900 :
                 (Age>=40 && Age<=50 && Gender=='F')? "Daily Wages are RS "+Nod*950 :
                 (Age<50 && Age<=60 && Gender=='M' || Gender=='F')? "Daily Wages are RS "+Nod*1000 :
                 (Age<60 && Gender=='M' || Gender=='F')? "Retired" : "Invalid" ;
     System.out.print(res);
   }
}