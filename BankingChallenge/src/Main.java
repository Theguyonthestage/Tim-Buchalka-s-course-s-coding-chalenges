public class Main {
    public static void main(String[] args) {
        // Your job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers  a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions

        Bank UnitedBank = new Bank("United Bank");
        UnitedBank.addNewBranch("Sofia 1st branch");
        UnitedBank.addNewBranch("Plovdiv 1st branch");
        UnitedBank.addNewBranch("Varna main branch");
        UnitedBank.addNewCustomerToBranch("Sofia 1st branch", "Ivan Petrov", 500.00);
        UnitedBank.addNewCustomerToBranch("Sofia 1st branch", "Maria Georgieva", 1000.00);
        UnitedBank.addNewCustomerToBranch("Plovdiv 1st branch", "Georgi Dimitrov", 750.00);
        UnitedBank.addNewCustomerToBranch("Varna main branch", "Elena Todorova", 250.00);
        UnitedBank.addTransactionToCustomer("Sofia 1st branch", "Ivan Petrov", 200.00);
        UnitedBank.addTransactionToCustomer("Sofia 1st branch", "Ivan Petrov", -150.00);
        UnitedBank.addTransactionToCustomer("Plovdiv 1st branch", "Georgi Dimitrov", 300.00);
        UnitedBank.printList("Sofia 1st branch", false);
        System.out.println("========");
        UnitedBank.printList("Sofia 1st branch", true);

    }
}
