/*
Q.2 WAP to create class name as TestChar with 
Method void setCharArray(char []) this method can accept character array as parameter and we have two classes name as 
ToUpperCase with two methods void convertToUpper() this method convert your character array as upper and we have one 
method void show() display the character array after conversion and we have one more class name as RevWord with one methods 
Void revWord(): this method can accept character and reverse the word and display it 

*/
import java.util.*;
class TestChar{
	char ch[];
	void setCharArray(char ch[]){
		this.ch=ch;
	}
}
class ToUpperCase extends TestChar{
	void convertToUpper(){
		for(int i=0;i<ch.length;i++){
			if(ch[i]>='a'&&ch[i]<='z'){
				ch[i] -= 32;
			}
		}
	}
	void show(){
		System.out.println("Converted array is: ");
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]+" ");
		}
	}
}
class RevWord extends TestChar{
	void revWord(){
		int left=0;
		int right=ch.length-1;
		while(left < right){
			char temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			
			left++;
			right--;
		}
		System.out.println("\nReversed array is: ");
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]+" ");
		}
	}
}
public class Q2_12_11{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		char ch[]=new char[5];
		System.out.println("Enter 5 character input in array: ");
		for(int i=0;i<ch.length;i++){
			ch[i]=sc.next().charAt(0);
		}
		
		ToUpperCase tuc=new ToUpperCase();
		tuc.setCharArray(ch);
		tuc.convertToUpper();
		tuc.show();
		
		RevWord rw=new RevWord();
		rw.setCharArray(ch);
		rw.revWord();
	}
}