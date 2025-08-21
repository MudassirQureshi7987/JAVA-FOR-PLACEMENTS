import java.util.*;

public class ArrayListLearn {
    
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + "->" + list.size());

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list + "->" + list.size());

        list.add(1,1000);
        System.out.println(list + "->" + list.size());

        int val = list.get(1);  // cannot be done using list[1]
        System.out.println("Value at index 1: " + val);

        list.set(1,2000);  // cannot be done using list[1] = 2000
        System.out.println(list + "->" + list.size());

        list.remove(1);  // cannot be done using delete list[1]
        System.out.println(list + "->" + list.size());

        ArrayList<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("Cello");
        strList.add("Mello");
        System.out.println(strList + "->" + strList.size());

        for(int i = 0;i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for(int val1 : list) {
            System.out.println(val1);
        }

        System.out.println(strList);
    }
}
