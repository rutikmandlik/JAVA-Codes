public class Shop
{
    void setProduct(Product ...p)
    {
        for(int i=0;i<p.length;i++)
        {
            System.out.print(p[i].getId()+"\t");
            System.out.print(p[i].getName()+"\t");
            System.out.print(p[i].getPrice()+"\t");
            System.out.println();

        }
    }
}