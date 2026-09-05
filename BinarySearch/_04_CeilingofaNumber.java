public class _04_CeilingofaNumber {
    public static void main(String[] args){
        int arr[] ={-12,-8,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 17; // 17 not in this array so its return just greater than itself ie 18 is the just greaater of 17 
        int result = ceiling(arr,target);
        System.out.println("Target " +target+ " found at index " +result);
       
    }
    static int ceiling(int[] arr,int target){
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
        return start; //this is main roll in ceiling its return start index of element if target element not found 
    }

    
}
