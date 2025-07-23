public class TryCatchFinallyExample {
    public static void main(String[] args) {

        try{
            method1("dummy");
        }catch(ClassNotFoundException | InterruptedException ex){
            ex.printStackTrace();
        }catch (Exception exception){
            exception.printStackTrace();
        }
        finally {
            System.out.println("Program Ends Here!!");
        }
    }

    public static void method1(String name) throws ClassNotFoundException , InterruptedException{
        if(name.equals("dummy"))
            throw new ClassNotFoundException();
        else if(name.equals("interrupted"))
            throw new InterruptedException();
    }
}
