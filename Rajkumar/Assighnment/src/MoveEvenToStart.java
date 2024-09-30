import java.util.Arrays;

public class MoveEvenToStart {
    public static void main(String[] args) {

            int[] numbers = {24, 45, 65, 88, 90, 21, 34};
            int temp;
            int j=-1;
            for (int i=0;i< numbers.length;i++){
                if (numbers[i]%2==0){
                    j++;
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
            System.out.println(Arrays.toString(numbers));

    }
}
