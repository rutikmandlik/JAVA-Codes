import java.util.*;
class Seller
{
    int cp;
    int sp;
    void acceptSellingCostPrice(int cp, int sp)
    {
        this.cp=cp;
        this.sp=sp;
    }
    void showProfitLoss()
    {
        if(cp < sp)
        {
            System.out.print("Profit");
        }
        else
        {
            System.out.print("Loss");
        }
    }
}
public class SellerApp
{
    public static void main(String args[])
    {
        Seller sl=new Seller();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        int cp=sc.nextInt();
        System.out.print("Enter Sellng Price: ");
        int sp=sc.nextInt();

        sl.acceptSellingCostPrice(cp,sp);
        sl.showProfitLoss();
    }
}