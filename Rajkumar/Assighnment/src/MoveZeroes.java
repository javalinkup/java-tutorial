public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {1,2,0,3,5,0,4};
        int temp;
        int j= -1;
        for (int i =0;i< arr.length;i++){
            if (arr[i]!=0){
                j++;
                temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
