package lab_5_theme_8;

public class Container<T> {
    
    private T[] dataList;
    private int maxSize = 10;
    private int topStack; // -1 если пуст 
    

    public Container() {
        dataList = (T[]) new Object[maxSize];
        topStack = -1;
    }
    
    public void printContainer() {
        System.out.println("Container: ");

        for (int i = 0; i <= topStack; i++) {
            System.out.println(dataList[i]);
        }
        System.out.println();
    }


    public void Push(T element) throws FullException {
        if (topStack >= maxSize - 1) {
            throw new FullException(maxSize);
        }
        topStack++;
        dataList[topStack] = element;
    }


    public T Pop() throws EmptyException {
        if (topStack < 0) {
            throw new EmptyException();
        }
        T elem = dataList[topStack];
        dataList[topStack] = null;
        topStack--;
        return elem;
    }


    public int Find(T element) throws EmptyException {
        if (topStack < 0) {
            throw new EmptyException();
        }
        
        for (int i = 0; i <= topStack; i++) {
            if (element == (dataList[i])) {
                return i;
            }
        }
        return -1;
    }
}