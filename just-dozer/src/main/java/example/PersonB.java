package example;

import java.util.List;

public class PersonB {

    private Name name;
    private Address primaryAddress;
    private List<Contact> contacts;
    
    public Name getName() {
        return name;
    }
    public void setName(Name name) {
        this.name = name;
    }
    public Address getPrimaryAddress() {
        return primaryAddress;
    }
    public void setPrimaryAddress(Address primaryAddress) {
        this.primaryAddress = primaryAddress;
    }
    public List<Contact> getContacts() {
        return contacts;
    }
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
    
    public String toString() {
        StringBuilder str = new StringBuilder("[PersonB]\n");
        if (name != null) {
            str.append("_name_\n" + name.toString());
        }
        if (primaryAddress != null) {
            str.append("\n_primaryAddress_\n" + primaryAddress.toString());
        }
        if (contacts != null) {
            for (Contact contact : contacts) {
                str.append("\n_contact_\n");
                str.append(contact.toString());
            }
        }
        return str.toString();
    }
}
