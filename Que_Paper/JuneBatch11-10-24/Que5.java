/*
Q5. Write a java program to create a class name as StringApp to accept charchater array 
and implement the logic.
Input : - Indian
Search Value : - d
Output : - n i
*/

class StringApp{
	StringApp(char ch[],char skey){
		boolean flag=false;
		for(int i=0;i<ch.length-1;i++){
			if(ch[i]==skey)
			{
				System.out.println(ch[i-1]);
				System.out.println(ch[i+1]);
			}
		}
	}
}
public class Que5{
	public static void main(String args[]){
		char ch[]={'i','n','d','i','a'};
		char skey='d';
		
		StringApp sa=new StringApp(ch,skey);
	}
}