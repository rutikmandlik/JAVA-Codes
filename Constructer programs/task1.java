/*
Q1. Suppose consider we have two character array word1={‘a’,’b’,’c’} and word2={‘p’,’q’,’r’} 
Merge the two array in alternate order starting word1 
Note: set both character size same 
Example:
word1={‘a’,’b’,’c’}
word2={‘p’,’q’,’r’}
word3={‘a’,’p’,b’,’q’,’c’,’r’}

Your task
You have to create class name as AlterMerge with parameterized constructor 
AlterMerge(char word1[],char word2[]): this constructor can accept two character array as parameter 
char []  getMergedArray(): this method can merge two array and store in third character and return it.
*/

class AlterMerge
{
	char word1[];
	char word2[];
	//char word3[];
	
	AlterMerge(char word1[],char word2[]){
		this.word1=word1;
		this.word2=word2;
			
	}
	public char[] getMergedArray(){
		int k = 0;
		int p = 0;
		
		char[] word3 = new char[word1.length + word2.length];

		for (int i = 0; i < word3.length; i++) {
            if (i % 2 == 0 && k < word1.length) {
                word3[i] = word1[k++];
            } 
			else if (p < word2.length) {
                word3[i] = word2[p++];
            }
		}
		return word3;
	}
}
public class task1
{
	public static void main(String args[])
	{
		char word1[]={'g','o','o','d'};
		char word2[]={'f','r','e','s','h'};
		
		AlterMerge  am= new AlterMerge(word1,word2);
		
		char [] mergearray = am.getMergedArray();
		for(int i=0;i< mergearray.length;i++)
		{
			System.out.print(mergearray[i]+" ");
		}
	}
}