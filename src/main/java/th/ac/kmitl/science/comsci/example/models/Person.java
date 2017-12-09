package th.ac.kmitl.science.comsci.example.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    
    private String id;
    private String globalId; 
    private String name; 
    private String taxId;  
    private Address address;
    private List<UniversalCommunication> universalCommunication;

    public Person() {
        address = new Address();
        universalCommunication = new ArrayList<>();
    }
    
    public List<UniversalCommunication> getUniversalCommunication() {
        return universalCommunication;
    }
 
    public Address getAddress() {
        return address;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}