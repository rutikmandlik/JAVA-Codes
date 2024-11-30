import java.util.*;
class Student
{
    private int id;
    private String name;
    private double per;
    private int mark;

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
    public void setPer(double per)
    {
        this.per=per;
    }
    public double getPer()
    {
        return per;
    }
    public void setMark(int mark)
    {
        this.mark=mark;
    }
    public int getMark()
    {
        return mark;
    }
}
public class StudentPOJO
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Student st=new Student();
        int choice,x;

        while(true){
            System.out.print("\n 1.Add Record \n 2.Show Record \n 3.Exit");
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter id: ");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.print("\nEnter name: ");
                    String name=sc.nextLine();
                    System.out.print("\nEnter Percentage: ");
                    double per=sc.nextDouble();
                    System.out.print("\nEnter Marks: ");
                    int mark=sc.nextInt();

                    st.setId(id);
                    st.setName(name);
                    st.setPer(per);
                    st.setMark(mark);
                    break;

                case 2:
                    System.out.println("Record is: ");
                    System.out.println("ID is "+st.getId());
                    System.out.println("Name is "+st.getName());
                    System.out.println("Percentage are "+st.getPer());
                    System.out.println("Marks are "+st.getMark());

                    break;

                case 3:
                    System.out.println("Prigrame is ended.....");
                    return;

                default:
                    System.out.println("Invalid Choice");  
            }
            //System.out.println("Do you want to continue(yes=1 / no=0)? ");
            //x=sc.nextInt();
        }
        //while(x == 1);
    }
}