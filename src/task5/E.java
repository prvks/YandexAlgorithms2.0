package task5;

import java.util.*;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int[] a = getArrayFormInput(scanner);
        int[] b = getArrayFormInput(scanner);
        Map<Integer, Integer> mapForC = new HashMap<>();
        int cLength = scanner.nextInt();
        int number;
        for (int i = 0; i < cLength; i++) {
            number = scanner.nextInt();
            if (mapForC.containsKey(number)) {
                continue;
            }
            mapForC.put(number, i);
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (mapForC.containsKey(s - (a[i] + b[j]))) {
                    System.out.println(i + " " + j + " " + mapForC.get(s - (a[i] + b[j])));
                    return;
                }
            }
        }
        System.out.println(-1);
    }

    private static int[] getArrayFormInput(Scanner scanner) {
        int arrLength = scanner.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
