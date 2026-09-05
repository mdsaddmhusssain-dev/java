
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Original array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // Reverse
        System.out.println("\nReversed array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}