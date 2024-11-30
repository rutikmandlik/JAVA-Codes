public class TempApp2
{
     public static void main(String args[])
     {
       float fahr,cel;
       cel=Integer.parseInt(args[0]);
       fahr=(cel*9/5)+32;
       System.out.println("Answer is:"+fahr);
     }
}