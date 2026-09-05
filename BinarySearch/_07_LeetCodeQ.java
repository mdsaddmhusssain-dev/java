//34.Find First and last position of Element in sorted array
//nums =[5,7,7,8,8,10],
//target 8
//output = [3,4]
//if target not found in the array return[-1,-1]
//if you find through linear search its return index 1 and loops stop. 

public class _07_LeetCodeQ {
    
 public static int[] searchRange(int[] nums,int target){
        int[] ans = {-1,-1};
        // int start = search(nums,target,true);
        // int end = search(nums,target,false);
       ans[0]=search(nums,target,true);
        ans[1]=search(nums,target,false);
        return ans;

    }
    private static int search(int[] nums,int target,boolean findStartIndex){
        int ans =-1;
        int start =0;
        int end = nums.length -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>nums[mid]){
                start=mid+1;

            }else if(target<nums[mid]){
                end=mid-1;
            }else{
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                }else{
                    start =mid+1;
                }
            }
        }
            return ans;
        }
        

    
    public static void main(String[] args) {
        int[] nums ={5,7,7,8,10};
        int target = 8;
        int[] result =searchRange(nums, target);
        System.out.println("first and last position: "+java.util.Arrays.toString(result));
    }
    
}
  