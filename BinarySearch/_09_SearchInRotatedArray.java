public class _09_SearchInRotatedArray {

    // Function to search target in rotated sorted array
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the target
            if (nums[mid] == target)
                return mid;

            // Check which side is sorted
            if (nums[start] <= nums[mid]) {
                // Left part is sorted
                if (target >= nums[start] && target < nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                // Right part is sorted
                if (target > nums[mid] && target <= nums[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }

        return -1; // Target not found
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 1, 2, 3, 4, 5, 6, 7 };
        int target = 3;

        int result = search(arr, target);

        if (result != -1)
            System.out.println("Target found at index: " + result);
        else
            System.out.println("Target not found in array.");
    }
}
