package dinesh;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scanner.nextInt();
        if (isPerfect(n)) {
            System.out.println(n + " is a Perfect Number");
        } else {
            System.out.println(n + " is not a Perfect Number");
        }
    }

    private static boolean isPerfect(int n) {
        int sumOfFactors = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumOfFactors += i;
            }
        }
        return sumOfFactors == n;
    }
}
