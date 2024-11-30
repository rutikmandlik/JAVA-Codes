import java.util.Scanner;
public class MarksCalculator
{
    public static void main(String args[])
     {
       Scanner s=new Scanner(System.in);
       int subject1,subject2,subject3,subject4,subject5;
       int total;
       System.out.println("Enter Marks for Subject 1:");
       subject1=s.nextInt();
       System.out.println("Enter Marks for Subject 2:");
       subject2=s.nextInt();
       System.out.println("Enter Marks for Subject 3:");
       subject3=s.nextInt();
       System.out.println("Enter Marks for Subject 4:");
       subject4=s.nextInt();
       System.out.println("Enter Marks for Subject 5");
       subject5=s.nextInt();

       total=subject1+subject2+subject3+subject4+subject5;
       double percentage=(total/5.0);

       System.out.println("Toatl Marks:"+total);
       System.out.println("Percentage:"+percentage + "%");
     }
}