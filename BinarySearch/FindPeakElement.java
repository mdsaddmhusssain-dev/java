public class FindPeakElement {
    public static int findPeakMountain(int [] arr){
        int start = 0;
        int end =  arr.length-1;

        while(start<end){
            int mid = start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                //You are in dec part of array so,
                end = mid;
            }else{
                //you are in ascending part of array
                start = mid+1;
               
                
            } 
        
            
        }
        return start;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,6,4,3,2,1};
        int peakIndex = findPeakMountain(arr);
        System.out.println("peak element is : " +arr[peakIndex]);
        System.out.println("peak Index is : " +peakIndex);
        
    }
}
