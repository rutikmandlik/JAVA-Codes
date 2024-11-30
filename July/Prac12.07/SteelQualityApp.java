import java.util.*;
public class SteelQualityApp
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int H,T;
      float C;
      System.out.print("Enter Hardness of Steel: ");
      H=sc.nextInt();
      System.out.print("Enter Carbon Content of Steel: ");
      C=sc.nextFloat();
      System.out.print("Enter Tensile Strength of Steel: ");
      T=sc.nextInt();
   
      String res=(H>50 && C<0.7 && T>5600)? "Quality= 10 Grades" :
                 (H>50 && C<0.7)? "Quality= 9 Grades" :
                 (C<0.7 && T>5600)? "Quality= 8 Grades" :
                 (H>50 && T>5600)? "Quality= 7 Grades" :
                 (H>50)? "Quality= 6 Grades" :
                 (C<0.7)? "Quality= 6 Grades" :
                 (T>5600)? "Quality= 6 Grades" : 
                            "Quality= 5 Grades" ;
    System.out.print(res);
   }
}