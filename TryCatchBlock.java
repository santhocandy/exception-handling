
import java.lang.ClassNotFoundException;

public class TryCatchBlock {
    public static void main(String[] args) {
        try{
            method1();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws ClassNotFoundException{
        throw new ClassNotFoundException();
    }
}
