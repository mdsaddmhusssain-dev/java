public class _06_LeetCodeCeiling {
    
    public static char nextGreatestLetter(char[] letters,char target){
        int start = 0;
        int end = letters.length-1;

        while(start <= end){
            int mid = start+(end - start)/2;
            if(target>=letters[mid]){
                start = mid+1;
              }else{
                end = mid-1;

            
            }
        }
        return letters[start % letters.length];
    
    }
    public static void main(String[] args) {
        char[] letters={'c','f','j','z'};
        // char target = 'y';
        System.out.println("output: "+ nextGreatestLetter(letters, 'y'));
    }
    
}
