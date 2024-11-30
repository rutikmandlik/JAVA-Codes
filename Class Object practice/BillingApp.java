/*
Q. WAP Create Application Generate Bill so you have to class name as Product with field id,name and qty,
rate and mark Product as POJO class and we have to create one class name as Customer with field id,name,address
 and mark customer as POJO and create one more class name as Bill with following methods 

void acceptCustDetails(Customer customer,Product …p):this method can accept single customer details 
with more than one products.
void calDisplayBill(): this method can print and calculate total bill of customer in given format

*/

import java.util.Scanner;

class Product {
    private int id, qty, rate;
    private String name;

    void setDetailsProduct(int id, String name, int qty, int rate) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.rate = rate;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    int getQty() {
        return qty;
    }

    int getRate() {
        return rate;
    }
}

class Customer {
    private int cId;
    private String cName;
    private String cAdd;

    void setDetailsCust(int cId, String cName, String cAdd) {
        this.cId = cId;
        this.cName = cName;
        this.cAdd = cAdd;
    }

    int getCustId() {
        return cId;
    }

    String getCustName() {
        return cName;
    }

    String getCustAdd() {
        return cAdd;
    }
}

class Bill {
    private Customer customer;
    private Product[] products;

    void acceptCustDetails(Customer customer, Product... products) {
        this.customer = customer;
        this.products = products;
    }

    void calDisplayBill() {
        if (customer == null || products == null) {
            System.out.println("No customer or product details available.");
            return;
        }

        System.out.println("\n--- Bill Details ---");
        System.out.println("Customer ID: " + customer.getCustId());
        System.out.println("Customer Name: " + customer.getCustName());
        System.out.println("Customer Address: " + customer.getCustAdd());
        System.out.println("\nProducts Purchased:");

        int totalBill = 0;
        for (int i = 0; i < products.length; i++) {
            Product p = products[i];
            int productTotal = p.getQty() * p.getRate();
            totalBill += productTotal;
            System.out.println((i + 1) + ". Product ID: " + p.getId() +
                    ", Name: " + p.getName() +
                    ", Quantity: " + p.getQty() +
                    ", Rate: " + p.getRate() +
                    ", Total: " + productTotal);
        }
        System.out.println("\nTotal Bill: " + totalBill);
    }
}

public class BillingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int no = sc.nextInt();

        Customer[] customers = new Customer[no];
        Bill bill = new Bill();

        for (int i = 0; i < customers.length; i++) {
            customers[i] = new Customer();

            System.out.println("\nEnter details for customer " + (i + 1) + ":");
            System.out.print("Customer ID: ");
            int cId = sc.nextInt();
            sc.nextLine();
            System.out.print("Customer Name: ");
            String cName = sc.nextLine();
            System.out.print("Customer Address: ");
            String cAdd = sc.nextLine();

            customers[i].setDetailsCust(cId, cName, cAdd);

            System.out.print("Enter number of products for this customer: ");
            int n = sc.nextInt();
            Product[] products = new Product[n];

            for (int j = 0; j < n; j++) {
                products[j] = new Product();

                System.out.println("Enter details for product " + (j + 1) + ":");
                System.out.print("Product ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Product Name: ");
                String name = sc.nextLine();
                System.out.print("Quantity: ");
                int qty = sc.nextInt();
                System.out.print("Rate: ");
                int rate = sc.nextInt();

                products[j].setDetailsProduct(id, name, qty, rate);
            }

            bill.acceptCustDetails(customers[i], products);
            bill.calDisplayBill();
        }

        sc.close();
    }
}
