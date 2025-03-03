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

            switch (choice.toUpperCase()) {
                case "A":
                    System.out.println("Add name: ");
                    String name = scnr.nextLine();
                    System.out.println("Add Phone number: ");
                    String number = scnr.nextLine();
                    System.out.println("Add email: ");
                    String email = scnr.nextLine();
                    contactList.addContact(name, number, email);
                    break;

                case "D":
                    System.out.println("Enter a contact to delete: ");
                    name = scnr.nextLine();
                    contactList.deleteContact(name);
                    break;

                case "S":
                    System.out.println("Search contact by name: ");
                    name = scnr.nextLine();
                    contactList.searchContact(name);
                    break;

                case "E":
                    System.out.println("Search contact by Email: ");
                    name = scnr.nextLine();
                    contactList.searchByEmail(name);
                    break;

                case "P":
                    contactList.printContacts();
                    break;

                case "Q":
                    System.out.println("Exiting program...");
                    scnr.close();
                    return;  //stops program

                default:
                    System.out.println("Invalid choice, please try again");
                    break;
            }
        }
    }
}
