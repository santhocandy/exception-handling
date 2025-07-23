public class AvoidExceptionInRealTime {

    public static void main(String[] args) {
        int res = div(5,0);
        System.out.println(res);

       /*  Here I am using traditional way to Handling Exception,
       but that is not need only if there are other ways that can be solved.
        */
        try{
            int val = 5/0;
            System.out.println(val);
        }catch (ArithmeticException e){
            System.out.println(e);
        }

    }

    public static int div(int a, int b){
        if(b == 0){
            return -1;
        }
        int val = a / b;
        return val;
    }
}
