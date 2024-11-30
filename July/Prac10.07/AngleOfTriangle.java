public class AngleOfTriangle
{
    public static void main(String args[])
    {
       int angle1,angle2,angle3;
       angle1=Integer.parseInt(args[0]);
       angle2=Integer.parseInt(args[1]);
       angle3=180-(angle1+angle2);
       System.out.println("Angle 3="+angle3);
    }
}