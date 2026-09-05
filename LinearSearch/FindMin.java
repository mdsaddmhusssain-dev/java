public class FindMin {
    public static void main(String[] args) {
        int[] arr = {12,3,4,5,6,7,1,34};
        System.out.println(min(arr));

    }
     public static int min(int[] arr){ // public use or not yr choise but public help u when u call function from outside the class or package
        
        int ans = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }

        return ans;

    }
    
}
