class Sum
{
    int a[];
    void calSum(int ...x)
    {
        a=x;
        int s=0;
        for(int i=0;i<a.length;i++)
        {
            s += a[i];
        }
        System.out.print("Sum is: "+s);
    }
}
public class SumApplication
{
    public static void main(String args[])
    {
        Sum s=new Sum();
        s.calSum(10,20,30,40,50);
    }
}