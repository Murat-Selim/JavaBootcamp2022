package Homework2.inheritance;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Customer customer = new Customer();
        System.out.println(employee.firstName);
        System.out.println(customer.firstName);
        CustomerManager customerManager=new CustomerManager();
        customerManager.add();
    }
}
