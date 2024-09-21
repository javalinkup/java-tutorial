public class ExceptionDemo {
    static int a =56;
    static int b=0;
    static int res1;
   static int res2;
    static void test(){
        test1();
    }

    static  void test1(){
        try{
            res1 = a/b;
        }
        catch (Exception e){
            System.out.println(e);
        }

        res2 = a*b;
        System.out.println(res1);
        System.out.println(res2);
        System.out.println("Test1");
        try {
            test2();
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
    static void test2() throws ArithmeticException{
        //res1 = a/b;
        throw new ArithmeticException("value cant be 0");
    }
    public static void main(String[] args){
        test();


    }

}
