import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branchArrayList;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branchArrayList = new ArrayList<Branch>();
    }

    public void addNewBranch(String branchName) {
        Branch newBranch = new Branch(branchName);
        branchArrayList.add(newBranch);
    }

    public void addNewCustomerToBranch(String branchName, String customerName, double initialTransaction) {
        Branch existing = findBranch(branchName);
        if (existing != null) {
            existing.addNewCustomer(customerName, initialTransaction);
        } else System.out.println("Branch not found!");
    }

    public Branch findBranch(String branchName) {
        for (Branch temp : branchArrayList) {
            if (temp.getBranchName().equals(branchName)) {
                return temp;
            }
        }
        return null;
    }

    public void addTransactionToCustomer(String branchName, String customerName, double addTransaction) {
        Branch existing = findBranch(branchName);
        if (existing != null) {
            Customer existingCustomer = existing.findCustomer(customerName);
            if (existingCustomer != null) {
                existingCustomer.addTransaction(addTransaction);
            } else System.out.println("Customer with name " + customerName + " not found!");
        } else System.out.println("Branch with name " + branchName + " not found!");
    }

    public void printList(String branchName, boolean showTransactions) {

        Branch branch = findBranch(branchName);
        if (branch != null) {
            for (Customer customer : branch.getCustomerArrayList()) {

                if (showTransactions == true) {
                    System.out.println("Customer: " + customer.getCustomerName() + " has the following transactions: " + customer.getTransactions());

                } else System.out.println("Customers: " + customer.getCustomerName());

            }

        } else System.out.println("Branch " + branchName + " not found!");
    }
}