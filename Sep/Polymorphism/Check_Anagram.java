import java.util.*;
public class Check_Anagram
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int b[]=new int[5];
        System.out.print("Input 5 input in 1st int array: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Input 5 input in 2nd int array: ");
        for(int i=0;i<b.length;i++)
        {
            b[i]=sc.nextInt();
        }
        System.out.println();
        
        char c[]=new char[5];
        char d[]=new char[5];

        System.out.print("Input 5 input in 1st char array: ");
        for(int i=0;i<c.length;i++)
        {
            c[i]=sc.next().charAt(0);
        }
        System.out.print("Input 5 input in 2nd char array: ");
        for(int i=0;i<d.length;i++)
        {
            d[i]=sc.next().charAt(0);
        }

        boolean resultInt=isAnagram(a,b);
        if(resultInt)
        {
            System.out.print("Int Array is Anagram");
        }
        else
        {
            System.out.print("Int Array is Not Anagram");
        }
        System.out.println();
        boolean resultChar=isAnagram(c,d);
        if(resultChar)
        {
            System.out.print("char Array is Anagram");
        }
        else
        {
            System.out.print("char Array is Not Anagram");
        }
    }
    public static boolean isAnagram(int a[],int b[])
    {
        boolean flag=true;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                if(b[i]>b[j])
                {
                    int temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i] != b[i])
            {
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static boolean isAnagram(char a[],char b[])
    {
        boolean flag=true;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    char temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                if(b[i]>b[j])
                {
                    char temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i] != b[i])
            {
                flag=false;
                break;
            }
        }
        return flag;
    }
}