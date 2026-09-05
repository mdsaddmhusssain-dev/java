public class _08_FindInMountainArray {
    // Step1: Fisrt Find PEak Index.
    public static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        return start;
    }

    // Now Find Order Agnostic Binary Search.
    public static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }

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

    // Step 3: find target elemnt in mountain array
    public static int findInMountainArray(int[] arr, int target) {
        int peak = findPeak(arr);

        // in ascending order
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, peak);
        if (firstTry != -1)

            return firstTry;

        // in descending order
        return orderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 7, 6, 2, 1 };
        int target = 6;
        int ans = findInMountainArray(arr, target);
        System.out.println("Target element " + target + "found at Index: " + ans);

    }

}
