// duplicate array 
public class _10_RotationCountDuplicateArray {
    public static void main(String[] args) {
        int[] arr = { 7, 7, 3, 4, 7, 7 };
        int ans = countRotations(arr);
        System.out.println("Rotation count : " + ans);

    }

    static int countRotations(int[] arr) {
        int pivot = findPivotWithDuplicates(arr);
        return pivot + 1;
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;
            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                if (arr[end - 1] > arr[end])
                    return end--;

            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
