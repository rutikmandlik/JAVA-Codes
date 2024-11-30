import java.util.*;
public class AlphaApp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Character:");
        char ap=sc.next().charAt(0);
        ap=(ap>='A' && ap<='Z') ? (char)((int)ap+32) : ap ; 
        String res=(ap=='a' || ap=='e' || ap=='i' || ap=='o' || ap=='u')? "It is a Vowel" : "It is a Consonant" ;
        System.out.println(res); 
    }
}