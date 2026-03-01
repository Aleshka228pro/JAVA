package lab_6;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Reader {
    
    public static Person[] loadPeople(String fileName) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
            Person[] people = (Person[]) ois.readObject();
            ois.close();
            return people;
        } catch (Exception e) {}
        return null;
    }
}