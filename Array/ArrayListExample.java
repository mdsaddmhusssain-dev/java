import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Syntax to creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Grapes");
        fruits.add("Pine");
        fruits.add("Lichi");
        fruits.add("Strawberry");
        fruits.add("Pomegranes");
        System.out.println("Fruits List: " + fruits);

        // Syntext to add integer value
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(65);
        list.add(7);
        list.add(54);
        list.add(98);
        list.add(10);
        list.add(30);
        // System.out.println(list.set(0, 90));

        list.set(0, 90);
        list.remove(2);

        System.out.println("Number List : " + list);
        // System.out.println(list.contains(25));

    }

}
