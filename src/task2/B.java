package task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] buildings = new int[10];
        int[] left = new int[buildings.length];
        Arrays.fill(left, 0);
        for (int i = 0; i < buildings.length; i++) {
            buildings[i] = scanner.nextInt();
        }
        int shoppos = -20;
        for (int i = 0; i < buildings.length; i++) {
            if (buildings[i] == 2) {
                shoppos = i;
            }
            if (buildings[i] == 1) {
                left[i] = i - shoppos;
            }
        }
        shoppos = 30;
        int ans = 0;
        int minDist;
        for (int i = buildings.length - 1; i >= 0; i--) {
            if (buildings[i] == 2) {
                shoppos = i;
            }
            if (buildings[i] == 1) {
                minDist = Math.min(shoppos - i, left[i]);
                ans = Math.max(ans, minDist);
            }
        }
        System.out.println(ans);
    }
}
