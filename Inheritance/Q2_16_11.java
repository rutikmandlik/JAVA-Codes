/*
Q2. WAP to create abstract class name as Pattern with one abstract method 
abstract void  display(): this  is the abstract method and used for displaying the patterns.
We have to create two child classes name as First and need to override display() method in it 
and show the  following pattern
1
2 # 2
3 # 3 # 3
4 # 4 # 4 # 4
5 # 5 # 5 # 5 # 5

Create one more class name as Second and override display() method in it and print the following pattern
a
AB
abc
ABCD
abcde

*/

abstract class Pattern{
	
	abstract void display();
}
class First extends Pattern{
	
	void display(){
	
		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if(j <= (2 * i - 1)){
					if(j % 2 == 1){
						System.out.print(i+" ");
					}
					else{
						System.out.print("# ");
					}
				}
			}
			System.out.println();
		}
	}
}
class Second extends Pattern{
	
	void display(){
		
		for(int i=1;i<=5;i++){
			char ch = 65;
			for(int j=1;j<=5;j++){
				if(i >= j){
					if(i % 2 == 0){
						System.out.print(ch);
					}
					else{
						System.out.print((char)(ch+32));
					}
					ch++;
				}
			}
			System.out.println();
		}
	}
	
	/*
	void display() {
    for (int i = 1; i <= 5; i++) { 
        char ch = (i % 2 == 0) ? 'A' : 'a'; // Determine starting character (uppercase or lowercase)
        for (int j = 1; j <= i; j++) { 
            System.out.print(ch); 
            ch++; 
        }
        System.out.println(); 
    }
}

	*/
}
public class Q2_16_11{
	public static void main(String args[]){
		First f=new First();
		f.display();
		
		Second s=new Second();
		s.display();
	}
}