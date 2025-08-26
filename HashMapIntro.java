import java.util.*; 

public class HashMapIntro {
    
    public static void main(String[] args)
    {
        HashMap<String, Integer> hm = new HashMap<>();
        
        hm.put("India", 135);
        hm.put("China", 200);
        hm.put("Pak", 30);
        hm.put("US", 20);
        hm.put("UK", 10);

        System.out.println(hm);

        hm.put("Nigeria", 5);
        hm.put("US", 25);

        System.out.println(hm);

        System.out.println(hm.get("India"));  // if the key is present then returns the value otherwise returns null
        System.out.println(hm.get("Utopia")); // key is not present so returns null

        System.out.println(hm.containsKey("China")); // true
        System.out.println(hm.containsKey("Russia")); // false

        System.out.println(hm.size());

        hm.remove("Pak");
        System.out.println(hm);

        System.out.println(hm.size());

        Set<String> keys = hm.keySet(); // returns all the keys in the form of a set
        System.out.println(keys);   // [India, China, US, UK, Nigeria]

        for(String key : hm.keySet())
        {
            System.out.println(key + " -> " + hm.get(key));
        }

        // incrementing by 1 
        hm.put("India", hm.get("India") + 1); // 135 + 1 = 136 bt cause get returns an Integer object which is unboxed to int and then incremented and then put back as Integer object
        // hm.get("India")++; // error: cannot do this as we cannot directly change the value at a particular key like arrays
        System.out.println(hm.get("India")); // 136

        hm.put("India", hm.getOrDefault("India", 0) + 1); // if key is present then returns the value otherwise returns the default value provided
        System.out.println(hm.get("India")); // 137
        hm.put("Bhutan", hm.getOrDefault("Bhutan", 0) + 1); // Bhutan key is not present so it will be added with value 0 + 1 = 1
        System.out.println(hm.get("Bhutan")); // 1


        hm.clear();
        System.out.println(hm.size()); // 0
    }
}
