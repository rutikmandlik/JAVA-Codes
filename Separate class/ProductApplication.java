public class ProductApplication
{
    public static void main(String args[])
    {
        Shop s1=new Shop();
        
        Product p1=new Product();
        p1.setId(1);
        p1.setName("ABC");
        p1.setPrice(100);

        Product p2=new Product();
        p2.setId(2);
        p2.setName("PQR");
        p2.setPrice(200);

        Product p3=new Product();
        p3.setId(3);
        p3.setName("XYZ");
        p3.setPrice(300);

        s1.setProduct(p1,p2,p3);
    }
}