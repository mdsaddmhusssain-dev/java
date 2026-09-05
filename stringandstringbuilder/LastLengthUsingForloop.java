//Find the length of last word using for loop
public class LastLengthUsingForloop {
    public static void main(String[] args) {
        String str= "Saddam Hussain";
        int count = 0;
        

        for( int i =str.length()-1;i>=0 && str.charAt(i) == ' ';i--){

        }
        for(int i =str.length()-1;i>=0 && str.charAt(i)!=' ';i--){
            count++;
        }
        System.out.println(count);
    }
    
}
