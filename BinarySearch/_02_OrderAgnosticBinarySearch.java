public class _02_OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] asendingArray = { 2, 4, 6, 8, 10, 13, 15 };
        int[] descendingArray = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int target = 10;
        int result1 = orderAgnosticBinarySearch(asendingArray, target);
        System.out.println("Found in ascending array at index : " + result1);
        int result2 = orderAgnosticBinarySearch(descendingArray, target);
        System.out.println("Found in descending array at index:" + result2);

    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {

                if (target > arr[mid]) {

                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }

}
