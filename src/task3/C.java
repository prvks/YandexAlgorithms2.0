package task3;

import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> map = new LinkedHashMap<>();
        while (scanner.hasNextInt()) {
            int current = scanner.nextInt();
            map.put(current, map.getOrDefault(current, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
