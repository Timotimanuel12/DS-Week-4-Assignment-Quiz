import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ContactList contactList = new ContactList();

        while (true) {
            System.out.println("\n*****************************");
            System.out.println("(A)dd Contact");
            System.out.println("(D)elete Contact");
            System.out.println("(S)earch Contact");
            System.out.println("(E)mail Search");
            System.out.println("(P)rint List");
            System.out.println("(Q)uit");
            System.out.println("*****************************");
            System.out.println("Choice: ");

            String choice = scnr.next();
            scnr.nextLine();

            if (choice.equalsIgnoreCase("A")) {
                System.out.println("Add name: ");
                String name = scnr.nextLine();
                System.out.println("Add Phone number: ");
                String number = scnr.nextLine();
                System.out.println("Add email: ");
                String email = scnr.nextLine();
                contactList.addContact(name, number, email);
            }
            else if (choice.equalsIgnoreCase("D")) {
                System.out.println("Enter a contact to delete: ");
                String name = scnr.nextLine();
                contactList.deleteContact(name);
            }
            else if (choice.equalsIgnoreCase("S")){
                System.out.println("Search contact by name: ");
                String name = scnr.nextLine();
                contactList.searchContact(name);
            }
            else if (choice.equalsIgnoreCase("E")) {
                System.out.println("Search contact by Email: ");
                String name = scnr.nextLine();
                contactList.searchByEmail(name);
            }
            else if (choice.equalsIgnoreCase("P")) {
                contactList.printContacts();
            }
            else if (choice.equalsIgnoreCase("Q")){
                System.out.println("Exiting program...");
                break;
            }
            else {
                System.out.println("Invalid choice, please try again");
            }

        }
        scnr.close();
    }
}