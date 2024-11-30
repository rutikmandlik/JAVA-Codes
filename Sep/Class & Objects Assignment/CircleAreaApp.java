import java.util.*;
class circle
{
    double r;
    void setRadius(double radius)
    {
        r=radius;
    }
    void showArea()
    {
        double a=3.14*r*r;
        System.out.print("Area of circle is: "+a);
    }
}
public class CircleAreaApp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius: ");
        int radius=sc.nextInt();
        circle cr=new circle();
        cr.setRadius(radius);
        cr.showArea();
    }
}