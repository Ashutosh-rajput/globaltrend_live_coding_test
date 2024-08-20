
import java.util.*;

class Arraylist {
    public static void main(String args[])
    {
        // Creating an empty TreeSet
        TreeSet<String> tree = new TreeSet<String>();

        // Use add() method to add elements into the Set
        tree.add("Welcome");
        tree.add("To");
        tree.add("Geeks");
//        tree.add("4");
        tree.add("Geeks");
        tree.add("TreeSet");

        // Displaying the TreeSet
        System.out.println("TreeSet: " + tree);

        // Removing elements using remove() method
        tree.remove("Geeks");
        tree.remove("4");
        tree.remove("TreeSet");

        // Displaying the TreeSet after removal
        System.out.println("New TreeSet: " + tree);
    }
}
