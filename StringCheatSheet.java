

public class StringCheatSheet {
    public static void main(String[] args) {
        String str = "  Hello World  ";

        // Basic properties
        System.out.println(str.length());       // 15
        System.out.println(str.isEmpty());      // false
        System.out.println(str.charAt(6));      // W

        // Manipulation
        System.out.println(str.trim());         // "Hello World"
        System.out.println(str.toUpperCase());  // "  HELLO WORLD  "
        System.out.println(str.replace("World", "Java")); // "  Hello Java  "
        System.out.println(str.substring(2, 7));           // "Hello"

        // Search
        System.out.println(str.contains("World"));        // true
        System.out.println(str.startsWith("  He"));       // true
        System.out.println(str.indexOf("o"));             // 4
        System.out.println(str.lastIndexOf("o"));         // 7

        // Comparison
        System.out.println(str.equals("Hello World"));           // false
        System.out.println(str.equalsIgnoreCase("  hello world  ")); // false
        System.out.println(str.compareTo("Hello"));             // 2

        // Split & join
        String[] words = str.trim().split(" ");
        for(String word : words) System.out.println(word);       // "Hello", "World"
        System.out.println(String.join("-", words));            // "Hello-World"
    }
}

