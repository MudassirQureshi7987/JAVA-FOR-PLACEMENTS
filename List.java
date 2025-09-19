public class List {
    public static void main(String[] args) {
        // Creating a list using ArrayList
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println("ArrayList: " + arrayList);

        // Creating a list using LinkedList
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        System.out.println("LinkedList: " + linkedList);

        // Accessing elements
        System.out.println("First element in ArrayList: " + arrayList.get(0));
        System.out.println("First element in LinkedList: " + linkedList.get(0));

        // Iterating through the list
        System.out.print("ArrayList elements: ");
        for (int num : arrayList) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("LinkedList elements: ");
        for (int num : linkedList) {
            System.out.print(num + " ");
        }
    }
}
