
public class TryCatchFinally {
    public static void main(String[] args) {

        try{
            String name = null;
            System.out.println(name.charAt(0));
        } catch (NullPointerException e) {
            System.out.println(e);
        }finally {
            System.out.println("End of the Program");
        }
    }
}
