public class Contact {
    private String name;
    private String phoneNumber;
    private String email;
    private Contact next;

    //Constructor
    public Contact(String name, String phoneNumber, String email){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.next = null;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Contact getNext() {
        return next;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setNext(Contact next) {
        this.next = next;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //how contact is displayed
    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email +
                '}';
    }
}
