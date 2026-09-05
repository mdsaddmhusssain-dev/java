
public class SwapTowNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        System.out.println("before swap : a ="+a + ",b=" + b);

        int[] swapped = swap(a,b);
        System.out.println("After swap : a ="+swapped[0] + ",b=" + swapped[1]);
    }
    static int[] swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
        return new int[]{x,y};
    }
    
}
// swap number code
// int temp = a;
// a =b;
// b= temp;