import java.util.*;
public class Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[5];
        char arr2[]=new char[5];
        System.out.print("Input 5 inputs in int array: ");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter 5 inputs in char array: ");
        for(int j=0;j<arr2.length;j++)
        {
            arr2[j]=sc.next().charAt(0);
        }
        rev(arr1);
        rev(arr2);
    }
        public static void rev(int a[])
        {
            int start=0;
            int end=a.length - 1;
            while(start < end)
            {
                int temp=a[start];
                a[start]=a[end];
                a[end]=temp;

                ++start;
                --end;
            }
            System.out.print("Reversed array is: ");
            for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i]+" ");
            }
        }
        public static void rev(char c[])
        {
            int start=0;
            int end=c.length - 1;
            while(start < end)
            {
                char temp=c[start];
                c[start]=c[end];
                c[end]=temp;

                ++start;
                --end;
            }
            System.out.print("\nReversed array is: ");
            for(int i=0;i<c.length;i++)
            {
                System.out.print(c[i]+" ");
            }
        }
}