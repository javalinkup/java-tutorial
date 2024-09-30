public class SortByMaxElement {
    public static void main(String[] args) {
        int[] arr ={42,15,5,6,7,9,25,13,2};//{2,15,5,6,7,9,25,13,42};
        int maxIndex;
        int max;
        int n=arr.length-1;

        for (int i = n; i >=0; i--) {
            max = arr[i];
            maxIndex = i;
            for (int j = i; j >=0; j--) {
                if ( arr[j]>max) {
                    maxIndex = j;
                    max = arr[j];
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
