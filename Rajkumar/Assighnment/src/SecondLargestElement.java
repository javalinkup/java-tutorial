public class SecondLargestElement {
    public static void main(String[] args) {
        int[] array = {15,17,18,34,16,25};
        if (array.length > 0) {
            int largest = array[0];
            int secondLargest = array[1];

            if (array[1] > array[0]) {
                largest = array[1];
                secondLargest = array[0];
            }

            for (int i = 2; i < array.length; i++) {
                if (array[i] > largest) {
                    secondLargest = largest;
                    largest = array[i];
                } else if (array[i] > secondLargest) {
                    secondLargest = array[i];
                }
            }

            System.out.println(secondLargest);


        }
        else
            System.out.println("array is empty");
    }




            }




