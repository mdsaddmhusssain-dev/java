public class _03_OrderOfAgnostic {
   

   

  static int search(int[] arr,int target){
        int start =0;
        int end = arr.length -1;

        // Step 1: find if array is ascending or descending
        boolean isAscending = arr[start] < arr[end];

        //Binary search loop

        while(start<=end){
            int mid = start +(end - start )/2;
            if(target==arr[mid]){
                return mid;
            }
            if (isAscending){
                if(target < arr[mid]){
                end = mid-1;
                }else{
                    start =mid+1;
                }
            }else{// decending case
                if(target>arr[mid]){
                    end = mid-1;
                }else{
                    start=mid+1;
                }

            }
        }return -1;


    }
     public static void main(String[] args){
        int[] arrayinascending = {1,2,3,4,5,6,7,8,9,10};
        int[] arrayindecending = {11,10,9,8,7,6,5,4,3,2,1};
        System.out.println(search(arrayinascending,10));
        System.out.println(search(arrayindecending,8));

        // int target =10;
        // int result1 = search(arrayinascending,target);
        // int result2 = search(arrayindecending,target);
        
        // System.out.println("Target "+target+ " found at index "+result1);
        // System.out.println("Target " +target+ " found at index "+result2);


    }
    
}


    