import java.util.Arrays;

public class Segregation {


    public static void main(String[] args) {
        seggregateEvenOdd1();

    }

    private static void seggregateEvenOdd1() {
        int[] numbres = {24, 45, 65, 88, 90, 21, 34};
        int j=0;
        int k=0;
        int l=0;
        int m=0;
        int eventIndex=0;
        for (int i=0;i< numbres.length;i++){
            if (numbres[i]%2 ==0){
                // swap the even number to front
                l++;
            } else {
                m++;
            }

        }
        int[] even = new int[l];
        int[] odd = new int[m];

        for (int i = 0; i < numbres.length; i++) {
            if(numbres[i]%2 == 0){
                even[j]=numbres[i];
                j++;
            }
            else {
                odd[k]=numbres[i];
                k++;
            }
        }

        for (int i = 0; i < even.length; i++) {
            System.out.println("even number :" + even[i]);
        }

        for (int i = 0; i < odd.length; i++) {
            System.out.println("odd number :" + odd[i]);
        }
    }
}