package example;

import java.util.List;

public class PersonA {

    private String firstName;
    private String lastName;
    private List<Address> addresses;
    private Contact primaryContact;
    

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public List<Address> getAddresses() {
        return addresses;
    }
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
    public Contact getPrimaryContact() {
        return primaryContact;
    }
    public void setPrimaryContact(Contact primaryContact) {
        this.primaryContact = primaryContact;
    }
    
    public String toString() {
        StringBuilder str = new StringBuilder("[PersonA]\n");
        str.append("firstName: " + firstName);
        str.append("\nlastName: " + lastName);
        if (primaryContact != null) {
            str.append("\n_primaryContact_\n" + primaryContact.toString());
        }
        if (addresses != null) {
            for (Address address : addresses) {
                str.append("\n_address_\n");
                str.append(address.toString());
            }
        }
        return str.toString();
    }
}
