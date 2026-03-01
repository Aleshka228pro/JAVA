package lab_6;

import java.io.Serializable;

public class Person implements Serializable {
    
    private String name;    
    private String surname;    
    private int birthYear;     
    private String address;    
    
    public Person(String name, String surname, int birthYear, String address) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.address = address;
    }
    
    public String getPerson() {
        return surname + " " + name + " " + birthYear + " " + address;
    }
}