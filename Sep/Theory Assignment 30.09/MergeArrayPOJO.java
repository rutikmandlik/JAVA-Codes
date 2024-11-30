import java.util.*;
class MergeArray
{
    private int a[];
    private int b[];
    private int m[];
    void setArray(int a[],int b[])
    {
        this.a=a;
        this.b=b;
    }
    void performMerge()
    {
        m=new int[a.length+b.length];
        for(int i=0;i<a.length;i++)
        {
            m[i]=a[i];
            //m[i+a.length]=b[i];
        }
        for(int i=0;i<b.length;i++)
        {
            m[i+a.length]=b[i];
        }
    }
    int[] getMergeArray()
    {
        return m;
    }
}
public class MergeArrayPOJO
{
    public static void main(String args[])
    {
        MergeArray ma=new MergeArray();
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[5];
        System.out.print("Enter 5 input in first array: ");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int arr2[]=new int[5];
        System.out.print("Enter 5 input in second array: ");
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=sc.nextInt();
        }
        ma.setArray(arr1,arr2);
        ma.performMerge();
        
        int MergedArray[]=ma.getMergeArray();
        System.out.print("Merged Array is: ");
        for(int i=0;i<MergedArray.length;i++)
        {
            System.out.print(MergedArray[i]+" ");
        }
    }
}