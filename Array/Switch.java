import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String fruit = in.next();

    switch (fruit) {
      case "Mango":
        System.out.println("King of the fruits");
        break;
      case "Apple":
        System.out.println("Red in color");
        break;
      case "Grapes":
        System.out.println("Small round shape");
        break;
      case "orange":
        System.out.println("Lime in taste");
        break;
        
      default:
        System.out.println("no idea about this fruits");
    }
    in.close();

  }
  

}
