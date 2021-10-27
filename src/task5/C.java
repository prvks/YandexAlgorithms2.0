package task5;

import java.util.*;
import java.util.stream.Collectors;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nCount = scanner.nextInt();
        int mCount = scanner.nextInt();
        Map<Integer, Integer> nMap = new HashMap<>();
        Map<Integer, Integer> mMap = new HashMap<>();
        for (int i = 0; i < nCount; i++) {
            nMap.put(i + 1, scanner.nextInt());
        }
        for (int i = 0; i < mCount; i++) {
            mMap.put(i + 1, scanner.nextInt());
        }
        nMap = nMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(
                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        mMap = mMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(
                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        List<Integer> indexes = new LinkedList<>(mMap.keySet());
        int[] ans = new int[nCount + 1];
        Arrays.fill(ans, 0);
        int mi = 0;
        for (Map.Entry<Integer, Integer> entry : nMap.entrySet()) {
            while (mi < indexes.size() && mMap.get(indexes.get(mi)) < entry.getValue() + 1) {
                mi++;
            }
            if (mi == indexes.size()) {
                break;
            }
            ans[entry.getKey()] = indexes.get(mi);
            mi++;
        }
        long count = Arrays.stream(ans).filter(i -> i != 0).count();
        System.out.println(count);
        for (int i = 1; i < ans.length; i++) {
            if (i == 1) {
                System.out.print(ans[i]);
            } else {
                System.out.print(" " + ans[i]);
            }
        }
    }
}
