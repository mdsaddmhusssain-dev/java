package ZClassProblem;
/*
| Operator | Name                        |
| -------- | --------------------------- |
| &        | AND                         |
| |        | OR                          |
| ^        | XOR                         |
| ~        | NOT (Complement)            |
| <<       | Left Shift                  |
| >>       | Right Shift                 |
| >>>      | Unsigned Right Shift (Java) |
 */
public class Operator {
    public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        System.out.println(a & b);//And
        System.out.println(5 | 3);//OR
        System.out.println(5 ^ 3);//XOR
        System.out.println(5<<3);
        System.out.println(5>>3);
        System.out.println(5>>>3);

    }
}
    
}
/*
1 & 1 = 1

1 & 0 = 0

0 & 1 = 0

0 & 0 = 0
 */

//OR OPerator//
/*
1 | 1 = 1

1 | 0 = 1

0 | 1 = 1

0 | 0 = 0

//XOR Operator//
1 ^ 1 = 0

0 ^ 0 = 0

1 ^ 0 = 1

0 ^ 1 = 1
 */