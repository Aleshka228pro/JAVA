package lab_7;

public class Rice {    
    // синхронизатор как официант только 
    public synchronized void takeRice(String philosopherName, int i) { // синхронизатор чтобы кто то более голодный не выхватил рис
        System.out.println(philosopherName + " take rice");
        
        try {
            Thread.sleep(500); 
        } catch (Exception e) {}
        
        System.out.println(philosopherName + " eat " + i + " portion");
    }
}
