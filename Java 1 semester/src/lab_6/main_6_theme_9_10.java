package lab_6;

public class main_6_theme_9_10 {

    public static void main(String[] args) {
        
        String file = "people.dat";

        Person p1 = new Person("Igor", "Sinyak", 2004, "Omsk");
        Person p2 = new Person("Danil", "Kolbasenko", 2010, "Samara");
        Person[] people = {p1, p2};
        
        Writer.savePeople(people, file);
        
        Person[] loaded = Reader.loadPeople(file);
        
        for (int i = 0; i < loaded.length; i++) {
            Person person = loaded[i];
            System.out.println(person.getPerson());
        }
    }
}