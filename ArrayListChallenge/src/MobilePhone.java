import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contactList = new ArrayList<>();

    public boolean addContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            return false;
        }
        contactList.add(contact);
        return true;
    }

    public int findContact(String contactName) {
        for (int i = 0; i < contactList.size(); i++) {
            Contact contact = contactList.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public void printContacts() {
        System.out.println("You have " + contactList.size() + " contacts.");
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println((i + 1) + ". " +
                    contactList.get(i).getName() + " -> " +
                    contactList.get(i).getPhoneNumber());
        }
    }

    public boolean modifyContact(String oldName, Contact newContact) {
        int position = findContact(oldName);

        if (position < 0) {
            System.out.println("Contact not found.");
            return false;
        } else if (findContact(newContact.getName()) !=-1) {
            System.out.println("Contact with name " + newContact.getName() + " already exists. Update was not successful.");
            return false;
        }

        contactList.set(position, newContact);
        System.out.println("Contact has been modified.");
        return true;
    }

    public boolean removeContact(String contactName) {
        int position = findContact(contactName);

        if (position < 0) {
            System.out.println("Contact not found.");
            return false;
        }

        contactList.remove(position);
        System.out.println(contactName + " has been removed.");
        return true;
    }

    public Contact queryContact(String contactName) {
        int position = findContact(contactName);

        if (position >= 0) {
            return contactList.get(position);
        }
        return null;
    }
}