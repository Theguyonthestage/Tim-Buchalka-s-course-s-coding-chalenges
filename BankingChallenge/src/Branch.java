import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customerArrayList;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customerArrayList = new ArrayList<Customer>();
    }

    public void addNewCustomer(String customerName, double initialTransactionAmount) {
        Customer customer = new Customer(customerName);
        customer.addTransaction(initialTransactionAmount);
        customerArrayList.add(customer);

    }

    public void addTransaction(Customer customer, double transaction) {
        Customer existing = findCustomer(customer.getCustomerName());
        if (existing != null) {

            existing.addTransaction(transaction);
        } else System.out.println("Customer not found!");
    }

    public Customer findCustomer(String name) {
        for (Customer temp : customerArrayList) {
            if (temp.getCustomerName().equals(name)) {
                return temp;
            }
        }
        return null;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }
}