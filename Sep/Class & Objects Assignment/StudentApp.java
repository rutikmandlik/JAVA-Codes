import java.util.*;
class Student
{
    int s[];
    double percentage;
    String grade;
    void setSubMarks(int arr[])
    {
        s=arr;
    }
    void calculatePer()
    {
        int totalMarks = 0;
        for(int i=0;i<s.length;i++)
        {
            totalMarks += s[i];
        }
        percentage = (totalMarks / 600.0)*100;
    }
    void checkGrades()
    {
        if (percentage > 75 && percentage <= 100)
        {
            grade = "Distinction";
        } 
        else if (percentage > 60 && percentage <= 75) 
        {
            grade = "First Division";
        } 
        else if (percentage >= 50 && percentage <= 60) 
        {
            grade = "Second Division";
        } 
        else if (percentage > 40 && percentage <= 50) 
        {
            grade = "Third Division";
        } 
        else if (percentage < 40) 
        {
            grade = "Failed";
        }

        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
public class StudentApp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        System.out.print("Enter 6 subject marks one by one in the array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        Student st=new Student();
        st.setSubMarks(arr);
        st.calculatePer();
        st.checkGrades();
    }
}