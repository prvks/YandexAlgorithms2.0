package task1;

import java.util.*;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cathet = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x >= 0 && y >= 0 && y + x - cathet <= 0) {
            System.out.println(0);
        } else {
            double[] arr = new double[4];
            Arrays.fill(arr, 0.0);
            arr[1] = Math.sqrt((Math.pow(x, 2)) + Math.pow(y, 2));
            arr[2] = Math.sqrt((Math.pow(x - cathet, 2)) + Math.pow(y, 2));
            arr[3] = Math.sqrt((Math.pow(x, 2)) + Math.pow(y - cathet, 2));
            int closest = 1;
            double minDist = arr[1];
            for (int i = 2; i < arr.length; i++) {
                if (arr[i] < minDist) {
                    closest = i;
                    minDist = arr[i];
                }
            }
            System.out.println(closest);
        }
    }
}
