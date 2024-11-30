import java.util.*;
class FindSecondMax
{
    private int a[];
    void setValue(int ...x)
    {
        
        a = x;
    }    
    int getSecondMax()
    {
        if(a.length < 2)
        {
            return -1;
        }

        int max=a[0];
        int smax=-1;

        for(int i=0;i<a.length;i++)
        {
            if(a[i] > max)
            {
                smax = max;
                max = a[i];
            }
            else if(a[i] > smax && a[i] != max)
            {
                smax = a[i];
            }
        }
        return smax;
    }
}
public class SecondMaxPOJO
{
    public static void  main(String args[])
    {
        FindSecondMax fsm=new FindSecondMax();
        
        fsm.setValue(10,20,30,40,50,60,70);
       
        int n=fsm.getSecondMax();
        if(n == -1)
        {
            System.out.println("There is no second largest value.");
        }
        else
        {
            System.out.println("Second Largest value is: "+n);
        }
    }
}