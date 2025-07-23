public class ClassNotFoundExceptionExample {
    public static void main(String[] args) throws ClassNotFoundException{
        method1();
        try{
            method2();
        }catch(ClassNotFoundException ex){
            System.out.println("Custom  Messgae for Message 2"+ex);
        }
        method3();
    }

    public static void method1(){
        try{
            throw new ClassNotFoundException("Here is the Custom Exception message for the Exception 1");
        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }

    public static void method2() throws ClassNotFoundException{
        throw new ClassNotFoundException("Custom Message for Method2");
    }

    public static void method3() throws ClassNotFoundException{
        throw new ClassNotFoundException("Hey this is Custom Exception Mesage for Method 3");
    }
}
