import java.util.Hashtable;
import java.util.Random;

public class Main {
    public static Random random = new Random();

    public static void main(String[] args) {

        MyHashTable<MyTestingClass , Employee> table =  new MyHashTable<MyTestingClass , Employee>();


        BST<Integer, String> bst = new BST<>();

        bst.put(50, "One");
        bst.put(30, "Two");
        bst.put(70, "Three");
        bst.put(20, "Four");
        bst.put(40, "Five");
        bst.put(60, "Six");
        bst.put(80, "Seven");

        System.out.println(bst.get(40));
        System.out.println(bst.get(60));

        bst.delete(30);

        System.out.println(bst.contains(30));

        for (Integer key : bst) {
            System.out.println(key + " " + bst.get(key));
            System.out.println(bst.size(bst.getNode(key)));
        }

        System.out.println(bst.size(bst.getRoot()));

    }
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < length ; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }
        return result.toString();
    }

}