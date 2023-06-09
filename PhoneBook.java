import java.util.HashMap;
import java.util.Map;

class PhoneBook {
    private Map<String, String> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String lastName, String phoneNumber) {
        contacts.put(lastName, phoneNumber);
    }

    public String getPhoneNumber(String lastName) {
        return contacts.get(lastName);
    }

    public void removeContact(String lastName) {
        contacts.remove(lastName);
    }

    public boolean containsKey(String lastName) {
        return contacts.containsKey(lastName);
    }

    public boolean containsValue(String phoneNumber) {
        return contacts.containsValue(phoneNumber);
    }

    public int getSize() {
        return contacts.size();
    }

    public void printPhoneBook() {
        System.out.println("Телефонна книга :");
        for (String lastName : contacts.keySet()) {
            System.out.println(lastName);
        }
    }
}
