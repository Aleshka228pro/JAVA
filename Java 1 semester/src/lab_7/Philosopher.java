package lab_7;


public class Philosopher extends Thread { // для создания потока
    
    private String name;
    private Rice rice;
    private int riceEaten = 0;
    
    public Philosopher(String _name, Rice _rice) {
        name = _name;
        rice = _rice;
    }
    
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                
                System.out.println(name + " thinking");
                Thread.sleep((long) (Math.random() * 2000)); // до 2 секунд
                
                rice.takeRice(name, i+1);
                riceEaten++;
            }
            
            System.out.println(name + " not hungry\n Amount of eaten: " + riceEaten );
            
        } catch (Exception e) {}
    }
}
