import java.util.*;
public class Program_No_21
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
	int n,k,j,m,p;
        System.out.println("Enter the total number of monkeys:");
        n = sc.nextInt();
        System.out.println("Enter the number of bananas each monkey can eat:");
        k = sc.nextInt();
        System.out.println("Enter the number of peanuts each monkey can eat:");
        j = sc.nextInt();
        System.out.println("Enter the total number of bananas available:");
        m = sc.nextInt();
        System.out.println("Enter the total number of peanuts available:");
        p = sc.nextInt();

        //number of monkeys that can be fed with bananas
        int bananasFed = m / k;
        //number of monkeys that can be fed with peanuts
        int peanutsFed = p / j;

        //total number of monkeys that can be fed
        int totalFed = bananasFed + peanutsFed;
        int monkeysFed;
        
        //number of monkeys that can actually be fed
        if (totalFed > n) 
        {
            monkeysFed = n;
        } 
	else 
	{
            monkeysFed = totalFed;
        }

        //number of monkeys left on the tree
        int monkeysLeft = n - monkeysFed;

        System.out.println("Number of Monkeys left on the tree: " + monkeysLeft);
    }
}
