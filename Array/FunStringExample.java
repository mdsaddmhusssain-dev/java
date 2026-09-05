
public class FunStringExample {
    public static void main(String[] args) {
        String finalans = myGreet("Saddam hussain");
        System.out.println(finalans);
        
    }
    static String myGreet(String name ){
        String message="As salam alikum "+name ;
        return message;
    }
}
