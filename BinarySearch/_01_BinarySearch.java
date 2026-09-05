public class _01_BinarySearch {
    public static void main(String[] args){
        int arr[] ={-12,-8,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 22;
        int result = binarySearch(arr,target);
        System.out.println("Target " +target+ " found at index " +result);
        //Second question same but change in loop  
        int arr2[] ={-12,-8,-4,0,2,3,4,15,16,18,22,89};
        int target1 = 16;
        int result1 = b1inarySearch(arr2,target1);
        System.out.println("Target " +target1+ " found at index " +result1);
    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            // find the middle element
            int mid= start +(end - start)/2;

            if(target<arr[mid]){
                end = mid -1;
            }
            else if (target>arr[mid]){
                start = mid +1;

            }
            else{
                // ans found bcoz  if target< or> mid loop continue if mid = target element ans is mid
                return mid;
            }
        }
        return -1;
    }

    static int b1inarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            // find the middle element
            int mid= start +(end - start)/2;

            if(target==arr[mid]){
                return mid;
            }

            else if(target<arr[mid]){
                end = mid -1;
            }
            else {
                start = mid +1;

            }
            
        }
        return -1;
    }
    
}
