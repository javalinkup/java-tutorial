public class Ascending {
    public static void main(String[] args) {
       int[] arr={5,6,8,2,1,4};
       /* int temp;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<i;j++){
                if (arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for (int i=0;i< arr.length;i++)
            System.out.println(arr[i]);*/

        int min = arr[0];
        int temp;
        for(int i =0;i<arr.length;i++){
            for (int j = i;j< arr.length;j++){
            if(min>arr[i]) {
                temp= arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
            }
        }
        for (int i=0;i< arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
