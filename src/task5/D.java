package task5;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] arr = scanner.nextLine().toCharArray();
        int counter = 0;
        for (char c : arr) {
            if (c == '(') {
                counter++;
            } else {
                counter--;
            }
            if (counter < 0) {
                System.out.println("NO");
                return;
            }
        }
        if (counter == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
