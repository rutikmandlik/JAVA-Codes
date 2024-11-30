class Per{
	int marks[];
	void setMarks(int marks[]){
		this.marks=marks;
	}
}
class Nine extends Per{
	void showNinePer(){
		int per = 0;
		for(int i=0;i<marks.length;i++){
			per += marks[i];
		}
		System.out.println("Perccentage of 9th are: "+(per/marks.length));
	}
}
class Ten extends Per{
	int m[];
	void setMarks(int marks[]){
		this.m=marks;
	}
	
	for(int i=0;i<m.length;i++){
		for(int j=i+1;j<m.length;j++){
			if(m[i] < m[j]){
				int temp=m[i];
				m[i]=m[j];
				m[j]=temp;
			}
		}
	}
	
	void showTenPer(){ 
		int per = 0;
		for(int i=0;i<m.length;i++){
			if(m[i]>=0 && m[i]<=m.length-1)
			per += m[i];
		}
		System.out.println("Perccentage of 10th are: "+(per/m.length - 1));
	}
}
public class 10-11-Q1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a1[]=new int[6];
		System.out.println("Enter marks of 9th standard: ");
		for(int i=0;i<a1.length;i++){
			a1[i]=sc.nextInt();
		}
		Nine n=new Nine();
		n.setMarks(a1);
		n.showNinePer();
		
		int a2[]=new int[6];
		System.out.println("Enter marks of 10th standard: ");
		for(int i=0;i<a2.length;i++){
			a2[i]=sc.nextInt();
		}
		Ten t=new Ten();
		t.setMarks(a2);
		t.showTenPer();
	}
}
