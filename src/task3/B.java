package task3;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> counterSet = new HashSet<>();
        for (int number : array) {
            if (!counterSet.contains(number)) {
                counterSet.add(number);
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
