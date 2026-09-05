package ArrayPractice;
//Find largest element in optimal ways
public class LargestElementWay2 {
    public static void main(String[] args) {
        int arr[]={2,3,4,1,7,5,9};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
           // if(arr[i]>max){
             //   max=arr[i];
                
            }

        System.out.println(max);
        }
        
    }
    

//TMC o(n)
