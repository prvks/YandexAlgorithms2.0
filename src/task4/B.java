package task4;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new TreeMap<>();
        while (scanner.hasNextLine()) {
            String[] s = scanner.nextLine().trim().split(" ");
            String surname = s[0];
            int count = Integer.parseInt(s[1]);
            map.put(surname, map.getOrDefault(surname, 0) + count);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
