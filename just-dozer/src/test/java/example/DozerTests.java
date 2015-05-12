package example;
import java.util.Arrays;

import org.dozer.DozerBeanMapper;
import org.junit.Test;

public class DozerTests {
    
    
    @Test
    public void scalarToVector() throws Exception {
        DozerBeanMapper mapper = new DozerBeanMapper(Arrays.asList("scalar-to-vector.xml"));
        PersonB personB = mapper.map(personA(), PersonB.class);
        System.out.println(personB);
    }
    
    @Test
    public void vectorToScalar() throws Exception {
        DozerBeanMapper mapper = new DozerBeanMapper(Arrays.asList("scalar-to-vector.xml"));
        PersonA personA = mapper.map(personB(), PersonA.class);
        System.out.println(personA);
    }
    
    public PersonA personA() {
        PersonA personA = new PersonA();
        personA.setFirstName("Fred");
        personA.setLastName("Flintstone");
        Address addr = new Address();
        addr.setLine1("500 E Boulder Ln");
        addr.setState("CO");
        addr.setZip("01011");
        personA.setAddresses(Arrays.asList(addr));
        Contact contact = new Contact();
        contact.setName("Barney Rubble");
        contact.setPhone("555-111-0000");
        personA.setPrimaryContact(contact);
        return personA;
    }
    
    public PersonB personB() {
        PersonB personB = new PersonB();
        Name name = new Name();
        name.setFirst("Fred");
        name.setLast("Flintstone");
        personB.setName(name);
        Address addr = new Address();
        addr.setLine1("500 E Boulder Ln");
        addr.setState("CO");
        addr.setZip("01011");
        personB.setPrimaryAddress(addr);
        Contact contact = new Contact();
        contact.setName("Barney Rubble");
        contact.setPhone("555-111-0000");
        personB.setContacts(Arrays.asList(contact));
        return personB;
    }
}
