import java.util.*;
class Player
{
   private int id;
   private String name;
   private int age;
   private int run;

   public void setDetails(int pid,int rn,int ag,String nm)
   {
	id=pid;
	run=rn;
	age=ag;
	name=nm;
   }
   public int getId()
   {
	return id;
   }
   
   public String getName()
   {
	return name;
   }
   
   public int getAge()
   {
	return age;
   }
   
   public int getRun()
   {
	return run;
   }
}
class ICCBoard
{
   Player p[];
   void setNewPlayer(Player ...pobject)
   {
	p=pobject;
   }
   void showDetails(int count)
   {
	for(int i=0;i<count;i++)
	{
	   System.out.println("Id: "+p[i].getId());
	   System.out.println("Name: "+p[i].getName());
 	   System.out.println("Age: "+p[i].getAge());
	   System.out.println("Run: "+p[i].getRun());
	}
   }
}
public class PlayerICCBoard
{
   public static void main(String args[])
   {
	Player p[]=new Player[4];
	
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<p.length;i++)
	{
	   p[i]=new Player();
	   System.out.println("Enter name: ");
	   String name=sc.nextLine();
	   System.out.println("Enter Id: ");
	   int id=sc.nextInt();
	   System.out.println("Enter Runs: ");
	   int run=sc.nextInt();
	   System.out.print("Enter age: ");
	   int age=sc.nextInt();
	   sc.nextLine();
	   p[i].setDetails(id,run,age,name);   
	}
	
	ICCBoard icObject=new ICCBoard();
	Player temp[]=new Player[4];
	int count=0;
	for(int i=0;i<p.length;i++)
	{
	   if(p[i].getAge() > 16 && p[i].getAge() < 40)
	   {
		temp[count]=new Player();
		temp[count].setDetails(p[i].getId(),p[i].getRun(),p[i].getAge(),p[i].getName());
		count++;
	   }
	}
	
	icObject.setNewPlayer(temp);
	icObject.showDetails(count);
   }
}