import java.util.*;
class Person{
    int id;
    String name;
    int age;
    Person(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("ID: " + id + " Name: " + name + " Age: " + age);
    }
}

class Student extends Person {
    String grade;
    int marks;
    Student(int id, String name, int age, String grade, int marks){
        super(id, name, age);
        this.grade = grade;
        this.marks = marks;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade: " + grade + " Marks: " + marks);
    }
}
class Teacher extends Person{
    String subject;
    double salary;
    Teacher(int id, String name, int age, String subject, double salary){
        super(id, name, age);
        this.subject = subject;
        this.salary = salary;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject + " Salary: " + salary);
    }
}

public class Que5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int stdsize=sc.nextInt();
        Student sarr[] = new Student[stdsize];
        for (int i = 0; i < stdsize; i++) {
            System.out.println("Enter details for Student " +(i+1)+":");
            System.out.print("ID: ");
            int id=sc.nextInt();
            System.out.print("Name: ");
            String name=sc.next();
            System.out.print("Age: ");
            int age=sc.nextInt();
            System.out.print("Grade: ");
            String grade=sc.next();
            System.out.print("Marks: ");
            int marks=sc.nextInt();
            sarr[i] = new Student(id, name, age, grade, marks);
        }
        System.out.print("Enter the number of teachers: ");
        int tsize= sc.nextInt();
        Teacher[] tarr= new Teacher[tsize];

        for (int i = 0; i < tsize; i++) {
            System.out.println("Enter details for Teacher "+(i+1)+":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Subject: ");
            String subject = sc.next();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            tarr[i] = new Teacher(id, name, age, subject, salary);
        }

        //average marks
        int totalMarks = 0;
        for (int i = 0; i < sarr.length; i++) {
            totalMarks += sarr[i].marks;
        }
        double averageMarks = (double) totalMarks / sarr.length;

        //total salary
        double totalSalary = 0;
        for (int i = 0; i < tarr.length; i++) {
            totalSalary += tarr[i].salary;
        }
		System.out.println("=====================================");
        System.out.println("Students Information:");
        for (int i = 0; i < sarr.length; i++) {
            sarr[i].displayInfo();
            System.out.println();
        }
        System.out.println("Teachers Information:");
        for (int i = 0; i < tarr.length; i++) {
            tarr[i].displayInfo();
            System.out.println();
        }
        System.out.println("Average Marks of Students: " + averageMarks);
        System.out.println("Total Salary of Teachers: " + totalSalary);
    }
}
