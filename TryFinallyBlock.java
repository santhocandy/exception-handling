
public class TryFinallyBlock {
    public static void main(String[] args) throws ClassNotFoundException {
        try{
            method1("dummy");
        }
        finally {
            System.out.println("Here is the End");
        }
    }

    public static void method1(String name) throws ClassNotFoundException{
        if(name.equals("dummy"))
            throw new ClassNotFoundException();
    }
}
