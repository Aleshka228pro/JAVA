package lab_7;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class main_7_theme_11_12 {
     public static void main(String[] args) {
        
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8)); // для русского языка

        
        Rice rice = new Rice();
        
        Philosopher p1 = new Philosopher("A", rice);
        Philosopher p2 = new Philosopher("B", rice);
        Philosopher p3 = new Philosopher("C", rice);
        Philosopher p4 = new Philosopher("D", rice);
        Philosopher p5 = new Philosopher("E", rice);
        
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        
    }
}
