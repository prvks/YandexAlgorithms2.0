package task4;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Long, Long> map = new TreeMap<>();
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            long color = scanner.nextLong();
            long number = scanner.nextLong();
            map.put(color, map.getOrDefault(color, 0L) + number);
        }
        for (Map.Entry<Long, Long> entry : map.entrySet()) {
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }
    }
}
