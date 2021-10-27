package task3;

import java.util.*;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countWits = scanner.nextInt();
        scanner.nextLine();
        List<Set<Character>> witList = new ArrayList<>();
        for (int i = 0; i < countWits; i++) {
            Set<Character> wit = new HashSet<>();
            for (char c : scanner.nextLine().toCharArray()) {
                wit.add(c);
            }
            witList.add(wit);
        }
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Map<String, Integer>> nums = new ArrayList<>();
        int maxWitCount = 0;
        for (int i = 0; i < n; i++) {
            String num = scanner.nextLine().trim();
            Set<Character> numSet = new HashSet<>();
            for (char c : num.toCharArray()) {
                numSet.add(c);
            }
            int witCount = 0;
            for (Set<Character> wit : witList) {
                if (numSet.containsAll(wit)) {
                    witCount += 1;
                }
            }
            maxWitCount = Math.max(maxWitCount, witCount);
            Map<String, Integer> numMap = new HashMap<>();
            numMap.put(num, witCount);
            nums.add(numMap);
        }
        for (Map<String, Integer> num : nums) {
            if (num.entrySet().iterator().next().getValue() == maxWitCount) {
                System.out.println(num.entrySet().iterator().next().getKey());
            }
        }
    }
}
