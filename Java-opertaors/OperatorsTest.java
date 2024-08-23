public class OperatorsTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        int product = a*b;
        int difrrence = b-a;
        int quotient = a / b;
        int remainder = a % b;
        /*System.out.println(++a); //11
        System.out.println(a);
        System.out.println(b--); //20
        System.out.println(b);*/
        System.out.println(product);
        System.out.println(difrrence);
        System.out.println(quotient);
        System.out.println(remainder);
        System.out.println(a ==b);
        System.out.println(a!=b); // 10= 20
        boolean isEqual = a==b;
        System.out.println(isEqual);
        System.out.println( a >= b);
        int age1 = 20;
        int age2 = 30;
        String gender =  "Male";
        if(age1 < 10 || gender.equals( "Male")){ //true | false = true  : ||, true && true =true
         System.out.println("I am in if loop");

        }else{
            System.out.println("in else");
        }
        if(age1 > age2 | gender.equals( "Male") ){
            System.out.println("In if conditio with Bitwise operator");
        }else{
            System.out.println("In else condition");
        }



    }
}
