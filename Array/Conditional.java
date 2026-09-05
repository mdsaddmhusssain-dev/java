
import java.util.Scanner;
public class Conditional {
    public static void main(String[] args){
        /*
         syntax of if statement
         if (boolean expression T or F){
               //body
        } else{
            // do this
        }
        
    */

    Scanner in = new Scanner(System.in);
    Float salary = in.nextFloat();
    if(salary>10000){
        salary +=2000;
    }else if (salary > 5000){
        salary +=1000;
    } else {
        salary += 0;
    }
    
    System.out.println(salary);

    }
}
    
