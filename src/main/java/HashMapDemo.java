import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, String> favouriteFruits = new HashMap<>();

        favouriteFruits.put("Alice", "apple");
        favouriteFruits.put("Sarah", "banana");
        favouriteFruits.put("Bob", "pear");

        System.out.println(favouriteFruits.get("Bob"));

        favouriteFruits.forEach((k, v) -> System.out.println(k + ": " + v));
    }


}
