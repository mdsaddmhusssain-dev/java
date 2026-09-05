
public class MaxArray {
    
    public static void main(String[] args) {
        int[] arr = {10, 45, 23, 78, 34};

        int max = arr[0]; // assume first number is max

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // update max if current is bigger
            }
        }

        System.out.println("Maximum value in the array is: " + max);
    }
}
    

