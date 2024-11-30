import java.util.*;
class Player
{
    private int id;
    private String name;
    private int run;
    private int marks;

    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name=name;
    } 
    public String getName()
    {
        return name;
    }
    public void setRun(int run)
    {
        this.run=run;
    }
    public int getRun()
    {
        return run;
    }
    public void setMarks(int marks)
    {
        this.marks=marks;
    }
    public int getMarks()
    {
        return marks;
    }

}
public class PlayerPOJO
{
    public static void main(String args[])
    {
        Player p1=new Player();
        Scanner sc=new Scanner(System.in);
        int choice,x;
         
        do
        {
            System.out.println("1.Add record \n 2.Show Record");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
             sc.nextLine();  // Consume the newline character after nextInt()
            switch(choice)
            {
                case 1:
                    int id,run,mark;
                    String name;
                    System.out.println("Enter id, name, run and marks: ");
                    id=sc.nextInt();
                     sc.nextLine();  // Consume the newline character after nextInt()
                    name=sc.nextLine();
                    run=sc.nextInt();
                    mark=sc.nextInt();

                    p1.setId(id);
                    p1.setName(name);
                    p1.setRun(run);
                    p1.setMarks(mark);

                    break;

                case 2: 
                    System.out.println("Record is: ");
                    System.out.println("id is: "+p1.getId());
                    System.out.println("Name is: "+p1.getName());
                    System.out.println("Run  is: "+p1.getRun());
                    System.out.println("marks is: "+p1.getMarks());    
                    break;
                
                default:
                    System.out.println("Invalid Choice");
            }
            System.out.print("Do you want to continue(y=1 / n=0)?");
            x=sc.nextInt();
             sc.nextLine();  // Consume the newline character after nextInt()
        }
        while(x == 1);
    }
}