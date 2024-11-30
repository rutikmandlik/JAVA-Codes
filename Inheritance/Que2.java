import java.util.*;
class CharArray{
	char ch[];
	void setCharArray(char ch[]){
		this.ch=ch;
	}
}
class ConvertToUpper extends CharArray{
	void convertToUpperCase(){
		for(int i=0;i<ch.length;i++){
			if(ch[i]>= 'a' && ch[i]<='z'){
				ch[i]-= 32;
				
			}
			System.out.print(ch[i]+" ");
		}
	}
}
class RevCharArr extends CharArray{
	void revCharArray(){
		int left=0;
		int right=ch.length-1;
		while(left < right){
			char temp = ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			
			right--;
			left++;
		}
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]+" ");
		}
	}
}
class FindCapitalLetters extends CharArray{
	void findUpperCaseLetter(){
		for(int i=0;i<ch.length;i++){
			if(ch[i]>='A' && ch[i]<='Z'){
				System.out.print(ch[i]+" ");
			}
		}
	}
}
public class Que2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Caharacter array: ");
		int size= sc.nextInt();
		char ch[]=new char[size];
		System.out.println("Enter character input: ");
		for(int i=0;i<ch.length;i++){
			ch[i]=sc.next().charAt(0);
		}
		
		//ConvertToUpper ctu=new ConvertToUpper();
		//ctu.setCharArray(ch);
		//System.out.println("After Converting lower case to upper case: ");
		//ctu.convertToUpperCase();
		
		RevCharArr rca=new RevCharArr();
		rca.setCharArray(ch);
		System.out.println("\nReverse character array is: ");
		rca.revCharArray();
		
		FindCapitalLetters fcl=new FindCapitalLetters();
		fcl.setCharArray(ch);
		System.out.println("\nCapital Letters are: ");
		fcl.findUpperCaseLetter();
	}
}