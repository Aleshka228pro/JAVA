package lab_6;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Writer {
    
    public static void savePeople(Person[] people, String fileName) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(people);
            oos.close();
        } catch (Exception e) {}
    }
}