import java.util.*;
class Student
{
    private int id;
    private String name;
    private float per;
    private int totalFees;
    private int disFees;
    private int actualPaidFees;

    void setId(int id)
    {
        this.id=id;
    }
    int getId()
    {
        return id;
    }
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return name;
    }
    void setPer(float per)
    {
        this.per=per;
    }
    float getPer()
    {
        return per;
    }
    void setTotalFees(int totalFees)
    {
        this.totalFees=totalFees;
    }
    int getTotalFees()
    {
        return totalFees;
    }
    void setDisFees(int disFees)
    {
        this.disFees=disFees;
    }
    int getDisFees()
    {
        return disFees;
    }
    void setActualPaidFees(int actualPaidFees)
    {
        this.actualPaidFees=actualPaidFees;
    }
    int getActualPaidFees()
    {
        return actualPaidFees;
    }
    
}
class DiscountFees
{
    Student student;
    void setStudent(Student student)
    {
        this.student=student;
    }
    void checkDiscountEligibility(float per)
    {
        if(per > 60)
        {
            // Calculate 30% discount
            int discount = (int)(student.getTotalFees() * 0.30);
            student.setDisFees(discount);
            // Calculate actual fees to be paid after discount
            student.setActualPaidFees(student.getTotalFees() - discount);
        } 
        else 
        {
            // No discount for students with percentage <= 60
            student.setDisFees(0);
            student.setActualPaidFees(student.getTotalFees());
        }
        
    }
    void show()
    {
        System.out.println("\nStudent ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Percentage: " + student.getPer());
        System.out.println("Total Fees: " + student.getTotalFees());
        System.out.println("Discounted Fees: " + student.getDisFees());
        System.out.println("Actual Paid Fees: " + student.getActualPaidFees());
    }
}
public class StudentDiscountApp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter id: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name=sc.nextLine();
        System.out.print("Enter Percentage: ");
        float per=sc.nextFloat();
        System.out.print("Enter Total Fees: ");
        int totalFees=sc.nextInt();

        Student st=new Student();
        st.setId(id);
        st.setName(name);
        st.setPer(per);
        st.setTotalFees(totalFees);

        DiscountFees df=new DiscountFees();
        df.setStudent(st);
        df.checkDiscountEligibility(per);
        df.show();
    }
}
