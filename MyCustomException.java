public class MyCustomException extends Exception {

    MyCustomException(String message){
        super(message);
    }

    public static void main(String[] args) throws MyCustomException{

        try {
            method1();
        }
//        }catch (MyCustomException ex){
//            ex.printStackTrace();  // here if it is handled no need to mention on the main method :)
//        }
        finally {
            System.out.println("Program End Here");
        }
    }

    public static void method1() throws MyCustomException{
        String name = "dummy";
        throw new MyCustomException(name);
    }
}
