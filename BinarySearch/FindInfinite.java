public class FindInfinite {
    // Function to find the position of the target in infinite sorted array
    public static int findPosition(int[] arr, int target) {
        // Step 1: Find the range
        int start = 0;
        int end = 1;

        // Increase the search range exponentially until target <= arr[end]
        while (end < arr.length && target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2; // expand range

        }

        // Step 2: Binary search in the found range
        return binarySearch(arr, target, start, end);
    }

    // Standard Binary Search
    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; // found
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        // Example infinite sorted array simulation
        int[] arr = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 25, 30, 40, 50 };

        int target = 25;
        int pos = findPosition(arr, target);

        if (pos != -1) {
            System.out.println("Element " + target + " found at index: " + pos);
        } else {
            System.out.println("Element not found in this given array");
        }
    }

}
