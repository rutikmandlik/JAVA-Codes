public class SumOfNumbers
{
    public static void main(String[] args) 
    {
        String s = "10rutik53abhi123java978html";
        int sum = 0, n = -1;

        for (int i = 0; i < s.length(); i++) 
 	{
            char c = s.charAt(i);

            if (c >= '0' && c <= '9') 
	    {
                n = (n == -1) ? c - '0' : n * 10 + (c - '0');
            } 
	    else if (n != -1) 
 	    {
                sum += n;
                n = -1;
            }
        }

        if (n != -1) 
	sum += n;
        System.out.println("Sum of all numbers: " + sum);
    }
}
