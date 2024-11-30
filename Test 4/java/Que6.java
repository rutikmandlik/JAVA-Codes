import java.util.*;
class BankAccount{
	int accNumber;
	String accHolderName;
	double balance;
	BankAccount(int accNumber,String accHolderName,double balance){
		this.accNumber=accNumber;
		this.accHolderName=accHolderName;
		this.balance=balance;
	}
}
class SavingsAccount extends BankAccount{
	double interestRate;
	SavingsAccount(int accNumber,String accHolderName,double balance,double interestRate){
		super(accNumber,accHolderName,balance);
		this.interestRate=interestRate;
	}
	void annualInterestRate(){
		double interest = (balance * interestRate)/100;
		System.out.println("===============================");
		System.out.println("Account Number: "+accNumber);
		System.out.println("Account Holder name: "+accHolderName);
		System.out.println("Account Balance: "+balance);
		System.out.println("Annual Interest Earned: "+interest);
	}
}
public class Que6{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Number: ");
		int accNumber=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Account Holder name: ");
		String accHolderName=sc.nextLine();
		System.out.println("Enter Account Balance: ");
		double balance=sc.nextDouble();
		System.out.println("Enter interest rate: ");
		double interestRate=sc.nextDouble();
		
		SavingsAccount sa=new SavingsAccount(accNumber,accHolderName,balance,interestRate);
		sa.annualInterestRate();
	}
}