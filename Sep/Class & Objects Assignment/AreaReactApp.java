import java.util.*;
class rectangle
{
    double l,w;
    void setLengthWidth(double len,double wid)
    {
        l=len;
        w=wid;
    }
    void showArea()
    {
        double a= l * w;
        System.out.print("Area of Rectangle is: "+a);
    }
}
public class AreaReactApp
{
    public static void main(String args[])
    {
        rectangle rt=new rectangle();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        int len=sc.nextInt();
        System.out.print("Enter width of rectangle: ");
        int wid=sc.nextInt();
        rt.setLengthWidth(len,wid);
        rt.showArea();
    }
}