package task3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] first = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] second = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> firstSet = Arrays.stream(first).boxed().collect(Collectors.toSet());
        Set<Integer> secondSet = Arrays.stream(second).boxed().collect(Collectors.toSet());
        firstSet.retainAll(secondSet);
        System.out.println(firstSet.size());
    }
}
