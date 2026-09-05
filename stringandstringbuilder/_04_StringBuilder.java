 /*StringBuilder is one of the most important Java classes, especially when you need to modify a string many times.

Why do we need StringBuilder?

First understand one important property of String.

String is Immutable

Immutable means it cannot be changed after it is created.

 */
public class _04_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("sddam");
        sb.append("Hussain");
        System.out.println(sb);
        sb.insert(1,"a");
        System.out.println(sb);
        sb.delete(2,4); //end index exclusive
        System.out.println(sb);
        
        sb.replace(1,4,"Ad");
        System.out.println(sb);
        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

    }
    
}
/*
| String                                         | StringBuilder           |
| ---------------------------------------------- | ----------------------- |
| Immutable                                      | Mutable                 |
| New object created after modification          | Same object is modified |
| Slower for many changes                        | Faster                  |
| Stored in String Pool (when literals are used) | Normal heap object      |
 */