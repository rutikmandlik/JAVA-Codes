/*
1. Write a java program to display following pattern :
  1  2  3  4  5
 10  9  8  7  6
 11 12 13 14 15
 20 19 18 17 16
 21 22 23 24 25
*/

public class Que1{
	public static void main(String args[]){
		int n=0;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i % 2 == 1){
					System.out.print(++n+" ");
				}
				else{
					System.out.print(n--+" ");
				}
			}
			/*
			if(i%2 != 0){
					n += 4;
			}else{
					n+= 6;
			}*/
			n += 5
			System.out.println();
		}
	}
}
