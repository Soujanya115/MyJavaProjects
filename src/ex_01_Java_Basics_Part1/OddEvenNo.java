package ex_01_Java_Basics_Part1;

import java.util.Scanner;

public class OddEvenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int i = sc.nextInt();

        // Check if the number is even or odd
        if (i % 2 == 0) {
            System.out.println(i + " is Even.");
        } else {
            System.out.println(i + " is Odd.");
        }

        // Close the scanner
        sc.close();

    }
}
