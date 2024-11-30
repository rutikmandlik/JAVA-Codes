class ConvertToUpper
{
    char c[];
    void setCharArray(char ch[])
    {
        c=ch;
    }
    void convertToUpperCase()
    {
        for(int i=0;i< c.length;i++)
        {
            if(c[i] > 'a' && c[i] < 'z')
            {
                c[i]= (char) (c[i]-32);
            }
            System.out.print(c[i]+" ");
        }
    }
}
public class ConvertToUpperApp
{
    public static void main(String args[])
    {
        ConvertToUpper ctu=new ConvertToUpper();
        char ch[]=new char[]{'r','u','t','i','k'};
        ctu.setCharArray(ch);
        ctu.convertToUpperCase();
    }
}