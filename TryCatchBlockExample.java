class TryCatchBlockExample{
    public static void main(String[] args) {

        try{
            int []a = new int[10];
            System.out.println(a[10]);
            String s = "santhosh";
            System.out.println(s.charAt(8));
        }catch(StringIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}