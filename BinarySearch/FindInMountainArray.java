public class FindInMountainArray {

    // Step 1: Find the peak (maximum element index)
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // You are in descending part
                end = mid;
            } else {
                // You are in ascending part
                start = mid + 1;
            }
        }
        // start == end -> peak index
        return start;
    }

    // Step 2: Order-agnostic binary search
    public static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

            if (isAsc) {
                if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (target > arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }

    // Step 3: Find target in mountain array
    public static int findInMountainArray(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);

        // Search in ascending part (left of peak)
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, peak);
        if (firstTry != -1)
            return firstTry;

        // Search in descending part (right of peak)
        return orderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 6, 6, 4, 2 };
        int target = 6;

        int ans = findInMountainArray(arr, target);
        System.out.println("Target found at index: " + ans);
    }
}
