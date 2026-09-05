public class StringQue_whileloop {
    public static void main(String[] args){
        String str="Saddam Hussain";
        int count=0;
        int i=str.length()-1;

        //loop for skip  space
        while(i>=0 && str.charAt(i)==' '){
            i--;
        }
        //for counting
        while(i>=0 && str.charAt(i)!=' '){
            count++;
            i--;
        }
        System.out.println(count);
    }
}
    