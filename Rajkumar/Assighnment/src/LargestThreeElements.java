public class LargestThreeElements {
    static  void largest(){
        int[] array = {1,2,3,4,5,6,7,8,9};


        int largestNumber=array[0];
        int secondLargest=array[1];
        int thirdLargest=array[2];
        
        for (int i =0;i< array.length;i++){
            if(array[i]>largestNumber){
                thirdLargest=secondLargest;
                secondLargest=largestNumber;
                largestNumber=array[i];
            } else if (array[i]>secondLargest) {
                thirdLargest=secondLargest;
                secondLargest=array[i];
                
            } else if (array[i]>thirdLargest) {
                thirdLargest=array[i];

            }
        }
        System.out.println("largest:"+largestNumber+"\n"+"second largest:"+secondLargest+"\n"+"third largest:"+thirdLargest);
    }
    
    public static void main(String[] args) {
        largest();
        int[] array = {1,2,3,4,5,6,7,8};
      int largestNumber=array[0];
      int secondLargest=array[1];
      int thirdLargest=array[2];
        for (int i =0;i< array.length;i++){
            if (array[i]>largestNumber &&  array[i]>secondLargest && array[i]>thirdLargest){
                thirdLargest=secondLargest;
                secondLargest=largestNumber;
                largestNumber=array[i];

            }

        }
        /*System.out.println(largestNumber);
        System.out.println(secondLargest);
        System.out.println(thirdLargest);*/
    }
}
