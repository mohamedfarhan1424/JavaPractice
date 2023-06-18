package dinesh;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = scanner.nextInt();
        int reverse = reverse(n);
        System.out.println("The Reverse of the Number is: " + reverse);
    }

    public static int reverse(int n) {
        int reverse = 0;  // reverse = 0
        while (n != 0) { // 123 != 0 - true
            int r = n % 10; // r = 123 % 10 = 3
            reverse = reverse * 10 + r; // reverse = 0 * 10 + 3 = 3
            n = n / 10; // n = 123 / 10 = 12
        }
        return reverse;
    }
}
/**
 * reverse = 0
 * 0 !=0  - false
 * 1%10 = 1
 * reverse = 32*10 + 1 = 321
 * 1/10 = 0
 * 321
 */

