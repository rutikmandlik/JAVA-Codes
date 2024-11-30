import java.util.Scanner;

class Employee {
    private int eId;
    private String eName;
    private int eSal;
    private String eAdd;
    private int eContact;

    // Constructor
    Employee(int eId, String eName, int eSal, String eAdd, int eContact) {
        this.eId = eId;
        this.eName = eName;
        this.eSal = eSal;
        this.eAdd = eAdd;
        this.eContact = eContact;
    }

    // Getters
    public int getId() {
        return eId;
    }

    public String getName() {
        return eName;
    }

    public int getSal() {
        return eSal;
    }

    public String getAdd() {
        return eAdd;
    }

    public int getContact() {
        return eContact;
    }

    // Setters for updating data
    public void setName(String eName) {
        this.eName = eName;
    }

    public void setSal(int eSal) {
        this.eSal = eSal;
    }

    // Display Employee details
    public void display() {
        System.out.println("ID: " + eId + ", Name: " + eName + ", Salary: " + eSal + ", Address: " + eAdd + ", Contact: " + eContact);
    }
}

public class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input the number of employees
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        // Step 2: Create an array to store Employee objects
        Employee[] employees = new Employee[n];

        // Step 3: Input Employee details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("ID: ");
            int eId = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Name: ");
            String eName = sc.nextLine();
            System.out.print("Salary: ");
            int eSal = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Address: ");
            String eAdd = sc.nextLine();
            System.out.print("Contact: ");
            int eContact = sc.nextInt();

            employees[i] = new Employee(eId, eName, eSal, eAdd, eContact);
        }

        // Step 4: Update Employee with name "ram" and salary 10000
        for (int i = 0; i < n; i++) {
            if (employees[i].getName().equalsIgnoreCase("ram") && employees[i].getSal() == 10000) {
                System.out.print("Enter new name for Employee with ID " + employees[i].getId() + ": ");
                sc.nextLine(); // Consume newline
                String newName = sc.nextLine();
                employees[i].setName(newName);

                System.out.print("Enter new salary for Employee with ID " + employees[i].getId() + ": ");
                int newSalary = sc.nextInt();
                employees[i].setSal(newSalary);
            }
        }

        // Step 5: Sort Employees in descending order of ID
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (employees[i].getId() < employees[j].getId()) {
                    // Swap employees[i] and employees[j]
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }

        // Step 6: Display all Employee details
        System.out.println("\nEmployee details in descending order of ID:");
        for (int i = 0; i < n; i++) {
            employees[i].display();
        }
    }
}
