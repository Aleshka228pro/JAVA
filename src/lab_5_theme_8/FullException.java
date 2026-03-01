package lab_5_theme_8;

public class FullException extends Exception{
    public FullException(int maxSize) {
        super("container is full");
    }
}
