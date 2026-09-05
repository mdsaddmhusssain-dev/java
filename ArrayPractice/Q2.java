package ArrayPractice;
//Find second smallest and second largest element in a given array
public class Q2 {
    public static void main(String[] args) {
        int[]  arr ={2,3,4,5,1,6,7,8,9,0};

        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<secondSmallest && arr[i] != smallest){
                secondSmallest=arr[i];
            }
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        System.out.println("Smallest: "+smallest);
        System.out.println("Second Smallest: "+ secondSmallest);
        System.out.println("Largest: "+largest);
        System.out.println("Second largest: "+secondLargest);

    }
}
    