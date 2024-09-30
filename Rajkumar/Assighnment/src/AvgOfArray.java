public class AvgOfArray {
    static void  largestElement(){
            int[] array1 = { 1, 3,1, 4,2 };
            int[] array2 = { 4, 5, 6 };
            int largest=array1[0];
            for(int i =0;i<array1.length;i++){
                if(largest<array1[i]){
                    largest=array1[i-1];
                }
            }
            System.out.println(largest);
        }

    public static void main(String[] args) {
        largestElement();
        /*int[] array1 = { 1, 2, 3 };
        int[] array2 = { 4, 5, 6 };
        int sum1=0;
        int sum2=0;
        double avg1=0.0;
        double avg2=0.0;


        for (int i=0;i<array1.length;i++){
            sum1=array1[i]+sum1;

        }
        avg1= (double) sum1 /array1.length;
        for (int i=0;i<array2.length;i++){
            sum2=array2[i]+sum2;
            avg2= (double) sum2 /array2.length;
        }
        System.out.println(avg2-avg1);
*/
    }
}
