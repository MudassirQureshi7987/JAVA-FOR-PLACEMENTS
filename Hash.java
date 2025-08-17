import java.util.HashMap;

class Hash {
    public static void main(String[] args) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        int key = 5;

        // Way 1: Using getOrDefault
        mp.put(key, mp.getOrDefault(key, 0) + 1);

        // Way 2: Using containsKey
        if (mp.containsKey(key)) {
            mp.put(key, mp.get(key) + 1);
        } else {
            mp.put(key, 1);
        }

        System.out.println(mp); // {5=1}
    }
}
