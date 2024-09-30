public class Distinct {
    public static void main(String[] args) {
        int[] num={3,5,4,3,5,8,1,3,5};
        int[] temp =new int[num.length];
        int k=0;

        for (int i=0;i< num.length;i++){
            boolean isDistinct = true;
            for (int j=0;j<k;j++){
                if (num[i]==num[j]){
                    isDistinct=false;
                    break;

                }
            }
            if (isDistinct){
                temp[k++]=num[i];
            }
        }
        for (int i=0;i<k;i++){
            System.out.println(temp[i]);
        }
    }

}
