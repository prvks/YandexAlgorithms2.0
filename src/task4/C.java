package task4;

import java.util.*;

public class C {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Map<String, Integer> map = new HashMap<>();
       while (scanner.hasNext()) {
           String[] words = scanner.nextLine().split(" ");
           for (String word : words) {
               map.put(word, map.getOrDefault(word, 0) + 1);
           }
       }
       map.entrySet().stream().sorted((o1, o2) -> {
           Integer value1 = o1.getValue();
           Integer value2 = o2.getValue();
           int valueComp = value1.compareTo(value2);
           if (valueComp != 0) {
               return -valueComp;
           }
           String key1 = o1.getKey();
           String key2 = o2.getKey();
           return key1.compareTo(key2);
       }).forEach(entry -> System.out.println(entry.getKey()));
    }
}
