package task1;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println((firstNumber > 12 || secondNumber > 12) || (firstNumber == secondNumber) ? 1 : 0);
    }
}
