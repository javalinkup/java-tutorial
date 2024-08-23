public class TernaryOperatords {
    public static void main(String[] args) {
        int score = 75;
        int passingScore = 95;
        String result =  score >= passingScore ? "Pass" : "Fail";
        System.out.println(result);
       if(score >= passingScore){
           System.out.println("Pass");
       }
       else{
           System.out.println("Fail");
       }

       int a = 10;
       int b= 20;
       int larger = a < b ? a:b;
       System.out.println(larger);
       int age =18;
       String eligibility = age >=18 ? "Eligibile for Vote" : "Not eligible for Vote";
       System.out.println(eligibility);
       a +=4;
       b -=2;
       //(a+4) //14
        System.out.println(a);
        System.out.println(b);

    }

}
