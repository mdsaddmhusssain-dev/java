public class Pattern4 {
    public static void main(String[] args) {
        int n = 10;
        for(int row=1;row<=n;row++){
            for(int col =1;col<=row;col++){
                System.out.print("* ");

            }
            System.out.println();
        }
        for(int row=n-1;row>0&&row<=n;row--){ //n-1 for sharp nodes
            for(int col =1;col<=row;col++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    
}
