import java.util.*;
class Interest{
	int pamt;
	int irate;
	int dur;
	void setPRD(int pamt,int irate,int dur){
		this.pamt=pamt;
		this.irate=irate;
		this.dur=dur;
	}
}
class CalculateInterest extends Interest{
	void calInterest(){
	
		System.out.println("Simple Interest is: "+((pamt * irate * dur)/100));
	}
}
public class  InterestApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principle Amount: ");
		int pamt=sc.nextInt();
		System.out.print("Enter Interest Rate: ");
		int irate=sc.nextInt();
		System.out.print("Enter Time Duration: ");
		int dur=sc.nextInt();
		
		CalculateInterest ci = new CalculateInterest();
		ci.setPRD(pamt,irate,dur);
		ci.calInterest();
	}
}