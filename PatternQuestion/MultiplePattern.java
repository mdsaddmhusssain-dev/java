public class MultiplePattern {
    public static void main(String[] args) {
        pattern6(5);
        
      
    }

    static void pattern6(int n){
        for(int row=1;row<=n;row++){
            for(int col =1;col<=row;col++){
                System.out.print(col +" ");

            }
            System.out.println();
        }

    }


    static void pattern2(int n){
     for(int row=n;row>0&&row<=n;row--){
            for(int col =1;col<=row;col++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    // Patern 3
    static void pattern3(int n){
         for(int row=1;row<=n;row++){
            for(int col =1;col<=row;col++){
                System.out.print("* ");

            }
            System.out.println();
        }
        for(int row=n;row>0&&row<=n;row--){
            for(int col =1;col<=row;col++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    }
    

    

