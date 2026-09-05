//we will print number example isntead of calling funcion ,print  using recusion 
public class _03_Recursion_Function {
    public static void main(String[] args) {
        print(1);
    }
    //same thing solved by recusrion instead of wriiting too much
    static void print(int n){
        if (n==10){
            System.out.println(n);
            return;
        } print(n+1);
        System.out.println(n);
         //print(n+1);
    }
}