import java.util.*;
class InsertArrEle
{
    int c[];
    void setIntArray(int ch[])
    {
        c=ch;
    }
    void insertValueOnIndex(int index , int value)
    {
        int b[]=new int[c.length + 1];     // Create a new array with size larger by 1

        for(int i=0;i< index;i++)      // Copy elements before the index
        {
            b[i]=c[i];
        }

        b[index]=value;               // Insert the new value at the index
        
        for(int i=index;i<c.length;i++)         // Copy the remaining elements
        {
            b[i+1]=c[i];
        }
        for(int i=0;i<b.length;i++)    
        {
            System.out.print(b[i]+" ");
        }
    }
}
public class InsertElement
{
    public static void main(String args[])
    {
        InsertArrEle ie=new InsertArrEle();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter input in array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        ie.setIntArray(arr);
        
        System.out.print("Enter the index: ");
        int index=sc.nextInt();

        if (index < 0 || index > arr.length)
        {
            System.out.println("Invalid index.");
            return;
        }
        System.out.print("Enter the Value: ");
        int value=sc.nextInt();

        ie.insertValueOnIndex(index,value);
       
    }
}