public class Evendigit {
    public static void main(String[] args) {
        int[] nums = {12,345,372263};
        int result = countEvenDigits(nums);
        System.out.println("Count of numbers with even digits : "+ result);

    }
    static boolean hasEvenDigits(int num){
        int digits = String.valueOf(Math.abs(num)).length();
        if (digits %2 ==0){
            return true;
        }
        return false;
    }
    static int countEvenDigits(int[] numbs){
        int count = 0;
        for (int num : numbs){
            if(hasEvenDigits(num)){
                count++;
            }
    }return count;

    }
    
    
}
