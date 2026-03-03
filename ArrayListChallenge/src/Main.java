import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone myMobilePhone = new MobilePhone();

    public static void main(String[] args) {

        boolean quit = false;
        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the contact list.");
        System.out.println("\t 2 - To add a new contact to the contact list.");
        System.out.println("\t 3 - To modify a contact in the list.");
        System.out.println("\t 4 - To remove a contact from the list.");
        System.out.println("\t 5 - To search for a contact in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    private static void printContacts() {
        myMobilePhone.printContacts();
    }

    private static void addNewContact() {
        System.out.println("Please enter a name:");
        String name = scanner.nextLine();

        System.out.println("Please enter a phone number:");
        String phone = scanner.nextLine();

        Contact newContact = new Contact(name, phone);

        if (myMobilePhone.addContact(newContact)) {
            System.out.println("Contact added successfully!");
        } else {
            System.out.println("Contact already exists!");
        }
    }

    private static void modifyContact() {
        System.out.println("Enter contact name you wish to modify:");
        String oldName = scanner.nextLine();   // ← use oldName here

        System.out.println("Enter new name:");
        String newName = scanner.nextLine();

        System.out.println("Enter new phone number:");
        String newPhone = scanner.nextLine();

        Contact newContact = new Contact(newName, newPhone);

        if (myMobilePhone.modifyContact(oldName, newContact)) {
            System.out.println("Contact updated successfully!");
        } else {
            System.out.println("Contact not found!");
        }
    }

    private static void removeContact() {
        System.out.println("Enter contact name you wish to remove:");
        String name = scanner.nextLine();


        if (myMobilePhone.removeContact(name)) {
            System.out.println("Contact removed!");
        } else {
            System.out.println("Contact not found!");
        }
    }

    private static void searchContact() {
        System.out.println("Enter contact name to find:");
        String name = scanner.nextLine();


        Contact found = myMobilePhone.queryContact(name);

        if (found != null) {
            System.out.println("Found: " + found.getName() + " " + found.getPhoneNumber());
        } else {
            System.out.println("Contact not found.");
        }
    }
}