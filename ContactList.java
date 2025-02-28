import java.util.LinkedList;
import java.util.Iterator;

public class ContactList {
    private LinkedList<Contact> contacts;

    //Constructor
    public ContactList() {
        this.contacts = new LinkedList<>();
    }

    //Add contact
    public void addContact(String name, String phone, String email) {
        contacts.add(new Contact(name, phone, email)); //adds contact to list
        System.out.println(name + " is added to contacts.");
    }

    //Remove contact from list
    public void deleteContact(String name) {
        Iterator<Contact> itr = contacts.iterator();
        while (itr.hasNext()) {
            Contact contact = itr.next();
            if (contact.getName().equalsIgnoreCase(name)) {
                itr.remove();
                System.out.println(name + " has been removed from contacts.");
                return;
            }
        }
        System.out.println(name + " is not found in contacts.");
    }

    //Search contact by name
    public void searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Contact found: ");
                System.out.println("Name: " + contact.getName());
                System.out.println("Phone: " + contact.getPhoneNumber());
                System.out.println("Email: " + contact.getEmail());
                return;
            }
        }
        System.out.println(name + " is not found.");
    }

    //Search contact by email
    public void searchByEmail(String email) {
        for (Contact contact : contacts) {
            if (contact.getEmail().equalsIgnoreCase(email)) {
                System.out.println("Contact found: ");
                System.out.println("Name: " + contact.getName());
                System.out.println("Phone: " + contact.getPhoneNumber());
                System.out.println("Email: " + contact.getEmail());
                return;
            }
        }
        System.out.println(email + " is not found.");
    }

    //Prints all contacts and the info
    public void printContacts() {
        if (contacts.isEmpty()) {
            System.out.println("The contact list is empty.");
            return;
        }
        System.out.println("Contact list: ");
        for (Contact contact : contacts) {
            System.out.println("Name: " + contact.getName() +
                    ", Phone: " + contact.getPhoneNumber() +
                    ", Email: " + contact.getEmail());
        }
    }
}
