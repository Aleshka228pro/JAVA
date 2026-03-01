package lab_5_theme_8;

public class main_lab_5_theme_8 {
    public static void main(String[] args) {

        Container<Integer> stack = new Container<>();

        stack.printContainer();

        
        // try {

        //     stack.Find(9);
        // }
        // catch (EmptyException e)
        // {
        //     System.err.println(e.getMessage());
        // }



        // try {
        //     for (int i = 0; i < 10; i++) stack.Push(i+1);
        //     stack.printContainer();

        //     System.out.println(stack.Find(9));
        // }
        // catch (EmptyException | FullException e)
        // {
        //     System.err.println(e.getMessage());
        // }


        // try {
        //     stack.Pop();
        //     stack.printContainer();
        // }
        // catch (EmptyException e)
        // {
        //     System.err.println(e.getMessage());
        // }


        // try {
        //     for (int i = 0; i < 10; i++) stack.Push(i+1);
        //     stack.printContainer();
        // }
        // catch (FullException e)
        // {
        //     System.err.println(e.getMessage());
        // }


        try {
            for (int i = 0; i < 11; i++) stack.Push(i+1);
            stack.printContainer();
        }
        catch (FullException e)
        {
            System.err.println(e.getMessage());
        }
    }
}
