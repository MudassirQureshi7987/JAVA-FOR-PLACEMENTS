import java.util.HashMap;
import java.util.Map;


public class HashMapCheatSheet {
    public static void main(String[] args) {

        // 1️⃣ Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 2️⃣ Insert elements
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");
        map.putIfAbsent(2, "Orange"); // Won't update since key 2 exists

        System.out.println("Map after insertions: " + map);

        // 3️⃣ Access elements
        System.out.println("Value for key 1: " + map.get(1));
        System.out.println("Value for key 4 (default): " + map.getOrDefault(4, "Default"));

        // 4️⃣ Check existence
        System.out.println("Contains key 2? " + map.containsKey(2));
        System.out.println("Contains value 'Mango'? " + map.containsValue("Mango"));

        // 5️⃣ Remove elements
        map.remove(3);                 // Remove key 3
        map.remove(4, "Orange");       // Does nothing (key 4 not present)
        System.out.println("Map after removals: " + map);

        // 6️⃣ Iteration using entrySet()
        System.out.println("\nIteration using entrySet():");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // 7️⃣ Iteration using keySet()
        System.out.println("\nIteration using keySet():");
        for (Integer key : map.keySet()) {
            System.out.println(key + " → " + map.get(key));
        }

        // 8️⃣ Iteration using values()
        System.out.println("\nIteration using values():");
        for (String value : map.values()) {
            System.out.println(value);
        }

        // 9️⃣ Java 8 forEach
        System.out.println("\nIteration using forEach():");
        map.forEach((key, value) -> System.out.println(key + " → " + value));

        // 🔟 Replace / update values
        map.replace(1, "Green Apple");        // Replace value for key 1
        map.replace(2, "Banana", "Yellow");  // Replace only if current value matches
        System.out.println("\nMap after replace: " + map);

        // 1️⃣1️⃣ Compute / merge (Java 8)
        map.compute(1, (k,v) -> v + " 🍏");  // Update value for key 1
        map.merge(2, " 🍌", (oldVal, newVal) -> oldVal + newVal); // Merge key 2
        System.out.println("\nMap after compute & merge: " + map);

        // 1️⃣2️⃣ Size and empty check
        System.out.println("\nSize of map: " + map.size());
        System.out.println("Is map empty? " + map.isEmpty());

        // 1️⃣3️⃣ Clear map
        map.clear();
        System.out.println("Map after clear(): " + map);
    }
}

