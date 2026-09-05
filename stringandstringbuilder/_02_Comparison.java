public class _02_Comparison {
    public static void main(String[] args){
        String a="saddam";
        String b="saddam";
        System.out.println(a==b);

        String name1= new String("saddam");
        String name2= new String("saddam");
        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));
    
    }
    
}
/***String a = "saddam";
String b = "saddam";

System.out.println(a == b);

Output:

true
Why?

When you create strings using string literals ("saddam"), Java stores them in a special memory area called the String Pool.

String Pool
+------------------+
| "saddam"         |
+------------------+
        ^
        |
     a, b both point here

Both a and b point to the same object.

So,

a == b

actually checks

same memory address?

Answer:

Yes

Code 2
String name1 = new String("saddam");
String name2 = new String("saddam");

System.out.println(name1 == name2);

Output:

false
Why?

The new keyword always creates a new object in the heap, even if the text is the same.

Memory looks like this:

Heap

+------------------+
| "saddam"         | <--- name1
+------------------+

+------------------+
| "saddam"         | <--- name2
+------------------+

Although both contain the text "saddam",

they are different objects.

So

name1 == name2

means

Do both variables point to the same object?

Answer:

No

Therefore,

false**/
